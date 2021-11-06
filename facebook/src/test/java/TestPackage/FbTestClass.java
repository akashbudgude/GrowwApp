package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.Base;
import PomClasses.Login;
import PomClasses.Logout;
import PomClasses.Post;
import PomClasses.Profile;
import PomClasses.WatchButton;

public class FbTestClass extends Base {
	WebDriver driver;
	Login l;
	SoftAssert soft;
	
	@BeforeClass
	@Parameters("Browser")
	public void beforeClass(String Browser)
	{	 
		if(Browser.equalsIgnoreCase("Chrome"))
		   {
			driver = openChromeBrowser(); 
		    }
		if(Browser.equalsIgnoreCase("Firefox"))
				{
			driver =openFireFoxBrowser();
				}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
	}
	

	@BeforeMethod
	public void beforeMethod()
	{
	  l = new Login(driver);
	    l.sendUsername();
		l.sendpassword();
		l.clickOnlogin();
	 soft =new SoftAssert ();
	 
	}
	@Test(priority = 1)
	public void testpost() throws InterruptedException
	{
		Post p =new Post(driver);
		p.ClickOnPost();
		String str = driver.getCurrentUrl();
		soft.assertEquals(str, "https://www.facebook.com/?sk=welcome", "my url not ok");
		String  st = driver.getTitle();
		soft.assertEquals(st, "Facebook");
		System.out.println(st);
		System.out.println(str);
	
		soft.assertAll();
	}
	
	@Test(priority = 2)
	public void testProfile() throws InterruptedException
	{
		Profile p = new Profile (driver);
		p.ProfilePage();
		
	}
	
	@Test
	public void verifyWatch()
	{
		WatchButton w =new WatchButton (driver);
		 w.ClickOnWatch();
		 String srt =driver.getCurrentUrl();
		 soft.assertEquals(srt, "https://www.facebook.com/watch");
	
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Logout log = new Logout(driver);
		log.ClickOnLogout();
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	

}

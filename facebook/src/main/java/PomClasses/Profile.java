package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	WebDriver driver;

	@FindBy (xpath ="//input[@aria-label='Search Facebook']")
	private WebElement Search;
	
	@FindBy (xpath = "(//div[contains(@class, 'b5q2rw42 lq239pai mysgfdmx hddg9phg')])[1]")
	private WebElement Enter;
	
	@FindBy (xpath = "//div[@aria-label='Add Friend']")
	private WebElement Addfriend;
	
	public Profile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ProfilePage() throws InterruptedException {
		Search.sendKeys("tejashri  raut");
		Thread.sleep(2000);
		Enter.click();
		
	
	}
	public void requestSend() throws InterruptedException {
		Thread.sleep(2000);
		Addfriend.click();
	
	
	}


}

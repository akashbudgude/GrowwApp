package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy (xpath ="//div[@aria-label='Account controls and settings']//span[contains(@class,'owwhemhu dp1hu0rb dhp61c6y iyyx5f41')][1]")
    private WebElement Account;
	
	@FindBy(xpath ="//span[text() ='Log Out']")
	private WebElement logout; 
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogout() throws InterruptedException{
		Account.click();
		Thread.sleep(2000);
		logout.click();
	}

}

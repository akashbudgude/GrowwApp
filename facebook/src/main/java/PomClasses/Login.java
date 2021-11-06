package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath = "//input [@id='email']")
	private WebElement Username;

	@FindBy(xpath = "//input [@id='pass']")
	private WebElement password;

	@FindBy(xpath = "//button [text() = 'Log In']")
	private WebElement login;

	public Login(WebDriver driver) {
		
		
		
		PageFactory.initElements(driver, this);
		
		
	}

	public void sendUsername() {
		Username.sendKeys("himanshujagtap1515@gmail.com");
	}

	public void sendpassword() {
		password.sendKeys("himanshu123@");
	}

	public void clickOnlogin()  {
		login.click();
		
		
	}
}

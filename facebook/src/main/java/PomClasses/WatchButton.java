package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchButton {
	WebDriver driver;

	@FindBy (xpath ="//span[text()='Watch']")
	private WebElement Watch;
	
	@FindBy (xpath ="//div[@class='qzhwtbm6 knvmm38d']//span[text() ='Live']")
	private WebElement Live;
	
	@FindBy (xpath ="//a[@aria-label='Home']")
	private WebElement Home;
	
	public WatchButton(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public  void ClickOnWatch() {
		System.out.println(Watch.getText());
		Watch.click();
		Live.click();
		Home.click();
		
	}
}

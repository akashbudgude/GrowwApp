package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post {
	
	@FindBy (xpath="//div[@class='bp9cbjyn j83agx80 datstx6m taijpn5t oi9244e8'][3]")
	private WebElement Post;
	
	@FindBy (xpath ="//div[@class='lpgh02oy']//div[contains(@class,'du4w35lb bp9cbjyn btwxx1t3 dflh9lhu scb9dxdr')]")
    private WebElement Postclick;
	
	@FindBy (xpath ="//div[@aria-label='Close']")
	private WebElement Close;
	
	public Post(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnPost() throws InterruptedException {
		Post.click();
		
		Postclick.click();
		Thread.sleep(2000);
		Close.click();
	}

}

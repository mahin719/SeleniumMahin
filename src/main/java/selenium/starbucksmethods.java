package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class starbucksmethods {
	
	private WebDriver driver;
	
	public starbucksmethods(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstName")
	WebElement typeFirstName;
	public WebElement typeFirstName() {
		return typeFirstName;
	}
	
	@FindBy(id = "lastName")
	WebElement typeLastName;
	public WebElement typeLastName() {
		return typeLastName;
	}
	
	@FindBy(id = "emailAddress")
	WebElement typeEmailAddress;
	public WebElement typeEmailAddress() {
		return typeEmailAddress;
	}
	
	@FindBy(id = "password")
	WebElement typePassword;
	public WebElement typePassword() {
		return typePassword;
	}
	

}

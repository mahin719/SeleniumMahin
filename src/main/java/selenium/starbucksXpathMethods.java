package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class starbucksXpathMethods {
	
private WebDriver driver;
	
	public starbucksXpathMethods(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement typeFirstName;
	public WebElement typeFirstName() {
		return typeFirstName;
	}
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement typeLastName;
	public WebElement typeLastName() {
		return typeLastName;
	}
	
	@FindBy(xpath = "//input[@name=\"emailAddress\"]")
	WebElement typeEmailAddress;
	public WebElement typeEmailAddress() {
		return typeEmailAddress;
	}
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement typePassword;
	public WebElement typePassword() {
		return typePassword;
	}

}

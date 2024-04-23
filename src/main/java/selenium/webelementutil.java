package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class webelementutil {
	
	private WebDriver driver;

	public webelementutil(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="password_step_input")
	WebElement typePassword;
	public WebElement typePassword() {
		return typePassword;
	}

	
	@FindBy(name="reg_email__")
	WebElement typeMobileNumber;
	
	public WebElement typeMobileNumbers() {
		return typeMobileNumber;
	}
	
	@FindBy(name="firstname")
	WebElement typeFirstName;
	
	public WebElement typeFirstName() {
		return typeFirstName;
	}
	
	
	@FindBy(name="lastname")
	WebElement typeLastName;
	
	public WebElement typeLastNames() {
		return typeLastName;
	}
	


}

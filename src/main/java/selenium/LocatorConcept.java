package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorConcept {
	public static void main(String[] args) throws InterruptedException {
		//webelement- any element present is a webpage, clickable, dropdown
		//Locator: we need to create locators of every web element we need to perform any action
	
	//Create the locator of that webelement
	//perform Action- click, type, select, right click, is displayed
		
		//there different kind of locators, example- id, name, class name, css locator, xpath
		//DOM- Document Object Model
		
		//<input- its a html tag/tagname
		//attribute name= attribute value
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//website hit
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(3000);
		
		//approach 1
		
//		driver.findElement(By.name("firstname")).sendKeys("Ghalib");
//		Thread.sleep(3000);
//		driver.findElement(By.name("lastname")).sendKeys("MD");
//		Thread.sleep(3000);
//		driver.findElement(By.name("websubmit")).click();
//		Thread.sleep(3000);
//		driver.close();
		
		
		//approach 2
		 
//		WebElement FirstName=driver.findElement(By.name("firstname"));
//		WebElement LastName= driver.findElement(By.name("lastname"));
//		
//		FirstName.sendKeys("Sheikh");
//		
//		Thread.sleep(3000);
//		FirstName.clear();
//		FirstName.sendKeys("Mahin");
//		Thread.sleep(3000);

		//approach 3
		
//     driver.findElement(By.id("password_step_input")).sendKeys("1234");
		
				webelementutil webUtil=new webelementutil(driver);
				webUtil.typePassword.sendKeys("123456789");
				Thread.sleep(3000);
				webUtil.typeMobileNumber.sendKeys("214");
				Thread.sleep(3000);
				webUtil.typeFirstName.sendKeys("Adib");
				webUtil.typeLastName.sendKeys("Khadakar");
			}

		

}

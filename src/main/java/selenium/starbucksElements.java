package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class starbucksElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.starbucks.com/account/create?");
		
		Thread.sleep(2000);
		
		starbucksmethods elements = new starbucksmethods(driver);
		elements.typeFirstName.sendKeys("Mahin");
		Thread.sleep(2000);
		elements.typeLastName.sendKeys("Khan");
		Thread.sleep(2000);
		elements.typeEmailAddress.sendKeys("1234@gmail.com");
		Thread.sleep(2000);
		elements.typePassword.sendKeys("98765");
		Thread.sleep(2000);
		driver.quit();
	}
}

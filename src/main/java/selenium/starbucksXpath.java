package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class starbucksXpath {

	public static void main(String[] args) throws InterruptedException {
		//Syntex for creating xpath
		//tagname[@attribute=value]
		//input[@name="firstname"]
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutil webUtil=new webelementutil(driver);
		
		driver.get("https://www.starbucks.com/account/create?");
		Thread.sleep(2000);
		
		starbucksXpathMethods elements = new starbucksXpathMethods (driver);
		
		elements.typeFirstName.sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("ABCD");
		Thread.sleep(2000);
		
		elements.typeLastName.sendKeys("Wick");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("ABCD");
		Thread.sleep(2000);
		
		elements.typeEmailAddress.sendKeys("JohnWick@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'emailAddress')]")).sendKeys("ABCD");
		Thread.sleep(2000);
		
		elements.typePassword.sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Abc$");
		Thread.sleep(2000);
		
		String x=driver.findElement(By.xpath("//p[contains(text(),'Email is a great way')]")).getText();
		System.out.println(x);
		
		driver.quit();
		

	}

}

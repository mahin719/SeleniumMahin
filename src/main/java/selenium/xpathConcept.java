package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathConcept {
	

public static void main(String[] args) throws InterruptedException {
		
		//xpath: adress of the element in htm dom
		// Absolute xpath: /html/body/div[4]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input, single slash
		//Relative xpath/Custom Xpath: using attributes, value tagname, // double slash
		
		//Syntex for creating xpath
		//tagname[@attribute=value]
		//input[@name="firstname"]
		//*[@name="firstname"]
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutil webUtil=new webelementutil(driver);
		//website hit
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(1000);
		
		//webUtil.typeNewPW.sendKeys("12345");
		
		//tagname[@attribute1='value1' and @attribute2='value2']
				//tagname[@attribute1='value1' and @attribute2='value2' and @attribute3='value3']
				//driver.findElement(By.name("firstname"))
				//driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"reg_email__\"]")).sendKeys("1234567890");
				
				
				//tagname[@attribute1 and @attribute2]
				//input[@type and @class and @data-type and @aria-required and @id and @aria-invalid ]
				
				
				//by using contains we can create locator
				//tagname[contains(@attribute,'value')]
				//input[contains(@name,'reg_email__')]
				//tagname[contains(text(),'value')]
				//p[contains(text(),'People')]
				driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("ABCD");
				String a=driver.findElement(By.xpath("//p[contains(text(),'People')]")).getText();
				System.out.println(a);
				
				// parent to child xpath
				//select[@name="birthday_month"]/option[2]
//				List<WebElement> list=driver.findElements(By.xpath("//*[@aria-label=\"Month\"]/option"));
//				System.out.println(list);

}


}

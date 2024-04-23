package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//website hit
		driver.get("https://www.dell.com/en-us");
		webelementutil webutil=new webelementutil(driver);
	//View All Industry
		
		// mouse hover
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'IT Infrastructure')]"))).build().perform();
	Thread.sleep(2000);
	act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Industry')]"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'View All Industry')]")).click();
	
	
	//Drag and Drop
	//click and hold the element
	//move to element
	//release
//	
//	Thread.sleep(2000);
	
//	act.clickAndHold(webutil.Dragable).moveToElement(webutil.Dropable).release(webutil.Dropable).build().perform();
	
// Right click
	act.contextClick(driver.findElement(By.xpath("//span[contains(text(),'IT Infrastructure')]"))).perform();


	}

}

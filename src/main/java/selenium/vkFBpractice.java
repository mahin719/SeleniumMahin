package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vkFBpractice {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webelementutil webele=new webelementutil(driver);
		
		//website hit
		driver.get("https://www.facebook.com/signup");
		
		Robot rb=new Robot();
		webele.typeFirstName.click();

}
}
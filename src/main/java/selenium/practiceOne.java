package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class practiceOne {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver(); // we are topcasting WebDriver
		
	WebDriver driver;
	driver = new ChromeDriver();
	
	//website hit
	
	driver.get("https://www.youtube.com/");
	String title=driver.getTitle();
	System.out.println(title);

	}

}

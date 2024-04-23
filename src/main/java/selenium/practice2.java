package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		String youtubeTitle = driver.getTitle();
		System.out.println("The title of the page is " + youtubeTitle);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();
     //   cntrl+shift+o (letter o). this will import
        
	}

}

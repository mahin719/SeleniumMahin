package selenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class S1selenium {

	public static void main(String[] args) {
		//Browser open
				//prior to selenium 4.6 we need to have driver file
				//System.setProperty("webdriver.chrome.driver","C:\\chrome");
				//ChromeDriver driver=new ChromeDriver();
				//FirefoxDriver driver=new FirefoxDriver();
				//EdgeDriver driver=new EdgeDriver();
		  // SearchContext s1=new ChromeDriver();
		  //WebDriver driver=new ChromeDriver();
			//	WebDriver driver=new FirefoxDriver();
				WebDriver driver;
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//website hit
				driver.get("https://www.facebook.com/");
				String title=driver.getTitle();
				System.out.println(title);
				if(title.contains("Facebook - log in or sign up")) {
					System.out.println("PASS");
				}
				else {
					System.out.println("FAIL");
				}
				
				driver.close();
				
			}

	}



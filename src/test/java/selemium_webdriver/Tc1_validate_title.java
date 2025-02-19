package selemium_webdriver;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tc1_validate_title {

	public static void main(String[] args)
	{
		System.out.println("testing");
		
		// ChromeDriver driver = new ChromeDriver(); //launch browser..will store objects of chromedriver class olny
		WebDriver driver = new ChromeDriver(); 
//		 webdriver is parent interface of chromedriver class
//		 upcasting is being done here because
//		 referance variable of webdriver can store 
//		 objects of any driver class like chromedriver class, firefoxdriver class
//..this will be helpful in cross browser testing
		 
		   
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");  //open application
		String title = driver.getTitle();         //get title of page (every page of an application have different title)
		Assert.assertEquals("Your Store", title);
		driver.quit(); //to close browser
		
		
		
	

	}

}

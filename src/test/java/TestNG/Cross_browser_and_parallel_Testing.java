package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Cross_browser_and_parallel_Testing {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String s1) throws InterruptedException
	{
		
		switch(s1)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("o");
		Thread.sleep(5000);
	}
	
	
  @Test
  public void testLogin() {
	  //login to app and check if login happened using assertions
	  driver.findElement(By.id("name")).sendKeys("ashish");
	  
	  
  }
  
  @AfterClass
  public void tearDown()
	{
		driver.quit();
	}
  
  
}

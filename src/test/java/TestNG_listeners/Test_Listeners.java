package TestNG_listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Listeners {
	
	
	WebDriver driver;
	  @BeforeClass
	  public void SetUp() throws InterruptedException {
		
		  
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		System.out.println("in setup method"); 
}
	
	  @Test(priority = 1)
	  public void testUrl() {
		  
		
		  String url = driver.getCurrentUrl();
		  Assert.assertEquals(url, "https://testautomationpractice.blogspot.com/");
	  }
	
  @Test(priority = 2)
  public void testTitle() {
	  
	
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "jj");
	 
}
  
  @Test(priority = 3,dependsOnMethods =  "testTitle")
  public void a() {
	  
	  System.out.println("a");
	 
}
  
  @AfterClass
  public void tearDown() {
	  
	
	  System.out.println("in teardown method"); 
}
  
  
  
  
  
  
  
  
}

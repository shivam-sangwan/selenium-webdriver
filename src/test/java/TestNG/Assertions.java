package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertions {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	
  @Test
  public void testLogin() {
	  //login to app and check if login happened using assertions
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  SoftAssert sa = new SoftAssert();
	  String actual =  driver.findElement(By.xpath("//div[@id='app']//h6")).getText();
	  sa.assertEquals(actual, "Dashboard");
	  driver.findElement(By.xpath("//div[@id='app']//span[@class=\"oxd-userdropdown-tab\"]//i")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  sa.assertAll();
	
	 
  }
  
  @AfterClass
  public void tearDown()
	{
		driver.quit();
	}
  
  
}

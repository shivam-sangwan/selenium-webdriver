package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Data_Provider {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
  @Test(dataProvider = "credentials")
  public void testLogin(String s1, String s2) {
	  //login to app and check if login happened using assertions
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(s1);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  SoftAssert sa = new SoftAssert();
	  String actual =  driver.findElement(By.xpath("//div[@id='app']//h6")).getText();
	  sa.assertEquals(actual, "Dashboard");
	  driver.findElement(By.xpath("//div[@id='app']//span[@class=\"oxd-userdropdown-tab\"]//i")).click();
	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
	  sa.assertAll();
	 
  }
  
  @DataProvider(name = "credentials", indices = {1,2})
  Object[][] cred()
  {
	  Object obj[][] = {
			  {	"Admi", "admin12"}, //0
			  {	"Admn", "admin23"}, //1
			  {	"Admin", "admin123"} //2
	              };
	  return obj;
  }

  
  @AfterClass
  public void tearDown()
	{
		driver.quit();
	}
  
  
}

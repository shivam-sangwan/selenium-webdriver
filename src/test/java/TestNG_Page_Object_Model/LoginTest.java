package TestNG_Page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;	
	
  @BeforeClass
  public void SetUp() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
  }
  
  
  @Test
  public void testLogin() {
	  LoginPage_PageFactory  lp = new LoginPage_PageFactory(driver);
	  lp.userName("Admin");
	  lp.passWord("admin123");
	  lp.clickLogin();
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  
  
  
  
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
}

package testNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Class2 {
	 
	
  
	  @Test
	  public void t1() 
	  {
		System.out.println("t1class2");
	  }
	  
	  @Test
	  public void t2() 
	  {
		System.out.println("t2class2");
	  }
	  
	  @BeforeMethod
	  public void login() 
	  {
		System.out.println("loginclass2");
	  }
	  
	  @AfterMethod
	  public void logout() 
	  {
		System.out.println("logoutclass2");
	  }
	 
	
	  
	  
	 

}

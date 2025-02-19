package testNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Class1 {
	 
	
  
	  @Test(priority =1)
	  public void t1() 
	  {
		System.out.println("t1class1");
	  }
	  
	  @Test(priority =2)
	  public void t2() 
	  {
		System.out.println("t2class1");
	  }
	  
	  @BeforeMethod
	  public void login() 
	  {
		System.out.println("loginclass1");
	  }
	  
	  @AfterMethod
	  public void logout() 
	  {
		System.out.println("logoutclass1");
	  }
	  
	  @BeforeTest
	  public void bt1() 
	  {
		System.out.println("beforetest");
	  }
	  
	  @AfterTest
	  public void at1() 
	  {
		System.out.println("aftertest");
	  }
	  
	  @BeforeSuite
	  public void bs1() 
	  {
		System.out.println("beforesuite");
	  }
	  
	  @AfterSuite
	  public void as1() 
	  {
		System.out.println("afteresuite");
	  }
	 
	  
	  @BeforeClass
	  public void bc1() 
	  {
		System.out.println("beforclass1");
	  }
	  
	  @AfterClass
	  public void ac1() 
	  {
		System.out.println("afterclass1");
	  }
	  
	
	  
	  
	 

}

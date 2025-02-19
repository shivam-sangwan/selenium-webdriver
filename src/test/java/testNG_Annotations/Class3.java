package testNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Class3 {
	 
	
  
	  @Test
	  public void t1() 
	  {
		System.out.println("t1class3");
	  }
	  
	  @Test
	  public void t2() 
	  {
		System.out.println("t2class3");
	  }
	  
	  @BeforeMethod
	  public void b1() 
	  {
		System.out.println("b1class3");
	  }
	  
	  @AfterMethod
	  public void a1() 
	  {
		System.out.println("a1class3");
	  }
	  
	  @BeforeClass
	  public void bc1a() 
	  {
		System.out.println("beforclass3");
	  }
	  
	  @AfterClass
	  public void ac1s() 
	  {
		System.out.println("afterclass3");
	  }
	 
	  @BeforeTest
	  public void bt1() 
	  {
		System.out.println("beforetest3");
	  }
	  
	  @AfterTest
	  public void at1() 
	  {
		System.out.println("aftertest3");
	  }
	  
	  
	 

}

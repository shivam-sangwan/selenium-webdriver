package testNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Class4 {
	 
	
  
	  @Test
	  public void t1() 
	  {
		System.out.println("t1class4");
	  }
	  
	  @Test
	  public void t2() 
	  {
		System.out.println("t2class4");
	  }
	  
	  @BeforeMethod
	  public void b1() 
	  {
		System.out.println("b1class4");
	  }
	  
	  @AfterMethod
	  public void a1() 
	  {
		System.out.println("a1class4");
	  }
	 
	
	  
	  
	 

}

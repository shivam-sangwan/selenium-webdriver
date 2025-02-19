package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Depends_on_method {
	
	
  @Test
  public void openapp() {
	  
	
	  System.out.println("a");
	  Assert.fail();
	  
  }
  
  @Test
  public void login() {
	  
	  System.out.println("shiv");
	  
  }
  
  //both "openapp","login" should pass...otherwise sendEmail() will be skipped
  @Test(dependsOnMethods = {"openapp","login"})
  public void sendEmail() {
	  
	  System.out.println("sending email");
	  
	  
  }
	
}

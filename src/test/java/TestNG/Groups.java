 package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Groups {
	
	//we want run only the test methods(sendEmail) which belongs..
	//to both sanity and regression groups
	//so we will add "functional" as group i.e. as parameter in annotation of that method
	//now we will include functional in xml to run required method
	
  @Test(priority =1,groups = "sanity")
  public void openapp() {
	  
	
	  System.out.println("a");
	 
	  
  }
  
  @Test(groups = "regression")
  public void login() {
	  
	  System.out.println("shiv");
	  
  }
  

  @Test(groups = {"sanity","regression","functional"})
  public void sendEmail() {
	  
	  System.out.println("sending email");
	  
	  
  }
	
}

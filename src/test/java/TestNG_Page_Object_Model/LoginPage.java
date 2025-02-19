package TestNG_Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//every pom class have 3 sections
	WebDriver driver; //driver created in one class cannot work in another class..thats why
	                  //constructer is used here
	
	
	//Section1: constructer
	//object of this class will be created in loginTest class and
	//constructer will get called with (driver parameter) created in loginTest class
	//and driver of loginTest class will be assigned to driver of current class
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Section2: locators
	By txt_usrname_loc = By.xpath("//input[@name='username']");
	By txt_password_loc = By.xpath("//input[@name='password']");
	By btn_login_loc = By.xpath("//button[@type='submit']");
	
	
	
	
	//Section3: Action Methods(functions)
	//this will be called in loginTest class using (user parameter)
	public void userName(String user)
	{
		driver.findElement(txt_usrname_loc).sendKeys(user);
	}
	
	public void passWord(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	
	
	
	
	
	

}

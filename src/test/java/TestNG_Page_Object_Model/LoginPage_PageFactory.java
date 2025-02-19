package TestNG_Page_Object_Model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	
	WebDriver driver; 
	
	
	
	LoginPage_PageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Section2: locators
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;
	@FindBy(xpath="//input[@name='password']") WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']")  WebElement btn_login;
	
	
	 
	//finding group of elements by findby (replacement of findelements)
	@FindBy(tagName = "a") List<WebElement> mylist;
	


	public void userName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void passWord(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
	
	
	
	
	
	

}

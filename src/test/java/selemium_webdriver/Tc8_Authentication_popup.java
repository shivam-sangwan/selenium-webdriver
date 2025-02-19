package selemium_webdriver;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc8_Authentication_popup {

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//there are some applications when we try to access them...
		//an authentication pop up(asking for username and id) will come before opening the app
		//this popup cant be handled using alert class
		//to handle this popup we need to inject username and password in url itself
		//after doing above pop up wont come
		
		driver.get("https://demo.opencart.com/");  //normal url
		
		//username: admin
		//password: 123
		
		//injected url
		driver.get("https://admin:123@demo.opencart.com/"); 
		
		
		
	

	}

}

package selemium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc4_xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("tab");
        
		
		//using multiple attributes...both the attributes should present
		//driver.findElement(By.xpath("//input[@name=\"search\"][@placeholder='Search']")).sendKeys("tab");
		
		//can also be done AND operator
		//driver.findElement(By.xpath("//input[@name=\"search\" and @placeholder='Search']")).sendKeys("tab");
	   

		//finding webelement based on inner text
		//driver.findElement(By.xpath("//a[text()='Tablets']")).click();
		
		//finding dynamic webelement using contains()
		//driver.findElement(By.xpath("//input[contains(@name,'ar')]")).sendKeys("mac");
		
		//finding dynamic webelement using start-with()
	    //driver.findElement(By.xpath("//input[starts-with(@name,'se')]")).sendKeys("android");
	
	    //chained xpath: combination of relative and absolute xpath
	    //used to write xpath when attributes not available for an element(in this case: image)
	    
	   //ex: //div[@id ='12']/a/img
	   //here we wrote xpath for tag 'img' using parent tag 'div' traversing through middle tag 'a'
	 
		//alternative of chained xpath: axes methods
	    //ex: //div[@id ='12']//descendant::img
	}

}
 
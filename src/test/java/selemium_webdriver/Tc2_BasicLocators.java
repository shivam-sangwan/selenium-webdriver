package selemium_webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tc2_BasicLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		
	
	
		WebElement header = driver.findElement(By.id("header-cart"));
		Assert.assertTrue(header.isDisplayed());
		
		
		driver.findElement(By.name("search")).sendKeys("phone");
		
		//LinkText: contains link of another page
		//found in last of anchor tag(a) in html
		WebElement wb = driver.findElement(By.linkText("Tablets"));   //returns webelement
		wb.click();
		//  driver.findElement(By.partialLinkText("lets")); //partial link text of above linkedtext

		
		//to get all the links in upperheader of opencart
		//there are 4links in upperheader which belongs to a particular
		//class "nav-item" in html
		
		//storing elements in list
		List<WebElement> headerlinks = driver.findElements(By.className("nav-item"));  //return list of webelements
		//(using <WebElement> is optional in List<WebElement>)
		//findelements return a List 
		
		System.out.println(headerlinks.size()); //printing all the links in header
		
		//finding all links present on a webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//finding all images on webpage
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		
		
		
	}

}

package selemium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc3_CSS_Selector {

	public static void main(String[] args) {
		//CSS: cascading style sheets,used to design webpages just like HTML
		//sometimes single attribute may not be able to locate elements 
		//CSS selector: use combination of attributes to locate elements
		//one of the attributes is usually tagname(ex: tagname + id)
		//mainly 4 combinations are used:
		//tag+id                      syntex: tag#id
		//tag+class                   syntex:  tag.classname
		//tag+ other attribute        syntex:  tag[name = "value"]
		//tag+class+ other attribute  syntex:  tag.classname[linkedtext = "value"]
		
		//note: css locator can also be created without tagname
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shirt");
		
		//using tag is optional in above statement i.e.
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("jeans");  
		
		//tag.classname
		driver.findElements(By.cssSelector("input.search-box-text"));
		
		//using tag is optional in above statement i.e.
		driver.findElements(By.cssSelector(".search-box-text"));
		
		//if we want to find group of elements then there were two methods
		//tag and class....we can use combination of both using above css.. 
		//method for more impactful search
		

	}

}

package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc6_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//scenario1: select 7 checkboxes from sunday to saturday
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@id = 'sunday']//parent::div//parent::div//child::input"));
		
		//using simple xpath
		//List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox' and @class = 'form-check-input']"));
		
//		System.out.println(checkboxes.size());
//		for(WebElement ch: checkboxes)
//		{
//			ch.click(); 
//		}
		
		
		//scenario2: select last 3 out of 7 checkboxes
		//starting index = 7-3
		//use normal for loop in such cases bcox we will need index
//		for(int i=4;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
		//scenario2: select first 3 out of 7 checkboxes
//		for(int i=0;i<3;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
		//scenario3: select sunday and saturday checkboxes
		//do manually without loop
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("monday")).click();
		
		//scenario4: unselect selected checkboxes
		Thread.sleep(5000);
		for(WebElement chk: checkboxes)
		{
			if(chk.isSelected())
					{
				       chk.click();
					}
		}
		
		
		
		
		
		
		
	}

}

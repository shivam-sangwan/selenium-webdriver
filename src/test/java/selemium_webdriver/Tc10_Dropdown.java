package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc10_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement wb = driver.findElement(By.xpath("//select[@id = 'country']"));
		Select dd = new Select(wb);
		
		//dd.selectByIndex(3);
		//dd.selectByVisibleText("China");
		
		//value is an attribute present in Html for given dropdown
		//visibletext is present on ui itself (in dropdown)..represented by inner text in HTML
		//in most cases value and visibletext will have same value
		//advisable to use visibletext than value bcoz sometimes value filed may not present in HTML 
		dd.selectByValue("india");  
		
		List<WebElement> l1 = dd.getOptions();
		System.out.println(l1.size());
		System.out.println(l1.get(3).getText());
		
		//we can achieve the same using normal for loop and get() method of list
		for(WebElement w:l1)
		{
			System.out.println(w.getText());
		}
		
		

		
		
		
		
		
		
		
	}

}

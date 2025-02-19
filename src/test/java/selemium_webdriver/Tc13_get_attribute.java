package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc13_get_attribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement wb = driver.findElement(By.xpath("//input[@id='name']"));
		
		//getAttribute(): will get value of specified attribute from DOM
		//can be used to capture text of input box(sendkeys), which cant be done using gettext()
		String text = wb.getAttribute("value"); //value="shivam" if we entered shivam in input box
		System.out.println(text);
		
		

		
		
		
		
		
		
		
	}

}

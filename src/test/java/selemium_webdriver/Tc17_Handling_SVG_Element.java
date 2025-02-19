package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc17_Handling_SVG_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login to application
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//svg elements: icons/images on webpage that have svg tag in html
		//we a can't write xpath for svg element
		//name() method is used to capture svg elements
		
		//clicking on svg element by copying xpath from DOM
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//svg")).click();
		//NoSuchElementException is thrown
		
		
		//solution: writing xpath for svg element
		
		//1: finding svg element through parent tag <a>
		//replace svg with *[name()='svg']  in xpath
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
		
		//2: finding svg element through width attribute of svg element
		//driver.findElement(By.xpath("//*[name()='svg'and @width='22']")).click();
		
		
		//3: if there is any tag <g> in svg tag then..
		//wrong: //*[name()='svg']//g
		//correct: //*[name()='svg']//*[local-name()='g']
	
		
		
		

		
		
		
		
		
		
		
	}

}

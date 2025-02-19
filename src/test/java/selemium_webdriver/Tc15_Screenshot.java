package selemium_webdriver;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc15_Screenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//1: taking full page screenshot
//		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		//saving ss as fulpage.png
//		sourcefile.renameTo(new File("C:\\Users\\shiva\\eclipse-workspace\\selemium_webdriver\\ScreenShots\\auto.png"));
//		
		//in real time project we write code of screenshot in a user defined method
		//and we call that method with required parameters every time we want to take screenshot
		//we usually take screenshot when there is any failure in test cases
		
		
		//2: taking specefic area screenshot(not full page)
		//introduced in selenium 4
		//in this way we can take screenshot of any webelement
		
		WebElement ss = driver.findElement(By.xpath("//input[@id='name']//parent::div"));
		File sourcefile = ss.getScreenshotAs(OutputType.FILE);
		sourcefile.renameTo(new File("C:\\Users\\shiva\\eclipse-workspace\\selemium_webdriver\\ScreenShots\\partial.png"));
		
		

		
		
		
		
		
		
		
	}

}

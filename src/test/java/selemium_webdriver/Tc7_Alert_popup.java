package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Tc7_Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		//simple alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		String s1 = driver.switchTo().alert().getText();
//		System.out.println(s1);
//		//storing alert
//		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
		
		//confirmation alert
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		Alert alert2 = driver.switchTo().alert();
//		alert2.getText();
		
//		Thread.sleep(null);
//		alert2.dismiss(); 
//		
		//prompt alert
		driver.findElement(By.xpath("//*[@id=\"content\"]//descendant::li[3]/button")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("entering in alert box");
		alert3.accept();
		
		//verifying textbox
		String s2 = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		Assert.assertEquals(s2, "You entered: entering in alert box");
	
		//handeling alert box without switchto()...using explicitwait
		//do below actions post clicking on button which will open alert box
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert4 = wait.until(ExpectedConditions.alertIsPresent());
	    //now using alert4 we can perform operations on alert box
		
		
	}

}

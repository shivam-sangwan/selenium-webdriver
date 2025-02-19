package selemium_webdriver;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc9_Frames {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/"); 
		
		//switch to frame1
		//1: switching using attributes(id,name etc.) of frame
		//driver.switchTo().frame("id1");   //id1 is id of frame
		//driver.switchTo().frame("center");  //center is value of 'align' attribute of frame
		
		
		
		//2: switching using webelement..use this if frame does not have unique attributes
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("in frame1"); 		
		
		
		
		
		//exits current frame and goes to parent frame of current frame
		//driver.switchTo().parentFrame();
	
		//exits all subframes and parent frames and goes to original webpage
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//switching to frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("in frame2");
		
		//switch to inner iframe of frame3
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("in frame3");
		
		
		driver.switchTo().frame(0); //here only 1 frame is present so we used index concept
		driver.findElement(By.xpath("//div[@id ='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent(); //exiting all frames
	
		
		
		
		
		
	
				
		
	

	}

}

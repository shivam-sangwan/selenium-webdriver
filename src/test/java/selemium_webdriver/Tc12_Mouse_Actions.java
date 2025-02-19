package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tc12_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demo.opencart.com/"); 
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//for drag and drop: http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
		
		
//		Actions a1 = new Actions(driver);
//		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
//		WebElement pc = driver.findElement(By.xpath("//a[text()='PC (0)']"));
		
		//a1.moveToElement(desktop).moveToElement(pc).click().build().perform();
		//build(): build/create an action bye combining all actions..here we combined 2 movetoelement actions and 1 click action
		//perform(): perform/complete an action
		//without using these two action cant be performed
		
		//perform() action has also capability to build the action and perform as well
//		a1.moveToElement(desktop).moveToElement(pc).click().perform();  //valid
		
//			
//		//if we just want to create an action and want to perform it later then 
//		//only build() is used
//		Action a2 = a1.moveToElement(desktop).moveToElement(pc).click().build();  //building action
//		a2.perform();  //performing later
//		
		
		//Action vs Actions
		
		//Actions: a class, we can perform various mouse actions like..
		//draganddrop(),doubleclick() by creating objects of this class
		
		//Action: an interface, we can store various actions created by us 
		//by creating reference variable of this interface
		
		
		
		
		
		
		
		
		
		
		//Drag and drop
		WebElement drag = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='box106']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		
		
		
	}

}

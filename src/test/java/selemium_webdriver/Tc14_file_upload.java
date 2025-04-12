package selemium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tc14_file_upload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		//1: uploading single file
//		
		//first find element where file is to be uploaded
		//sendkeys will be used to give path of the file to be uploaded along with file name
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\shiva\\Downloads\\flower.jpg");
        
//	    //verifying if file is uploaded
//		String filetext = driver.findElement(By.xpath("//ul[@id = 'fileList']//li")).getText();
//		Assert.assertEquals(filetext,"flower.jpg");
//		
//		
		
		
		
		
		
		
		
		
		//2: uploading multiple files
		String f1 = "C:\\Users\\shiva\\Downloads\\flower.jpg";
		String f2 = "C:\\Users\\shiva\\Downloads\\peacock.jpg";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(f1+"\n"+f2);
		
		//verifying if files are uploaded
		String filetext1 = driver.findElement(By.xpath("//ul[@id = 'fileList']//li[1]")).getText();
		String filetext2 = driver.findElement(By.xpath("//ul[@id = 'fileList']//li[2]")).getText();
		
		if(filetext1.equals("flower.jpg") && filetext2.equals("peacock.jpg") )
		{
			System.out.println("files uploaded");
		}
		else
		{
			System.out.println("files not uploaded");
		}
		
		
	}

}

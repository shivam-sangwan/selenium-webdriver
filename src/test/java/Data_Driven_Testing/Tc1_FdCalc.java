package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc1_FdCalc {

	public static void main(String[] args) throws IOException {
		
		//calculating interest by taking data from excel file
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String xl = System.getProperty("user.dir") + "\\\\Test_Data\\\\data1.ods";
		String sheet = "sheet1";
		
		ExcelUtils eu = new ExcelUtils(xl);
		int rows = eu.getRowNum(sheet);
		for(int i=1;i<=rows;i++) //i=1 as row starts from 1
		{
			
			//hard coding column values as number of columns are less
			driver.findElement(By.xpath("principle input field")).sendKeys(eu.getCellData(sheet, i, 0));
			driver.findElement(By.xpath("time")).sendKeys(eu.getCellData(sheet, i, 1));
			driver.findElement(By.xpath("rate")).sendKeys(eu.getCellData(sheet, i, 2));
			driver.findElement(By.xpath("calculate button")).click();
			
			//entering value in dropdown
			Select ddi = new Select(driver.findElement(By.xpath("dropdown")));
			ddi.selectByVisibleText(eu.getCellData(sheet, i, 3)); //3rd cell had value of dropdown
			
			//click ke baad jo text aaya uski validation bhi for loop m hi hogi
			
		}

	}

}

package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2_Read_Write_Excel {
    
	public static void main(String[] args) throws IOException {
        
		
		//for understanding purpose only
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
			
		FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"Test_Data//shivam.ods");
		XSSFWorkbook wb1 = new XSSFWorkbook(inputfile);
		XSSFSheet sheet1 = wb1.getSheetAt(0);  //accessing sheet through sheet index
		//XSSFSheet sheet1 = wb1.getSheet("signup"); > accessing sheet through sheet name
		
		int rows = sheet1.getLastRowNum();
		int cells = sheet1.getRow(1).getLastCellNum();
			
			
		for(int i=1;i<=rows;i++)
		{
			
			
		  driver.findElement(By.xpath("")).sendKeys(sheet1.getRow(i).getCell(0).toString()); 
		  driver.findElement(By.xpath("")).sendKeys(sheet1.getRow(i).getCell(1).toString());
		  //tostring will convert whatever is present in cell(numeric or string) into string
			
		  sheet1.getRow(i).getCell(3).setCellValue(123);
		  sheet1.getRow(i).getCell(4).setCellValue("ram");
			
		}

	}

}

package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc11_Webtables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//printing whole table
//		WebElement table = driver.findElement(By.xpath("//table[@name = 'BookTable']"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
				
//		for(WebElement row:rows)
//		{
//			List<WebElement> cols = row.findElements(By.tagName("td"));
//			for(WebElement col:cols)
//			{
//				System.out.println(col.getText() + "\t");
//			}
//		    System.out.println(); //to move to next line
//		}
		
		
		//printing text in 5th row and 1st column(note: first row contains headers)
	    WebElement wb1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]"));
	    System.out.println(wb1.getText());
	    
	    //printimg all data of 6th row
//	    List<WebElement> l2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[7]//td"));
//	    for(WebElement col:l2)
//			{
//				System.out.println(col.getText());
//			}
		
		
		
		//printing number of rows
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
//		System.out.println(rows.size()-1);   //to disclude header row
//				
//		//printing number of columns
//		List<WebElement> cols1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
//		System.out.println(cols1.size());
//		
		//printing header of table i.e. printing all data from 1st row
//	    List<WebElement> l2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
//	    for(WebElement col:l2)
//			{
//				System.out.print(col.getText() + " ");
//			}
//	    System.out.println(); //to move to next line
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//printing all data of table...another method
//	    for(int i=2;i<=rows.size();i++)  //i=2 > to exclude header
//	    {
//	    	for(int j=1;j<=cols1.size();j++)
//	    	{
//	    		//tr["+i+"] > syntex to use int variables in xpath
//	    		//string type variables cannot be used in xpath
//	    		WebElement wb1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"));
//	    	    System.out.print(wb1.getText() + "\t");  //\t will add space
//	    	}
//	    	System.out.println(); //to move to next line
//	    }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    //print book names whose author is mukesh
//	    for(int i=2;i<=rows.size();i++)  //i=2 > to exclude header
//	    {
//	    	
//	    	WebElement wb = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]"));
//	    	if(wb.getText().equals("Mukesh"))
//	    	{
//	    	
//	    		WebElement wb1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]"));
//	    	    System.out.print(wb1.getText() + "\t");  //\t will add space
//	    
//	    	System.out.println(); //to move to next line
//	    	}
//	    }
		
		//print price of every book and total price
//	    int tp=0;
//	    for(int i=2;i<=rows.size();i++)  //i=2 > to exclude header
//	    {
//	    	
//	    	WebElement wb = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]"));
//	    	int price =  Integer.parseInt(wb.getText());
//	    	System.out.println(price); 
//	    	tp += price;  	
//	    }
//	    System.out.println(tp);
//		
	}

}

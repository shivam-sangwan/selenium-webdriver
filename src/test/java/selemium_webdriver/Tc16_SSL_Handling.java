package selemium_webdriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tc16_SSL_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		//handling ssl i.e. accessing website without ssl certificate
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); //accepting insecure certificates
		//ager "true" ki jagah "false" hota to bina ssl certificate ke website ko access nhi kr pate
		
		
		WebDriver driver = new ChromeDriver(options); //we have  to pass "options" in chrome to handle ssl
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badSSL.com/");
		System.out.println(driver.getTitle()); //it will give privacy error
		//so we have done settings above to handle ssl
		
		
		//some websites may require SSL(secured socket layer) certificate to access
		//we will get an error while opening these websites
		//error example: "your connection is not private", "the connection is untrusted"
		

		
		
		
		
		
		
		
	}

}

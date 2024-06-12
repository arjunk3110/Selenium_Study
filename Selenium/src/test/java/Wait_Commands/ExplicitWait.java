package Wait_Commands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait


{
	public static String browser="Firefox";
	public static WebDriver driver;
	
	
	public static void main(String[] args) 
	
	
		{
			if (browser.equals("Chrome"))
			{
			driver=new ChromeDriver();
				
			}
			
			else if(browser.equals("Firefox"))
			{
				driver=new FirefoxDriver();
				
			}
			
			driver.manage().window().maximize();
			
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
			
			
			
				//EXPLICIT WAIT
			
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	         WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
	            
	            
			boolean status= ele.isDisplayed();
			 if(status)
			 {
				 System.out.println("Element found");
			 }
			 
			 else
			 {
				 System.out.println("Element Not Found");
				 
			 }
			
	}
}










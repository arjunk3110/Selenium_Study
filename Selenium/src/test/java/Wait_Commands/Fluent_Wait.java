


package Wait_Commands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_Wait


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
			
			
			
				//FLUENT WAIT
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);

		    WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		    		
		    		{
	
						public WebElement apply(WebDriver t)
						{
							// TODO Auto-generated method stub
							return null;
						}
		    	
		    		});
		
	
			
		}
}











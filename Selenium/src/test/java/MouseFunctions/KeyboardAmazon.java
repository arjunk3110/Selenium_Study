package MouseFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAmazon 
{
	public static WebDriver driver;
	public static String Browser="Chrome";
	

	public static void main(String[] args) throws InterruptedException 
	
	{
		if (Browser.equals("Chrome"))
		{
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-cookies");
			 driver=new ChromeDriver();			
		}
		
		else if(Browser.equals("C"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	        
	        Actions act=new Actions(driver);
	        WebElement Ele= driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']"));
	        
	        act.moveToElement(Ele).click().keyDown(Keys.SHIFT).sendKeys("pendrive").perform();
	        act.sendKeys(Keys.BACK_SPACE).perform();
	        
	      
	        act.moveToElement(Ele).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.SHIFT).perform();
	        Thread.sleep(80);
	        act.sendKeys(Keys.BACK_SPACE).perform();
	        
	        driver.quit();
	        
	     


	}


}

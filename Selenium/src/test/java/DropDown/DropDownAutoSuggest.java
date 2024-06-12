package DropDown;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownAutoSuggest

{
	public static WebDriver driver;
	public static String Browser="Chrome";
	


	public static void main(String[] args) throws InterruptedException{
		if (Browser.equals("Chrome"))
		{
			//ChromeOptions options= new ChromeOptions();
			//options.addArguments("--disable-cookies");
			driver=new ChromeDriver();
			
		}
		
		else if(Browser.equals("Chrome"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 
		//Click On Field
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		//Enter the Text
		WebElement Origin=driver.findElement(By.xpath("//input[@placeholder='From']"));
		Origin.sendKeys("Pune");
		
		
		WebElement OField=driver.findElement(By.xpath(" //span[contains(text(),'Chhatrapati Shivaji International Airport') ] "));
		OField.click();
		
		Thread.sleep(45);
		
		//Click On Field
		driver.findElement(By.xpath("//span[text()='To']")).click();
				
		//Enter the Text
				WebElement Destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
				Destination.sendKeys("Goa");
				Thread.sleep(5000);
				
				Destination.sendKeys(Keys.ARROW_DOWN);
				Destination.sendKeys(Keys.ARROW_DOWN);
				Destination.sendKeys(Keys.ARROW_DOWN);
				Destination.sendKeys(Keys.ENTER);
				
				
				
				//WebElement DField=driver.findElement(By.xpath(" //span[contains(text(),'Goa - Dabolim Airport')] "));
				//DField.click();
				
				driver.quit();
	
	}

}

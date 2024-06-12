package Display_Details;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tags_Count {

	public static WebDriver driver;
	public static String Browser="Chrome";
	
	
    

	public static void main(String[] args) 
	{
		if(Browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if (Browser.equals("Firefox"))
		{
            driver = new FirefoxDriver();
        }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(" https://www.sugarcrm.com");
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		List<WebElement> alltags=	driver.findElements(By.tagName("option"));
		System.out.println("Number of Tags Are" + alltags.size());

}
}

package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp 
{
    public static String browser = "Chrome";
    public static WebDriver driver;
    
    
    

	public static void main(String[] args) throws InterruptedException
	
	{
		if (browser.equals("Chrome"))
		{
            driver = new ChromeDriver();
            
        } 
		else if (browser.equals("Firefox"))
		{
            driver = new FirefoxDriver();
        }

        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(200);
        driver.findElement(By.id("alert1")).click();
        
        Alert alert = driver.switchTo().alert();
        
       String str= alert.getText();
        System.out.println(str);
        alert.accept();
        
        

	}

}

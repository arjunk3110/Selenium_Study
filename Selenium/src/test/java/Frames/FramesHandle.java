package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesHandle 
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
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
        int FramesCount=driver.findElements(By.tagName("iframe")).size();
        System.out.println(FramesCount);
        
        		
        		
        		
        driver.findElement(By.xpath(" //button[@class='fc-button fc-cta-consent fc-primary-button']  ")).click(); 
        
        driver.findElement(By.id("name")).sendKeys("Hello");
        Thread.sleep(6000);
        
        
        
   // Switch to frame and perform actions inside the frame
        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select courseDropdown = new Select(driver.findElement(By.id("Course")));
        courseDropdown.selectByVisibleText("Java");
        Thread.sleep(400);
       
        
   // Switch back to default content and continue actions     
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("World");
        
        

	}

}

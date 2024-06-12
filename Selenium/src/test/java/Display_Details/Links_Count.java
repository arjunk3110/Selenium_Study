package Display_Details;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Count 
{
	public static String Browser="Chrome";
    public static WebDriver driver;
    
    

	public static void main(String[] args) 
	{
		if (Browser.equals("Chrome"))
		{
            driver = new ChromeDriver();
            
        } 
		
		else if (Browser.equals("Firefox"))
		{
            driver = new FirefoxDriver();
        }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.linkedin.com/signup");
        
        //CAPTURE ALL THE LINKS
        List <WebElement> Links=driver.findElements(By.xpath("//a"));
        
        //COUNT THE NUMBER OF LINKS
        int linkcount=Links.size();
        System.out.println("Total number of links avaialble " +linkcount);
        
        //DISPLAY ALL LINKS
        for(int i=0;i<Links.size();i++)
        {
        	  String LinkName= Links.get(i).getText();
        	  System.out.println("All Links " +LinkName);
        }
       
        
    
        

	}

}

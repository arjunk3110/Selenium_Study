package Display_Details;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button_Count

{
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
		driver.get("https://www.linkedin.com/signup");
		
		
		   //CAPTURE ALL THE BUTTONS
		 List<WebElement> Buttons= driver.findElements(By.xpath(" //button[@type='submit']"));
		 
		 
		   //COUNT THE NUMBER OF BUTTON
	     int Buttoncount=Buttons.size();
	     System.out.println("Total number of Buttons avaialble " +Buttoncount);
		

	     //DISPLAY BUTTONS
	     for(int i=0;i<Buttons.size();i++)
	        {
	        	  String ButtonName= Buttons.get(i).getText();
	        	  System.out.println("All Links " +ButtonName);
	        }
	       
	}

}

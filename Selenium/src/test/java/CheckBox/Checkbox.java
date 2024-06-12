package CheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

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

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        
        /*
        //SELECT SINGLE CHECKBOX
        WebElement Checkbox=driver.findElement(By.xpath( "  //input[@value='yellow']"));
        Checkbox.click();
        System.out.println(Checkbox.isSelected());
        */
        
       
        //SELECT ALL CHECK BOXES AND PRINT VALUES
       List <WebElement> AllCheckBoxes= driver.findElements(By.xpath("  //input[@type='checkbox']  "));
        for(int i=0;i<AllCheckBoxes.size();i++)
        {
        	AllCheckBoxes.get(i).click();
        	System.out.println(AllCheckBoxes.get(i).getAttribute("value"));
        	
        }
        
    
    
        
        
        //SELECT A PARTICULAR CHECKLIST
        List <WebElement> Checkbox= driver.findElements(By.xpath("  //input[@type='checkbox']  "));
        for(int j=0;j<Checkbox.size();j++)
        {
        	if(Checkbox.get(j).getAttribute("value").equalsIgnoreCase("Green"))
        	{
        		Checkbox.get(j).click();
        	}
        
        }
        
        driver.close();
             
}
}


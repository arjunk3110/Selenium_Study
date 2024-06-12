package UI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage
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
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.close();

	}
}






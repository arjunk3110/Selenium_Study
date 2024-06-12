package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiSelect

{
	public static WebDriver driver;
	public static String Browser="Chrome";
	
	public static void main(String[] args) 
	
	{
		if (Browser.equals("Chrome"))
		{
		driver=new ChromeDriver();
			
		}
		
		else if(Browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://output.jsbin.com/osebed/2");
		

//SELECT ALL VALUES FROM MULTI SEELCT DROPDWON
		
		Select dropdown= new Select(driver.findElement(By.id("fruits")));
		
		
		//GET ALL OPTIONS
		List<WebElement> list=dropdown.getOptions();
		
		
		for(int i=0;i<list.size();i++)
		{
			  
			  dropdown.selectByIndex(i);
			  System.out.println(list.get(i).getText()); 
	
		}
	
			
		List<WebElement> Allitems=dropdown.getAllSelectedOptions();
		System.out.println(Allitems.size());
		
		
		
		
		dropdown.getAllSelectedOptions();
		driver.close();

	}

}

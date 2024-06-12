package WindowHandles;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
    public static String browser = "Chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equals("Chrome")) {
      
            driver = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }

        driver.get("https://seleniumpractise.blogspot.com/2017/07");
        System.out.println("Parent URL = " + driver.getCurrentUrl());
        
        //Capture the Current Window
        String parentWindow = driver.getWindowHandle();

        // Click on the Google link
        driver.findElement(By.xpath("//a[contains(@href,'www.google.com')]")).click();

        
        // WINDOW HANDLES
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Total Windows open = " + allWindows.size());

        
        // CAPTURE WINDOW FROM SET
        Iterator<String> itr = allWindows.iterator();
        String parentID = itr.next();
        String childID = itr.next();

        // PASS DRIVER TO CHILD WINDOW
        driver.switchTo().window(childID);


        driver.close();
        Thread.sleep(300);

        driver.switchTo().window(parentWindow);

        // Click on the Facebook link
        driver.findElement(By.xpath("//a[contains(@href,'www.facebook.com')]")).click();

        allWindows = driver.getWindowHandles(); // Get updated window handles
        itr = allWindows.iterator();

        while (itr.hasNext()) {
            String windowID = itr.next();
            if (!windowID.equals(parentWindow) && !windowID.equals(childID)) {
                driver.switchTo().window(windowID);
                break;
            }
        }

        System.out.println("Child Tab URL (Facebook) = " + driver.getCurrentUrl());

        // Clean up and close the browser
        driver.close();
    }
}

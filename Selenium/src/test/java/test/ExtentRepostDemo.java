package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPage;

public class ExtentRepostDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test123 = extent.createTest("Google Search test 1", "this is the test to validate search function");
        
        System.setProperty("webdriver.chrome.driver", "C:\\data\\selenium\\driver\\chromedriver.exe");
        driver = new ChromeDriver ();
        
        
        test123.log(Status.INFO, "Starting test case");
        
          		// go to google.com
        		 driver.get("https://www.google.com/");
        test123.pass("Navigated to google.com");
        		 // search in search line
        		 //driver.findElement(By.name("q")).sendKeys("Enter something what you want to search");
        test123.pass("enter text in searchbox");
        		 GoogleSearchPage.textbox_search(driver).sendKeys("Some text here again");
        		 	 
        		 //click on search button
        		 //driver.findElement(By.name("btnK")).click();
        		 //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        		 //driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);
        
        		 test123.pass("pressed keyboard enter key");
        	
        		 GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
        		 
        		 //close browser
        		 driver.close();
        		 test123.pass("close the browser");
        		 System.out.println("Test completed successfully");
        		 test123.info("test completed");
        		 extent.flush();
        		 
	}
	
}

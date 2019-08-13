package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch ();
	}
 public static void googleSearch () {
	 System.setProperty("webdriver.chrome.driver", "C:\\data\\selenium\\driver\\chromedriver.exe");
	 driver = new ChromeDriver ();
   
	 
	 // go to google.com
	 driver.get("https://www.google.com/");
		 
	 // search in search line
	 //driver.findElement(By.name("q")).sendKeys("Enter something what you want to search");
	 
	 GoogleSearchPage.textbox_search(driver).sendKeys("Some text here again");
	 	 
	 //click on search button
	 //driver.findElement(By.name("btnK")).click();
	 //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 //driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);
	 
	 GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	 
	 //close browser
	 driver.close();
	 
	 System.out.println("Test completed successfully");
	 
	 
 }
 
 
}

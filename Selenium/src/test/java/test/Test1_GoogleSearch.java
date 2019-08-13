package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch ();
	}
 public static void googleSearch () {
	 System.setProperty("webdriver.chrome.driver", "C:\\data\\selenium\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver ();
   
	 
	 // go to google.com
	 driver.get("https://www.google.com/");
	 
	 // search in search line
	 driver.findElement(By.name("q")).sendKeys("Enter something what you want to search");
	 
	 //click on search button
	 //driver.findElement(By.name("btnK")).click();
	 //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);
	 
	 //close browser
	 driver.close();
	 
	 System.out.println("Test completed successfully");
	 
	 
 }
 
 
}

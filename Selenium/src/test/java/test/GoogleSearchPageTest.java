package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
private static WebDriver driver = null;
		
 public static void main(String[] args) {
	 GoogleSearchTest ();
}
  public static void GoogleSearchTest () {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\data\\selenium\\driver\\chromedriver.exe");
	 driver = new ChromeDriver ();
	 GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
	 
	 driver.get("https://www.google.com/");
	 searchPageObj.setTextInSearchBox("Some text here");
	 
	 searchPageObj.clickSearchButton();
	 
	 driver.close();
	 
	 System.out.println("Test case compleatle Complete");
 }
 
 
}

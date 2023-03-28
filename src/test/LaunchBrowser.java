package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.chrome.driver","chromedriver.exe"); //if on lab or MAC then just write chromedriver.exe
			
		WebDriver driver = new ChromeDriver();//webDriver is an interface we can't create object if webdriver so we called chromeDriver
		
		driver.get("https://www.simplilearn.com/");*/
		
				
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);

		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
	}

}

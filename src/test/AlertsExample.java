package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		//JavascriptExecutor object = (JavascriptExecutor) driver;  
		//object.executeScript("arguments[0].scrollIntoView();",element);
		
		WebElement ele = driver.findElement(By.id("alertButton"));
		ele.click();
		
		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();
		
		WebElement ele1 = driver.findElement(By.id("confirmButton"));
		ele1.click();
		
		obj=driver.switchTo().alert();
		Thread.sleep(2000);
		obj.dismiss();
	}

}

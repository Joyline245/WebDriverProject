package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		WebElement from =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to =driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions obj = new Actions(driver);
		
		//sendkey , key will activate keyboard so it'll give all options from keyboard
		
		/*obj.sendKeys(Keys.PAGE_DOWN)	
		.dragAndDrop(from, to)
		.build()
		.perform();*/
		
		//For hover on the element 
		obj.moveToElement(from).build().perform();		
	
		//if its only drag and drop 
		obj.dragAndDrop(from, to).build().perform();
		
		
	}

}

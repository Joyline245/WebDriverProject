package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//Maximize
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	//Username
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("abc@xyz.com");
	
	//Password
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("Abcd@12345");
	
	/*//Click on the login button
	WebElement loginbtn = driver.findElement(By.name("login"));
	loginbtn.click();*/
	
	
	//click on new account 
	
	WebElement NewAccount = driver.findElement(By.id("u_0_9_4D"));
	NewAccount.click();
	}

}

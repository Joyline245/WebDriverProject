package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
				
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//Click on New account 
		
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		
		//First Name 
		WebElement FName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		FName.sendKeys("ABCD");
		
		//Surname Name 
		WebElement SName = driver.findElement(By.xpath("//input[@name='lastname']"));
		SName.sendKeys("xyz");
		
		//Mobile Number 
		WebElement MNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MNumber.sendKeys("123456789");
		
		//Password 
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		Password.sendKeys("Qwerty@12345");
		
		//Select Date of Birth 
		
		WebElement selectedDay = driver.findElement(By.xpath("//select[@title='Day']/option[@selected=1]"));
		System.out.println("The default day is " +selectedDay.getText()); //To print in console
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		// ddDay.selectByVisibleText("10");	
		ddDay.selectByValue("10");
		
		// For Month 
		WebElement selectedMonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected=1]"));
		System.out.println("The default Month is " +selectedMonth.getText()); //To print in console
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select mMonth = new Select(month);
		// ddDay.selectByVisibleText("May");	
		mMonth.selectByValue("5");
		
		// For year 
		WebElement selectedYear = driver.findElement(By.xpath("//select[@title='Year']/option[@selected=1]"));
		System.out.println("The default Year is " +selectedYear.getText()); //To print in console
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yYear = new Select(year);
		// ddDay.selectByVisibleText("1995");	
		yYear.selectByValue("1995");
		
		
		//Display all values in console 
		/*
		List<WebElement> DisplayDay = driver.findElements(By.xpath("//select[@title='Day']/option"));
		for(WebElement xDay :DisplayDay) {
			System.out.println(xDay.getText());
		}*/
			
		List<WebElement> DisplayMonth = driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement xMonth :DisplayMonth) {
			System.out.println(xMonth.getText());
		}
		
		//To display Year in console
		/*
		List<WebElement> DisplayYear = driver.findElements(By.xpath("//select[@title='Year']/option"));
		for(WebElement xYear :DisplayYear) {
			System.out.println(xYear.getText());*/
		
		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		Female.click();

		
		/* Method 1 using Replace function 
		
		String Gender ="Male";
		String genderXpath = "//label[text()='placeholder']";
		String NewXpath = genderXpath.replace("placeholder", Gender);
		
		System.out.println("New Path is "+NewXpath);*/
		
		
		//Method 2 using concatenation 
		
		String Gender ="Male";
		String NewXpath = "//label[text()='" +Gender + "']";
			
		WebElement genderElem = driver.findElement(By.xpath(NewXpath));
		genderElem.click();
		
		}
		
		
	}



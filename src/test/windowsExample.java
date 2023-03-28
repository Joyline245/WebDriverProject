package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement newTab =driver.findElement(By.id("tabButton"));
		
		String parentwin = driver.getWindowHandle();
		System.out.println("The parent window is " + parentwin);
		
		newTab.click();
		
		Set<String> Allwin = driver.getWindowHandles();
		String Childwin= " ";
		
		for(String win:Allwin) {
			System.out.println("The win ID " +win);
			
			if(!win.equals(parentwin)) {
				Childwin = win;
			}
		}
	System.out.println("The child window is "+ Childwin);
		
	driver.switchTo().window(Childwin);
	
	WebElement childheader = driver.findElement(By.id("sampleHeading"));
	System.out.println("Header in child is " +childheader.getText());
	
	driver.close();
	
	//===================================Second Window =============================================
	//without switching to parent window code doesn't work 
	
	driver.switchTo().window(parentwin);
	
	WebElement NewWindow = driver.findElement(By.id("windowButton"));
	NewWindow.click();
	Thread.sleep(2000);
	
	Set<String> Allwin1 = driver.getWindowHandles();
	String Childwin1= " ";
	
	for(String win1:Allwin1) {
		System.out.println("The win Id "+win1);
		
		if(!win1.equals(Allwin1)) {
			Childwin1 = win1;
		}
	}
	System.out.println("The child window is "+ Childwin1);
	
	driver.switchTo().window(Childwin1);
	
	childheader = driver.findElement(By.id("sampleHeading"));
	System.out.println("The Child header is Second window is " + childheader.getText());
	
	driver.quit();
	
	
	
	}
	

}

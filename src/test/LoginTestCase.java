package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Step-1 : Launch Chrome browser and open simplilearn website
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		// Step-2 : Maximize the browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
		
		// Step-3 : Click on the login link on top right corner
		
		System.out.println("The title of the page is " + driver.getTitle());  //it'll give title i.e Simplilearn | Online Courses - Bootcamp & Certification Platform
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		String location = LoginLink.getAttribute("href");   // It'll give href in console 
		System.out.println("The link will take you to " +location);
	    LoginLink.click(); //we need title before clicking on log in 
		
		// Step-4 : Enter User name
		
		WebElement UserName = driver.findElement(By.name("user_login"));  // user_login name was using inspect 
		UserName.sendKeys("abc@xyz.com");
		
		// Step-5 : Enter the Password
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
		
		//Step-6: Click on remember me check box 
		
		WebElement remember = driver.findElement(By.className("rememberMe"));
		remember.click();

		
		// Step-7 : Click on the login button
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
		// Step-8: Validate the login was successful
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		// System.out.println("The error message is " +errorMsg); This was printing in console
		String expErrrorMsg = "The email or password you have entered is invalid.";
		
		if(error.isDisplayed() && errorMsg.equals(expErrrorMsg)) { //Now there are 2 if conditions it'll check whether error message is displayed then is it equal as expected
			System.out.println("TC passed");
			}else {
				System.out.println("TC failed");
			}
		
		//Step-9 : get all link present 
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));  //USING findelelments as we have more than one and list is used 
		
		System.out.println("Total number of links are " +Alllinks.size());
		
		for(WebElement link :Alllinks)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		
		//Step 10 : Close the browser
		
		driver.close();
		
		
	}
}

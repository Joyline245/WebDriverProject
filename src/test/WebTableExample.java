package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	//	List<WebElement> Rows = driver.findElement(By.cssSelector("table#customers>tbody>tr"));
		
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total no. of rows " +Rows.size());
		
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total no. of columns " +Columns.size());
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("The data is "+data.getText());
		
		for(int i=2;i<=Rows.size();i++) //To display all the values from each row
		{
			List<WebElement> Columnsdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+ i +"]/td"));
			System.out.println("The Company is "+Columnsdata.get(0).getText()+" The Contact is "+Columnsdata.get(1).getText()+" The Country is "+Columnsdata.get(2).getText());
		}
		
			
	}

}

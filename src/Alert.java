import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/ravib/Desktop/Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try 
		{
			/*driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			WebElement alertpopup = driver.findElement(By.className("btn btn-default btn-lg"));
			alertpopup.click();
			Thread.sleep(3000);
			org.openqa.selenium.Alert okpop = driver.switchTo().alert();
			okpop.accept();
			Thread.sleep(3000);
			driver.switchTo().frame("okpopup");*/
			
			
			/*IFrame*/
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		WebElement iframetxt = driver.findElement(By.id("IF1"));
		driver.switchTo().frame(iframetxt);
		
			
			WebElement txtLastName = driver.findElement(By.name("lastname"));
			txtLastName.sendKeys("Yuva");
			
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			System.out.println("ravi");
			
			
			
			
			
			
			

		} catch (Exception e) 
		{
			// TODO: handle exception
		}
		driver.close();
		driver.quit();
		
	}
	

}

package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seljava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C:/Users/ravib/Desktop/Jars/chromedriver.exe");
		// Object declaring
		WebDriver driver = new ChromeDriver();
		// Browser maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// try catch block 
		try 
		{
			// Calling Browser
			driver.get("https://www.google.com");
			//WebElement txtname = driver.findElement(By.name("q"));
			//txtname.sendKeys("Success");
			WebElement txtname = driver.findElement(By.xpath("//input[@name ='q']"));
			txtname.sendKeys("success");
			WebElement btnname = driver.findElement(By.name("btnK"));
			btnname.click();
			
			
			//Browser to remain 
			Thread.sleep(3000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		//Browser close
		driver.close();
		//Browser Quit
		driver.quit();
		

	}

}

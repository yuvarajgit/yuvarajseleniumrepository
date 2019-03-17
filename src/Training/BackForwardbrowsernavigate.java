package Training;

import java.awt.Transparency;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardbrowsernavigate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/ravib/Desktop/Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try 
		{
		driver.get("https://www.google.com");
		WebElement Signin = driver.findElement(By.xpath("//*[text()='Sign in']"));
		Signin.click();
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com");
	    
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		driver.navigate().refresh();
			
		} catch (Exception e) 
		
		{
			// TODO: handle exception
		}
		driver.close();
		driver.quit();
	}
	




}

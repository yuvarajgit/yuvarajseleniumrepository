package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumeasy {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.Chromedriver", "")
		System.setProperty("webdriver.chrome.driver", "C:/Users/ravib/Desktop/Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try 
		{
			driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
			WebElement txtfirstname = driver.findElement(By.name("first_name"));
			String Firstname = "yuvaraj";
			txtfirstname.sendKeys(Firstname);
			Thread.sleep(3000);
			WebElement txtlastname = driver.findElement(By.name("last_name"));
			String Lastname ="Murugesan";
			txtlastname.sendKeys(Lastname);
			Thread.sleep(3000);
			WebElement txtemailaddress = driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']"));
			txtemailaddress.sendKeys("yuvaraj.ajii@gmail.com");
			Thread.sleep(3000);
			WebElement txtPhone = driver.findElement(By.name("phone"));
			txtPhone.sendKeys("04422453096");
			Thread.sleep(3000);
			WebElement txtAdress = driver.findElement(By.name("address"));
			txtAdress.sendKeys("No:32/13");
			Thread.sleep(3000);
			WebElement txtcity = driver.findElement(By.name("city"));
			txtcity.sendKeys("Chennai");
			Thread.sleep(3000);
			WebElement txtzip = driver.findElement(By.name("zip"));
			txtzip.sendKeys("600032");
			Thread.sleep(3000);
			WebElement txtwebordmn = driver.findElement(By.name("website"));
			txtwebordmn.sendKeys("https://www.seleniumhq.com");
			Thread.sleep(3000);
			WebElement rdnbtnhosting = driver.findElement(By.xpath("//*[@type='radio' and @value='yes']"));
			rdnbtnhosting.click();
			Thread.sleep(3000);
			//WebElement txtprodesc = driver.findElement(By.name("comment"));
			//txtprodesc.sendKeys("Superb");
			//Thread.sleep(3000);
			WebElement btnsubmit = driver.findElement(By.xpath("//*[@type ='submit']"));
			btnsubmit.click();
			Thread.sleep(5000);
			
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		driver.close();
		driver.quit();
	}

}

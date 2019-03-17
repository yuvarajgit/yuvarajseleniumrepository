import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/ravib/Desktop/Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		try
		{
		  driver.get("https://www.toolsqa.com/automation-practice-form/");
		  WebElement ddlcontinents = driver.findElement(By.id("continents"));
		  Select select = new Select(ddlcontinents);
		  select.selectByVisibleText("Australia");
		  Thread.sleep(3000);
		 // WebElement chkProfession = driver.findElement(By.id("profession-0"));
		  select.getOptions();
		  List<WebElement> options = select.getOptions();
		  for(int i= 0; i<options.size(); i++)
		  {
			  String value = options.get(i).getText();
			  System.out.println(value);
		  }
		  Alert okpopup = driver.switchTo().alert();
		  
		  driver.switchTo()
		  
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
          driver.close();
          driver.quit();
	}

}

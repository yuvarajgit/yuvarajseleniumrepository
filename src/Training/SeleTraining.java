package Training;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleTraining {

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
			//Navigate to other Site:
			driver.navigate().to("https://facebook.com");
			//Navigate to Back to Google page:
			driver.navigate().back();
			//Navigate to Forward
			driver.navigate().forward();
			//Calling google url using string:
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			//Getting the Title google:
			String value = driver.getTitle();
			System.out.println(value);
			//Getting the Page Source
			//String PageSource = "yuvaraj";
			String PageSource = driver.getPageSource();
			PageSource.length();
			//How to get the Page Source Length:s
			int pagesourcelengthSelenium =PageSource.length();
			System.out.println(pagesourcelengthSelenium);
			
			
		} 
		catch (Exception e) 
		{
			
		}
		driver.close();
		driver.quit();

	}

}

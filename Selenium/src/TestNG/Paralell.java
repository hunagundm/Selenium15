package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Paralell {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void test1(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		if(browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
		}
	}

}

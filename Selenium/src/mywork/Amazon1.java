package mywork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sonata watch");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='SINOBI Sport Watch for Men Military Rubber Digital and Quartz Mens Watches with Alarm, Luminous Dual Time Auto Date Watches, 47mm Big Dial']")).click();

	}

}

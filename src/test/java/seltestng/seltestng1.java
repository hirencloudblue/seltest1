package seltestng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seltestng1 {
 
	@Test
	public static void main(String[] args) 
	{
	// System.setProperty("webdriver.chrome.driver","D:\\chromedriver80.exe");
	System.setProperty("webdriver.gecko.driver", "/root/Downloads/geckodriver");
	//ChromeOptions chromeOptions = new ChromeOptions();
	// chromeOptions.addArguments("--headless");
	// WebDriver driver = new ChromeDriver(chromeOptions);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://192.168.1.90:3001/");
	driver.findElement(By.name("login")).sendKeys("devops");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.name("click")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String test = driver.findElement(By.name("test")).getText();
	assertEquals(test, "Login Succeeded");
	System.out.println("Test Succeeded!!");
	driver.quit();
		
	}
}
	



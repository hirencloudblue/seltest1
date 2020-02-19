package seltestng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class seltestng1 {
 @Test
	
	public static void runFromSeltestng()
	{
	// System.setProperty("webdriver.chrome.driver","D:\\chromedriver80.exe");
	System.setProperty("webdriver.gecko.driver", "geckodriver");
	System.out.println("Hi This is a Selenium Test Case");
	//ChromeOptions chromeOptions = new ChromeOptions();
	// chromeOptions.addArguments("--headless");
	// WebDriver driver = new ChromeDriver(chromeOptions);

	WebDriver driver = new FirefoxDriver();
	driver.get("http://192.168.1.90:3001/");
	driver.findElement(By.name("login")).sendKeys("devops");
	driver.findElement(By.name("password")).sendKeys("test");
	driver.findElement(By.name("click")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	String test = driver.findElement(By.name("test")).getText();
	AssertJUnit.assertEquals(test, "Login Succeeded");
	System.out.println("Test Succeeded!!");
	driver.quit();

	}
}
	



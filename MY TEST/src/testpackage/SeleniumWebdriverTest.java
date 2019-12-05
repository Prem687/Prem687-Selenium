package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumWebdriverTest {
	
	WebDriver driver = new ChromeDriver();

  @Test
  public void MyFirstTestNGTestCase() throws InterruptedException {
		String title = driver.getTitle();
		System.out.print("Current page title is : " + title);

		WebElement user = driver.findElement(By.name("userName"));
		user.sendKeys("test");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("test");
		WebElement signin = driver.findElement(By.name("login"));
		signin.click();

		Thread.sleep(1000);

		System.out.print("\n'SUCCESSFUL EXECUTION!!!");
	}
  
  @BeforeMethod
  public void startFireFox() {
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
  
  @AfterMethod
  public void cleaupProc() {
		System.out.print("\nBrowser close");
		driver.quit();
	}
}
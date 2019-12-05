package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		
		WebElement un = driver.findElement(By.id("identifierId"));
		Actions a = new Actions(driver);
		a.sendKeys(un, "test").build().perform();

	}

}

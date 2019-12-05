package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com");
		//Thread.sleep(5000);
		
		WebElement lt = driver.findElement(By.linkText("Products"));
		Actions a = new Actions(driver);
		a.moveToElement(lt).build().perform();
		Thread.sleep(3000);
		
		WebElement ln = driver.findElement(By.linkText("Loans"));
		a.moveToElement(ln).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Gold Loan")).click();
		
	}

}
	
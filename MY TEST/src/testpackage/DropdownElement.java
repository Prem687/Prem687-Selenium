package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubssssdd

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByIndex(11);
		Thread.sleep(3000);
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Oct");
		Thread.sleep(5000);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1993");
		Thread.sleep(5000);
		
		driver.close();
		
		/*Select day1 = new Select(driver.findElement(By.id("day")));
		day1.deselectByIndex(11);
		Thread.sleep(3000);
		
		Select month1 = new Select(driver.findElement(By.id("month")));
		month1.deselectByVisibleText("Oct");
		Thread.sleep(3000);
		
		Select year1 = new Select(driver.findElement(By.id("year")));
		year1.deselectByValue("1993");*/
				
		
	}

}

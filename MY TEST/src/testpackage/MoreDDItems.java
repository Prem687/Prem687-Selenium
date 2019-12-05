package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MoreDDItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();		
		driver.get("http://toolsqa.com/automation-practice-form/");		
		driver.manage().window().maximize();
		
		Select sc = new Select(driver.findElement(By.name("selenium_commands")));
		
		//return a list of items in the drop down
		List<WebElement> dl = sc.getOptions();
		System.out.println(dl.size());
		
		//multiple item selected drop down or not
		boolean x = sc.isMultiple();
				
		if(x==true) {
			
			Actions a = new Actions(driver);
			
			//a.keyDown(Keys.CONTROL).build().perform();
			
			a.click(dl.get(1)).build().perform();
			
			Thread.sleep(3000);
			
			a.click(dl.get(2)).build().perform();
			
			//a.keyUp(Keys.CONTROL).build().perform();
		}
		
		else {
			System.out.println("it is not support to select more items dropdown");
		}
	}

}

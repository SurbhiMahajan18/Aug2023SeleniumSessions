package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
//				act.sendKeys(Keys.PAGE_DOWN).perform();
//				Thread.sleep(2000);
//				act.sendKeys(Keys.PAGE_UP).perform();
		
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(3000);
		
		
		//scrollToElement
		//act.scrollToElement(driver.findElement(By.linkText("Brands"))).click(driver.findElement(By.linkText("Brands"))).perform();
		
		Thread.sleep(4000);
		//Control+F5
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
	}

}

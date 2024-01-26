package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
driver = new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree");
Thread.sleep(2000);
driver.findElement(By.id("justAnInputBox")).click();
Thread.sleep(3000);
	}
}

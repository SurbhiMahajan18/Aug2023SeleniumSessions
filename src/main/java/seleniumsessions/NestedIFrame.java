package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		WebElement FirstFrame = driver.findElement(By.id("pact1"));
		driver.switchTo().frame(FirstFrame);
		driver.findElement(By.id("inp_val")).sendKeys("Meera");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Sharma");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Job");
		
	
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Meera");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Help?")).click();
		

	}

}

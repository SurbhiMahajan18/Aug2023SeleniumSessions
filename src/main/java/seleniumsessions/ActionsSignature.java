package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver= new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		
		WebElement signPad =driver.findElement(By.cssSelector("canvas#signature-pad"));
		
		Actions signature1 = new Actions(driver);
		signature1.click(signPad);
								signature1.moveToElement(signPad, 30,20)
								.clickAndHold(signPad)
								.moveToElement(signPad, -200, -50)
								.moveByOffset(-20, -10)
								.moveByOffset(30, 50)
								.moveByOffset(100, 50)
								.release(signPad)
								.build().perform();
								
								
									
								
		
		

	}

}

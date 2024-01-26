package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownJqueryExample2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='justAnInputBox']")).click();
		List <WebElement> choicesList= driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		for(WebElement e:choicesList)
		{
			String text = e.getText();
			//		System.out.println(text);
			//		if(text.contains("choice 2"))
			//				{
			try {
				e.click();// after 15th span element, it will give ElementNotInteractableException exception, hence has to be written in try catch block
			}
			catch(ElementNotInteractableException ex)
			{
				System.out.println("drop down choices are over");
				break;//drop down choices are over
			}
			//break;
		}
	}

}	



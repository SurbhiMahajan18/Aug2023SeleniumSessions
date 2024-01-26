package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHanldeWithoughSelect {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		Thread.sleep(5000);
		By country = By.cssSelector("select[id='Form_getForm_Country']>option");
		selectDropDownValue(country, "India");

	}

	public static void selectDropDownValue(By locator, String value)
	{
		List <WebElement> optionsList = driver.findElements(locator);
		for(WebElement e: optionsList)
		{
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}

		}
	}

}

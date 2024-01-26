package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		By img = By.cssSelector("#imageTemplateContainer>img");
		By frameEle = By.xpath("//iframe[contains(@id, 'frame-one')]");
		By textBox =By.cssSelector("input#RESULT_TextField-10");
		By header = By.cssSelector("h3.details__form-preview-title");
		
		waitforVisibilityofElement(img, 10).click();

		waitForFrameByLocator(frameEle, 10);
		
		waitforVisibilityofElement(textBox, 10).sendKeys("Ramnagar, 1002");

		driver.switchTo().defaultContent();

		String headerVal = waitforVisibilityofElement(header, 5).getText();
		System.out.println(headerVal);


	}

	public static WebElement waitforVisibilityofElement(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}
	
	//*******utills********//

	public static void waitForFrameByLocator(By frameLocator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfElementLocated(frameLocator));
	}




}

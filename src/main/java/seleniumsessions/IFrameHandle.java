package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();
		
		WebElement frameWebElement =  driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]"));
		driver.switchTo().frame(frameWebElement);
		
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Vrana");
		//driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
	System.out.println(text);
	}

}

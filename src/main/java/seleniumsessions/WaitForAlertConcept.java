package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();
	}


	public static Alert waitForJSAlert(int timeOut) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void acceptJSAlert(int timeOut) 
	{
		waitForJSAlert(timeOut).accept();
	}

	public static void dismissJSAlert(int timeOut) 
	{
		waitForJSAlert(timeOut).dismiss();
	}
	public static String getJSAlertText(int timeOut) 
	{
		return waitForJSAlert(timeOut).getText();
	}

	public static void getValueonJSAlert(int timeOut, String val) 
	{
		waitForJSAlert(timeOut).sendKeys(val);
	}

}


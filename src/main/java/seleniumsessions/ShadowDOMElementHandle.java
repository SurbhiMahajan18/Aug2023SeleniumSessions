package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");

		String jsPathPizzaScript = " return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";

		JavascriptExecutor js = (JavascriptExecutor)(driver);
		WebElement pizzapathWE = (WebElement)js.executeScript(jsPathPizzaScript);
		
		pizzapathWE.sendKeys("Chicken Pizza");
	}

}

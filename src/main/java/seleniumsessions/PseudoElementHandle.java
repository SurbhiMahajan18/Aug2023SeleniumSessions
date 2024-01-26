package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	String script =" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname'] \"), '::before').getPropertyValue('content')";
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String mandatory_text = js.executeScript(script).toString();
	System.out.println(mandatory_text);
	if(mandatory_text.contains("*"))
	{
		System.out.println("first name is mandatory");
	}
	}

}

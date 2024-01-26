package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
JavascriptExecutor js = (JavascriptExecutor)driver;
		//		String text = js.executeScript("return document.title").toString();
		//		System.out.println(text);

		//jsalerts
		//JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		//				String title = jsUtil.getTitleByJS();
		//				System.out.println(title);
		//				
		//				jsUtil.generateJSAlert("hello there??????????????  are you fine");

		//getInnerText
//		driver.get("https://classic.crmpro.com/");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String text = js.executeScript("return document.documentElement.innerText;").toString();
//		System.out.println(text);
//		System.out.println("-------------------Test1------------------");
//		if ((text).contains("Alerts"))
//		{
//			System.out.println("Yes you do have alerts here");
//		}
//		
		//scrollPage down and up
		//driver.get("https://amazon.com");
//		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		Thread.sleep(2000);
//		jsUtil.scrollPageDownJS();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUpJS();
//		
WebElement ele=driver.findElement(By.linkText("Newsletter"));

js.executeScript("arguments[0].scrollIntoView(true)", ele);

		

	}

}

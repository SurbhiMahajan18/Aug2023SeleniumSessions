package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://amazon.com");
		List <WebElement> imgValueList= driver.findElements(By.tagName("img"));
		System.out.println(imgValueList.size());
		for(WebElement e:imgValueList)
		{
			String altVal = e.getAttribute("alt");
			String getSrcVal = e.getAttribute("src");
			System.out.println(altVal+ " :===== " +getSrcVal);
			System.out.println();
		}
		driver.close();
			}
}

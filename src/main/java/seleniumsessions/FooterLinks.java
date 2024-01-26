package seleniumsessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/"); 
		
//		List <WebElement> footerLinks  = driver.findElements(By.xpath("//footer//a"));
//		for(WebElement e: footerLinks)
//		{
//			String text = e.getText();
//			System.out.println(text);
//		}
		By footerLinks = By.xpath("//footer//a");
		ElementUtil eleUtil = new ElementUtil(driver);
		int footerLinksCount = eleUtil.getElementsCount(footerLinks);
		System.out.println(footerLinksCount);
		List <String> footerLinksText =eleUtil.getElementsTextList(footerLinks);
		System.out.println(footerLinksText);
		List <String> expfooterLinksText =Arrays.asList("About  Us", "Delivery Information", "Privacy Policy");
		if(footerLinksText.containsAll(expfooterLinksText))
			System.out.println("Importamnt footer links passed ------PASS");
		else
		{
			System.out.println("FAIL");
		}
		
	}

}

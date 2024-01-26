package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	//	driver.findElement(By.xpath("(//input[@class = 'form-control'])[1]")).sendKeys("Surbhi");

		//parent to child concept
		//direct child - /
		//indirect child - //

		List <WebElement> ddlist = driver.findElements(By.xpath("//form[@id='form-currency']//ul[@class='dropdown-menu']//button"));
System.out.println(ddlist);
		for(WebElement e:ddlist)
		{
			System.out.println("----------" +e.getSize());
System.out.println(e.getText());
		}
		//child to parent

	}

}

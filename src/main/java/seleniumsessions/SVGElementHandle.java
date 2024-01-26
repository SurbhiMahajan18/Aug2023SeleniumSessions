package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

		driver=new ChromeDriver();
		driver.get("https:flipkart.com");
		
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mac book");
Thread.sleep(2000);
	driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();
	}

}

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassicCRMWebTable {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new EdgeDriver();
		driver.get("https://classic.freecrm.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("@input[@text='type']")).sendKeys("surbhi9696");
		driver.findElement(By.xpath("@input[@text='password']")).sendKeys("Kohli@96");
		driver.findElement(By.xpath("@input[@text='submit']")).click();
		
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("Contacts")).click();
	}

}

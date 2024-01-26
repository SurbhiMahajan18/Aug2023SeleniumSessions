package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUpHandling {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//alert
	//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//Alert al =	driver.switchTo().alert();
//	String text = al.getText();
//	System.out.println(text);
//	Thread.sleep(1000);
//	al.accept();
//	al.dismiss();
	
		
		//confirm
//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	Alert al =	driver.switchTo().alert();
//	al.dismiss();
	
		
		//prompt
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Alert al =	driver.switchTo().alert();
//		al.sendKeys("Automation");
		Thread.sleep(3000);
		al.accept();
		
		

		
	}

}

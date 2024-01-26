package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDisabledElement {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
Thread.sleep(3000);
		//Submit button selected or not
		driver.findElement(By.id("submitButton")).click();
	}

}

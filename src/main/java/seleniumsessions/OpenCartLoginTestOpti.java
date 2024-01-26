package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTestOpti {

	public static void main(String[] args) {
	
	BrowserUtil brUtil = new BrowserUtil();
	WebDriver driver = brUtil.launchBrowser("chrome");
	
	//--------------launch lOGIN url-------------
	//brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	
//	String title = brUtil.getPageTitle();
//	System.out.println(title);
//	
//	By eid =By.id("input-email");
//	By pass = By.id("input-password");
//	
//	ElementUtil eleUtil = new ElementUtil(driver);
//	eleUtil.doSendKeys(eid, "hugh@gmail.com");
//	eleUtil.doSendKeys(pass, "hugh1234");
//	
	
	//Launch Register URL
	brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By email = By.id("input-email");
	By telephone = By.id("input-telephone");
	By pass = By.id("input-password");
	By cpass = By.id("input-confirm");
	
	
ElementUtil eleUtil = new ElementUtil(driver);
eleUtil.doSendKeys(firstname, "Surbhi");


	
	
	//brUtil.closeBrowser();
	
	
	
	
	

	}

}

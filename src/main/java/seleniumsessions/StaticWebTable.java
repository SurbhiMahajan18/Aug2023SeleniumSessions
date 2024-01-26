package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath1 = "]/td[1]";
		String afterXpath2 = "]/td[2]";
		String afterXpath3 = "]/td[3]";
		
		for(int row=2;row<=rowCount;row++)
		{
//			String actXpath = beforeXpath + row +afterXpath1;
//			//System.out.println(actXpath);
//		String compNamecol1 = 	driver.findElement(By.xpath(actXpath)).getText();
//		System.out.println(compNamecol1);
//		
		String actXpath2 = beforeXpath + row +afterXpath2;
		//System.out.println(actXpath2);
	String compNamecol2 = 	driver.findElement(By.xpath(actXpath2)).getText();
	System.out.println(compNamecol2);
	
	String actXpath3 = beforeXpath + row +afterXpath3;
	//System.out.println(actXpath3);
String compNamecol3 = 	driver.findElement(By.xpath(actXpath3)).getText();
System.out.println(compNamecol3);
		}
		
		
	}

}

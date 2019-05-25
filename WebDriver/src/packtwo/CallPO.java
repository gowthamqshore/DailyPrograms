package packtwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import packone.PageObjects;
import packone.PageObjects1;

public class CallPO {

	public static void main(String[] args) {
		
		//PageObjects p=new PageObjects();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.manage().window().maximize();
		
		PageObjects p=PageFactory.initElements(driver, PageObjects.class);
		p.fname1.sendKeys("Kishore");
		p.lname1.sendKeys("Kumar");
		p.uid1.sendKeys("kumar@gmail.com");
		p.signin.click();
		
		
		PageObjects1 p1=PageFactory.initElements(driver, PageObjects1.class);
		p1.email1.sendKeys("Kishore");
		
		
		/*driver.findElement(p.fname).sendKeys("Kishore");
		driver.findElement(p.lname).sendKeys("Kumar");
		driver.findElement(p.uid).sendKeys("kumar@gmail.com");*/
		
		

	}

}

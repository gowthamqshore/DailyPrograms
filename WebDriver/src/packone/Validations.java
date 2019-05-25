
package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("URL");
		
		
		
		
		
		/*String a=driver.getTitle();
		System.out.println(a);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		WebElement uid=driver.findElement(By.id("email"));
		System.out.println(uid.getLocation());
		System.out.println(uid.getSize());
		System.out.println(uid.getAttribute("class"));
		System.out.println(uid.getTagName());*/
	
		
		
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a=driver.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

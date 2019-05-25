package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Clicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		// Clicking On Cookie Policy Lonk
		driver.findElement(By.id("cookie-use-link")).click();
		
		//driver.quit();
		
		Set<String> windows=driver.getWindowHandles();
		//System.out.println(windows.size());
		ArrayList a=new ArrayList(windows);
		/*int i;
		for(i=0; i<a.size(); i++){
			List<WebElement> l=driver.switchTo().window((String)a.get(i)).findElements(By.tagName("a"));
			//driver.switchTo().window((String)a.get(i)).close();
			System.out.println(l.size());
		}*/
		driver.switchTo().window((String)a.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		driver.switchTo().window((String)a.get(1)).findElement(By.id("pass")).sendKeys("abcdef");
		
		
		
		

	}

}

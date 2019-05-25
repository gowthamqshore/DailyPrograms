package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bharatmatrimony.com");
		driver.manage().window().maximize();
		
		WebElement n=driver.findElement(By.id("NAME"));
		n.sendKeys("Kishore");
		n.clear();n.sendKeys("dfsds");
		n.clear();
		
		WebElement pf=driver.findElement(By.id("REGISTERED_BY"));
		pf.sendKeys("Brother");
		
		
		driver.findElement(By.id("NAME")).sendKeys("Kishore");
		driver.findElement(By.id("NAME")).clear();
		driver.findElement(By.id("NAME")).sendKeys("abcdef");
		driver.findElement(By.id("NAME")).clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.id("REGISTERED_BY")).sendKeys("Friend");
		driver.findElement(By.id("NAME")).sendKeys("abcdef");
		driver.findElement(By.id("DOBDAY")).sendKeys("25");
		driver.findElement(By.id("NAME")).clear();*/
		
	}

}

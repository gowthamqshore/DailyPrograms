package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@title='Find anyone on the web.']")).click();
		

	}

}

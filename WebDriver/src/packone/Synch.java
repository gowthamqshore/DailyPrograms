package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("kishore.k1024");
		driver.findElement(By.id("next")).click();
		WebDriverWait ww=new WebDriverWait(driver, 30);
		//ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 5));
		ww.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 10));
		//ww.until(ExpectedConditions.titleIs("Gmail"));
		//ww.until(ExpectedConditions.urlContains("passwordss"));
		driver.findElement(By.id("Passwd")).sendKeys("sdfsdfsdf");
		
		


	}

}

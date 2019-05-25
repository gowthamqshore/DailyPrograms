package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://facebook.com");
		 driver.manage().window().maximize();
		 
		 // Importing Actions
		/* Actions a=new Actions(driver);
		 WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		 a.doubleClick(companies).build().perform();*/
		 Actions a=new Actions(driver);
		 WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		 a.clickAndHold(companies).build().perform();
		 Thread.sleep(120000);
		 a.release().build().perform();
		 
		 
		 /*WebElement uid=driver.findElement(By.id("email"));
		 a.contextClick(uid).build().perform();
		 
		 a.sendKeys(Keys.DOWN).build().perform();a.sendKeys(Keys.DOWN).build().perform();
		 a.sendKeys(Keys.DOWN).build().perform();
		 a.sendKeys(Keys.DOWN).build().perform();
		 
		 a.sendKeys(Keys.ENTER).build().perform();*/
		 
		 /*WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		 a.dragAndDrop(companies, companies).build().perform();*/
		 
		 /*a.sendKeys(Keys.F5).build().perform();
		 a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		 
		 
		 
		 
		 /*// Create Webelement fo Companies
		 WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		 // Move cursor to companies
		 a.moveToElement(companies).build().perform();
		 
		 driver.findElement(By.xpath("//*[@title='About Companies']")).click();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

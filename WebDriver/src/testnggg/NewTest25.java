package testnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest25 {
	public WebDriver driver;	
	@DataProvider(name="Data")
	public Object[][] testdata(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Kishore";
		obj[0][1]="abcdef";
		obj[1][0]="kishore1";
		obj[1][1]="abcdefghjo";		
		return obj;		}	
  @Test(dataProvider="Data")
  public void f(String a, String b) {
	  driver.findElement(By.id("email")).sendKeys(a);
	  driver.findElement(By.id("pass")).sendKeys(b); }  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();	    }
  @AfterMethod
  public void afterMethod() {
	  driver.close();  }

}

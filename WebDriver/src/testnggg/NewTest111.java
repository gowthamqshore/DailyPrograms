package testnggg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest111 {
	public WebDriver driver;	
	@DataProvider(name="TestData1")
	public Object[][] data(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="Kishore1";
		obj[0][1]="abcdef1";
		obj[1][0]="Kishore2";
		obj[1][1]="abcdef2";
		return obj;	}
	@DataProvider(name="TestData2")
	public Object[][] data1(){
		Object[][] obj=new Object[2][1];
		obj[0][0]="Kishore1";
		obj[0][1]="abcdef1";		
		return obj;	}	
  @Test(dataProvider="TestData1")
  public void f(String a, String b) {
	  driver.findElement(By.id("ID")).sendKeys(a);
	  driver.findElement(By.id("NAME")).sendKeys(b);  }
  @Test(dataProvider="TestData2")
  public void f(String a) {
	  driver.findElement(By.id("ID")).sendKeys(a);
	  
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://bharatmatrimony.com");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

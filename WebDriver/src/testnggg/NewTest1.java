package testnggg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest1 {
	public WebDriver driver;
	
	@DataProvider(name="data")
	public Object[][] testdata(){
		Object[][] d=new Object[2][2];
		d[0][0]="abcd";
		d[0][1]="abcdefgh";
		d[1][0]="sdfdsfdssd";
		d[1][1]="sdfsfsfs";
		return d;
		
	}
  @Test(dataProvider="data")
  public void f(String uid, String pwd) {
	  driver.findElement(By.id("email")).sendKeys(uid);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

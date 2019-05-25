package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabless {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody/tr[10]/td[3]")).getText());
		List<WebElement> r=driver.findElements(By.tagName("tr"));
		System.out.println(r.size());
		
		//driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody")).findElements(By.tagName("tr"));
		WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		WebElement columns=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/thead/tr"));
		List<WebElement> cols=columns.findElements(By.tagName("th"));
		System.out.println(cols.size());
		
		String xpath1="tr[";
		String xpath2="]/td[1]/a";
		
		int i;
		for(i=1; i<=rows.size(); i++){
			System.out.println(table.findElement(By.xpath("tr[" + i + "]/td[1]")).getText());
			System.out.println(table.findElement(By.xpath(xpath1+i+xpath2)).getText());
		}
		
		
		
		
		
		
		
		
		
		

	}

}

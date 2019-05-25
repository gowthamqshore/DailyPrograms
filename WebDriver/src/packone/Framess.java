package packone;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\WD9\\0705.png"));
		
		driver.findElement(By.id("email")).sendKeys("sdfds");
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\DELL\\Desktop\\WD9\\email.png"));
		
		/*// Creating Webelement for Frame
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		// Switch Focus to Frame
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();
        // Creating Webelement for Frame2
		driver.switchTo().parentFrame();
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		driver.switchTo().frame(f2).findElement(By.xpath("//a[@href='AppletStub.html']")).click();*/
		
		/*List<WebElement> frames=driver.findElements(By.tagName("frame"));
		int i; int j;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText() + "-" + links.get(j).getAttribute("href"));
			}
			System.out.println("***********************************************");		
			driver.switchTo().parentFrame();
		}
		//System.out.println(frames.size());
	}
*/
}
}
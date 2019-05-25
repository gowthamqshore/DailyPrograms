package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	/*
	public By fname=By.id("FirstName");
	public By lname=By.id("LastName");
	public By uid=By.id("GmailAddress");*/
	
	public @FindBy(id="FirstName") WebElement fname1;
	public @FindBy(id="LastName") WebElement lname1;
	public @FindBy(id="GmailAddress") WebElement uid1;
	public @FindBy(id="link-signin") WebElement signin;
	

}

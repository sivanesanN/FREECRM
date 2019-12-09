package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	
		@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
		WebElement LoginButton;
		
		@FindBy(xpath="//input[contains(@name,'email')]")
		WebElement username;
		
		@FindBy(xpath= "//input[contains(@name='password')]")
		WebElement password;
		
		
		@FindBy(xpath="//div[contains(@class,'ui fluid')]")
		WebElement clickloginbutton;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
				WebElement signupbutton;
		
		
public Loginpage()
{
	PageFactory.initElements(driver, this);
}




  public String validateloginpagetitle()
  {
	   return driver.getTitle();   
  }

  
  public Homepage login(String un, String pwd)
  {
	username.sendKeys(un);
	password.sendKeys(pwd);
	clickloginbutton.click();
	return new Homepage();
	
	
  }
  




}

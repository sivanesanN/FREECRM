package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Loginpagetest extends TestBase {
	
	
	Loginpage loginpage;
	Homepage homepage;
	
	public Loginpagetest()
	{
		super();	
	}
	
	
	@BeforeMethod
	public void setup()
	{
	initialization();
	loginpage =new Loginpage();
	homepage=new Homepage();
	}
	
	
	@Test(priority=1)
	public void validatelogintitlepagetest()
	{
		String Title =loginpage.validateloginpagetitle();
		Assert.assertEquals(Title, "CRM");
	}
	
	@Test(priority=2)
	public void loginpagetestt()
	{
		homepage =loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	

	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}

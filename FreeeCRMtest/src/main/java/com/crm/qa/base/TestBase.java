package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.Testutil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	static public TestBase()
	{
		try {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\selinium\\732019\\FreeeCRMtest\\src\\main\\java\\com\\crm\\qa\\properties\\config.properties");
	prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void initialization()
	{
	String browsername =prop.getProperty("browser");	
	if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","\\D:\\selenium\\firefoxdriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
		
	}
	
	}


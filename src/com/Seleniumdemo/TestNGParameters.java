package com.Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	public static WebDriver driver;
	
@Test
@Parameters({"URL","BrowserName"})

public static void login(String URL, String BrowserName ){
	if(BrowserName.equals("firefox")){
		driver=new FirefoxDriver();
	}else{
		Reporter.log("Invalid browser name defined");
	}
	driver.get(URL);
	
}

}

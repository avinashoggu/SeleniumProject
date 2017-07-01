package com.Seleniumdemo;

import java.awt.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RadiobuttonsAndOtherElements {
	public static WebDriver driver;

	@Test
	public static void radioButtons() {
		
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath(".//*[@id='exp-1']"));
		if(element.isSelected()){
			System.out.println("Element is selected");
			
		}else {
			element.click();
		}
		driver.findElement(By.xpath(".//*[@id='selenium_commands']/option[1]")).click();
	
	}
	@AfterTest
	public static void TearDown(){
		driver.quit();
	}
	

}

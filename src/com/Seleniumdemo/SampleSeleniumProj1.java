package com.Seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleSeleniumProj1 {
	public static WebDriver driver;
		
	public static void setup(){
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*WebDriverWait wait=new WebDriverWait (driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));*/
		
		
	}
	public static void clicklinks(String nlang, String ilang){
	WebElement element= driver.findElement(By.linkText(nlang));
	if(element.isDisplayed()){
		System.out.println("Successfully Displayed");
		element.click();		
	}
	else{
		System.out.println("Not Displayed");
	}
	driver.findElement(By.linkText(ilang)).click();
	System.out.println("Successfulyl Clicked");
	}
	public static void teardown(){
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		clicklinks("हिन्दी","English");
		clicklinks("తెలుగు","English");
		
		
		

	}

}

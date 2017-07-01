package com.Seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdroplist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/user/add.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select oselect=new Select(driver.findElement(By.xpath(".//*[@id='proofTypeId']")));
		List<WebElement> options=oselect.getOptions();
		int count=options.size();
		for(int i=0;i<count;i++){
		String value=options.get(i).getText();
		driver.findElement(By.xpath(".//*[@id='idNumber']")).sendKeys(value);
			
		}
		
		

	}

}


package com.Seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//This is new comments123
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/alert.html");
		System.out.println("Successfully accessed the URL")
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}

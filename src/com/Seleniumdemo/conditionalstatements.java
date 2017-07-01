package com.Seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditionalstatements {
	public static WebDriver driver;
	public static void setup(){
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	public static String clicklinks(String nlang, String ilang){
		String LangStatus;
		if(nlang.equals("हिन्दी")){
			LangStatus="Successfully clicked on Hindi link";
					}else if(nlang.equals("తెలుగు")){
						LangStatus="Successfully clicked on Telugu link";			
					}else {
						LangStatus="Successfully clicked on Marati link";	
					}
		driver.findElement(By.linkText(nlang)).click();
		driver.findElement(By.linkText(ilang)).click();
		return LangStatus;
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		String lang1=clicklinks("हिन्दी","English");
		System.out.println(lang1);
		String lang2=clicklinks("తెలుగు","English");
		System.out.println(lang2);
		String lang3=clicklinks("मराठी","English");
		System.out.println(lang3);
	}

}

package com.Seleniumdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("D:/Selenium/TestData.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(file);
		XSSFSheet WS=WB.getSheet("Sheet1");
		int count=WS.getPhysicalNumberOfRows();
		System.out.println(count);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		LinkedList<String> tabs2 = new LinkedList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(3000);
        driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
        
			for(int i=1;i<=count;i++){
			XSSFCell C1=WS.getRow(i).getCell(0);
			String userid=C1.getStringCellValue();
			XSSFCell C2=WS.getRow(i).getCell(1);
			String password=C2.getStringCellValue();
			
			WebElement userid1=driver.findElement(By.xpath(".//*[@id='identifierId']"));
			userid1.click();
			userid1.sendKeys(userid);
			driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
			Thread.sleep(3000);
			WebElement password1=driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
			password1.click();
			password1.sendKeys(password);
			driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@class='gb_Fb']/div[2]/a")).click();
			
		}
		
		
		

	}

}

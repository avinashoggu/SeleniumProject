package com.Seleniumdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConnectJDBCserver {

	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/avinash_schema";
		String user="root";
		String password="@Lt12345";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stm=con.createStatement();
		ResultSet RS=stm.executeQuery("select* from employee");
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("gs_htif0"));
		element.click();
		element.sendKeys("Test");*/
		while(RS.next()){
			String EmpID=RS.getString(1);
			String EmpName=RS.getString(2);
			System.out.println(EmpID+" "+EmpName);
		}
		
		

	}

}

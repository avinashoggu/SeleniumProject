package com.Seleniumdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestngClass {
  @Test(groups = { "GroupName" })
  public void f() {
	 System.out.println("This is Test1"); 
	 Reporter.log("Successfully Executed Test1");
  }
  @Test
  public void A() {
	 System.out.println("This is Test2"); 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is afterSuite");
  }

}

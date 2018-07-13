package com.myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.SearchPage;
import com.myntra.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	static LoginPage loginpage;
	static SearchPage searchpage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public static void SetUp() {
		initialization();
		 loginpage = new LoginPage();
		 searchpage= new SearchPage();
	}
	
	@Test(priority=1)
	public void LoginTest() {		
		searchpage=loginpage.Login(prop.getProperty("Mailid"), prop.getProperty("Password"));
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}


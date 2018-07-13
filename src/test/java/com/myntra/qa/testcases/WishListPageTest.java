package com.myntra.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.LoginPage;
import com.myntra.qa.pages.SearchPage;
import com.myntra.qa.pages.WishListPage;

public class WishListPageTest extends TestBase{

	static LoginPage loginpage;
	static SearchPage searchpage;
	static WishListPage wishlistpage;
	
	public WishListPageTest() {
		super();
	}

	@BeforeMethod
	public static void SetUp() {
		initialization();
		 loginpage = new LoginPage();
		 searchpage= new SearchPage();
		 wishlistpage= new WishListPage();
	}
	
	@Test(priority=1)
	public void WishList_Test() throws InterruptedException {		
		searchpage=loginpage.Login(prop.getProperty("Mailid"), prop.getProperty("Password"));
		
		wishlistpage.ClickOn_WishList();
	}
	
	
	@AfterMethod
	public void TearDown() {
		//driver.quit();
	}
	
}



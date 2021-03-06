package com.myntra.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.SearchPage;
import com.myntra.qa.pages.LoginPage;


public class SearchPageTest extends TestBase{
	static LoginPage loginpage;
	static SearchPage searchpage;
	
	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public static void SetUp() {
		initialization();
		 loginpage = new LoginPage();
		 searchpage= new SearchPage();
	}
	
	@Test(priority=1)
	public void SearchItem_Test()                     {		
		searchpage=loginpage.Login(prop.getProperty("Mailid"), prop.getProperty("Password"));	
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		searchpage.Search_for_req_item();
		searchpage.SelectAll_Item();
		searchpage.Select_Size();
		searchpage.Verify_AddToBag();
		searchpage.Verify_GoToBag();
		searchpage.Verify_PlaceOrder();
		searchpage.Continue_Btn();
		searchpage.Select_Bank();
		searchpage.Click_PayNow();
	}

	/*@Test(priority=2)
	public void AlertTest() {
		searchpage.isAlertPresent(driver);
	}*/
	
	
	@AfterMethod
	public void TearDown() {
		//driver.quit();
	}
	
}

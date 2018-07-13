package com.myntra.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntra.qa.base.TestBase;
import com.myntra.qa.pages.AddressPage;
import com.myntra.qa.pages.LoginPage;
import com.myntra.qa.pages.SearchPage;

public class AddressPageTest extends TestBase{


	static LoginPage loginpage;
	static SearchPage searchpage;
	static AddressPage addresspage;
	
	public AddressPageTest() {
		super();
	}

	@BeforeMethod
	public static void SetUp() {
		initialization();
		 loginpage = new LoginPage();
		 searchpage= new SearchPage();
		 addresspage= new AddressPage();
	}
	
	@Test(priority=1)
	public void Add_Address_Test() {
		addresspage.ADD_Address();
		addresspage.selectRadio(null);
		addresspage.Save_Address();
	}

	
	@AfterMethod
	public void TearDown() {
		//driver.quit();
	}
	

}

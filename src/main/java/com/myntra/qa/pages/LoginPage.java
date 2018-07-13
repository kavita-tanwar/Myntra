package com.myntra.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement Mailid;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement Password ;

	@FindBy(xpath="//button[@class='login-login-button']")
	@CacheLookup
	WebElement LoginBtn ;
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public SearchPage Login(String un, String pwd) {
		Mailid.sendKeys(un);
		Password.sendKeys(pwd);
		//LoginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", LoginBtn);
		return new SearchPage();
	}
}
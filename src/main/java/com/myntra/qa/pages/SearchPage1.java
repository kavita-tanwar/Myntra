package com.myntra.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class SearchPage1 extends TestBase {

	// Page Factory

	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	@CacheLookup
	WebElement SearchBox;

	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	@CacheLookup
	WebElement SearchImage;

	@FindBy(xpath = "//img[@alt='Roadster Women Green Solid Round Neck T-shirt']")
	@CacheLookup
	WebElement Roadster_green_tshirt;

	@FindBy(xpath = "//p[text()='M']")
	@CacheLookup
	WebElement select_size;

	@FindBy(xpath = "//span[text()='SAVED' or text()='SAVE']")
	@CacheLookup
	WebElement Save_btn;
	
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	@CacheLookup
	WebElement AddToBag;
	
	@FindBy(xpath="//span[text()='GO TO BAG']")
	@CacheLookup
	WebElement GoToBag;	
	
	@FindBy(xpath="//button[text()='PLACE ORDER']")
	@CacheLookup
	WebElement PlaceOrder_Btn;
	
	@FindBy(xpath="//*[text()='continue']")
	@CacheLookup
	WebElement Continue_Btn;
	
	@FindBy(xpath="//div[@class='bank-icon icon-bank-3']")
	@CacheLookup
	WebElement ICICI_bank;
	
	@FindBy(xpath="//*[@id='net_banking']/div[3]/button")
	@CacheLookup
	WebElement PayNow_btn;
	
	// Initilize my Page Factory
	public SearchPage1() {
		PageFactory.initElements(driver, this);
	}

	public void Search_for_req_item() {
		SearchBox.sendKeys("tshirts women");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Roadster_green_tshirt);
		
		SearchImage.click();		
	}

/*	public static void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
	}*/
	public void Select_Item() {
		Roadster_green_tshirt.click();
	}
	
	public void Select_Size() {
		select_size.click();
		Save_btn.click();
	}

	public void Verify_AddToBag() {
		AddToBag.click();
	}
	
	public void Verify_GoToBag() {
		GoToBag.click();
	}
	public void Verify_PlaceOrder() {
		PlaceOrder_Btn.click();
	}

	public void Continue_Btn() {
		Continue_Btn.click();
	}
	
	public void Select_Bank() {
		ICICI_bank.click();
	}
	
	public void Click_PayNow() {
		PayNow_btn.click();
	}
	/*
	 * public boolean isAlertPresent(WebDriver driver) { try{
	 * driver.switchTo().alert(); return true; }catch(NoAlertPresentException e) {
	 * return false; } }
	 */
}

package com.myntra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.myntra.qa.base.TestBase;

public class WishListPage  extends TestBase{
	
	// Page Factory

		@FindBy(xpath="//span[@class='myntraweb-sprite desktop-iconUser sprites-user']")
		WebElement Profile_Img;
		
		@FindBy(xpath = "//div[@class='desktop-infoSection' and text()='Wishlist']")
		WebElement WishList;
		
		// Initilize my Page Factory
		public WishListPage() {
			PageFactory.initElements(driver, this);
		}

		public void ClickOn_WishList() {
			
			Profile_Img.click();
			Actions action= new Actions(driver);
			action.moveToElement(WishList).build().perform();
			WishList.click();	
			
				
		}
		
}
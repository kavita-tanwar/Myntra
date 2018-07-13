package com.myntra.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class AddressPage  extends TestBase{

	// Page Factory

		@FindBy(xpath = "//input[@id='pincode']")
		WebElement PinCode;
		
		@FindBy(xpath = "//input[@id='locality'")
		WebElement Locality;
		
		@FindBy(xpath = "//input[@id='city']")
		WebElement City;
		
		@FindBy(xpath = "//input[@id='state']")
		WebElement State;
		
		@FindBy(xpath = "//textarea[@id='address']")
		WebElement Address;
		
		@FindBy(xpath = "//input[@id='mobile']")
		WebElement Mobile;
		
		@FindBy(xpath = "//div[@id='home']")
		WebElement TypeOfAddress;
		
		@FindBy(how = How.CSS, using = "[type='radio']")
		private List<WebElement> radioButtons;
		
		@FindBy(xpath="//button[text()='SAVE' and @class='green-button submit clickable'] ")
		WebElement Save_Btn;
		
		// Initilize my Page Factory
		public AddressPage() {
			PageFactory.initElements(driver, this);
		}


		public void ADD_Address() {
			PinCode.sendKeys("412207");
			Locality.sendKeys("Wagholi");
			City.sendKeys("Pune");
			Address.sendKeys("F-104, 1st floor, Marvel Fria, Near KamalBagh");
			Mobile.sendKeys("9560696503");
		}
		
		public void selectRadio(String Home){
			  for(WebElement radio : radioButtons){
			    if(radio.getAttribute("value").contains(Home))
			        radio.click();
			  }
			}
		
		public void Save_Address() {
			Save_Btn.click();
		}
		
	
		}	

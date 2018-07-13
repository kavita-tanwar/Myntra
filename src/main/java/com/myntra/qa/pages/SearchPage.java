package com.myntra.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.qa.base.TestBase;

public class SearchPage extends TestBase {
	 public static WebElement element = null;
	public static List<WebElement> elements = null;


	// Page Factory

	@FindBy(xpath = "//input[@class='desktop-searchBar']")
	WebElement SearchBox;

	@FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")
	WebElement SearchImage;

	//@FindBy(xpath = "//img[@alt='Roadster Women Olive Green Solid Boat Neck T-shirt']")
			
	//@FindBy(xpath = "//img[@alt='Roadster Women Green Solid Round Neck T-shirt']")
	//@FindBy(xpath = "//*[@alt='Alba Black Slim Fit T-Shirt']")
	//WebElement selected_tshirt;

	@FindBy(xpath = "//p[text()='M']")
	WebElement select_size;

	@FindBy(xpath = "//span[text()='SAVED' or text()='SAVE']")
	WebElement Save_btn;
	
	@FindBy(xpath="//span[text()='ADD TO BAG']")
	WebElement AddToBag;
	
	@FindBy(xpath="//span[text()='GO TO BAG']")
	WebElement GoToBag;	
	
	@FindBy(xpath="//button[text()='PLACE ORDER']")
	WebElement PlaceOrder_Btn;
	
	@FindBy(xpath="//*[text()='continue']")
	WebElement Continue_Btn;
	
	@FindBy(xpath="//div[@class='bank-icon icon-bank-3']")
	WebElement ICICI_bank;
	
	@FindBy(xpath="//*[@id='net_banking']/div[3]/button")
	WebElement PayNow_btn;
	
	// Initilize my Page Factory
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void Search_for_req_item() {
		
		SearchBox.sendKeys("tshirts women");
		SearchImage.click();
	
	}

/*	public void SelectAll_Item() {
//List<WebElement> elements = driver.findElements(By.xpath("//*[starts-with(@class, 'product-thumb')]"));
	//	  if(values.equals("Roadster Women Olive Green Solid Boat Neck T-shirt"))
	List<WebElement> mylist = driver.findElements(By.xpath("//*[starts-with(@class, 'product-thumb')]"));
	System.out.println("Size of the list is : " +mylist.size()); 
	
	Iterator<WebElement> itr = mylist.iterator();
	while(itr.hasNext()) {
	    System.out.println(itr.next().getAttribute("alt"));
	    if (itr.next().getAttribute("alt").equals("Roadster Women Olive Green Solid Boat Neck T-shirt")) {
	   
            // move to a specific element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
            		mylist.get(mylist.size() - 1));
                   
            // move slightly up as blue header comes in the picture
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            // then click on the element
            itr.
        }
    }
	}*/
	
	/*public void SelectAll_Item() {
	
		// Take everything on the page in list first .
    List<WebElement> completecalContent = driver.findElements(By.xpath("//*[starts-with(@class, 'product-thumb')]"));
    System.out.println(completecalContent.size());
    // printing all elements
    for (int i = 0; i < completecalContent.size(); i++) {
        //System.out.println("Print complete Content : " + completecalContent.get(i).getText());
    	System.out.println("Print complete Content : " + completecalContent.get(i).getAttribute("alt"));
        if (completecalContent.get(i).getAttribute("alt").equals("Roadster Women Olive Green Solid Boat Neck T-shirt")) {
            // move to a specific element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
                    completecalContent.get(completecalContent.size() - 1));
            // move slightly up as blue header comes in the picture
           // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-100)");
            // then click on the element
            completecalContent.get(i).click();
        }
    }
}*/
	public void SelectAll_Item() {
		//WebElement tshirt = driver.findElement(By.xpath ("//img[@class= 'product-thumb' and @alt='Roadster Women Olive Green Solid Boat Neck T-shirt']"));
		//WebElement tshirt = driver.findElement(By.xpath ("//img[@class= 'product-thumb' and @alt='The Dry State Women Navy Blue Striped Round Neck T-Shirt']"));
		WebElement tshirt = driver.findElement(By.xpath ("//img[@class= 'product-thumb' and @alt='Kook N Keech Women White Printed Round Neck T-shirt']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", tshirt);
		//Thread.sleep(10);
		tshirt.click();
	}
	
	public void Select_Size() {
		select_size.click();
		Save_btn.click();	}

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

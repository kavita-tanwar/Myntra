package com.myntra.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.myntra.qa.testdata.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:/Users/GTS/eclipse-workspace/Myntra_wishlist/src/main/java/com/myntra/qa/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// code to disable notification in settings
		// Create object of HashMap class
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Set the notification setting,it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create object of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Set the experimental option
		options.setExperimentalOption("prefs", prefs);

		String BrowserType = prop.getProperty("browser");

		// pass the options option in chrome driver
		if (BrowserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/Softwares/browsers_exe/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver(options);
		}

		else if (BrowserType.equals("FF")) {

			System.getProperty("webdriver.gecko.driver",
					"D:/Softwares/browsers_exe/geckodriver-v0.20.0-win64/geckodriver.exe");
			driver = new FirefoxDriver(options);
		}
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		// js.executeScript("window.scrollBy(0,1000)");
		/*
		 * driver.manage().deleteAllCookies();
		 * driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,
		 * TimeUnit.SECONDS);
		 */
		
		// driver.manage().deleteAllCookies();	
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
		// TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,
		// TimeUnit.SECONDS);

		// to scroll down in a page
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("scrollBy(0,2500)");
		;
	}
}

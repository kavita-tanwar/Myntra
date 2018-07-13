package com.myntra.qa.testdata;

import com.myntra.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 10;
	
	public void SwitchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	

}

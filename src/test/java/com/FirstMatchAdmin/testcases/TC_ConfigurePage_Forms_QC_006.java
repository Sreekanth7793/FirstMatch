package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigurePage_Forms_QC;
import com.FirstMatchAdmin.pageobjects.LoginPage;


public class TC_ConfigurePage_Forms_QC_006 extends BaseClass {
	
	@Test
	public void displyConfig() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_Forms_QC dconfig=new ConfigurePage_Forms_QC(driver);
		Thread.sleep(3000);
		dconfig.dispconfigpage();
		Thread.sleep(3000);
		dconfig.dispformsqc();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		dconfig.adqcinforms();
		
		
	}
		

}

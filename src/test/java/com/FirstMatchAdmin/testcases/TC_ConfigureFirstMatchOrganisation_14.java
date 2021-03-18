package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigureFirstMatchOrganisation;

import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigureFirstMatchOrganisation_14 extends BaseClass {
	
	@Test
	public void displayConfigurOrganisations() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigureFirstMatchOrganisation displayorgs=new ConfigureFirstMatchOrganisation(driver);
		
		displayorgs.clkconfig();
		Thread.sleep(3000);
		displayorgs.ViaDropDown(3);
		Thread.sleep(3000);
		displayorgs.addques();
		Thread.sleep(3000);
		displayorgs.clicksmt();
		
	
	
	
	
	}
}

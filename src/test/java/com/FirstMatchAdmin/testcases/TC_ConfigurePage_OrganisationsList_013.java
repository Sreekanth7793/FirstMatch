package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;


import com.FirstMatchAdmin.pageobjects.ConfigurePage_OrganisationsList;
import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_OrganisationsList_013 extends BaseClass {
	
	@Test
	public void displayConfigurOrganisations() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_OrganisationsList displayorgs=new ConfigurePage_OrganisationsList(driver);
		
		displayorgs.dispconfigpage();
		displayorgs.disporglists();
		driver.manage().window().maximize();
		
		displayorgs.selectorg();
		displayorgs.deactivateorg();
		displayorgs.suspendorg();
		displayorgs.cancelorg();
		
		
	
	
	
	
	
	
	
	
	
	}
	
	
	

}

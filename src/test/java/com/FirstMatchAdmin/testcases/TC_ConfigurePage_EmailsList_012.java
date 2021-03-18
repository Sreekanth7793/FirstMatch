package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigurePage_EmailsList;

import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_EmailsList_012 extends BaseClass{
	
	@Test
	public void displayConfiguremails() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_EmailsList displaymails=new ConfigurePage_EmailsList(driver);
		
		displaymails.dispconfigpage();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		displaymails.mailslist();
	
	

}
}
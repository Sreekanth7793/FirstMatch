package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.EifFormsPage;
import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_EifForms_004 extends BaseClass {
	
	@Test
	public void displyeif() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		EifFormsPage deif=new EifFormsPage(driver);
		deif.clickeifForms();
		Thread.sleep(3000);
		
		deif.lstelement();
		
		Thread.sleep(3000);
		
		 
		
		
		
	}
		
	}
	
	
	



package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.LoginPage;
import com.FirstMatchAdmin.pageobjects.ProfilePage;

public class TC_ProfilePage_003 extends BaseClass{
	
	@Test
	public void changepwd() throws InterruptedException
	{

		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ProfilePage pfp=new ProfilePage(driver);
		 
		pfp.clickProfile();
		
		pfp.currentpwd("sree234");
		
		pfp.newpwd("sree123");
		
		pfp.repwd("sree123");
		
		pfp.btnpwdupdate();
		
		Thread.sleep(3000);
		
		
	}

}

package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigurePage_UsersList;
import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_Users_011 extends BaseClass {

	@Test
	public void displyConfigadsc() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();

		Thread.sleep(3000);

		ConfigurePage_UsersList displayusers = new ConfigurePage_UsersList(driver);

		displayusers.dispconfigpage();

		displayusers.userslist();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().back();
		
		displayusers.adduse();

		displayusers.userfname();
		displayusers.userlnmae();
		displayusers.usermail();
		
		displayusers.userselect();
		displayusers.slktradio(1);
		displayusers.usermobile();
		displayusers.adduserbtn();

	}
}

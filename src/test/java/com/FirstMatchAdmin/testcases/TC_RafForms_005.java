package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;


import com.FirstMatchAdmin.pageobjects.LoginPage;
import com.FirstMatchAdmin.pageobjects.RafFormsPage;

public class TC_RafForms_005 extends BaseClass {
	

	@Test
	public void displyRaf() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		RafFormsPage draf=new RafFormsPage(driver);
		
		draf.clickrafforms();
		
		draf.dsprafform();
		Thread.sleep(3000);

}
}

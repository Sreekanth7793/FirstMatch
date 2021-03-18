package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigurePage_Forms_AddQL;

import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_Forms_AddQL_010 extends BaseClass {
	@Test
	public void displyConfig() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_Forms_AddQL dconfigaddql=new ConfigurePage_Forms_AddQL(driver);
		Thread.sleep(3000);
		dconfigaddql.dispconfigpage();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		dconfigaddql.clkaddql();
		Thread.sleep(3000);
		dconfigaddql.slktradio();
		Thread.sleep(3000);
		dconfigaddql.addtxt();
		Thread.sleep(3000);
		dconfigaddql.clkradio();
		Thread.sleep(3000);
		dconfigaddql.clktsavebtn();

}
}
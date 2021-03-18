package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;

import com.FirstMatchAdmin.pageobjects.ConfigurePage_Forms_AddQC;

import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_Forms_AddQC_007 extends BaseClass {
	@Test
	public void ConfigureAddQuestionCategory() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_Forms_AddQC dconfigadqc=new ConfigurePage_Forms_AddQC(driver);
	
		dconfigadqc.dispconfigpage();
		
		dconfigadqc.dispformsqc();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		dconfigadqc.adqcinforms();
		dconfigadqc.addQC();
		dconfigadqc.clkbtnsve();
		Thread.sleep(2000);
		driver.navigate().back();
		dconfigadqc.dispformsqc();
		driver.manage().window().maximize();
	

}
}
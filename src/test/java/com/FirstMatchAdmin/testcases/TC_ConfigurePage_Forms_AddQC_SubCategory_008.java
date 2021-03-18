package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;


import com.FirstMatchAdmin.pageobjects.ConfigurePage_Forms_AddQC_SubCategory;
import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_Forms_AddQC_SubCategory_008 extends BaseClass{
	
	@Test
	public void ConfigureAddSubCategoryQuestions() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_Forms_AddQC_SubCategory dconfigadqcsc=new ConfigurePage_Forms_AddQC_SubCategory(driver);
	
		dconfigadqcsc.dispconfigpage();
		
		dconfigadqcsc.adqcinforms();
		
		Thread.sleep(3000);
		
		dconfigadqcsc.selktsc();
		Thread.sleep(3000);
		dconfigadqcsc.ViaDropDown(2);
		Thread.sleep(3000);
		dconfigadqcsc.addqstosc();
		Thread.sleep(3000);
		dconfigadqcsc.clksv();

}
}
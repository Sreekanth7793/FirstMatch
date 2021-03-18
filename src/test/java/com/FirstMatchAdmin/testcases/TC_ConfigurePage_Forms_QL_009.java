package com.FirstMatchAdmin.testcases;

import org.testng.annotations.Test;


import com.FirstMatchAdmin.pageobjects.ConfigurePage_Forms_QL;
import com.FirstMatchAdmin.pageobjects.LoginPage;

public class TC_ConfigurePage_Forms_QL_009 extends BaseClass {
	@Test
	public void displyConfigadsc() throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Passsword is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		ConfigurePage_Forms_QL dconfigql=new ConfigurePage_Forms_QL(driver);
	
		dconfigql.dispconfigpage();
		
		dconfigql.dispqslst();
		
		Thread.sleep(3000);
		dconfigql.ViaQSDropDown(2);
		Thread.sleep(3000);
		dconfigql.ViaQSscDropDown(2);

	

}
}

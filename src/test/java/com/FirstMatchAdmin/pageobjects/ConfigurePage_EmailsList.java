package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurePage_EmailsList {
WebDriver ldriver;
	
	public ConfigurePage_EmailsList(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/admin/configure/emailslist'][contains(.,'Emails List')]")
	WebElement maillist;
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void mailslist() {
		maillist.click();
	}
	
	
	
	
	
	
	
}

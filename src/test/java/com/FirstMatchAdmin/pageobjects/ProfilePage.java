package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
WebDriver ldriver;
	
	public ProfilePage(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Profile')]")
	WebElement lnkProfile;

	@FindBy(xpath = "//input[@name='old_password']")
	WebElement currntpassword;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement nepassword;
	
	@FindBy(xpath = "//input[@name='retype_password']")
	WebElement repassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnupdate;
	
	public void clickProfile() {
		lnkProfile.click();
	}
	public void currentpwd(String cpwd) {
		currntpassword.sendKeys(cpwd);
	}
	public void newpwd(String npwd) {
		nepassword.sendKeys(npwd);
	}
	
	public void repwd(String rpwd)
	{
		repassword.sendKeys(rpwd);
	}
	
	public void btnpwdupdate()
	{
		btnupdate.click();
	}
	
}



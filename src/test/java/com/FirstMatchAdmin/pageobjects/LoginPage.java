package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
      ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	 @FindBy(name="email")
	 @CacheLookup
	 WebElement txtemail;
	 
	 @FindBy(name="password")
	 @CacheLookup
	 WebElement txtPassword;
	 
	 @FindBy(xpath = "//button[@class='button']")
	 @CacheLookup
	 WebElement btnLogin;
	   
	 @FindBy(xpath = "//button[@class='btn btn-link'][contains(.,'Logout')]")
	 @CacheLookup
	 WebElement lnkLogout;
	 
	 public void setUserName(String uname)
	 {
		 txtemail.sendKeys(uname);
}
	 public void setPassword(String pwd)
	 {
		 txtPassword.sendKeys(pwd);
	 }
	 
	 public void clickSubmit()
	 {
		 btnLogin.click();
	 }
	  
	 public void clickLogout()
	 {
		 lnkLogout.click();
	 }
	 
	 }
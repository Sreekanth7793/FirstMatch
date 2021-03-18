package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RafFormsPage {
WebDriver ldriver;
	
	public RafFormsPage(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//a[@href='/raflist']")
	WebElement lnkRafForms;
	
	@FindBy(xpath = "//a[@href='/raflist']")
	WebElement dsprafform;
	
	public void clickrafforms() {
		lnkRafForms.click();
	}
	public void dsprafform() {
		dsprafform.click();
	}
	
	
	
	

}

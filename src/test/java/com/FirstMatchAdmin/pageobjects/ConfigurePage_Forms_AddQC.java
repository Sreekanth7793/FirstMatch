package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurePage_Forms_AddQC {
WebDriver ldriver;
	
	public ConfigurePage_Forms_AddQC(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/admin/configure/questioncategorylist'][contains(.,'Question Categories')]")
	WebElement dspQC;
	
	@FindBy(xpath = "//a[@href='/admin/configure/questioncategory'][contains(.,'Add')]")
	WebElement adQC;
	
	@FindBy(xpath = "//input[@id='inputEmail3']")
	WebElement adqc;
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save')]")
	WebElement btnsve;
	
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void dispformsqc() {
		dspQC.click();
	}
	public void adqcinforms() {
		adQC.click();
	}
	public void addQC() {
		adqc.sendKeys("TestAddQC");
	}
	public void clkbtnsve() {
		btnsve.click();
	}
	
	
	
	
	
	

}

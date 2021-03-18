package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ConfigurePage_OrganisationsList {
WebDriver ldriver;
	
	public ConfigurePage_OrganisationsList(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/admin/configure/organizationlist'][contains(.,'Organizations List')]")
	WebElement orglist;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]")
	WebElement slktorg;
	
	@FindBy(xpath = "//button[contains(@data-id,'Deactivate')]")
	WebElement orgdeactivate;
	
	@FindBy(xpath = "//button[contains(@data-id,'Suspend')]")
	WebElement orgsuspend;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][contains(.,'Cancel')]")
	WebElement orgcancel;
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void disporglists() {
			orglist.click();
			} 
	
	public void selectorg() {
				slktorg.click();
			}
	public void deactivateorg() {
				orgdeactivate.click();
			}
	public void suspendorg() {
				orgsuspend.click();
			}
	public void cancelorg() {
				orgcancel.click();
			}
	
	
	
	
	
	
	
	
	

}

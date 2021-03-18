package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurePage_Forms_AddQL {
WebDriver ldriver;
	
	public ConfigurePage_Forms_AddQL(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/configure/addquestion'][contains(.,'Add')]")
	WebElement lnkaddql;
	
	@FindBy(xpath = "//input[contains(@value,'21')]")
	WebElement slktradioql;
	
	@FindBy(xpath = "//input[contains(@id,'inputEmail3')]")
	WebElement txtaddql;
	
	@FindBy(xpath = "//input[contains(@value,'TEXT')]")
	WebElement slktradio;
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Submit')]")
	WebElement clksbmtbtn;
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void clkaddql() {
		lnkaddql.click();
		}
	public void slktradio() {
		slktradioql.click();
		}
	public void addtxt() {
		txtaddql.sendKeys("addtexttoql");
	}	
	public void clkradio() {
		slktradio.click();
		}
	public void clktsavebtn() {
		clksbmtbtn.click();
		}
}

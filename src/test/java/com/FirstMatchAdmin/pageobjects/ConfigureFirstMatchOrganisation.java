package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfigureFirstMatchOrganisation {
WebDriver ldriver;
	
	public ConfigureFirstMatchOrganisation(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@href='/admin/org-configure/']")
	WebElement lnkconfgorg;
	
	@FindBy(id = "exampleFormControlSelect1")
	WebElement slktorgst;
	
	@FindBy(xpath = "//a[@href='/admin/questions-configure/Org=Capital Town&id=83'][contains(.,'Questions')]")
	WebElement addquestion;
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Submit')]")
	WebElement clksmt;
	
	public void clkconfig() {
		lnkconfgorg.click();
	}
	
	public  void ViaDropDown(int index) {
	    WebElement ele = ldriver.findElement(By.id("exampleFormControlSelect1"));
	    Select drop = new Select(ele );
	    drop.selectByIndex(3); 
	    
	     }
	public void addques() {
		addquestion.click();
	}
	
	public void clicksmt() {
	clksmt.click();
	
	}
	
	
	
	
	
	
	
}

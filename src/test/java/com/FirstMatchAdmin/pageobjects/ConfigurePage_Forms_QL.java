package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfigurePage_Forms_QL {
WebDriver ldriver;
	
	public ConfigurePage_Forms_QL(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/configure/questions'][contains(.,'Questions')]")
	WebElement lnkqslist;
	
	@FindBy(xpath = "//select[contains(@id,'exampleFormControlSelect1')]")
	WebElement slktqssc;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement slktsubcategory;
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void dispqslst() {
		lnkqslist.click();
	}
	public  void ViaQSDropDown(int index) {
	    WebElement ele = ldriver.findElement(By.xpath("//select[contains(@class,'form-control ')]"));
	    Select drop = new Select(ele );
	    drop.selectByIndex(2); 
	}
	public  void ViaQSscDropDown(int index) {
	    WebElement ele = ldriver.findElement(By.xpath("//select[@class='form-control']"));
	    Select dropsc = new Select(ele );
	    dropsc.selectByIndex(2); 
	}
	
	
	
	
	
	

}

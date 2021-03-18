package com.FirstMatchAdmin.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EifFormsPage {
WebDriver ldriver;
	
	public EifFormsPage(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@href='/admin/eiflist']")
	WebElement lnkEifForms;
	 
	@FindBy(xpath = "//li[@class='list-group-item mb-1'][contains(.,'clarke Created On:  2021-02-23T05:31:40.965000ZStatus: Approved')]")
	WebElement lstdsp;
	
	
	//List<WebElement> alllinks=ldriver.findElements(By.className("list-group-item mb-1"));
	//WebElement Single_element=alllinks.get(4);
	
	public void clickeifForms() {
		lnkEifForms.click();
	}
	
	
 public void lstelement() {
	List<WebElement> li= ldriver.findElements(By.xpath("//li[@class='list-group-item mb-1'][contains(.,'clarke Created On:  2021-02-23T05:31:40.965000ZStatus: Approved')]"));
	//lstdsp.click();
	WebElement Single_element=li.get(1);
	Select drop = new Select(Single_element);
    drop.selectByIndex(2);
	
	
//		Single_element.click();
	}
//	public void clickid() {
	//	dspform.click();
//	}
	
	
	
	
	
	
	

}

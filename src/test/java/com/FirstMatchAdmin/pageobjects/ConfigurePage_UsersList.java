package com.FirstMatchAdmin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfigurePage_UsersList {
WebDriver ldriver;
	
	public ConfigurePage_UsersList(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/admin/configure/userslist'][contains(.,'Users List')]")
	WebElement lnkuserslist;
	
	@FindBy(xpath = "//a[@href='/admin/configure/adduser'][contains(.,'Add')]")
	WebElement adduser;
	
	@FindBy(xpath = "//input[contains(@id,'validationDefault01')]")
	WebElement userfirstname;
	
	@FindBy(xpath = "//input[contains(@name,'last_name')]")
	WebElement userlastname;
	
	@FindBy(xpath = "//input[contains(@type,'email')]")
	WebElement useremail;
	
	@FindBy(xpath = "//input[@id='male']")
	WebElement userradio;
	
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement usermobilenum;
	
	@FindBy(xpath = "//select[contains(@id,'exampleFormControlSelect1')]")
	WebElement userrole;
	
	@FindBy(xpath = "//button[@type='submit'][contains(.,'ADD USER')]")
	WebElement btnadduser;
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	public void userslist() {
		lnkuserslist.click();
	}
	public void adduse() {
		adduser.click();
	}
	public void userfname() {
		userfirstname.sendKeys("srikanth");
		}
	public void userlnmae() {
		userlastname.sendKeys("reddy");
	}
	public void usermail() {
		useremail.sendKeys("esrikanth937@gmail.com");
	}
	public void slktradio(int index) {
		 
		    WebElement ele = ldriver.findElement(By.xpath("//select[contains(@id,'exampleFormControlSelect1')]"));
		    Select drop = new Select(ele );
		    drop.selectByIndex(1);
	}
	public void usermobile() {
		usermobilenum.sendKeys("9876543210");
	}
	public void userselect() {
	userradio.click();
	}
	public void adduserbtn() {
	btnadduser.click();
}
}	

	
	
	
	
	



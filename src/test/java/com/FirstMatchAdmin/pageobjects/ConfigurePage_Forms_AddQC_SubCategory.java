package com.FirstMatchAdmin.pageobjects;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ConfigurePage_Forms_AddQC_SubCategory {
WebDriver ldriver;
	
	public ConfigurePage_Forms_AddQC_SubCategory(WebDriver rdriver)
	{
       
		ldriver=rdriver;
      PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//a[@class='nav-link'][contains(.,'Configure')]")
	WebElement lnkconfigpage;
	
	@FindBy(xpath = "//a[@href='/admin/configure/addquestion'][contains(.,'Add')]")
	WebElement adQC;
	
	@FindBy(xpath = "//input[contains(@value,'sub')]")
	WebElement slktSC;
	
	@FindBy(xpath = "//select[contains(@name,'parent')]")
	WebElement slktonesc;
	
	@FindBy(xpath = "//input[contains(@id,'inputEmail3')]")
	WebElement adscqs;
	
	@FindBy(xpath = "//button[@class='btn btn-primary'][contains(.,'Save')]")
	WebElement btnscclk;
	
	
	
	public void dispconfigpage() {
		lnkconfigpage.click();
		}
	
	public void adqcinforms() {
		adQC.click();
	}
	
	public void selktsc() {
		slktSC.click();
	}
	public  void ViaDropDown(int index) {
    WebElement ele = ldriver.findElement(By.xpath("//select[contains(@name,'parent')]"));
    Select drop = new Select(ele );
    drop.selectByIndex(4); 
    
     }
	
	
//	public void scviadropdown() {
//		Select drop=new Select(slktonesc);
//		drop.selectByVisibleText("sample query23");
	//}

	public void addqstosc() {
		adscqs.sendKeys("testsubcategory");
		}
     public void clksv() {
    	 btnscclk.click();
    	 
     }
}

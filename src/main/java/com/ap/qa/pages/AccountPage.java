package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ap.qa.base.TestBase;

public class AccountPage extends TestBase{
	
	@FindBy(className="navigation_page")
	WebElement myAccount;
	
	@FindBy(xpath="(//div[@id='block_top_menu']//a)[1]")
	WebElement womenHeader;
	
	@FindBy(xpath="//div[@id='block_top_menu']//a)[9]")
	WebElement dressesHeader;
	
	@FindBy(xpath="//div[@id='block_top_menu']//a)[12]")
	WebElement tshirtHeader;
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateAccountPageTitle() {
		return driver.getTitle();
	}
	
	public String validateAccountPageLink() {
		return myAccount.getText();
	}
	
	public WomenPage clickOnWomenHeaderLink() {
		womenHeader.click();
		return new WomenPage();
	}
	
	public DressesPage clickOnDressesHeaderLink() {
		dressesHeader.click();
		return new DressesPage();
	}
	
}

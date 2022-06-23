package com.ap.qa.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.base.TestBase;

public class WomenPage extends TestBase{

	@FindBy(className="category-name")
	public WebElement womenBanner;
	
	@FindBy(xpath="//ul[@id='ul_layered_category_0']/li")
	public List<WebElement> categories;
	
	public WomenPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateWomenPageTitle() {
		return driver.getTitle();
	}
	
	public String validateBannerName() {
		return womenBanner.getText();
	}
	
	public void getCategoryList() {
		System.out.println(categories.size());
		for(WebElement catList : categories) {
			System.out.println(catList.getText());
		}categories.get(0).click();
		categories.get(1).click();
	}
}

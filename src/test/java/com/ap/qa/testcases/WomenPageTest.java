package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.AccountPage;
import com.ap.qa.pages.DressesPage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.WomenPage;

public class WomenPageTest extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;
	WomenPage womenPage;
	DressesPage dressespage;
	
	public WomenPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		accountPage = new AccountPage();
		womenPage = new WomenPage();
		accountPage=loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
		womenPage = accountPage.clickOnWomenHeaderLink();
	}
	
	@Test(priority=1)
	public void womenPageLinkTest() {
		String title = womenPage.validateWomenPageTitle();
		Assert.assertEquals(title, "Women - My Store","Title not Matched");
	}
	@Test(priority=2)
	public void womenPageBannerTest() {
		String bannername = womenPage.validateBannerName();
		Assert.assertEquals(bannername, "Women", "Name not Matched");
	}
	@Test(priority=3)
	public void getCategoryList() {
		womenPage.getCategoryList();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

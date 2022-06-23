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

public class AccountPageTest extends TestBase{

	LoginPage loginPage;
	AccountPage accountPage;
	WomenPage womenPage;
	DressesPage dressespage;
	
	public AccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		accountPage = new AccountPage();
		womenPage = new WomenPage();
		accountPage=loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void accountPageTitleTest() {
		String title = accountPage.validateAccountPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My account - My Store","not matched");
	}
	
	@Test(priority=2)
	public void AccountPageLinkTest() {
		String ap = accountPage.validateAccountPageLink();
		Assert.assertEquals(ap, "My account","not matched");
	}
	
	@Test(priority=3)
	public void clickOnWomenHeaderLinkTest() {
		womenPage = accountPage.clickOnWomenHeaderLink();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

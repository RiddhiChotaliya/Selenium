package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.AccountPage;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Login - My Store");
	}
	
	@Test(priority=2)
	public void topImageResponsiveTest() {
		boolean topImgRes = loginPage.topImageResponsive();
		Assert.assertTrue(topImgRes);
	}
	
	@Test(priority=3)
	public void shopPhNoTest() {
		boolean shopPhNo = loginPage.shopPhNo();
		Assert.assertTrue(shopPhNo);
	}
	
	@Test(priority=4)
	public void contactUsTest() {
		boolean contactUs = loginPage.shopPhNo();
		Assert.assertTrue(contactUs);
	}
	
	@Test(priority=5)
	public void signInTopBtnTest() {
		boolean signInTopBtn = loginPage.shopPhNo();
		Assert.assertTrue(signInTopBtn);
	}
	
	@Test(priority=6)
	public void shopLogoTest() {
		boolean shopLogo = loginPage.shopPhNo();
		Assert.assertTrue(shopLogo);
	}
	
	@Test(priority=7)
	public void searchBarTest() {
		boolean searchBar = loginPage.shopPhNo();
		Assert.assertTrue(searchBar);
	}
	
	@Test(priority=8)
	public void cartTest() {
		boolean cart = loginPage.shopPhNo();
		Assert.assertTrue(cart);
	}
	
	@Test(priority=9)
	public void homeTest() {
		boolean home = loginPage.shopPhNo();
		Assert.assertTrue(home);
	}
	
	@Test(priority=10)
	public void headerTest() {
		boolean header = loginPage.shopPhNo();
		Assert.assertTrue(header);
	}
	
	@Test(priority=11)
	public void emailCreateTest() {
		boolean emailCreate = loginPage.shopPhNo();
		Assert.assertTrue(emailCreate);
	}
	
	@Test(priority=12)
	public void createAnAccountTest() {
		boolean createAnAccount = loginPage.shopPhNo();
		Assert.assertTrue(createAnAccount);
	}
	
	@Test(priority=13)
	public void forgotYourPasswordTest() {
		boolean forgotYourPassword = loginPage.shopPhNo();
		Assert.assertTrue(forgotYourPassword);
	}
	
	@Test(priority=14)
	public void footerSectionTest() {
		boolean footerSection = loginPage.shopPhNo();
		Assert.assertTrue(footerSection);
	}
	
	@Test(priority=15)
	public void login() {
		accountPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}

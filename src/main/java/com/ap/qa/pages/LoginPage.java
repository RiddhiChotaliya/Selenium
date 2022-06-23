package com.ap.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ap.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement topImgRes;
	
	@FindBy(className="shop-phone")
	WebElement phone;
	
	@FindBy(id="contact-link")
	WebElement contactUs;
	
	@FindBy(className="login")
	WebElement signInTop;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(id="search_query_top")
	WebElement searchQuery;
	
	@FindBy(xpath="//div[@class='shopping_cart']/a")
	WebElement cart;
	
	@FindBy(xpath="//a[@class='home']")
	WebElement returnToHome;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li")
	WebElement topMenu;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signInBtn;
	
	@FindBy(name="email_create")
	WebElement emailCreate;
	
	@FindBy(id="SubmitCreate")
	WebElement submitCreate;
	
	@FindBy(xpath="//p[@class='lost_password form-group']/a")
	WebElement forgotYourPwd;
	
	@FindBy(className="footer-container")
	WebElement footer;
	
	@FindBy(xpath="(//ul[@class='submenu-container clearfix first-in-line-xs'])[1]//a")
	List<WebElement> WomenHeader;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean topImageResponsive() {
		return topImgRes.isDisplayed();
	}
	
	public boolean shopPhNo() {
		return phone.isDisplayed();
	}
	
	public boolean contactUs() {
		return contactUs.isDisplayed();
	}
	
	public boolean signInTopBtn() {
		return signInTop.isDisplayed();
	}
	
	public boolean shopLogo() {
		return logo.isDisplayed();
	}
	
	public boolean searchBar() {
		return searchQuery.isDisplayed();
	}
	
	public boolean cart() {
		return cart.isDisplayed();
	}
	
	public boolean home() {
		return returnToHome.isDisplayed();
	}
	
	public boolean header() {
		return topMenu.isDisplayed();
	}
	
//	public void womenHeader() {
//		
//	}
	
	public boolean emailCreate() {
		return emailCreate.isDisplayed();
	}
	
	public boolean createAnAccount() {
		return submitCreate.isDisplayed();
	}
	
	public boolean forgotYourPassword() {
		return forgotYourPwd.isDisplayed();
	}
	
	public boolean footerSection() {
		return footer.isDisplayed();
	}
	
	public AccountPage login(String emailAdd, String pwd) {
		email.sendKeys(emailAdd);
		password.sendKeys(pwd);
		signInBtn.click();
		return new AccountPage();
	}
	
}

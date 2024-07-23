package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath = "//img[@alt='ParaBank']")
	WebElement BankLogo;

	@FindBy(xpath = "//a[.='home']")
	WebElement homeButton;

	@FindBy(xpath = "//h4[.='Latest News']")
	WebElement LatestNewsInfo;

	@FindBy(xpath = "//a[@href='lookup.htm']")
	WebElement ForgotLoginInfoLink;

	@FindBy(xpath = "//h1[@class='title']")
	WebElement ForgotLoginForm;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String TitleTest() {
		return driver.getTitle();
	}

	public boolean BankLogo() {
		return BankLogo.isDisplayed();
	}

	public boolean HomeButtonTest() {
		homeButton.click();
		return LatestNewsInfo.isDisplayed();
	}
	
	public boolean ForgotLogin()
	{
		ForgotLoginInfoLink.click();
		return ForgotLoginForm.isDisplayed();
	}
}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.*;

public class LoginTest {

	WebDriver driver;
	LoginPage login;
	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		login = new LoginPage(driver);
	}

	@Test
	public void TitleTest() {
		String Title = login.TitleTest();
		softassert.assertTrue(Title.contains("ParaBank | Welcome"), "Title does not contain ParaBank");
	}

	@Test
	public void BankLogo() {
		softassert.assertTrue(login.BankLogo(), "Bank logo  not displayed");
	}

	@Test
	public void HomeButtonTesting() {
		softassert.assertTrue(login.HomeButtonTest(), "Home Button is not displayed");
	}
	
	@Test
	public void ForgotLoginTest()
	{
		softassert.assertTrue(login.ForgotLogin(), "Form not displayed");
	}
	
	@AfterMethod
	public void TearDown()
	{
		if (driver != null) {
			driver.quit();
		}
	}
}

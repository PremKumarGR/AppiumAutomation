package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helpers.ScrollPage;
import pages.HomePage;
import pages.RegistrationPage;

public class TitleValidation extends BaseClass {

	@Test(priority = 1)
	public void validateAppTitle() {
		HomePage hp = new HomePage(driver);
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));
	}

	@Test(priority = 2)
	public void validateEnbutton() {
		HomePage hp = new HomePage(driver);
		hp.selectEnButton();
		hp.selectnoNoOption();
		String homePageText = hp.homePageString();
		System.out.println("I am homepage String - " + homePageText);
		Assert.assertTrue(homePageText.equals("Hello Default Locale, Selendroid-test-app!"));
	}

	@Test(priority = 3)
	public void validatePreferredCarSelectionOption() {
		HomePage hp = new HomePage(driver);
		hp.clickChromeLogo();
		String chromePageText = hp.findChromePageText();
		System.out.println("I am chromePageText-" + chromePageText);
		Assert.assertTrue(chromePageText.equals("Hello, can you please tell me your name?"));
		hp.enterYourName("Premkumar");
		hp.selectMercedes();
		hp.clickSendYourNameButton();
	}

	@Test(priority = 4)
	public void validateRegistrationPage() throws Throwable {
		HomePage hp = new HomePage(driver);
		RegistrationPage rp = new RegistrationPage(driver);
		ScrollPage sp = new ScrollPage();
		hp.navigateFileLogo();
		String registrationPageText = hp.findRegistrationPageText();
		Assert.assertTrue(registrationPageText.equals("Welcome to register a new User"));
		String defaultName = rp.findDefaultName();
		Assert.assertEquals(defaultName, "Mr. Burns");
		rp.fillForms();
		sp.scroll(driver);
		rp.registerUser();
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));

	}

	@Test(priority = 5)
	public void validateProgressBar() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		RegistrationPage rp = new RegistrationPage(driver);
		hp.clickShowProgressBar();
		String registrationPageText = hp.findRegistrationPageText();
		Assert.assertTrue(registrationPageText.equals("Welcome to register a new User"));
	}

	@Test(priority = 6)
	public void navigateToDisplayToast() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnDisplayToast();
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));

	}

	@Test(priority = 7)
	public void valiateDisplayPopup() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnPopupWindow();
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));
	}

	@Test(priority = 8)
	public void validateExceptionButton() {
		BaseClass bc = new BaseClass();
		HomePage hp = new HomePage(driver);
		hp.clickExceptionButton();
	}
}

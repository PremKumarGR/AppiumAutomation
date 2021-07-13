package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helpers.ScrollPage;
import pages.HomePage;
import pages.RegistrationPage;

public class AppiumTestPositiveUseCases extends BaseClass {

	@Test
	public void validateAppTitle() {
		HomePage hp = new HomePage(driver);
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));
	}

	@Test
	public void validateEnbutton() {
		HomePage hp = new HomePage(driver);
		hp.selectEnButton();
		hp.selectnoNoOption();
		String homePageText = hp.homePageString();
		System.out.println("I am homepage String - " + homePageText);
		Assert.assertTrue(homePageText.equals("Hello Default Locale, Selendroid-test-app!"));
	}

	@Test
	public void validatePreferredCarSelectionOption() {
		HomePage hp = new HomePage(driver);
		hp.clickChromeLogo();
		driver.switchTo().frame(1);
		String chromePageText = hp.findChromePageText();
		Assert.assertTrue(chromePageText.equals("Hello, can you please tell me your name?"));
		hp.enterYourName("Premkumar");
		hp.selectMercedes();
		hp.clickSendYourNameButton();
	}

	@Test
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

	@Test
	public void validateProgressBar() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		RegistrationPage rp = new RegistrationPage(driver);
		hp.clickShowProgressBar();
		String registrationPageText = hp.findRegistrationPageText();
		Assert.assertTrue(registrationPageText.equals("Welcome to register a new User"));
	}

	@Test
	public void navigateToDisplayToast() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnDisplayToast();
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));

	}

	@Test
	public void valiateDisplayPopup() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOnPopupWindow();
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));
	}

}

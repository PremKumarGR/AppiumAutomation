package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class AppiumTestNegativeseCases extends BaseClass {
	@Test
	public void validateExceptionButton() {
		BaseClass bc = new BaseClass();
		HomePage hp = new HomePage(driver);
		hp.clickExceptionButton();
	}
}

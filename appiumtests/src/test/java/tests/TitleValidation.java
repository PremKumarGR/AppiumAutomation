package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class TitleValidation extends BaseClass {

	@Test
	public void validateAppTitle() {
		HomePage hp = new HomePage(driver);
		String title = hp.findTitle();
		Assert.assertTrue(title.equals("selendroid-test-app"));
	}
}

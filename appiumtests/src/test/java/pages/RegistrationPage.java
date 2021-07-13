package pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import Helpers.ScrollPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends HomePage {

	public RegistrationPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@AndroidFindBy(id = "io.selendroid.testapp:id/inputName")
	public WebElement getName;
	@AndroidFindBy(id = "io.selendroid.testapp:id/input_preferedProgrammingLanguage")
	public WebElement getProgrammingLanguage;
	@AndroidFindBy(id = "io.selendroid.testapp:id/inputUsername")
	public WebElement userName;
	@AndroidFindBy(id = "io.selendroid.testapp:id/inputEmail")
	public WebElement email;
	@AndroidFindBy(id = "io.selendroid.testapp:id/inputPassword")
	public WebElement password;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox")
	public WebElement acceptTermsCheckbox;
	@AndroidFindBy(id = "io.selendroid.testapp:id/btnRegisterUser")
	public WebElement RegisterUserButton;
	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonRegisterUser")
	public WebElement registerUser;

	public String findDefaultName() {
		String defaultName = getName.getText();
		return defaultName;
	}

	public String findDefaultLang() {
		String defaultLang = getProgrammingLanguage.getText();
		return defaultLang;
	}

	public void fillForms() {

		userName.sendKeys("Premkumar");
		email.sendKeys("prem@test.com");
		password.sendKeys("Test@12");
	}

	public void registerUser() {

		acceptTermsCheckbox.click();
		RegisterUserButton.click();
		registerUser.click();
	}
}
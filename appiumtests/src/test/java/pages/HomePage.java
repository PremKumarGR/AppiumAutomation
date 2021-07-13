package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "android:id/title")
	public WebElement getTitle;
	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonTest")
	public WebElement enButton;
	@AndroidFindBy(id = "android:id/button2")
	public WebElement noNoButton;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	public WebElement HomePageText;
	@AndroidFindBy(id = "io.selendroid.testapp:id/buttonStartWebview")
	public WebElement chromeLogo;
	@AndroidFindBy(accessibility = "Hello, can you please tell me your name?")
	public WebElement chromePageText;
	@AndroidFindBy(id = "name_input")
	public WebElement nameInput;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public WebElement mercedesDropDown;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Send me your name!\"]")
	public WebElement sendMeYourNameButton;
	@AndroidFindBy(id = "io.selendroid.testapp:id/startUserRegistration")
	public WebElement fileLogoButton;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
	public WebElement registrationPageText;
	@AndroidFindBy(id = "io.selendroid.testapp:id/waitingButtonTest")
	public WebElement showProgressBar;
	@AndroidFindBy(id = "io.selendroid.testapp:id/showToastButton")
	public WebElement DisplayToast;
	@AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	public WebElement DisplayPopupWindow;
	@AndroidFindBy(id = "io.selendroid.testapp:id/showPopupWindowButton")
	public WebElement DismissAlert;
	@AndroidFindBy(id = "io.selendroid.testapp:id/exceptionTestButton")
	public WebElement exceptionButton;

	public String findTitle() {
		String title = getTitle.getText();
		return title;
	}

	public void selectEnButton() {
		enButton.click();
	}

	public void selectnoNoOption() {
		noNoButton.click();
	}

	public String homePageString() {
		String homePageText = HomePageText.getText();
		return homePageText;
	}

	public void clickChromeLogo() {
		chromeLogo.click();
	}

	public String findChromePageText() {
		String PageText = chromePageText.getText();
		return PageText;
	}

	public void enterYourName(String preferredName) {
		nameInput.sendKeys(preferredName);
	}

	public void selectMercedes() {
		mercedesDropDown.click();
	}

	public void clickSendYourNameButton() {
		sendMeYourNameButton.click();
	}

	public void navigateFileLogo() {
		fileLogoButton.click();
	}

	public String findRegistrationPageText() {
		String pageText = registrationPageText.getText();
		return pageText;
	}

	public void clickShowProgressBar() throws InterruptedException {
		showProgressBar.click();
		Thread.sleep(10000);
	}

	public void clickOnDisplayToast() {
		DisplayToast.click();
	}

	public void clickOnPopupWindow() throws InterruptedException {
		DisplayPopupWindow.click();
		Thread.sleep(3000);
		DismissAlert.click();
	}

	public void clickExceptionButton() {
		try {
			exceptionButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}

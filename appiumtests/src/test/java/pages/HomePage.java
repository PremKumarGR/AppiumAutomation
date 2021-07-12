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
	public WebElement enBtton;

	public String findTitle() {
		String title = getTitle.getText();
		return title;
	}

}

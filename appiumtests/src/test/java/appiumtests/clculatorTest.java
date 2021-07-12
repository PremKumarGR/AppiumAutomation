package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class clculatorTest {

	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalclator();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

		}
	}

	public static void openCalclator() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy On5");
		cap.setCapability("udid", "42007c66c2a1b481");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Applicaton Starting");
	}

}

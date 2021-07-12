package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {

		try {
			DesiredCapabilities cap = new DesiredCapabilities();

			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.VERSION, "6.0.1");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy On5");
			cap.setCapability(MobileCapabilityType.UDID, "42007c66c2a1b481");
			// cap.setCapability(MobileCapabilityType.APP,
			// "/appiumtests/src/test/resources/apps/selendroid-test-app.apk");
			cap.setCapability("appPackage", "io.selendroid.testapp");
			cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
	}
}

package Helpers;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollPage {
	AppiumDriver<MobileElement> driver;

	public void scroll(AppiumDriver<MobileElement> driver) throws Throwable {
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);
		int end_x = (int) (dimension.width * 0.2);
		int end_y = (int) (dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);

	}
}

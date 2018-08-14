import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class gestures1 extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//PointOption to be used for tap action ,tap(el) no longer works
		  PointOption<ElementOption> point = ElementOption.element(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"));
		
		TouchAction<AndroidTouchAction> touch = new AndroidTouchAction(driver);
		touch.tap(point).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		  PointOption<ElementOption> press = ElementOption.element(driver.findElementByXPath("//android.widget.TextView[@text='People Names']"));

		touch.longPress(press).perform();
		
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").getText());
		
	
	}

}

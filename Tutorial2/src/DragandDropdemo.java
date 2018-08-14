import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DragandDropdemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		TouchAction<AndroidTouchAction> t = new AndroidTouchAction(driver);
        PointOption<ElementOption> longPress = ElementOption.element(driver.findElementsByClassName("android.view.View").get(0));
        PointOption<ElementOption> moveTo = ElementOption.element(driver.findElementsByClassName("android.view.View").get(2));
        t.longPress(longPress).moveTo(moveTo).release().perform();

	}

}

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class swipedemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		TouchAction<AndroidTouchAction> t = new AndroidTouchAction(driver);
		//navigate till clock
		
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
        driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();
        //swipe action code
        PointOption<ElementOption> Press = ElementOption.element(driver.findElementByXPath("//*[@content-desc='15']"));
        PointOption<ElementOption> Moveto = ElementOption.element(driver.findElementByXPath("//*[@content-desc='45']"));
        t.press(Press).moveTo(Moveto).release().perform();


	}

}

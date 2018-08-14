import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;

public class basics2 extends Hybridbase {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		HomePage h = new HomePage(driver);
		
		h.Preferences.click();
		h.Test.click();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click(); //xpath  -This test is for normal tests
		
		Preferences p = new Preferences(driver);
		
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click(); - code for normal tests
		
		p.dependencies.click();
		
		driver.findElementById("android:id/checkbox").click();//id
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();//xpath index
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");//class name
		driver.findElementsByClassName("android.widget.Button").get(1).click();//multiple elements class name
	}

}

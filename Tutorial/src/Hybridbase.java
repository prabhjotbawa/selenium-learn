import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybridbase {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {
		// TODO Auto-generated method stub
// use file method to get the apk
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
// define capabilities to pick the device name and device name
		DesiredCapabilities cap=new DesiredCapabilities();
		if (device.equals("real"))
		{
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
		}
		else if(device.equals("emulator"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Latest");
		
		}
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
// create connection with Appium using Android server(ios IOS driver)
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
//Android UIAutomator
		
		
		
		
	}

}

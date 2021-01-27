package Work_1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
		// TODO Auto-generated method stub

		File f=new File("src");
		//File fs=new File(f,"ApiDemos-debug.apk");
		File fs=new File(f,"General-Store.apk");
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RajivEmulator");//Emulator name
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//app location select
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
//		
//		
//		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
//		cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
//		cap.setCapability("noReset", "true");
//		//cap.setCapability("deviceName", "Galaxy A01");
//		cap.setCapability("udid", "emulator-5554");
//		
//		
//		
//		
//		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}

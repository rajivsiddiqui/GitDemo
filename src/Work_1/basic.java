package Work_1;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*     xpath syntax
		 *    //tagname[@attribute='value']
		 *    here tagname is the class value
		*/
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	    driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		//""
		
		
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(By.id("android:id/checkbox")).click();
//		
		
		
	}

}

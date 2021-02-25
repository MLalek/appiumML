package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstMT {

    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Mehmet\\Desktop\\Apium\\App\\GestureTool.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, desiredCapabilities);
        Thread.sleep(5000);

        WebElement addGestureBtn = driver.findElementById("com.davemac327.gesture.tool:id/reloadButton");
        addGestureBtn.click();

    }
}

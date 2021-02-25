package android;

/*
    lunch app API Demos
    click preference
    click default values
    click check box (checked)
    then verify checked

    2.Test Case
    click Edit text preference
    clear text box and write your name
    and verify your name.

 */

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RadioButton {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2"); //XSUI
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//IOS
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mehmet\\Desktop\\Apium\\App\\apiDemos.apk");
        desiredCapabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
        desiredCapabilities.setCapability("activity", "com.touchboarder.androidapidemos.MainActivity" );
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url, desiredCapabilities);
        Thread.sleep(1000);

        WebElement apiDemo = driver.findElementByXPath("//android.widget.TextView[@text='API Demos']");
        apiDemo.click();
        Thread.sleep(1000);

        WebElement apiPreference = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        apiPreference.click();
        Thread.sleep(1000);

        WebElement apiDependencies = driver.findElementByXPath("//android.widget.TextView[@text='Controls']");
        apiDependencies.click();
        Thread.sleep(1000);

        driver.findElementByXPath("//android.widget.TextView[@text='02. Dark Theme']").click();
        Thread.sleep(1000);

        driver.findElementById("com.touchboarder.android.api.demos:id/radio1").click();
        Thread.sleep(3000);

        driver.findElementByAndroidUIAutomator("UiSelector().checked(true)");
        Thread.sleep(3000);


//        WebElement radioButton = driver.findElementByXPath("(//android.widget.CheckedTextView)[2]");
//        radioButton.click();
//        Thread.sleep(1000);
//        Assert.assertTrue(Boolean.parseBoolean(radioButton.getAttribute("checked")));
//        Thread.sleep(1000);


    }
}

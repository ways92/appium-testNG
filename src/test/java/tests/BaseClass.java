package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {

    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup(){

        try {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName","ANDROID");
        caps.setCapability("platformVersion","11");
        caps.setCapability("deviceName","Pixel 3a");
        caps.setCapability("udid","emulator-5554");

        caps.setCapability("appPackage","com.google.android.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");



            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url,caps);

        } catch (Exception e) {
            System.out.println("The cause is : "+e.getCause());
            System.out.println("The message is : "+e.getMessage());
            e.printStackTrace();
        }

    }


    @AfterTest
    public void teardown(){
        driver.quit();
    }
}

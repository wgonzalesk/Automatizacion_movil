package definitions;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static AndroidDriver<WebElement> driver;

    @Before
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulador");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //capabilities.setCapability("chromedriverExecutable","D:\\ALP - Agile Learning Perú\\Consultorias\\mobile\\src\\test\\resources\\driver\\chromedriver74.exe");
        capabilities.setCapability("appPackage" , "com.vodqareactnative");
        capabilities.setCapability("appActivity", "com.vodqareactnative.MainActivity");
//        capabilities.setCapability(MobileCapabilityType.APP, "D:\\ALP - Agile Learning Perú\\Consultorias\\mobile\\src\\test\\resources\\app\\VodQA.apk");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @After
    public static void tearDown(){
        driver.quit();
    }
}

package definitions;

import io.appium.java_client.android.AndroidDriver;
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
        capabilities.setCapability("deviceName","emulador");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("appPackage","com.prodev.interestcalc");
        capabilities.setCapability("appActivity","com.prodev.interestcalc.InterestCalculatorActivity");
        capabilities.setCapability("automationName","UiAutomator2");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @After
    public static void tearDown(){
        driver.quit();
    }
}

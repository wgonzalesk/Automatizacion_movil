package pageobjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerticalSwipingPage {
    private WebDriverWait wait;
    private AndroidDriver<WebElement> dvr;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Vertical swiping')]") protected static AndroidElement lbl_title;

    public VerticalSwipingPage(AndroidDriver<WebElement>driver) {
        dvr =driver;
        PageFactory.initElements((new AppiumFieldDecorator(driver)),this);
        wait = new WebDriverWait(dvr,40);

    }
    public void validarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(lbl_title));
        lbl_title.isDisplayed();
    }

    public void ScrollView(String opcion){
        System.out.println("scrollview");
        String scroll= "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+opcion+"\"))";
        dvr.findElement(MobileBy.AndroidUIAutomator(scroll));
    }
}

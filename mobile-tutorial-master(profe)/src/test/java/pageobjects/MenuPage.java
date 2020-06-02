package pageobjects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MenuPage extends PageFactory {
    private AndroidDriver<WebElement> dvr;
    TouchAction move;
    private WebDriverWait wait;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='chainedView']") protected static AndroidElement lstchainedView;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='slider1']") protected static AndroidElement lstslider;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='verticalSwipe']") protected static AndroidElement lstswiping;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='dragAndDrop']") protected static AndroidElement lstdraganddrop;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='doubleTap']") protected static AndroidElement lstdoubletap;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='longPress']") protected static AndroidElement lstlongpress;
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='wheelPicker']") protected static AndroidElement lstwheelpicker;

    public MenuPage(AndroidDriver<WebElement> driver) {
        dvr=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        move = new TouchAction(driver);
        wait = new WebDriverWait(driver, 40);
    }

    public void loginCorrecto(){
        wait.until(ExpectedConditions.visibilityOf(lstchainedView));
        lstchainedView.isDisplayed();
    }

    public void ingresarChainedView(){
        lstchainedView.click();
    }

    public void ingresarSlider(){
        lstslider.click();
    }

    public void ingresarSwiping(){
        lstswiping.click();
    }

    public void ingresarDragAndDrop(){
        lstdraganddrop.click();
    }

    public void ingresarDoubleTap(){
        lstdoubletap.click();
    }

    public void ingresarLongPress(){
        lstlongpress.click();
    }

    public void scrollPicker(String opcion){
        String scroll="new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\""+opcion+"\"))";
        dvr.findElement(MobileBy.AndroidUIAutomator(scroll)).click();
    }

    public void scrollPicker2(){
        Dimension dimension = dvr.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        int codX =  width/2;
        int tapY = (int) (height * 0.5);
        int topY = (int) (height * 0.2);

        move.press(PointOption.point(codX, tapY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
                .moveTo(PointOption.point(codX, topY)).release().perform();

        lstwheelpicker.isDisplayed();

        lstwheelpicker.click();

    }

    public void scrollPickerHorizontal(){
        Dimension dimension = dvr.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        int codX =  height/2;
        int tapY = (int) (width * 0.5);
        int topY = (int) (width * 0.2);

        move.press(PointOption.point(codX, tapY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
                .moveTo(PointOption.point(codX, topY)).release().perform();
        lstwheelpicker.isDisplayed();
        lstwheelpicker.click();

    }
}

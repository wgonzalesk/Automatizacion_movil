package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SliderPage {
    private TouchAction move;

    @AndroidFindBy(accessibility = "slider") protected static AndroidElement slider;

    public SliderPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        move = new TouchAction(driver);
    }

    public void MoverSlider(){
        int xStart = slider.getLocation().getX();
        int xEnd = (int)(xStart+slider.getSize().getWidth()*0.5);
        int yPoint = slider.getLocation().getY();

        move.press(PointOption.point(xStart,yPoint)).moveTo(PointOption.point(xEnd,yPoint)).release().perform();

    }
}

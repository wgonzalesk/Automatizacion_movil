package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DoubleTapPage {
    private TouchAction move;

    @AndroidFindBy(accessibility = "doubleTapMe") protected static AndroidElement btndoubletap;

    public DoubleTapPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        move = new TouchAction(driver);
    }

    public void DoubleTap(){
        Point pointTap = btndoubletap.getLocation();
        Dimension dimensionTap = btndoubletap.getSize();

        int xTap = pointTap.getX() + dimensionTap.getWidth()/2;
        int yTap = pointTap.getY() + dimensionTap.getHeight()/2;

        move.tap(PointOption.point(xTap, yTap)).tap(PointOption.point(xTap, yTap)).perform();
    }
}

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

public class DragAndDropPage {

    private TouchAction move;

    @AndroidFindBy(accessibility = "dragMe") protected static AndroidElement objDrag;
    @AndroidFindBy(accessibility = "dropzone") protected static AndroidElement objDrop;
    @AndroidFindBy(accessibility = "success") protected static AndroidElement lblsuccess;

    public DragAndDropPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        move = new TouchAction(driver);
    }

    public void DragAndDrop(){
        Point pointDrag = objDrag.getLocation();
        Dimension dimensionDrag = objDrag.getSize();

        int xDrag = pointDrag.getX() + dimensionDrag.getWidth()/2;
        int yDrag = pointDrag.getY() + dimensionDrag.getHeight()/2;

        Point pointDrop = objDrop.getLocation();
        Dimension dimensionDrop = objDrop.getSize();

        int xDrop = pointDrop.getX() + dimensionDrop.getWidth()/2;
        int yDrop = pointDrop.getY() + dimensionDrop.getHeight()/2;

        move.longPress(PointOption.point(xDrag, yDrag)).moveTo(PointOption.point(xDrop, yDrop)).release().perform();
    }

    public void validarMensaje(){
        lblsuccess.isDisplayed();
    }
}

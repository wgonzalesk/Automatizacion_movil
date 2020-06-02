package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LongPressPage {
private TouchAction move;

    @AndroidFindBy(accessibility = "longpress") private AndroidElement btn_longpress;
    @AndroidFindBy(id="android:id/message") private AndroidElement lbl_mensaje;
    @AndroidFindBy(xpath = "//*[@text='OK']") private AndroidElement btn_ok;

    public LongPressPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        move = new TouchAction(driver);
    }

    public void longpress(){
        Point pointPress= btn_longpress.getLocation();
        Dimension dimensionPress = btn_longpress.getSize();

        int xPress = pointPress.getX()+dimensionPress.getWidth()/2;
        int yPress = pointPress.getY()+dimensionPress.getHeight()/2;

        move.longPress(PointOption.point(xPress,yPress)).perform();
    }

    public void validarMensaje(String msg){
        Assert.assertEquals(msg,lbl_mensaje.getText());
        btn_ok.click();
    }
}

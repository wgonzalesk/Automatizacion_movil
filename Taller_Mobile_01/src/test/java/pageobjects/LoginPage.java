package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageFactory {

    @AndroidFindBy(accessibility = "username") protected static AndroidElement txtUsername;
    @AndroidFindBy(accessibility = "password") protected static AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//*[@text='LOG IN']") protected static AndroidElement btnLogin;
    @AndroidFindBy(id = "android:id/message") protected static AndroidElement lblmensaje;

    public LoginPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void escribirUsuario(String texto){
        txtUsername.sendKeys(texto);
    }

    public void escribirPassword(String texto){
        txtPassword.setValue(texto);
    }

    public void clicLogin(){
        btnLogin.click();
    }

    public void validacion(){
        Assert.assertEquals("Invalid  Credentials",lblmensaje.getText());
    }
}

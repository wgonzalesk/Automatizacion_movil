package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageFactory {
    private WebDriverWait wait;
    private AndroidDriver<WebElement> dvr;

    @AndroidFindBy(accessibility = "username") protected static AndroidElement txtUsername;
    @AndroidFindBy(accessibility = "password") protected static AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//*[@text='LOG IN']") protected static AndroidElement btnLogin;
    @AndroidFindBy(id = "android:id/message") protected static AndroidElement lblmensaje;

    public LoginPage(AndroidDriver<WebElement> driver) {
        dvr=driver;
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 40);
    }

    public void escribirUsuario(String texto){
        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.sendKeys(texto);
        txtUsername.click();
        dvr.hideKeyboard();
    }

    public void escribirPassword(String texto){
        txtPassword.setValue(texto);

    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void validacion(){
        Assert.assertEquals("Invalid  Credentials",lblmensaje.getText());
    }

}

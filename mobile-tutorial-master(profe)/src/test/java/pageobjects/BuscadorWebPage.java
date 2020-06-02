package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscadorWebPage {

    @FindBy(name = "q") protected static WebElement txt_buscador;

    public BuscadorWebPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void escribirTexto(String texto){
        txt_buscador.sendKeys(texto);
        txt_buscador.sendKeys(Keys.ENTER);
    }

}

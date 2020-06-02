package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NativeViewPage extends PageFactory {

    @AndroidFindBy(xpath = "//*[contains(@text, 'View one')]") protected static AndroidElement lblprimertexto;
    @AndroidFindBy(xpath = "//*[contains(@text, 'View two')]") protected static AndroidElement lblsegundotexto;
    @AndroidFindBy(xpath = "//*[contains(@text, 'View three')]") protected static AndroidElement lbltercertexto;


    public NativeViewPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void ObtenerTexto(String opcion){
        String texto="";
        if (opcion.toLowerCase().equals("uno")){
             texto = lblprimertexto.getText();
        }else if (opcion.toLowerCase().equals("dos")){
             texto = lblsegundotexto.getText();
        }else if (opcion.toLowerCase().equals("tres")){
             texto = lbltercertexto.getText();
        }
        System.out.println(texto);
    }
}

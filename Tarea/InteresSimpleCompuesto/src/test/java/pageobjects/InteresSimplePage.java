package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;

public class InteresSimplePage {

    public static double valoractual;
    public static double tasadeinteres;
    public static double periodo;

    public static String interesGanado;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText\n") protected static AndroidElement txt_valorActual;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText\n") protected static AndroidElement txt_tasaInteres;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText\n") protected static AndroidElement txt_periodo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText\n") protected static AndroidElement txt_valorFuturo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText\n") protected static AndroidElement txt_interesTotal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button\n") protected static AndroidElement btn_calcular;
    @AndroidFindBy(xpath = "//*[@text='Revise el formulario, rellene todos los campos']") protected static AndroidElement lbl_mensajeError;


    public InteresSimplePage(AndroidDriver <WebElement> driver) {
        PageFactory.initElements( new AppiumFieldDecorator(driver),this);
    }
    public void ingresarValorInteresPeriodo(String valor, String interes, String periodo){

        txt_valorActual.sendKeys(valor);
        txt_tasaInteres.sendKeys(interes);
        txt_periodo.sendKeys(periodo);
    }

    public void calcular(){
        btn_calcular.click();
    }

    public void validarMensajeError(String msg){
    Assert.assertEquals(lbl_mensajeError.getText(),msg);
    System.out.println("Mensaje de error Esperado: "+lbl_mensajeError.getText());
    System.out.println("Mensaje de error Enviado: "+msg);
    }

    public void validarResultado(){

        //Calcular Interes con los campos ingresados
        double valorFuturo = valoractual*(1+((periodo/100)*tasadeinteres));

        //Redondear 3 decimales
        DecimalFormat df = new DecimalFormat("#.000");
        String valorFuturoFormateado=df.format(valorFuturo);

        System.out.println("1Valor futuro en app: "+txt_valorFuturo);
        System.out.println("1valor futuro cálculo interno: "+valorFuturoFormateado);

       //Validar Resultado en aplicativo vs Cálculo Interno
       Assert.assertEquals(valorFuturoFormateado,txt_valorFuturo);
        System.out.println("2Valor futuro en app: "+txt_valorFuturo);
        System.out.println("2valor futuro cálculo interno: "+valorFuturoFormateado);

    }


}

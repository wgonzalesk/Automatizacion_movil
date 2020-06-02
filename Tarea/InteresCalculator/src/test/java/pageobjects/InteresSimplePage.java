package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.processing.SupportedSourceVersion;

public class InteresSimplePage extends PageFactory{
    private WebDriverWait wait;
    public static double monto;
    public static double interes;
    public static double tiempo;

    public static String interesGanado;

    @AndroidFindBy(id="com.prodev.interestcalc:id/amount_entry") protected static AndroidElement txtMonto;
    @AndroidFindBy(id="com.prodev.interestcalc:id/interest_rate_entry") protected static AndroidElement txtInteres;
    @AndroidFindBy(id="com.prodev.interestcalc:id/time_entry") protected static AndroidElement txtTiempo;
    @AndroidFindBy(id="com.prodev.interestcalc:id/calculateButton") protected static AndroidElement btnCalcular;

    @AndroidFindBy(id="com.prodev.interestcalc:id/interestEarned") protected static AndroidElement txtInteresGanado;

    public InteresSimplePage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait(driver,40);
       }

    public void ingresarmonto(String monto){
        wait.until(ExpectedConditions.visibilityOf(txtMonto));
        txtMonto.setValue(monto);

    }

    public void ingresarinteres(String interes){
        txtInteres.sendKeys(interes);
    }

    public void ingresartiempo(String tiempo){
        txtTiempo.sendKeys(tiempo);
    }

    public void calcularinteres(){
        btnCalcular.click();
    }

    public void validarResultado(){

        //Calcular Interes con los campos ingresados
        double calcularInteres = monto*(interes/100)*(tiempo/12);
        //Redondear 2 decimales
        double calcularInteresRedondeado = Math.round(calcularInteres*100);
               calcularInteresRedondeado = calcularInteresRedondeado/100;

        //Extraer Interes
        interesGanado=txtInteresGanado.getText();
        String[] parteInteres = interesGanado.split(" ");

        //Validar Resultado en aplicativo vs Cálculo Interno
        Assert.assertEquals(parteInteres[1],Double.toString(calcularInteresRedondeado));
        System.out.println("Interés ganado en app: "+parteInteres[1]);
        System.out.println("Interés ganado cálculo interno: "+calcularInteresRedondeado);

    }


}

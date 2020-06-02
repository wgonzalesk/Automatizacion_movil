package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WheelPickerPage {
    private WebDriverWait wait;

    @AndroidFindBy(id = "android:id/text1") private AndroidElement cmb_colores;
    //@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='red']")private  AndroidElement wa;
    @AndroidFindBy(xpath = "//*[@text='black']")private  AndroidElement color_negro;
    @AndroidFindBy(xpath = "//*[@text='red']")private  AndroidElement color_rojo;
    @AndroidFindBy(xpath = "//*[@text='blue']")private  AndroidElement color_azul;
    @AndroidFindBy(xpath = "//*[@text='green']")private  AndroidElement color_verde;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Color: black')]")private  AndroidElement lbl_negro;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Color: red')]")private  AndroidElement lbl_rojo;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Color: blue')]")private  AndroidElement lbl_azul;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Color: green')]")private  AndroidElement lbl_verde;




    public WheelPickerPage(AndroidDriver<WebElement> driver) {
        PageFactory.initElements((new AppiumFieldDecorator(driver)),this);
        wait = new WebDriverWait(driver,40);
    }
    public void seleccionarColor(String color){
        cmb_colores.click();
        if(color.toLowerCase().equals("rojo")){
            color_rojo.click();
        }else if (color.toLowerCase().equals("azul")){
            color_azul.click();
        }else if (color.toLowerCase().equals("verde")){
            color_verde.click();
        }else if (color.toLowerCase().equals("negro")){
            color_negro.click();
        }
    }

    public void validarColor(String color){
        if(color.toLowerCase().equals("rojo")){
            lbl_rojo.isDisplayed();
        }else if (color.toLowerCase().equals("azul")){
            lbl_azul.isDisplayed();
        }else if (color.toLowerCase().equals("verde")){
            lbl_verde.isDisplayed();
        }else if (color.toLowerCase().equals("negro")){
            lbl_negro.isDisplayed();
        }
    }
}

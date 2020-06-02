package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscadorPage {

    @FindBy(name = "q") private WebElement txt_buscador;
    @FindBy(name = "btnK") private WebElement btn_buscador;

    public BuscadorPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void escribirTexto(String texto){
        txt_buscador.sendKeys(texto);
        txt_buscador.sendKeys(Keys.ENTER);
    }

    public void clickBuscar() {
        btn_buscador.click();
    }
}

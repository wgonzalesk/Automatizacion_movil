package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LongPressPage;
import pageobjects.MenuPage;

public class HistoriaLongPressDefinition {
    MenuPage menu;
    LongPressPage press;

    public HistoriaLongPressDefinition() {
        menu = new MenuPage(Hooks.driver);
        press = new LongPressPage(Hooks.driver);
    }

    @Given("ingresar a la opción longpress")
    public void ingresaralaopcionlongpress() {
        menu.ingresarLongPress();
    }

    @When("realizar longpress al boton")
    public void realizarLongpressAlBoton() {
        press.longpress();
    }

    @Then("validar mensaje de longpress {string}")
    public void validarMensajeDeLongpress(String msj) {
        press.valdiarMensaje(msj);
    }
}

package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DoubleTapPage;
import pageobjects.MenuPage;

public class HistoriaDoubleTap {
    MenuPage menu ;
    DoubleTapPage dtap;

    public HistoriaDoubleTap() {
        menu = new MenuPage(Hooks.driver);
        dtap = new DoubleTapPage(Hooks.driver);
    }

    @Given("entrar a la opción doble tap")
    public void entrarALaOpciónDobleTap() {
        menu.ingresarDoubleTap();        
    }

    @When("realizar doble tap")
    public void realizarDobleTap() {
        dtap.DoubleTap();
    }

    @Then("validar mensaje {string}")
    public void validarMensaje(String msg) {
        dtap.validarMensaje(msg);
    }
}

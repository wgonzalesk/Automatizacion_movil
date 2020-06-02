package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.MenuPage;

import java.io.IOException;

import static support.evidencias.captura;

public class HistoriaLoginDefinition {
    LoginPage login;
    MenuPage menu;

    public HistoriaLoginDefinition() {
        login = new LoginPage(Hooks.driver);
        menu = new MenuPage(Hooks.driver);
    }

    @Given("que el usuario ingresa con su cuenta {string}")
    public void queElUsuarioIngresaConSuCuenta(String texto) {
        login.escribirUsuario(texto);
    }

    @And("ingresa su password {string}")
    public void ingresaSuPassword(String texto) throws IOException {
        login.escribirPassword(texto);
        captura();


    }

    @When("ingresa a su cuenta")
    public void ingresaASuCuenta() {
        login.clicLogin();
    }


    @Then("logeo correcto")
    public void logeoCorrecto() {
        menu.loginCorrecto();
    }

    @Then("no debe permitir el login")
    public void noDebePermitirElLogin() {
        login.validacion();
    }

    @Given("Realizar login")
    public void realizarLogin() throws IOException {
        queElUsuarioIngresaConSuCuenta("admin");
        ingresaSuPassword("admin");
        ingresaASuCuenta();
        logeoCorrecto();
    }
}

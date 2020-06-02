package definitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.MenuPage;
import support.evidencias;

import java.io.IOException;

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

    @And("que el usuario ingrese su password {string}")
    public void queElUsuarioIngreseSuPassword(String texto) throws IOException {
        login.escribirPassword(texto);
        evidencias.captura();
    }

    @When("ingresar a su cuenta")
    public void ingresarASuCuenta() {
        login.clickLogin();
    }

    @Then("no debe permitir el login")
    public void noDebePermitirElLogin() {
        login.validacion();
    }

    @Then("login correcto")
    public void loginCorrecto() {
        menu.loginCorrecto();
    }

    @Given("realizar login")
    public void realizarLogin() throws IOException{
        queElUsuarioIngresaConSuCuenta("admin");
        queElUsuarioIngreseSuPassword("admin");
        ingresarASuCuenta();
        loginCorrecto();
    }
}

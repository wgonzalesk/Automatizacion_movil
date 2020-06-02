package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BuscadorWebPage;

public class HistoriaBusquedaDefinition {
    BuscadorWebPage web;

    public HistoriaBusquedaDefinition() {
        web = new BuscadorWebPage(Hooks.driver);
    }

    @Given("que el buscador este operativo")
    public void queElBuscadorEsteOperativo() {
        Hooks.driver.get("https://www.google.com.pe/");
    }

    @When("ingresar el texto {string}")
    public void ingresarElTexto(String texto) {
        web.escribirTexto(texto);
    }
}

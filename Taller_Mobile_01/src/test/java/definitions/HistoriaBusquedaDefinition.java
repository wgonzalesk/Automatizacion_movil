package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.BuscadorPage;

public class HistoriaBusquedaDefinition {
    BuscadorPage web;

    public HistoriaBusquedaDefinition() {
        web = new BuscadorPage(Hooks.driver);
    }

    @Given("que el buscador este operativo")
    public void queElBuscadorEsteOperativo() {

        Hooks.driver.get("https://www.google.com/");
    }

    @When("ingresar el texto {string}")
    public void ingresarElTexto(String texto) {
        web.escribirTexto(texto);
    }



}

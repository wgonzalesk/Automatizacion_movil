package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.MenuPage;
import pageobjects.NativeViewPage;

public class HistoriaViewDefinition {
    MenuPage menu;
    NativeViewPage nativeView;

    public HistoriaViewDefinition() {
        menu = new MenuPage(Hooks.driver);
        nativeView = new NativeViewPage(Hooks.driver);
    }

    @When("ingresar a native view")
    public void ingresarANativeView() {
        menu.ingresarChainedView();
    }


    @Then("mostrar el texto {string}")
    public void mostrarElTexto(String opcion) {
        nativeView.obtenerTexto(opcion);
    }
}

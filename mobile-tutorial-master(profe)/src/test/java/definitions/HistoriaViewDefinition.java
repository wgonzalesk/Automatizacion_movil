package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MenuPage;
import pageobjects.NativeViewPage;
import java.io.IOException;
import static support.evidencias.captura;

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
    public void mostrarElTexto(String opcion) throws IOException {
        nativeView.ObtenerTexto(opcion);
       captura();
    }
    
}

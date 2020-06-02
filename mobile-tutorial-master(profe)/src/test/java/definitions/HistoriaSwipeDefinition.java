package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.MenuPage;
import pageobjects.VerticalSwipingPage;

public class HistoriaSwipeDefinition {
    MenuPage menu;
    VerticalSwipingPage swipe;

    public HistoriaSwipeDefinition() {
        menu = new MenuPage(Hooks.driver);
        swipe = new VerticalSwipingPage(Hooks.driver);
    }

    @Given("ingresar a la opción swipe")
    public void ingresarALaOpcionSwipe() {
        menu.ingresarSwiping();
    }

    @Then("encontrar la opción {string}")
    public void encontrarLaOpcion(String opcion) {
        swipe.validarTitulo();
        swipe.ScrollView(opcion);
    }
}

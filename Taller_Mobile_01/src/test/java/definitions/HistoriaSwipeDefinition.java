package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.MenuPage;
import pageobjects.VerticalSwipingPage;

public class HistoriaSwipeDefinition {
    MenuPage menu;
    VerticalSwipingPage swipe;

    public HistoriaSwipeDefinition() {
        menu = new MenuPage((Hooks.driver));
        swipe = new VerticalSwipingPage((Hooks.driver));

    }

    @Given("ingresar a la opción swipe")
    public void ingresarALaOpciónSwipe() {
        menu.ingresarSwiping();

    }

    @Then("encontrar la opción {string}")
    public void encontrarLaOpción(String opcion) {
        swipe.ScrollView(opcion);
    }
}

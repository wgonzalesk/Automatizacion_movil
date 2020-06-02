package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.DoubleTapPage;
import pageobjects.MenuPage;

public class HistoriaDoubleTap {
    MenuPage menu;
    DoubleTapPage dtap;
    public HistoriaDoubleTap() {
        menu = new MenuPage(Hooks.driver);
        dtap = new DoubleTapPage(Hooks.driver);
    }

    @Given("entrar a la opción doble tap")
    public void entrarALaOpcionDobleTap() {
        menu.ingresarDoubleTap();
    }

    @When("realizar doble tap")
    public void realizarDobleTap() {
        dtap.DoubleTap();
    }
}

package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.MenuPage;
import pageobjects.SliderPage;

import java.io.IOException;

import static support.evidencias.captura;

public class HistoriaSliderDefinition {
    MenuPage menu;
    SliderPage slider;

    public HistoriaSliderDefinition() {
        menu = new MenuPage(Hooks.driver);
        slider = new SliderPage(Hooks.driver);
    }

    @Given("ingresar la opción slider")
    public void ingresarLaOpcionSlider() {
        menu.ingresarSlider();
    }

    @Then("permita mover el slider")
    public void permitaMoverElSlider() throws IOException {
        slider.MoverSlider();
        captura();
    }
}

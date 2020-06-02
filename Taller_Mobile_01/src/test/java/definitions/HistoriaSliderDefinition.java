package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import javafx.scene.control.Slider;
import pageobjects.MenuPage;
import pageobjects.NativeViewPage;
import pageobjects.SliderPage;

public class HistoriaSliderDefinition {

    MenuPage menu;
    SliderPage slider;

    public HistoriaSliderDefinition() {
        menu = new MenuPage(Hooks.driver);
        slider = new SliderPage(Hooks.driver);
    }
    @Given("ingresar a la opcion slider")
    public void ingresarALaOpcionSlider() {
        menu.ingresarSlider();
    }

    @Then("permita mover el slider")
    public void permitaMoverElSlider() {
        slider.MoverSlider();
    }
}

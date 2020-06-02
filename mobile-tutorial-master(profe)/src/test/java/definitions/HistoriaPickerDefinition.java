package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MenuPage;
import pageobjects.WheelPickerPage;

public class HistoriaPickerDefinition {
    MenuPage menu;
    WheelPickerPage picker;

    public HistoriaPickerDefinition() {
        menu = new MenuPage(Hooks.driver);
        picker = new WheelPickerPage(Hooks.driver);
    }

    @Given("ingresar a la opción wheel picker")
    public void ingresarALaOpcionWheelPicker() {
        menu.scrollPicker2();
        //menu.scrollPicker("Wheel Picker");
    }

    @When("seleccionar un color {string}")
    public void seleccionarUnColor(String color) {
        picker.seleccionarColor(color);
    }

    @Then("validar cambio de color {string}")
    public void validarCambioDeColor(String color) {
        picker.validarColor(color);
    }
}

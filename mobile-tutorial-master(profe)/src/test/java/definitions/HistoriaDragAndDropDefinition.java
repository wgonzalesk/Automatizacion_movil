package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DragAndDropPage;
import pageobjects.MenuPage;

public class HistoriaDragAndDropDefinition {
    MenuPage menu;
    DragAndDropPage objetos;

    public HistoriaDragAndDropDefinition() {
        menu = new MenuPage(Hooks.driver);
        objetos = new DragAndDropPage(Hooks.driver);
    }

    @Given("ingresar a la opción drag and drop")
    public void ingresarALaOpcionDragAndaDrop() {
        menu.ingresarDragAndDrop();
    }

    @When("mover el objeto")
    public void moverElObjeto() {
        objetos.DragAndDrop();
    }

    @Then("validar mensaje correcto")
    public void validarMensajeCorrecto() {
        objetos.validarMensaje();
    }
}

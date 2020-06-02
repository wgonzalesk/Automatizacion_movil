package definitions;
import pageobjects.MenuPage;
import io.cucumber.java.en.Given;


public class HistoriaMenu {
    MenuPage menu;

    public HistoriaMenu() {
        menu = new MenuPage(Hooks.driver);
    }

    @Given("ingreso a la opcion Interes {string} en el menu")
    public void ingresoALaOpcionInteresEnElMenu(String tipoInteres) {
        menu.ingresarMenu(tipoInteres);

    }


}

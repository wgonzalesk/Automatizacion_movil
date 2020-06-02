package definitions;

import io.cucumber.java.da.Men;
import io.cucumber.java.en.Given;
import pageobjects.LoginPage;
import pageobjects.LongPressPage;
import pageobjects.MenuPage;

public class HistoriaLongPressDefinition {
    MenuPage menu;
    LongPressPage press;

    public HistoriaLongPressDefinition() {
        menu = new MenuPage(Hooks.driver);
        press = new LongPressPage(Hooks.driver);
    }

    @Given("ingresar a la opción Longpress")
    public void ingresarALaOpciónLongpress() {
        menu.ingresarLongPress();
    }

    @Given("realizar longpress al boton")
        public void realizarlongpressalboton() {
        press.longpress();

    }

    @Given("validar mensaje de longpress {string}")
    public void validarMensajeDeLongPress(String msg) {
        press.validarMensaje(msg   );

    }
}

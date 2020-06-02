package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.InteresSimplePage;

public class HistoriaInteresSimple {
    InteresSimplePage interesSimple;

    public HistoriaInteresSimple() {
        interesSimple = new InteresSimplePage(Hooks.driver);
    }

    @When("ingreso un valor {string} con el interes del {string} porciento durante {string} meses")
    public void ingresoUnValorConElInteresDelPorcientoDuranteMeses(String valor, String interes, String periodo) {
        interesSimple.ingresarValorInteresPeriodo(valor,interes,periodo);

        InteresSimplePage.valoractual = Double.parseDouble(valor);
        InteresSimplePage.tasadeinteres = Double.parseDouble(interes);
        InteresSimplePage.periodo = Double.parseDouble(periodo);

    }

    @Then("ejecuto la calculadora")
    public void ejecutoLaCalculadora() {
        interesSimple.calcular();
    }

    @And("valido mensaje de error {string}")
    public void validoMensajeDeError(String msg) {
        interesSimple.validarMensajeError(msg);
    }

    @And("valido el resultado correcto")
    public void validoElResultadoCorrecto() {
        interesSimple.validarResultado();

    }
}

package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.InteresSimplePage;

public class HistoriaInteresSimple {
    InteresSimplePage interesSimple;

    public HistoriaInteresSimple() {
       interesSimple = new InteresSimplePage(Hooks.driver);
      }

    @Given("calcular los interes de un préstamo de {string} soles")
    public void CalcularLosInteresDeUnPréstamoDe(String monto) {
        interesSimple.ingresarmonto(monto);
        System.out.println("Se ingresó un monto: "+monto+" soles");

        InteresSimplePage.monto = Double.parseDouble(monto);
    }

    @When("con el interes del {string} porciento durante {string} meses")
    public void conElInteresDelPorcientoDuranteMeses(String interes, String tiempo) {

        interesSimple.ingresarinteres(interes);
        System.out.println("Se ingresó el interés: "+interes+" porciento");
        interesSimple.ingresartiempo(tiempo);
        System.out.println("Se ingresó: "+tiempo+" meses");

        InteresSimplePage.interes = Double.parseDouble(interes);
        InteresSimplePage.tiempo = Double.parseDouble(tiempo);
    }

    @Then("ejecuto la calculadora")
    public void ejecutoLaCalculadora() {
        interesSimple.calcularinteres();
        System.out.println("Se ejecutó el calculo: ");
    }

    @And("valido el resultado correcto")
    public void validoElResultadoCorrecto() {
        System.out.println("Se validó el calculo:");
        interesSimple.validarResultado();



    }
}

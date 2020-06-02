Feature: Calcular Interes Simple

  Scenario: verificar calculo interes simple
    Given ingreso a la opcion Interes "Simple" en el menu
    When ingreso un valor "100" con el interes del "10" porciento durante "10" meses
    Then ejecuto la calculadora
    And valido el resultado correcto


  Scenario: verificar calculo interes simple con campos vacíos
    Given ingreso a la opcion Interes "Simple" en el menu
    Then ejecuto la calculadora
    And valido mensaje de error "Revise el formulario, rellene todos los campos"
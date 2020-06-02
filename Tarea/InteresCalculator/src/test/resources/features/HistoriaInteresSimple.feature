Feature: Calcular Interes

  Scenario: verificar calculo interes simple
    Given calcular los interes de un préstamo de "10000" soles
    When con el interes del "10" porciento durante "10" meses
    Then ejecuto la calculadora
    And valido el resultado correcto

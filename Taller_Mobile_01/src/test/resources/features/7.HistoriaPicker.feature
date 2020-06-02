Feature: Wheel Picker
  Background:
    Given Realizar login

  Scenario: Seleccionar colores
    Given Ingresar a la opción Wheel picker
    When seleccionar un color "azul"
    Then validar cambio de color "azul"

  @regresion
  Scenario Outline: seleccionar varios colores
      Given Ingresar a la opción Wheel picker
      When seleccionar un color "<color>"
      Then validar cambio de color "<color>"

    Examples: colores
    |color|
    |rojo |
    |azul |
    |verde|
    |negro|


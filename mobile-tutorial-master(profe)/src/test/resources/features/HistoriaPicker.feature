@regresion
Feature: Wheel Pïcker

  Background:
    Given realizar login

  Scenario: Seleccionar colores
    Given ingresar a la opción wheel picker
    When seleccionar un color "rojo"
    Then validar cambio de color "rojo"

  @colores
  Scenario Outline: Seleccionar varios colores
    Given ingresar a la opción wheel picker
    When seleccionar un color "<color>"
    Then validar cambio de color "<color>"

    Examples: colores
      | color  |
      | rojo  |
      | azul  |
      | verde |
      | negro |
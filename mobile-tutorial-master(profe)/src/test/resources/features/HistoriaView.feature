@regresion
Feature: Historia Native View

  Background:
    Given realizar login

  Scenario: Obtener texto de la primera opción
    When ingresar a native view
    Then mostrar el texto "uno"
  @test12
  Scenario: Obtener texto de la segunda opción
    When ingresar a native view
    Then mostrar el texto "DOS"

  Scenario: Obtener texto de la tercera opción
    When ingresar a native view
    Then mostrar el texto "Tres"
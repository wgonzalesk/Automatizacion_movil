Feature: Historia Native View
  Background:
  Given Realizar login

  Scenario:Obtener texto de la primera opción
    When ingresar a native view
    Then mostrar el texto "uno"

  Scenario:Obtener texto de la segunda opción
    When ingresar a native view
    Then mostrar el texto "dos"

  Scenario:Obtener texto de la tercera opción
    When ingresar a native view
    Then mostrar el texto "tres"
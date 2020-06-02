Feature: Longpress
  Background:
    Given Realizar login

  @regresion
  Scenario: Validar mensaje de longpress
    Given ingresar a la opción Longpress
    When realizar longpress al boton
    Then  validar mensaje de longpress "you pressed me hard :P"


Feature: Longpress

  Background:
    Given realizar login

  Scenario: Validar mensaje de longpress
    Given ingresar a la opción longpress
    When realizar longpress al boton
    Then validar mensaje de longpress "you pressed me hard :P"
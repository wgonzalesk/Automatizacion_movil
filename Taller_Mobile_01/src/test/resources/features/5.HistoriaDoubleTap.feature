Feature: Acción doble click

  Background:
    Given Realizar login

  Scenario: Realizar doble click
    Given entrar a la opción doble tap
    When  realizar doble tap
    Then validar mensaje "Double tap successful!"
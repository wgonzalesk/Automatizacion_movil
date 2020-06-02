Feature: Vertical Swipe
  Background:
    Given Realizar login

  Scenario: Encontrar una opción
    Given ingresar a la opción swipe
    Then encontrar la opción "Karma"
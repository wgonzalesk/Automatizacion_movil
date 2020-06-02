Feature: Funcionalidad de mover objetos

  Background:
    Given realizar login

  Scenario: Mover un objeto
    Given ingresar a la opción drag and drop
    When mover el objeto
    Then validar mensaje correcto
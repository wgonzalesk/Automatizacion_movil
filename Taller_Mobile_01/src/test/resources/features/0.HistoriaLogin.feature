Feature: Creación de Login
  Como usuario
  necesito loguearme a la aplicación
  para poder trabajar con ella

  Scenario: Verificar login exitoso
    Given que el usuario ingresa con su cuenta "admin"
    And ingresa su password "admin"
    When ingresa a su cuenta
    Then logeo correcto

  Scenario: Verificar login con datos incorrectos
    Given que el usuario ingresa con su cuenta "Wilmer"
    And ingresa su password "Wilmer"
    When ingresa a su cuenta
    Then no debe permitir el login
Feature: Creación de login
  Como usuario
  necesito loguearme a la aplicacion
  para poder trabajar con ella

  Scenario: Verificar login exitoso
    Given que el usuario ingresa con su cuenta "admin"
    And que el usuario ingrese su password "admin"
    When ingresar a su cuenta
    Then login correcto

  Scenario: Verificar login con datos incorrectos
    Given que el usuario ingresa con su cuenta "alex"
    And que el usuario ingrese su password "1234"
    When ingresar a su cuenta
    Then no debe permitir el login
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/6.HistoriaLongPress.feature");
formatter.feature({
  "name": "Longpress",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Realizar login",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLoginDefinition.realizarLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar mensaje de longpress",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "ingresar a la opción Longpress",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLongPressDefinition.ingresarALaOpciónLongpress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizar longpress al boton",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.HistoriaLongPressDefinition.realizarlongpressalboton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar mensaje de longpress \"you pressed me hard :P\"",
  "keyword": "Then "
});
formatter.match({
  "location": "definitions.HistoriaLongPressDefinition.validarMensajeDeLongPress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/7.HistoriaPicker.feature");
formatter.feature({
  "name": "Wheel Picker",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "seleccionar varios colores",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la opción Wheel picker",
  "keyword": "Given "
});
formatter.step({
  "name": "seleccionar un color \"\u003ccolor\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "validar cambio de color \"\u003ccolor\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "colores",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "color"
      ]
    },
    {
      "cells": [
        "rojo"
      ]
    },
    {
      "cells": [
        "azul"
      ]
    },
    {
      "cells": [
        "verde"
      ]
    },
    {
      "cells": [
        "negro"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Realizar login",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLoginDefinition.realizarLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "seleccionar varios colores",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la opción Wheel picker",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.ingresarALaOpciónWheelPicker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar un color \"rojo\"",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.seleccionarUnColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar cambio de color \"rojo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.validarCambioDeColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Realizar login",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLoginDefinition.realizarLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "seleccionar varios colores",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la opción Wheel picker",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.ingresarALaOpciónWheelPicker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar un color \"azul\"",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.seleccionarUnColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar cambio de color \"azul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.validarCambioDeColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Realizar login",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLoginDefinition.realizarLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "seleccionar varios colores",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la opción Wheel picker",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.ingresarALaOpciónWheelPicker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar un color \"verde\"",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.seleccionarUnColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar cambio de color \"verde\"",
  "keyword": "Then "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.validarCambioDeColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Realizar login",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaLoginDefinition.realizarLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "seleccionar varios colores",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regresion"
    }
  ]
});
formatter.step({
  "name": "Ingresar a la opción Wheel picker",
  "keyword": "Given "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.ingresarALaOpciónWheelPicker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar un color \"negro\"",
  "keyword": "When "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.seleccionarUnColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validar cambio de color \"negro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "definitions.HistoriaPickerDefinition.validarCambioDeColor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
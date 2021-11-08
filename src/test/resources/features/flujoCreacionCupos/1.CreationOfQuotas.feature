#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Creacion Cupos

  @CreacionCupos
  Scenario Outline: Creacion Cupos
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Manejo de cupos - Creacion de cupos
    And Ingresamos el numero de documento <numbDoc> ,la fecha del alta <dateOn> , fecha de vencimiento <dateOff>
    And Ingresamos el valor limite <limit> , y valor prueba <prueba>

    Examples: 
      | userName | password | numbDoc | dateOn     | dateOff    | limit        | prueba  |
      | riesgos2 | riesgos1 | 3401002 | 14/10/2021 | 14/10/2022 | 3,000,000.00 | 3000000 |

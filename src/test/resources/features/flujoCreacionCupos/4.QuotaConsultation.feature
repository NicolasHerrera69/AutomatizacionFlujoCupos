#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Consulta Cupos

  @ConsultaCupos
  Scenario Outline: Consulta Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de consulta de cupos
    And Ingresamos el numero de identificacion  <id>

    Examples: 
      | userName | password | id         |
      | riesgos2 | riesgos1 | 1000587965 |

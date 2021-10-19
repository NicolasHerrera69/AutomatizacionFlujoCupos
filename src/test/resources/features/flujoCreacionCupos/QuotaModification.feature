#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Creacion Cupos

  @ModificacionCupos
  Scenario Outline: Modificacion Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Manejo de cupos - Modificacion de cupos
    And Ingresamos el numero de documento <numb>

    Examples: 
      | userName | password | numb     |
      | riesgos2 | riesgos1 | 51802316 |

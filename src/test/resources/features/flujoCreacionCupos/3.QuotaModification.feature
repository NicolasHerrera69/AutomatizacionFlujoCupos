#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Creacion Cupos

  @ModificacionCupos
  Scenario Outline: Modificacion Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Manejo de cupos - Modificacion de cupos
    And Ingresamos numero de documento <id> ingresamos el nuevo limite total <date>

    Examples: 
      | userName | password | id         | date       |
      | riesgos2 | riesgos1 | 1000587965 | 12/10/2022 |

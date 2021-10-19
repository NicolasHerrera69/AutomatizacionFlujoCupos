#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Eliminar Cliente Cupos Web

  @EliminarCliente
  Scenario Outline: Eliminar Clientes
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Al llegar a el flujo de Operativa-Clientes
    When Ingrese el numero de identificacion a consultar <FilterIds> y de click en el boton de Eliminar

    Examples: 
      | userName | password | FilterIds |
      | riesgos3 | riesgos1 |  51802316 |

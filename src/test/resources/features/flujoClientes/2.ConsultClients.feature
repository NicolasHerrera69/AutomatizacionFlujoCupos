#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Consulta clientes cupos web

  @ConsultarClientes
  Scenario Outline: Creacion Clientes Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Al llegar a el flujo de Operativa-Clientes
    When Ingrese el numero de identificacion a consultar <FilterDoc> ,de click en el boton de Consultar y en el de cerrar

    Examples: 
      | userName | password | FilterDoc |
      | riesgos3 | riesgos1 |   2021002 |

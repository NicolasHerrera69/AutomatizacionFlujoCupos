#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Editar clientes cupos web

  @EditarClientes
  Scenario Outline: Creacion Clientes Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Al llegar a el flujo de Operativa-Clientes
    When Ingrese el numero de identificacion a editar <FilterDoc> ,click en el boton editar, agregamos el nuevo nombre <NewName>, el nuevo rating <rating> y ventas <ventas>

    Examples: 
      | userName | password | FilterDoc  | NewName                 | rating | ventas      |
      | riesgos3 | riesgos1 | 1000587965 | Empresas Publica cucuta |   1.00 | 500.000.000 |

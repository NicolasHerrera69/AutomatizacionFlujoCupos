#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: CreacionClientesCuposWeb

  @CreacionClientes
  Scenario Outline: Creacion Clientes Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Al llegar al fomulario de creacion de cliente y dar click en crear
    When Seleccione tipo de documento <documents> ,diligenciar el numero de documento <documentNum> <digit> , y nombre <name> , y fecha <date>
    And Seleccione el grupo <groups> ,la banca local <banks> , el Subsegmento <SubSeg> , y el gestor<Gestor>
    And Ingresar cifra del rating <rating> , el valor activo <activo> , y el valor de ventas <ventas>
    And Se selecciona el rol jerarquico <roles> , Se agrega el porcentaje de participacion <porcentaje> y numero de empleados <numeroE>

    Examples: 
      | userName | password | documents         | documentNum | digit | name          | date       | groups     | banks          | SubSeg                    | Gestor              | rating | activo           | ventas      | roles     | porcentaje | numeroE |
      | riesgos3 | riesgos1 | CEDULA CIUDADANIA |   518023133 |     0 | Julian Suarez | 04/10/2021 | QA PRUEBAS | Banca Personal | 3 - Servicios financieros | Juan Carlos Moscote |   7.00 | 1,000,000,000.00 | 500,000,000 | No aplica |          0 |       1 |

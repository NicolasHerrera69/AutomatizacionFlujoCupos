#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Autorizacion Cupos

  @AutorizacionCupos
  Scenario Outline: Autorizacion Cupos
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Manejo de cupos - Creacion de cupos
    And Ingresamos el numero de documento <numbDoc> ,la fecha del alta <dateOn> , fecha de vencimiento <dateOff> ,limite total <limit> , seleccionamos el tipo de moneda <coinList>

    Examples: 
      | userName | password | numbDoc | dateOn     | dateOff    | limit        | coinList |
      | riesgos2 | riesgos1 | 1000898 | 14/10/2021 | 14/10/2022 | 300000000000 | COP      |


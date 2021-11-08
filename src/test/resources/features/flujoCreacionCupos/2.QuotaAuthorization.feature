#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Autorizacion Cupos

  @AutorizacionCupos
  Scenario Outline: Autorizacion Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Autoriza cupos
    And Ingresamos el documento con el cupo a autorizar <doc> , fecha de vencimiento <dateOff> , y valor total <limit>

    Examples: 
      | userName | password | doc     | dateOff    | limit       |
      | riesgos2 | riesgos1 | 1100587 | 21/10/2022 | 300,000,000 |

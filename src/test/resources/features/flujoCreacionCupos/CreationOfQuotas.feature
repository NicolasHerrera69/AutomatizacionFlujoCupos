#Proyecto Automatizacion Flujo Cupos Web
#Nicolas Robayo Herrera
Feature: Creacion Cupos

  @CreacionCupos
  Scenario Outline: Creacion Cupos Web
    Given Abrir el navegador
    And Diligenciar usuario <userName> y contraseña <password>
    And Ingresar al flujo de Manejo de cupos - Creacion de cupos
    
    
		    Examples: 
		
      | userName | password |
      | riesgos2 | riesgos1 | 

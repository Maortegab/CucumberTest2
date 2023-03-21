#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: HU 05 regla de validación No 1
  Se requiere validar los datos básicos de la reserva y los formatos correctos de esos datos

	Scenario: ingresar a payment
    Given ingreso a payment collector  
    
    
  Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es <textoError>
    
    #Examples: 
      #| reserva  			 | textoError        |
      #| res_HU_5_01 	 | "asdasd" 		     |
      #| res_HU_5_02 	 | "asdasdd"    		 |

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

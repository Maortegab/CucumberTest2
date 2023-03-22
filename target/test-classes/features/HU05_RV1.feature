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

	Background:
    Given ingreso a payment collector web
    
    
  Scenario: Ingresar la reserva sin correo valido y dar click en el botón gestion para validar el resultado
    Given Se ingresa la reserva sin correo valido
    When Se da click en botón gestión
    Then Validar que el texto de salida es igual al esperado
    
    
  Scenario: Ingresar la reserva sin telefono valido y dar click en el botón gestion para validar el resultado
    Given Se ingresa la reserva sin telefono valido
    When Se da click en botón gestión dos
    Then Validar que el texto de salida es igual al esperado dos
    
    
  #Scenario: Ingresar la reserva  y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
  #Scenario: Ingresar la reserva y dar click en el botón gestion para validar el resultado
    #Given Se ingresa la reserva 
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es igual al esperado
    #And Regresar a Home
    #
    
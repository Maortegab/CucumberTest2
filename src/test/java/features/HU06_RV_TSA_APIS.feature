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
@HU06_Test
Feature: HU 06 regla de validación No 6
  Se requiere validar los datos de TSA/APIS para la regla de validación 

	Background:
    Given ingreso a payment collector web HU6
    
  Scenario: Ingresar la reserva para error ingrese APIS TSA en la reserva
    Given Se ingresa la reserva a "<Reserva>" 
    When Se da click en botón gestión a
    #Then Validar que el texto de salida es "Por favor ingrese el APIS/TSA en la reserva"
    
    | Reserva | 
    | 0				|
    | 1				|	
    | 2				|	
    
  #Scenario: Ingresar la reserva para error asociacion de segmentos APIS TSA
    #Given Se ingresa la reserva b
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es "Por favor verifica la asociación de segmentos del APIS/TSA"
    #
  #Scenario: Ingresar la reserva para error ingrese RIZ
    #Given Se ingresa la reserva c
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es "No has ingresado el RIZ para esta reserva"
    #
  #Scenario: Ingresar la reserva para error ingrese FS
    #Given Se ingresa la reserva d
    #When Se da click en botón gestión
    #Then Validar que el texto de salida es "No has ingresado el FS"
    #
  #Scenario: Ingresar la reserva y pase exitosamente
    #Given Se ingresa la reserva e
    #When Se da click en botón gestión
    #Then Validar que el texto en pantalla es
package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BasePage;
import pom.PageObject_Login;
import pom.Page_Home;

public class HU05_RV1_Steps {
//	WebDriver driver;
	PageObject_Login login = new PageObject_Login(null);
	BasePage base = new BasePage(null);
	Page_Home home = new Page_Home(null); 
	
	
		
	@Given("ingreso a payment collector web")
	public void ingreso_a_payment_collector_web() throws IOException, InterruptedException {
		home.newWindowHome();		
	}
	

//	------------HU 5 - 1
	@Given("Se ingresa la reserva sin correo valido")
	public void se_ingresa_la_reserva_sin_correo_valido() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_01"));
	}
	@When("Se da click en botón gestión")
	public void se_da_click_en_botón_gestión() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado() throws InterruptedException{
//		System.out.println(home.traerTextoPopUp());
//		System.out.println(home.getProp_HU05().getProperty("texto_HU_5_01"));
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_01")),"El mensaje no coincide");
		home.clickEntendidoPopUp();		
		home.cerrarNavegador();
	}	
	
//	----------- HU 5 - 2
	@Given("Se ingresa la reserva sin telefono valido")
	public void se_ingresa_la_reserva_sin_telefono_valido() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_02"));
	}
	@When("Se da click en botón gestión dos")
	public void se_da_click_en_botón_gestión_dos() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado dos")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_dos() throws InterruptedException{
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_02")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 3
	@Given("Se ingresa la reserva con telefono valido")
	public void se_ingresa_la_reserva_con_telefono_valido() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_03"));
	}
	@When("Se da click en botón gestión tres")
	public void se_da_click_en_botón_gestión_tres() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado tres")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_tres() throws InterruptedException{
		assertTrue(home.traerTextoGestionPagos().contains(home.getProp_HU05().getProperty("texto_HU_5_03")),"El mensaje no coincide");		
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 4
	@Given("Se ingresa la reserva con telefono sin codigo area")
	public void se_ingresa_la_reserva_con_telefono_sin_codigo_area() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_04"));
	}
	@When("Se da click en botón gestión cuatro")
	public void se_da_click_en_botón_gestión_cuatro() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado cuatro")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_cuatro() throws InterruptedException{
		assertTrue(home.traerTextoGestionPagos().contains(home.getProp_HU05().getProperty("texto_HU_5_04")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 5
	@Given("Se ingresa la reserva sin contacto de emergencia")
	public void se_ingresa_la_reserva_sin_contacto_de_emergencia() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_05"));
	}
	@When("Se da click en botón gestión cinco")
	public void se_da_click_en_botón_gestión_cinco() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado cinco")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_cinco() throws InterruptedException{
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_05")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 6
	@Given("Se ingresa la reserva con nombre invalido")
	public void se_ingresa_la_reserva_con_nombre_invalido() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_06"));
	}
	@When("Se da click en botón gestión seis")
	public void se_da_click_en_botón_gestión_seis() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado seis")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_seis() throws InterruptedException{
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_06")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 7
	@Given("Se ingresa la reserva sin determinante")
	public void se_ingresa_la_reserva_sin_determinante() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_07"));
	}
	@When("Se da click en botón gestión siete")
	public void se_da_click_en_botón_gestión_siete() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado siete")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_siete() throws InterruptedException{
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_07")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
		home.cerrarNavegador();
	}
	
//	----------- HU 5 - 8
	@Given("Se ingresa la reserva completa")
	public void se_ingresa_la_reserva_completa() throws InterruptedException, IOException {
		home.ingresarReserva(home.getProp_HU05().getProperty("res_HU_5_08"));
	}
	@When("Se da click en botón gestión ocho")
	public void se_da_click_en_botón_gestión_ocho() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado ocho")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado_ocho() throws InterruptedException{
		assertTrue(home.traerTextoGestionPagos().contains(home.getProp_HU05().getProperty("texto_HU_5_08")),"El mensaje no coincide");		
		home.cerrarNavegador();
	}

}

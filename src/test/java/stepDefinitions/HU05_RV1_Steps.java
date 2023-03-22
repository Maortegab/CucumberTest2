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
		System.out.println(home.traerTextoPopUp());
		System.out.println(home.getProp_HU05().getProperty("texto_HU_5_01"));
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_01")),"El mensaje no coincide");
		home.clickEntendidoPopUp();
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
		System.out.println(home.traerTextoPopUp());
		System.out.println(home.getProp_HU05().getProperty("texto_HU_5_02"));
		assertTrue(home.traerTextoPopUp().contains(home.getProp_HU05().getProperty("texto_HU_5_02")),"El mensaje no coincide");		
	}

}

package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
	
	@Given("Se ingresa la reserva")
	public void se_ingresa_la_reserva() throws InterruptedException, IOException {
		home.ingresarReserva();
	}
	@When("Se da click en botón gestión")
	public void se_da_click_en_botón_gestión() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	@Then("Validar que el texto de salida es igual al esperado")
	public void validar_que_el_texto_de_salida_es_igual_al_esperado() throws InterruptedException{	   
	   assertTrue(home.traerTextoPopUp().equals("Reserva no contiene un correo electrónico en formato válido PRUEBAS@GMAIL.COM-B"));
	   home.clickEntendidoPopUp();
	}
}

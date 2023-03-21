package stepDefinitions;

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
	WebDriver driver;
	PageObject_Login login = new PageObject_Login(null);
	BasePage base = new BasePage(null);
	Page_Home home = new Page_Home(null); 
	
	
	@Given("ingreso a payment collector")
	public void ingreso_a_payment_collector() throws IOException, InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
	    login.autenticacion();
	}
	
	@Given("Se ingresa la reserva")
	public void se_ingresa_la_reserva() throws InterruptedException {
		home.ingresarReserva();
	}
	@When("Se da click en botón gestión")
	public void se_da_click_en_botón_gestión() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validar que el texto de salida es {string}")
	public void validar_que_el_texto_de_salida_es(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}

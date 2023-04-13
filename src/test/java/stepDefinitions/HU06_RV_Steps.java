package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Page_Home;
import utilidadesExcel.ReadExcelFile;

public class HU06_RV_Steps {
	
	ReadExcelFile  leer = new ReadExcelFile();
	Page_Home home = new Page_Home(null);
	
	@Given("ingreso a payment collector web HU6")
	public void ingreso_a_payment_collector_web_hu6() throws InterruptedException, IOException {
		home.newWindowHome();
	}
	
//	---HU06_01
	@Given("Se ingresa la reserva a {string}")
	public void se_ingresa_la_reserva_a(String reserva) throws IOException, InterruptedException {
		reserva = leer.getCellValue(home.getProperties().getProperty("filePathExcel"), home.getProp_HU06().getProperty("nameSheet"), 1, 0);		
		home.ingresarReserva(reserva);	    
	}
	
	@When("Se da click en botón gestión a")
	public void se_da_click_en_botón_gestión_a() throws InterruptedException, IOException {
	    home.clickGestion();
	}
	    
	@Then("Validar que el texto de salida es {string}")
	public void validar_que_el_texto_de_salida_es(String texto) {
	    assertTrue(false);
	}
	
//	---HU06_02
//	---HU06_03
//	---HU06_04
}

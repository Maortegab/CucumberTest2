package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BasePage;
import pom.PageObject_Login;
import pom.Page_Home;

public class HU01_PantallaLogueoSteps {
//	WebDriver driver;
	PageObject_Login login = new PageObject_Login(null);
	BasePage base = new BasePage(null);
	
	
	
	@Given("La conexión con B2B")
	public void la_conexión_con_b2b() throws InterruptedException, IOException {	
		base.chromeDriverConnection();
		
		
		login.loginMicrosoft();		
	}

	@When("ingresar usuario")
	public void ingresar_usuario() throws InterruptedException {
		login.ingresarUsuarioOkta();
	}

	@When("ingresar contraseña")
	public void ingresar_contraseña() throws InterruptedException {
	    login.ingresarContraseñaOkta();
	}

	@When("dar click en boton conectar")
	public void dar_click_en_boton_conectar() throws InterruptedException {
	    login.clickConectarOcta();
	}

	@Then("validar conexión exitosa")
	public void validar_conexión_exitosa() throws InterruptedException {
	    login.sendPushOkta();
		login.verificarLogoAvianca();
		login.escribirAmadeus();
		login.cerrarNavegador();
		
	}
	//ScenarioAlmErroresConexB2B
	@Given("La conexión Erronea con B2B")
	public void la_conexión_erronea_con_b2b() {		
	    System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}

	@When("se tiene un error de conexión con B2B")
	public void se_tiene_un_error_de_conexión_con_b2b() {
		System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}

	@Then("validar que se almacena el error")
	public void validar_que_se_almacena_el_error() {
		System.out.println("De acuerdo a comentarios de Oscar esta prueba no se puede verificar porque requiere modificar los datos que estan en el código fuente de front y hacen parte del b2b.");
	}
//	# PBI_383190 Validación Informacion Basica del Asesor
//	#ScenarioValidarInfoAsesor
	
	@Given("La conexión exitosa con payment collector")
	public void la_conexión_exitosa_con_payment_collector() throws InterruptedException, IOException {
	    login.autenticacion();
	    login.verificarLogoAvianca();
	}

	@When("aparece la información del asesor")
	public void aparece_la_información_del_asesor() throws InterruptedException {
	    login.validarCampoVisibleNombreAsesor();
	}

	@Then("Validar que la información es correcta")
	public void validar_que_la_información_es_correcta() throws InterruptedException {
	    login.validarNombreAsesor();
//	    driver.close();
	}
	
//	# PBI_383190 Validación Tiempo Activo de Sesión
//	#ScenarioValidarTiempoActivo
	@Given("inicio de sesión exitoso")
	public void inicio_de_sesión_exitoso() throws InterruptedException {
//		login.autenticacion();
//	    login.verificarLogoAvianca();
		throw new io.cucumber.java.PendingException();
	}

	@When("pasados {int} minutos")
	public void pasados_minutos(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validar que la sesión deja de estar activa")
	public void validar_que_la_sesión_deja_de_estar_activa() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
//	# PBI_383190 Validación Usuario Payment Collector
//	#ScenarioValidarUsuarioPaymentC
	@Given("La pantalla de inicio de sesión usuario")
	public void la_pantalla_de_inicio_de_sesión_usuario() throws InterruptedException, IOException {
	    login.loginMicrosoft();
	}

	@When("solicita el usuario")
	public void solicita_el_usuario() throws InterruptedException {
	    login.UsuarioOktaVisible();	    
	}

	@Then("Validar que se ingresa correctamente")
	public void validar_que_se_ingresa_correctamente() throws InterruptedException {
	    login.ingresarUsuarioOkta();
		login.ingresarContraseñaOkta();
	    login.clickConectarOcta();
	    login.sendPushOkta();
	    login.verificarLogoAvianca();
	    login.cerrarNavegador();
	    
	    
	}
//	#ScenarioValidarContraseñaPaymentC
	@Given("La pantalla de inicio de sesión contraseña")
	public void la_pantalla_de_inicio_de_sesión_contraseña() throws InterruptedException, IOException {
		login.loginMicrosoft();
		login.ingresarUsuarioOkta();
	}

	@When("solicita la contraseña")
	public void solicita_la_contraseña() throws InterruptedException {
	    login.ContraseñaOktaVisible();
	    login.ingresarContraseñaOkta();
	}

	@Then("Validar que se realiza el ingreso correctamente")
	public void validar_que_se_realiza_el_ingreso_correctamente() throws InterruptedException {
	    login.clickConectarOcta();	    
	    login.sendPushOkta();
	    login.verificarLogoAvianca();
	    login.cerrarNavegador();
	    
	}

//	#ScenarioValidarEstadoBloqueadoPaymentC
	@Given("el usuario estado bloqueado")
	public void el_usuario_estado_bloqueado() {
	    System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}

	@When("muestra el mensaje de estado")
	public void muestra_el_mensaje_de_estado() {
		System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}

	@Then("Validar que aparece mensaje para solicitud de desbloqueo")
	public void validar_que_aparece_mensaje_para_solicitud_de_desbloqueo() {
		System.out.println("De acuerdo a comentarios de Romero Tapia, Isias Jair (i.romerotapia@dxc.com) , en un reunión tomaron la decision de no realizar el mensaje  ya que el Equipo no controla eso. ");
	}

}

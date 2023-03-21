package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import conection.Conection_db;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BasePage;
import pom.PageObject_Login;

public class HU02_logIngresoEgresoDiarios_Steps {

	
	PageObject_Login login = new PageObject_Login(null);
	BasePage base = new BasePage(null);
	Conection_db conection = new Conection_db();

	@Given("ingreso a plataforma")
	public void ingreso_a_plataforma() throws InterruptedException, IOException {
	    login.autenticacion();
	}
	
	@When("login realizado correctamente")
	public void login_realizado_correctamente() throws InterruptedException {
		login.verificarLogoAvianca();
	    login.escribirAmadeus();
	}
	
	@Then("se almacena log")
	public void se_almacena_log() throws SQLServerException, SQLException {
		conection.conexion();		
		assertTrue(conection.usuarioBD.equals("m.ortegabuitrago@dxc.com"));
	}
	
	@Then("contiene la fecha de logueo_Formato DD\\/MM\\/AA")
	public void contiene_la_fecha_de_logueo_formato_dd_mm_aa() {
		assertTrue(conection.fechaLog.equals("2023-03-02"));
	}
	
	@Then("contiene la Hora de Logueo_Formato HH:MM:SS")
	public void contiene_la_hora_de_logueo_formato_hh_mm_ss() {
		assertTrue(conection.horaLog.contains(":"));
	}
	
	@Then("contiene la Fecha de Deslogueo_Formato DD\\/MM\\/AA")
	public void contiene_la_fecha_de_deslogueo_formato_dd_mm_aa() {
		assertTrue(conection.fechaDeslog.contains("2023"));
	}
	
	@Then("contiene la Hora de Deslogueo_Formato HH:MM:SS")
	public void contiene_la_hora_de_deslogueo_formato_hh_mm_ss() {
	    assertTrue(conection.horaDeslog.contains(":"));
	}
	
	@Then("contiene el Usuario")
	public void contiene_el_usuario() {
		assertTrue(conection.usuarioBD.equals("m.ortegabuitrago@dxc.com"));
	}
	
	@Then("contiene la IP del Usuario")
	public void contiene_la_ip_del_usuario() {
		assertTrue(conection.ipUsuario.equals("172.31.200.15"));
	}
	
	@Then("contiene el Navegador Utilizado")
	public void contiene_el_navegador_utilizado() {
		assertTrue(conection.navegadorBD.contains("Chrome"));
	}
	
	@Then("contiene el Calculo de Minutos entre Fecha\\/Hora")
	public void contiene_el_calculo_de_minutos_entre_fecha_hora() {
		assertTrue(conection.tiempoSesion!="");
	}

}

package pom;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Home extends PageObject_Login{

	
public Page_Home(WebDriver driver) {
		super(driver);
	}

//	Campos de Page Home	
	private By campoCodigoRes = By.xpath("(//input[@id='inputReserve'])[1]");
	private By botonGestion = By.xpath("(//img[@class='img-search'])[1]");
	private By textoAmadeus = By.xpath("(//input[@type='text'])[1]");
	private By guardarAmadeus = By.xpath("(//button[normalize-space()='Guardar'])[1]");
	private By popUpTextContent = By.xpath("(//p[@class='text-content'])[1]");
	private By popUpTitle = By.xpath("(//p[@class='text-warning'])[1]");
	private By button_Entendido = By.xpath("(//button[@aria-label='Entendido'])[1]");
	private By buttonHome = By.xpath("(//img[@class='Icon-home'])[1]");
	private By textoFormularioGestionPagos = By.xpath("(//p[@class='pnr-welcome-up'])[1]");
			
//	Métodos
	public void newWindowHome() throws InterruptedException, IOException {
		traerPropiedades();
		newWindow();
		autenticacion();
	}
	
	public void ingresarFirmaAmadeus() throws InterruptedException, IOException {
		writeOn(textoAmadeus, "565");
		clickOn(guardarAmadeus);		
	}

	public void ingresarReserva(String reserva) throws InterruptedException, IOException {		
		tiempoEspera(5, campoCodigoRes);
		writeOn(campoCodigoRes, reserva);				
	}
	
	public void clickGestion() throws InterruptedException, IOException {
		tiempoEspera(2, campoCodigoRes);
		clickOn(botonGestion);
	}
	
	public String traerTextoPopUp() throws InterruptedException {
		tiempoEspera(15, popUpTextContent);
		String texto = readOn(popUpTextContent);
		return texto;
	}
	
	public String traerTextoGestionPagos() throws InterruptedException {
		tiempoEspera(10, textoFormularioGestionPagos);
		String texto = readOn(textoFormularioGestionPagos);
		return texto;
	}
	
	public void clickEntendidoPopUp() throws InterruptedException {
		tiempoEspera(1, button_Entendido);		
		clickOn(button_Entendido);
	}
	public void borrarTxt() throws InterruptedException {
		tiempoEspera(1, campoCodigoRes);
		clearText(campoCodigoRes);		
	}
	
	public void clickHome() throws InterruptedException {
		tiempoEspera(1, buttonHome);
		clickOn(buttonHome);		
	}
		
}

package pom;

import java.io.IOException;

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
	
//	Métodos
	public void newWindowHome() throws InterruptedException, IOException {
//		System.out.println("reserva: " + properties.getProperty("res_HU_5_01"));
		newWindow();
		autenticacion();
	}
	
	public void ingresarFirmaAmadeus() throws InterruptedException, IOException {
		writeOn(textoAmadeus, "565");
		clickOn(guardarAmadeus);		
	}

	public void ingresarReserva() throws InterruptedException, IOException {		
		tiempoEspera(1, campoCodigoRes);
//		writeOn(campoCodigoRes, properties.getProperty("res_HU_5_01"));
		writeOn(campoCodigoRes, "3EEFOW");			
	}
	
	public void clickGestion() throws InterruptedException, IOException {	
		clickOn(botonGestion);
	}
	
	public String traerTextoPopUp() throws InterruptedException {
		tiempoEspera(10, popUpTextContent);
		String texto = readOn(popUpTextContent);
		return texto;
	}
	
	public void clickEntendidoPopUp() throws InterruptedException {
		tiempoEspera(1, button_Entendido);
		clickOn(button_Entendido);
		
	}
}

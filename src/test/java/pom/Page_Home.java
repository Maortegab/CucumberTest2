package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Home extends PageObject_Login{

	
public Page_Home(WebDriver driver) {
		super(driver);
	}

//	Campos de Page Home	
	private By campoCodigoRes = By.xpath("(//input[@id='inputReserve'])[1]");
	private By botonGestion = By.xpath("(//img[@class='img-search'])[1]");
	
//	Métodos
	public void ingresarReserva() throws InterruptedException {
//		System.out.println("reserva: " + properties.getProperty("res_HU_5_01"));
		tiempoEspera(3, campoCodigoRes);
		writeOn(campoCodigoRes,"3EEFOW");
		clickOn(botonGestion);
		
	}
	
	public void validarPopUp() throws InterruptedException {
		tiempoEspera(3, campoCodigoRes);
	}
}

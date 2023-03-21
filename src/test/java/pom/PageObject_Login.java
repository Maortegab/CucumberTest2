package pom;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageObject_Login extends BasePage {

	
	
	public PageObject_Login (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	// Campos avianca
	private By botonIniciarSesion = By.xpath("//a[normalize-space()='Iniciar sesión']");
	private By inputAmadeus = By.xpath("(//input[@type='text'])[1]");
	private By nombreAsesor = By.xpath("(//p[@class='imglogin session-name'])[1]");

	// Campos Office 365
	private By inputCorreoMcsft = By.id("i0116");
	private By btnSiguienteUsuario = By.xpath("(//input[@id='idSIButton9'])[1]");	
//	private String correo = properties.getProperty("userNameDxc");
	

	// camposOcta
	public By inputCorreoOkta = By.xpath("//input[@id='okta-signin-username']");
	public By inputPasswordoOkta = By.xpath("//input[@id='okta-signin-password']");
	private By btnSingInOcta = By.xpath("(//input[@id='okta-signin-submit'])[1]");
	public By btnsendPush = By.xpath("//*[@id='form75']/div[2]/input");
	public By btnBackToSingInOcta = By.xpath("//a[normalize-space()='Back to sign in']");
	private By logoAvianca = By.xpath("(//p[@class='imglogin session-name'])[1]");
//	private String password = properties.getProperty("passwordDxc");
	
	
//	BasePage base = new BasePage();
	
	public void autenticacion() throws InterruptedException, IOException {
		
//		nuevaVentanaChrome();
		traerPropiedades();
		chromeDriverConnection();
//		driver.navigate().to(properties.getProperty("linkURL"));		
		
		// Selecccionar link del login en pagina de login
		tiempoEspera(2, botonIniciarSesion);
		clickOn(botonIniciarSesion);

		// Ingresar user en la pagina de microsoft
		tiempoEspera(5, inputCorreoMcsft);
//		correo = properties.getProperty("userNameDxc");
//		writeOn(inputCorreoMcsft, correo);
		writeOn(inputCorreoMcsft, properties.getProperty("userNameDxc"));
		
		clickOn(btnSiguienteUsuario);

		// Ingresar user en okta
		tiempoEspera(5, inputCorreoOkta);
		writeOn(inputCorreoOkta, properties.getProperty("userNameDxc"));
		writeOn(inputPasswordoOkta, properties.getProperty("passwordDxc"));
		clickOn(btnSingInOcta);
		
		tiempoEspera(5, btnsendPush);
		clickOn(btnsendPush);
		tiempoEspera(15, logoAvianca);

	}

	public void loginMicrosoft() throws InterruptedException, IOException {
//		nuevaVentanaChrome();
		traerPropiedades();
		chromeDriverConnection();
//		driver.navigate().to(properties.getProperty("linkURL"));
		// Selecccionar link del login en pagina de login
		clickOn(botonIniciarSesion);

		// Ingresar user en la pagina de microsoft		
		tiempoEspera(5, inputCorreoMcsft);
		writeOn(inputCorreoMcsft, properties.getProperty("userNameDxc"));
		clickOn(btnSiguienteUsuario);
	}

	public void ingresarUsuarioOkta() throws InterruptedException {

		tiempoEspera(3, inputCorreoOkta);
		writeOn(inputCorreoOkta, properties.getProperty("userNameDxc"));
	}

	public void UsuarioOktaVisible() throws InterruptedException {

		tiempoEspera(3, inputCorreoOkta);		
		validate(inputCorreoOkta);
	}

	public void ingresarContraseñaOkta() throws InterruptedException {
		
		writeOn(inputPasswordoOkta, properties.getProperty("passwordDxc"));
	}

	public void ContraseñaOktaVisible() throws InterruptedException {

		tiempoEspera(3, inputPasswordoOkta);
		validate(inputPasswordoOkta);
	}

	public void clickConectarOcta() throws InterruptedException {
		
		clickOn(btnSingInOcta);
	}

	public void sendPushOkta() throws InterruptedException {

		tiempoEspera(2, btnsendPush);
		clickOn(btnsendPush);

	}

	public void verificarLogoAvianca() throws InterruptedException {		
		tiempoEspera(15, logoAvianca);
		boolean logo = driver.findElement(logoAvianca).isDisplayed();
		assertTrue(logo, "conexión exitosa");		
	}
	
	public void escribirAmadeus() throws InterruptedException {
		tiempoEspera(10, inputAmadeus);
		writeOn(inputAmadeus, "al fin");		
	}

	public void validarNombreAsesor() throws InterruptedException {
		tiempoEspera(10, nombreAsesor);
		String nombre = driver.findElement(nombreAsesor).getText();
		boolean validacionNombreAsesor = driver.findElement(nombreAsesor).getText().equals(nombre);
		assertTrue(validacionNombreAsesor);
	}

	public void validarCampoVisibleNombreAsesor() throws InterruptedException {
		tiempoEspera(5, nombreAsesor);
		validate(nombreAsesor);
	}
	public void cerrarNavegador() {
		driver.close();
	}
}

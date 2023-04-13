package pom;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilidadesExcel.ReadExcelFile;

public class BasePage {
	
	protected WebDriver driver;
//	Instancias de los archivos properties
	protected Properties properties = new Properties();	
	protected Properties prop_HU05 = new Properties();
	protected Properties prop_HU06 = new Properties();
	
	

	

	public BasePage(WebDriver driver)  {
		this.driver = driver;		
	}

	public WebDriver chromeDriverConnection() {
//		WebDriver _driver = null;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.navigate().to(getProperties().getProperty("linkURL"));
		driver.manage().window().maximize();	
		
		return driver;
	}
	
	public void traerPropiedades() throws FileNotFoundException, IOException {
		properties.load(new FileReader("properties/generalProperties.properties"));		
		prop_HU05.load(new FileReader("properties/HU_05.properties"));	
		prop_HU06.load(new FileReader("properties/HU_06.properties"));
		System.setProperty(properties.getProperty("keyDriverCon"), getProperties().getProperty("valueDriverCon"));
	}
	
	public void cerrarVentanaChrome() {
		driver.close();
	}
	
	public void tiempoEspera(int time, By element) throws InterruptedException {
		do {
			Thread.sleep(time * 1000);
		} while (driver.findElement(element).isDisplayed() == false);
	}
	
	public void clickOn(By element) throws InterruptedException {
		driver.findElement(element).click();
	}
	
	public void writeOn(By element, String text) throws InterruptedException {
		driver.findElement(element).sendKeys(text);
	}
	public String readOn(By element) throws InterruptedException {
		String text = driver.findElement(element).getText();
		return text;
		
	}
	public void clearText(By element) throws InterruptedException {
		driver.findElement(element).clear();
	}
	
	public void traerReserva(ReadExcelFile leer, Properties propiedades) throws Exception{
		leer.getCellValue(propiedades.getProperty("filePathExcel"), "Sheet1", 1, 0);
	}
	
	//Presencia de elemento
	public void validate(By element) throws InterruptedException {
		assertTrue(driver.findElement(element).isDisplayed());
	}

	public Properties getProperties() {
		return properties;
	}
	
	public Properties getProp_HU05() {
		return prop_HU05;
	}
	
	public Properties getProp_HU06() {
		return prop_HU06;
	}
}

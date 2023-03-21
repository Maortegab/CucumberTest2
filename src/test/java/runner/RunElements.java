package runner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;

public class RunElements {
	
	private static WebDriver driver;
	
	@Before("@browser")
	public void setUp() throws IOException {
		Properties properties = new Properties();	
		Properties prop_HU05 = new Properties();
		properties.load(new FileReader("src/main/resources/properties/generalProperties.properties"));		
		prop_HU05.load(new FileReader("src/main/resources/properties/HU_05.properties"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.navigate().to(properties.getProperty("linkURL"));
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver(){
        return driver;
    }
}

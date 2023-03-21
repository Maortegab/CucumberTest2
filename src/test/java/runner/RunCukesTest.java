package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features="src/test/java/features/",
//		features="src/test/java/features/HU01_PantallaLogueo.feature",
//		features="src/test/java/features/HU02_logIngresoEgresoDiarios.feature",
		features="src/test/java/features/HU05_RV1.feature",
		
		glue="stepDefinitions")

public class RunCukesTest extends AbstractTestNGCucumberTests{
	 
}

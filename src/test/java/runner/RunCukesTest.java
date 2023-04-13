package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features="src/test/java/features/",
//		features="src/test/java/features/HU01_PantallaLogueo.feature",
//		features="src/test/java/features/HU02_logIngresoEgresoDiarios.feature",
//		features="src/test/java/features/HU05_RV1.feature",
		features="src/test/java/features/HU06_RV_TSA_APIS.feature",
		
		glue="stepDefinitions")

public class RunCukesTest extends AbstractTestNGCucumberTests{
	 
}

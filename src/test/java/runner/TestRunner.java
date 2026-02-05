package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features/02_DataTable.feature",
	    glue = {"stepdefinitions"},
	    plugin = {"pretty","html:target/report.html"}
	)

	public class TestRunner extends AbstractTestNGCucumberTests {
	}
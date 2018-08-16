package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pom.Setup;
import utility.CreateReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature files", glue = { "step_defination" })

public class TestRunner extends Setup {
	CreateReport report = new CreateReport(driver);

	@Test
	public void test1() {

	}

	@AfterTest
	public void EndReport() {
		report.endTESTReport();
	}
}
package step_defination;

import java.io.IOException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Schedular_POM;
import pom.Setup;
import utility.CreateReport;
import utility.Take_ScreenShots;

public class Schedular_Sd extends Setup {
	CreateReport report = new CreateReport(driver);
	Take_ScreenShots screenshots = new Take_ScreenShots();
	Schedular_POM Schedular = new Schedular_POM(driver,report,screenshots);

	@When("^User \"([^\"]*)\"$")
	public void user(String CheckView) throws IOException, InterruptedException {
		Schedular.verfiyResourceProjectViewTab(CheckView);
		
	}

	@When("^User clicks on different \"([^\"]*)\"$")
	public void user_clicks_on_different(String ClickView) throws IOException, InterruptedException {
		Schedular.Resource_Or_ProjectViewTab(ClickView );
	}

	@Then("^Application should change the view$")
	public void application_should_change_the_view() {
	}

}

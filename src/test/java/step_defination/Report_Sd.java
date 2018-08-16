package step_defination;

import java.awt.AWTException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Login_POM;
import pom.Report_POM;
import pom.Setup;

public class Report_Sd extends Setup {

	Report_POM report = new Report_POM(driver);
	Login_POM login = new Login_POM(driver);

	@Given("^User is navugated to \"([^\"]*)\"$")
	public void user_is_navugated_to(String ExpName) {
		report.Page_Verify(ExpName);
	}

	/*
	 * @When("^User select \"([^\"]*)\">  for resource dropdown$") public void
	 * user_select_for_resource_dropdown(String ReportType) {
	 * System.out.println("for resource dropdown"); //
	 * report.Report_Type("All"); }
	 */
	
	@When("^User select \"([^\"]*)\" for resource dropdown$")
	public void user_select_for_resource_dropdown(String arg1) {
		System.out.println("for resource dropdown");
	}

	@When("^User  Select \"([^\"]*)\" for Project dropdown$")
	public void user_Select_for_Project_dropdown(String arg1) throws AWTException, InterruptedException {
		report.Get_Report_Button();

	}

	@When("^User  Select \"([^\"]*)\" for Location dropdown$")
	public void user_Select_for_Location_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for Department dropdown$")
	public void user_Select_for_Department_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for Start Date dropdown$")
	public void user_Select_for_Start_Date_dropdown(String arg1) {

	}

	@When("^User  Select  \"([^\"]*)\" for End Date dropdown$")
	public void user_Select_for_End_Date_dropdown(String arg1) {

	}

	@Then("^Clicks on Get Report$")
	public void clicks_on_Get_Report() {

	}

}

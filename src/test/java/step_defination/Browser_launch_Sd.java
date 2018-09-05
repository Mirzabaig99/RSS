package step_defination;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pom.Setup;
import utility.CleanFolder;
import utility.Take_ScreenShots;

public class Browser_launch_Sd extends Setup {
	
	Take_ScreenShots screenshots = new Take_ScreenShots();
	CleanFolder clean = new CleanFolder();
	
	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws IOException {
		clean.clearfolder();
		launch_Browser();
		System.out.println("Browser_launch");
		screenshots.takeScreenShot(driver, "launch_Browser_RCP");
	}

	
}

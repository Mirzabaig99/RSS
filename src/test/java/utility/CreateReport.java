package utility;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class CreateReport {

	WebDriver driver;
	public static ExtentReports extent;

	static LastFile last_file = new LastFile();

	public CreateReport(WebDriver driver) {
		this.driver = driver;
	}

	final ExtentReports logger = ExtentReports.get(CreateReport.class); // Creating logger at class level

	public void CreateRep(String reportname){

		
		
		// ----------------------------------Start creating Report-----------------------------------------//

		logger.init("C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\" + reportname + ".html", true);// Location of report created
	}
	public void startTest(String testname){
		
		logger.startTest(testname); 											   // start test with name "reportname" which comes from calling function
	}

	public void INFO(String name) {																		   //Info send to report INFO
		logger.log(LogStatus.INFO, name);
	}

	public void Attcahscreenshot() throws InterruptedException {

		// ----------------To find out last modified file and save in string "name"-------------------------------------

		File file = last_file.lastFileModified("C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\Screenshots\\");
		String name = file.getName();
		System.out.println("Create Report class which has last file " + name); 								   //***JUST TO VERIFY****
		// -------------------------*********************************************----------------------------------------

		logger.attachScreenshot("C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\Screenshots\\" + name); //Attach screen shot
	}

	public void PASS(String name) {																			   //Info for PASS test
		String Title = driver.getTitle();
		logger.log(LogStatus.INFO, "Title has been captured");

		Assert.assertTrue(Title.contains(name));
		logger.log(LogStatus.PASS, "Title is verified ");

		System.out.println("Page title is " + Title);
		try {
			Thread.sleep(6000);

			
			Thread.sleep(3000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	
	// logger.attachScreenshot("C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\Screenshots\\" + name);

	public void endTESTReport() {                                                                             //End Test here 
		logger.endTest();

	}

}

//--------------POM is craeted By: Mirza Asim Baig--------------
//--------------POM dose followings
//----1. Creates variable and objects
//----2. Create a constructor that passes Driver, Extent report and Screenshots objects
//----3. Verfiy that user is on which view (i.e. Resource or Project), take screenshot of that view and attach to report
//----4. Click on desired view based on above check view method

package pom;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.CreateReport;
import utility.Take_ScreenShots;

public class Schedular_POM {
	WebDriver driver;
	String CheckView;
	int count;

	CreateReport report;
	Take_ScreenShots screenshots;

	static ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Schedular");

	public Schedular_POM(WebDriver Const_driver, CreateReport report, Take_ScreenShots screenshots) {
		this.driver = Const_driver;
		this.report = report;
		this.screenshots = screenshots;
	}

	public void verfiyResourceProjectViewTab(String View) throws IOException, InterruptedException {
		CheckView = driver.findElement(By.xpath(bundle.getString("Resources_Text_Verify_Xpath"))).getText();
		report.startTest("Schedular");
		if (CheckView.contains(View)) {
			System.out.println("Schedular>>--" + View);
			count = 1;
		} else {
			System.out.println("Schedular>>--" + View + "---->not navigated");
			count = 2;
		}

	}

	public void Resource_Or_ProjectViewTab(String Clickview) throws IOException, InterruptedException {
		if (count == 2 || Clickview.equals("Resources")) {
			driver.findElement(By.xpath(bundle.getString("Resource_View_Tab_Xpath"))).click();
			report.INFO("Resource_TabView");
			screenshots.takeScreenShot(driver, "RCP");
			report.Attcahscreenshot();
		}

		else if (count == 1 || Clickview.equals("Resources")) {
			System.out.println("Already on same view(--Resource)");
			report.INFO("Resource_TabView");
			screenshots.takeScreenShot(driver, "RCP");
			report.Attcahscreenshot();
		}

		else if (count == 2 || Clickview.equals("Project")) {
			System.out.println("Already on same View(--Project)");
			report.INFO("Project_TabView");
			screenshots.takeScreenShot(driver, "RCP");
			report.Attcahscreenshot();
		}

		else if (count == 1 || Clickview.equals("Project")) {
			driver.findElement(By.xpath(bundle.getString("Project_View_Tab_Xpath"))).click();
			report.INFO("Project_TabView");
			screenshots.takeScreenShot(driver, "RCP");
			report.Attcahscreenshot();
		}
	}

	public void Select_Resource_Status_Dropdown(String DropdownValue) {
		Select select = new Select(driver.findElement(By.xpath(bundle.getString("ResourcesStatusDropDown_Xpath"))));
		select.selectByVisibleText(DropdownValue);
	}

	public void Select_Project_Type_Dropdown(String DropdownValue) {
		Select select = new Select(
				driver.findElement(By.cssSelector(bundle.getString("ProjectTypeFilterDropDown_Css"))));
		select.selectByVisibleText(DropdownValue);
	}

	public void Skill_Dropdown(String data) throws InterruptedException {
		WebElement ul = driver.findElement(By.xpath("//ul[@class='addressListItems']"));// xpath
																						// of
																						// ul
		Thread.sleep(2000);
		List<WebElement> allOptions = ul.findElements(By.tagName("li"));
		for (WebElement selectLi : allOptions) {
			if (selectLi.getText().equals(data)) {
				selectLi.click();
			}
		}
	}

	public void Experince_Dropdown(String DropdownVlaue) {
		Select select = new Select(driver.findElement(By.xpath(bundle.getString("ExperienceDropDown_Xpath"))));
		select.selectByVisibleText(DropdownVlaue);
	}

	public void Titile_Dropdown(String DropdownVlaue) {
		Select select = new Select(driver.findElement(By.xpath(bundle.getString("TitleDropDown_Xpath"))));
		select.selectByVisibleText(DropdownVlaue);
	}

	public void Search_TextBox(String Data) {
		driver.findElement(By.cssSelector(bundle.getString("SearchTextBox_Css"))).sendKeys(Data);
	}

	public void ResetFilter_Button() {
		WebElement element = driver.findElement(By.cssSelector(bundle.getString("ResetFilterButton_Css")));
		// Dimension i = element.getSize();
		if (element.isDisplayed()) {
			System.out.println("Element is Present");
			element.click();
		} else {
			System.out.println("Element is Absent");
		}
	}

}

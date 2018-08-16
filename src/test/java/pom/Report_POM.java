package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Report_POM {

	WebDriver driver;
	static ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Report");


	public Report_POM(WebDriver Const_driver) {
		this.driver = Const_driver;

	}

	public void Report_Type(String Report_Type) {
		Select select = new Select(driver.findElement(By.xpath("Resource_Type_Xpath")));
		select.selectByVisibleText(Report_Type);

	}

	public void Get_Report_Button() throws AWTException, InterruptedException {
		// driver.switchTo().defaultContent();
		/*Robot rb = new Robot();
		for (int i=1;i<=20;i++){
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		}*/
		/*rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);*/
		
		
		WebElement eSupplier = driver.findElement(By.id("supplier:supplierOps_input"));
	    eSupplier.sendKeys("OPS1");
	    Thread.sleep(5000); // wait the suggestbox

	    // i find the suggestbox
	    WebElement eSupplierSuggest = driver.findElement(By.cssSelector("css path of that specific value in the auto suggestion box"));
	    eSupplierSuggest.click();
	    Thread.sleep(5000); // wait 
	}

	public void Page_Verify(String Exp_Name) {
		String Page_name = driver.findElement(By.xpath("html/body/app-root/div/app-report/nav/h3")).getText();
		// Assert.assertEquals(Exp_Name, Page_name,"Not matched");
		System.out.println(Page_name);
		if (Page_name.equals("Resource Allocation Report")) {
			System.out.println("Page navigated");
		}

		else {
			System.out.println("Not Navigated");
		}
	}
}

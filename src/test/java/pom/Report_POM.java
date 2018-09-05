package pom;

import java.util.ResourceBundle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Report_POM {

	WebDriver driver;
	static ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Report");

	public Report_POM(WebDriver Const_driver) {
		// TODO Auto-generated constructor stub
		this.driver=Const_driver;
	}

	public void Report_Type(String Report_Type) {
		Select select = new Select(driver.findElement(By.xpath("Resource_Type_Xpath")));
		select.selectByVisibleText(Report_Type);

	}

	public void Get_Report_Button() {
		driver.findElement(By.xpath(bundle.getString("Download_PDF_Xpath"))).click();
		driver.findElement(By.xpath(bundle.getString("GetReport_Xpath"))).click();
		driver.switchTo().alert().accept();
	}

	
	
}

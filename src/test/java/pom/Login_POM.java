package pom;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_POM {

	static ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Login");

	WebDriver driver;

	public Login_POM(WebDriver const_driver) {
		this.driver = const_driver;
	}

	public void enter_EmployeeID(String EmpID) {
		driver.findElement(By.xpath(bundle.getString("EmpID_Xpath"))).sendKeys(EmpID);
	}

	public void enter_Password(String passwrd) {
		driver.findElement(By.xpath(bundle.getString("Password_Xpath"))).sendKeys(passwrd);
	}

	public void Click_Login() {
		driver.findElement(By.xpath(bundle.getString("loginBtn_Xpath"))).click();
	}

	public void Forget_password() {
		driver.findElement(By.xpath(bundle.getString("ForgetPassword_Xpath"))).click();
	}

	public void ClickReport() {
		driver.findElement(By.xpath(bundle.getString("Report_xpath"))).click();
	}

	
}

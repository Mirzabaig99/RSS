package pom;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
	
	ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.Resources_File");
	
	public static WebDriver driver;
	
	public void launch_Browser()
	{
		System.setProperty("webdriver.firefox.marionette",
				"D:\\Software\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void launch_URL()
	{
		driver.get(bundle.getString("URL"));
	}

	public void close_browser(){
		driver.close();
	}
}

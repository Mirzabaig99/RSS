package utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Take_ScreenShots {

	public String takeScreenShot(WebDriver driver, String Screenshot) throws IOException {
		String dest = null;
//		String dir = "C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\Screenshots\\";
		// for (File file: dir.listFiles()) if (!file.isDirectory())
		// file.delete();

		/*Path folder = Paths.get(dir);
		 CleanFolder.clean(folder);*/

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			dest = "C:\\Users\\mirzab\\Desktop\\RCP\\Automation\\Reports\\Screenshots\\" + Screenshot + "-"
					+ System.currentTimeMillis() + ".png";

			File destination = new File(dest);

			FileUtils.copyFile(source, destination);
		}

		catch (IOException e) {
			System.out.println("Exception while taking screen shot");
		}
		return dest;

	}
}

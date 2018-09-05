package utility;

import pom.Setup;

public class AllPage_Verify extends Setup {
	public void Page_Verify(String Exp_Name) {
		String URL = driver.getCurrentUrl();
		System.out.println("FILE is Utiluty_A_PageVerify-->>" + URL);
		if (URL.contains(Exp_Name)) {
			System.out.println("Page navigated");
		} else {
			System.out.println("Not Navigated");
		}
	}
}

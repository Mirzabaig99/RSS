package utility;

import java.util.ResourceBundle;

public class ConfigFileReader {
	static ResourceBundle bundle = ResourceBundle.getBundle("Resource Folder.config");
	
	public String getReportConfigPath(){
		String reportConfigPath = bundle.getString("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}

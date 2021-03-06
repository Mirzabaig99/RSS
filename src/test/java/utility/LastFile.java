package utility;

import java.io.File;
import java.io.FileFilter;

public class LastFile {
	public  File lastFileModified(String dir) throws InterruptedException {
	    File fl = new File(dir);
	    File[] files = fl.listFiles(new FileFilter() {          
	        public boolean accept(File file) {
	            return file.isFile();
	        }
	    });
	    long lastMod = Long.MIN_VALUE;
	    File choice = null;
	    for (File file : files) {
	    	Thread.sleep(500);
	        if (file.lastModified()>= lastMod) {
	            choice = file;
	            lastMod = file.lastModified();
	        }
	    }
	    return choice;
	}
}

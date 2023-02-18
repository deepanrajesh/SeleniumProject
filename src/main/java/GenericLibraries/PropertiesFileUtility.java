package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains all reusable methods 
 */

public class PropertiesFileUtility {
	 private Properties property;

	
	public void propertyFileInitialization(String filepath) {
		FileInputStream fis=null;
		try {
				
			fis=	new FileInputStream(filepath);
		
	}
catch(FileNotFoundException e) {
	e.printStackTrace();
}
		property = new Properties();
		try {
			property.load(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * this method returns the data from properties based on the key passed
	 * @paramkey
	 * @return
	 * 
	 */
public String fetchProperty(String key) {
	return property.getProperty(key);
	
	}
}
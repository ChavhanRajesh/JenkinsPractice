package vtiger.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consists of generic methods related to property file
 * @author Chaitra M
 */
public class PropertyFileUtility {
	
	/**
	 * This method will read data from property file 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IContantsUtility.propertyfilePath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String values = pObj.getProperty(key);
		return values;
	}
	

}

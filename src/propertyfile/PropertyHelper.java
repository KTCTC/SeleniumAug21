package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	
private Properties propObj=null;
	public PropertyHelper(String fileName) 
	{
		
		try {
			File f = new File(System.getProperty("user.dir")+"\\"+fileName);		
			FileInputStream fis = new FileInputStream(f);		
			 propObj = new Properties();		
			propObj.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}
	
	public String getPropertyValue(String key)
	{
		
		return propObj.getProperty(key);
		
	}
	
	

}

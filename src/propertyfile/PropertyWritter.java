package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWritter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"\\Env.properties");		
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f);
		
		Properties propObj = new Properties();		
	
		propObj.setProperty("baseURL", "https://www.javatpoint.com/");
		
		
		propObj.store(fos, "Updated URL");
		
		
		
		

	}

}

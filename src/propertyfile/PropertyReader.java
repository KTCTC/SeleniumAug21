package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"\\Env.properties");		
		FileInputStream fis = new FileInputStream(f);		
		Properties propObj = new Properties();		
		propObj.load(fis);		
		String url = propObj.getProperty("baseURL");
		System.out.println(url);
		System.out.println(propObj.getProperty("userName"));
		
		
		

	}

}

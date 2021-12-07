package propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ABCD {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
PropertyHelper obj = new PropertyHelper("Env.properties");
		
	
		System.out.println(obj.getPropertyValue("baseURL"));

	}

}

package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		  WebDriver chDriver = new ChromeDriver(); 
		  EdgeDriver edgeDriver = new EdgeDriver(); 
		  ChromeDriver chDriver1 = new ChromeDriver();		  
		  
		  chDriver.get("https://www.javatpoint.com/");
		  edgeDriver.get("https://www.javatpoint.com/");
		  chDriver1.get("https://demoqa.com/text-box");		 
		  driver.get("https://demoqa.com/text-box");
		
		

	}

}

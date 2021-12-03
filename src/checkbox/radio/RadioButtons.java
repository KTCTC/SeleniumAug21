package checkbox.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		  
		driver.get("http://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='Option 2']")).click();
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='Option 3']")).click();

	}

}

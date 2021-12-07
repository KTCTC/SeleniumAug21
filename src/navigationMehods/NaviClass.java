package navigationMehods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyfile.PropertyHelper;

public class NaviClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PropertyHelper obj = new PropertyHelper("Env.properties");
		
		driver.get(obj.getPropertyValue("baseURl")+"/text-box");
		
		driver.navigate().to(obj.getPropertyValue("baseURL")+"/text-box");
		
		driver.findElement(By.xpath("//*[@class='accordion']//span[contains(text(),'Check Box')]")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		

	}

}

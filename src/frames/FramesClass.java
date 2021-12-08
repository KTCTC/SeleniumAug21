package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyfile.PropertyHelper;

public class FramesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			PropertyHelper obj = new PropertyHelper("Env.properties");			
			
			driver.navigate().to(obj.getPropertyValue("baseURL")+"/frames");
			
			driver.switchTo().frame("frame1");
			String data = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(data);
			driver.switchTo().defaultContent();
			

	}

}

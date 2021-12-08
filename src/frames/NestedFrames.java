package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertyfile.PropertyHelper;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			PropertyHelper obj = new PropertyHelper("Env.properties");			
			
			driver.navigate().to(obj.getPropertyValue("baseURL")+"/nestedframes");
			
			driver.switchTo().frame("frame1");
			
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
			String data = driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText();
			System.out.println(data);
			
			driver.switchTo().parentFrame();
			
			String data1 = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();	
			System.out.println(data1);
			driver.switchTo().defaultContent();
			

	}

}

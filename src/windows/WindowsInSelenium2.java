package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import propertyfile.PropertyHelper;

public class WindowsInSelenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PropertyHelper obj = new PropertyHelper("Env.properties");
		
		driver.get(obj.getPropertyValue("baseURL")+"/browser-windows");
		String parentWindow = driver.getWindowHandle(); //45
		System.out.println(parentWindow);
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWindow = driver.getWindowHandles();// 34,45
		
		
		for (String each:allWindow)
		{
			if (!each.equals(parentWindow))
			{
				driver.switchTo().window(each);
			}
		}
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sampleHeading"))));
		
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
		
		driver.switchTo().window(parentWindow);
		driver.quit();
		
		

	}

}

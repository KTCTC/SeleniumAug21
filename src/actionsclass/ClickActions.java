package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import propertyfile.PropertyHelper;

public class ClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			PropertyHelper obj = new PropertyHelper("Env.properties");
			
			driver.get(obj.getPropertyValue("baseURL")+"/text-box");
			
			Actions act = new Actions(driver);
			
			WebElement interactions = driver.findElement(By.xpath("//div[contains(text(),'Interactions')]"));
			WebElement bookStore = driver.findElement(By.xpath("//div[contains(text(),'Book Store Application')]"));
			
			
			act.moveToElement(bookStore).build().perform();
			act.click(interactions).build().perform();
			
			
			
			

	}

}

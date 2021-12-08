package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import propertyfile.PropertyHelper;

public class ScrollActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			PropertyHelper obj = new PropertyHelper("Env.properties");
			
			driver.get(obj.getPropertyValue("baseURL")+"/buttons");
			
			Actions act = new Actions(driver);
			
			WebElement clickButton = driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
			WebElement rightClickButton = driver.findElement(By.id("rightClickBtn")); 
			WebElement doubleButton = driver.findElement(By.id("doubleClickBtn"));
			
			act.click(clickButton).build().perform();
			
			act.moveToElement(rightClickButton).contextClick().build().perform();
			
			act.doubleClick(doubleButton).build().perform();
			
			
			

	}

}

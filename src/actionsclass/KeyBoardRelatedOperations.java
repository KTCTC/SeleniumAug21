package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import propertyfile.PropertyHelper;

public class KeyBoardRelatedOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);

		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		act.click(emailTextBox).keyDown(Keys.SHIFT).sendKeys("welcome to ktctc").keyUp(Keys.SHIFT).build().perform();
		
		
		
		

	}

}

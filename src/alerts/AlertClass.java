package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		driver.get("https://demoqa.com/alerts");
		
		// prompt 
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alt3 = driver.switchTo().alert();
		
		System.out.println(alt3.getText());
		alt3.sendKeys("KTCTC");
		
		alt3.accept();
		
		// confirm button alert
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.dismiss();
		
		
		// timer alert
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		
		wt.until(ExpectedConditions.alertIsPresent());
		
		Alert alt1 = driver.switchTo().alert();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		alt1.accept();
		
		
		
		
		
		
		
		// Normal alert
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}

}

package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By uname = By.id("email");
		WebElement emailId = driver.findElement(uname);     
		
		emailId.sendKeys("ganeshktctc@gmail.com");
		
		
		driver.findElement(By.id("email")).sendKeys("ganeshktctc@gmail.com");
		
		By pass = By.name("pass");
		 WebElement passWord = driver.findElement(pass);		
		
		passWord.sendKeys("KTCTC3456789");
		
		
		
		
		WebElement button = driver.findElement(By.name("login"));
		
	    button.click();
	    
	    
        driver.close();
	}

}

package checkbox.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		boolean f = driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']")).isDisplayed();
		System.out.println(f);
		
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']")).click();
	}

}

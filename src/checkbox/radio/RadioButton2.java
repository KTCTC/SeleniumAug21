package checkbox.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();  
		driver.get("https://demoqa.com/radio-button");
		
		WebElement yesButton = driver.findElement(By.id("yesRadio"));
		WebElement noButton = driver.findElement(By.id("noRadio"));
		boolean f5 = noButton.isDisplayed();
		System.out.println(f5);
		boolean f3 = yesButton.isSelected();
		System.out.println(f3);
		boolean f1 = yesButton.isEnabled();
		System.out.println(f1);
		boolean f2 = noButton.isEnabled();
		System.out.println(f2);
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		boolean f4 = yesButton.isSelected();
		System.out.println(f4);
		
		

	}

}

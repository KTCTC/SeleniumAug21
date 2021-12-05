package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();  
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select sel = new Select(driver.findElement(By.name("country")));
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		sel.selectByIndex(2);
		
		sel.selectByValue("ARGENTINA");
		
		sel.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
		
		sel.deselectByVisibleText("ASHMORE AND CARTIER ISLANDS");

	}

}

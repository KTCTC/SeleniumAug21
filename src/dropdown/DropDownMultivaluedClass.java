package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultivaluedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();  
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select sel = new Select(driver.findElement(By.id("fruits")));		
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		
		sel.selectByIndex(0);
		sel.selectByValue("apple");
		sel.selectByVisibleText("Grape");
		
		WebElement el = sel.getFirstSelectedOption();
		System.out.println(el.getText());
		
		
		List<WebElement> els = sel.getAllSelectedOptions();
		
		for (WebElement each:els)
		{
			System.out.println(each.getText());
		}
		
		
		List<WebElement> allEl = sel.getOptions();
		
		Iterator<WebElement> itr = allEl.iterator();
		while(itr.hasNext())
		{
			WebElement ee = itr.next();
			System.out.println(ee.getText());
		}
		
		
		sel.deselectByVisibleText("Apple");
		
		
		sel.deselectAll();
		
		

	}

}

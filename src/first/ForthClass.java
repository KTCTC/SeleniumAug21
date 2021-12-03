package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForthClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement textElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		String msg = textElement.getText();
		System.out.println(msg);
		
		String fontFam = textElement.getCssValue("font-family");
		System.out.println(fontFam);
		String fontSize = textElement.getCssValue("font-size");
		System.out.println(fontSize);
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		String val = emailTextBox.getAttribute("placeholder");
		System.out.println(val);
		
		List<WebElement> eles = driver.findElements(By.xpath("//form[contains(@data-testid,'login_form')]//div//input"));
		
		for (int i=0; i<eles.size();i++)
		{
			eles.get(i).sendKeys("KTCTC " + i);
		}
		
		
		WebElement ele = driver.findElement(By.xpath("//form[contains(@data-testid,'login_form')]//div//input"));
		ele.clear();
		
		ele.sendKeys("KTCTC");
		
		String read = emailTextBox.getAttribute("value");
		System.out.println(read);
		
		driver.findElement(By.name("login")).submit();
		driver.close();

	}

}

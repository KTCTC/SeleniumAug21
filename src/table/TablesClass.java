package table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println(rows.size());
		WebElement tableE = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		String companyName = tableE.findElement(By.xpath("tbody/tr[1]//td[1]/a")).getText();
		String cntPrice = tableE.findElement(By.xpath("tbody/tr[1]//td[4]")).getText();
		
		System.out.println("Company Name = "+ companyName + " current share price = "+cntPrice);

	}

}

package table;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		HashMap<String, String> cInfo = getComanyInforMation(driver, "Ltd");
		
		System.out.println(cInfo.get("Company Cnt Price"));
		
		for (Entry<String, String> each: cInfo.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
		}
		

	}
	
	public static HashMap<String,String> getComanyInforMation(WebDriver driver, String cName)
	{
		
		WebElement companyName = driver.findElement(By.xpath("//table[@class='dataTable']/tbody//td/a[contains(text(),'"+cName+"')]"));		
		HashMap<String, String> cData = new HashMap<>();
		cData.put("CompanyName", companyName.getText());
		cData.put("Company Group", companyName.findElement(By.xpath("parent::td/following-sibling::td[1]")).getText());
		cData.put("Company Prev Close", companyName.findElement(By.xpath("parent::td/following-sibling::td[2]")).getText());
		cData.put("Company Cnt Price", companyName.findElement(By.xpath("parent::td/following-sibling::td[3]")).getText());
		cData.put("Company Per Change", companyName.findElement(By.xpath("parent::td/following-sibling::td[4]/font")).getText());
		
		return cData;
		
		
	}

}

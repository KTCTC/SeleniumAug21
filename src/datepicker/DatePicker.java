package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import propertyfile.PropertyHelper;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PropertyHelper obj = new PropertyHelper("Env.properties");
		String date = "12/01/2022";
		driver.get(obj.getPropertyValue("baseURL")+"/date-picker");
		
		selectRequiredDate(driver, "03/12/2023");
		
		
		

	}
	
	public static void selectRequiredDate(WebDriver driver, String date)
	{
  
     String []arr = date.split("/"); // arr[0]="12", arr[1] = "01";, arr[2]="2022"
	
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select selYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		selYear.selectByVisibleText(arr[2]);
		
		Select selMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		int day = Integer.parseInt(arr[0]) -1;		
		selMonth.selectByValue(String.valueOf(day));
		
		WebElement ss = selMonth.getFirstSelectedOption();
		String mName = ss.getText();
		
		driver.findElement(By.xpath("//*[contains(@class,'0"+arr[1]+"') and contains(@aria-label,'"+mName+"')]")).click();
		
	}

}

package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import propertyfile.PropertyHelper;

public class DatePicker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PropertyHelper obj = new PropertyHelper("Env.properties");
		String date = "12/01/2022";
		driver.get(obj.getPropertyValue("baseURL") + "/date-picker");

		WebElement datePicker = driver.findElement(By.id("datePickerMonthYearInput"));
		datePicker.click();
		for (int i = 0; i < 10; i++) {
			datePicker.sendKeys(Keys.BACK_SPACE);
		}

		datePicker.sendKeys(date);
		datePicker.sendKeys(Keys.ENTER);

	}

}

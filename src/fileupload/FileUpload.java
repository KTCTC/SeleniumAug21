package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import propertyfile.PropertyHelper;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedMessage = "1 file has been successfully uploaded.";
		
		System.out.println(expectedMessage);
		
		System.out.println(expectedMessage.replace("\n", ""));
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\Env.properties");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='res']//center"))));
		
		String text = driver.findElement(By.xpath("//*[@id='res']//center")).getText();
		System.out.println(text);
		
		
		
		if (text.replace("\n", " ").equals(expectedMessage))
		{
			System.out.println("Upload file test case is passed");
		}
		else
		{
			System.out.println("Upload file test case is failed");
		}
		
		if (driver.findElement(By.xpath("//*[@id='res']//center")).getText().replace("\n", " ").equals("1 file has been successfully uploaded."))
		{
			System.out.println("Upload file test case is passed");
		}
		else
		{
			System.out.println("Upload file test case is failed");
		}
		

	}

}

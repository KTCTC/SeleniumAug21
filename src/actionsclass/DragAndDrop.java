package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import propertyfile.PropertyHelper;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PropertyHelper obj = new PropertyHelper("Env.properties");

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		Actions act = new Actions(driver);

		WebElement amount = driver.findElement(By.xpath("//div[@id='products']//a[contains(text(),' 5000')]"));
		WebElement destinationAmt1 = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		WebElement destinationAmt2 = driver.findElement(By.xpath("//*[@id='amt8']/li"));

		WebElement bankButton = driver.findElement(By.xpath("//div[@id='products']//a[contains(text(),'BANK')]"));
		WebElement bankDestination = driver.findElement(By.xpath("//*[@id='bank']/li"));

		WebElement salesButton = driver.findElement(By.xpath("//div[@id='products']//a[contains(text(),'SALES')]"));
		WebElement salesDestination = driver.findElement(By.xpath("//*[@id='loan']/li"));

		act.dragAndDrop(amount, destinationAmt1).build().perform();
		act.dragAndDrop(amount, destinationAmt2).build().perform();
		
		act.clickAndHold(bankButton).moveToElement(bankDestination).release().build().perform();
		act.clickAndHold(salesButton).moveToElement(salesDestination).release().build().perform();
		
		
		

	}

}

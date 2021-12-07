package waitsinselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://test-demoqa.com");
		
		String data = System.getProperty("user.dir");
		System.out.println(data);
      System.out.println("before wait");
      Thread.sleep(10000);
      
      System.out.println("After wait");
	}

}

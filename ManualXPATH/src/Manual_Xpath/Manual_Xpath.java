package Manual_Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manual_Xpath {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		
		webdriver.get("https://www.google.com");
		webdriver.findElement(By.xpath("//div[@id='searchform']/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Hello from script");
		//webdriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div/span")).click();

		
	}
}

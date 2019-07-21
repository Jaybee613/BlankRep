package CSSlocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCSSLocator {
	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		webdriver.get("https://www.gmail.com");
		webdriver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("jayabalaji1990@gmail.com");
		webdriver.findElement(By.xpath("//*[@id=\'identifierNext\']/span")).click();
		
		webdriver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Vedam@1953");
		
		
		
		
	}

}

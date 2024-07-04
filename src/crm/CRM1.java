package crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRM1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://larsonjuhl-sandbox.crm.dynamics.com/");

	}

}

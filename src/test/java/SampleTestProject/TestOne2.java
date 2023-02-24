package SampleTestProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestOne2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
	driver.findElement(By.xpath("//a[contains(@id,'nav-link-accountList')]")).click();
	driver.findElement(By.id("ap_email")).sendKeys("12345");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("aaaa#123");
	driver.findElement(By.id("signInSubmit")).click();
	if(driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed())
		System.out.println("successfully logged in");
	}

	
}

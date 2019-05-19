package PanasonicPurple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PurplePhone {
	WebDriver driver;

	@Test(priority=0)
	public void f() throws InterruptedException {
		driver.get("https://www.act.com/demo");
		Actions act = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a"));
		WebElement target2 = driver.findElement(By.xpath("//a[@href='/demo']"));
		act.moveToElement(target).perform();
		target2.click();
	}
			//	@Test(priority=2)


	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\A STUFF\\SOFTWARE\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void over() {
		System.out.println("passed");
	}
}

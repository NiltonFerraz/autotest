package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cenario3 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();

	}

	@Test
	public void testDAtePicker() throws Exception {

		driver.get("http://demo.automationtesting.in/Datepicker.html");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// put date on Datepicker1 Calendar

		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();

		// Creating the JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// i have stored my elements somehwere on a file as String
		WebElement disElement = driver.findElement(By.xpath("//input[@id='datepicker1']"));

		// Js executor on Readonly argument

		((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1]", disElement, "01/17/1971");

		// put date on Datepicker2 Calendar

		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();

		driver.findElement(By.xpath("//input[@id='datepicker2']")).sendKeys("01/17/1971");
	}
}

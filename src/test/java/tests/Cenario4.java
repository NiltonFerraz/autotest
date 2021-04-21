package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cenario4 {

	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.close();
		// driver.quit();
	}

	@Test
	public void test() {

		// Visita a página do Automation Demo Site - Widgets - Slider
		driver.get("http://demo.automationtesting.in/Slider.html");
		driver.manage().window().maximize();
		testSlider();
	}

	public static void testSlider() {
		int x = 2;

		WebElement slider = driver.findElement(By.id("slider"));
		int width = slider.getSize().getWidth();

		Actions move = new Actions(driver);

		// Cria o movimento do slider
		move.moveToElement(slider, ((width * x) / 100), 0).click();
		move.build().perform();
		System.out.println("Slider moved");

	}

}

package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cenario2 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();

	}

	@Test
	public void preencheRegisterForm() {

		// Visita a página do Automation Demo Site - Switch to - Frames
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		// Direciona para o frame
		driver.switchTo().frame("singleframe");

		// Escreve dentro do frame
		WebElement inputText = driver
				.findElement(By.cssSelector("body > section > div > div > div > input[type='text'"));
		inputText.sendKeys("Nilton");

	}
}

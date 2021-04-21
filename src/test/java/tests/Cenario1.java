package tests;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cenario1 {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void preencheRegisterForm() {
		
		// Visita a página do Automation Demo Site - Register
		driver.get("http://demo.automationtesting.in/Register.html");

		// Escolhe o valor de First Name
		WebElement inputFirstName = driver.findElement(By.cssSelector("input[ng-model='FirstName'"));
		inputFirstName.sendKeys("Nilton");

		// Escolhe o valor de Last Name
		WebElement inputLastName = driver.findElement(By.cssSelector("input[ng-model='LastName'"));
		inputLastName.sendKeys("Ferraz");

		// Escolhe o valor de Address
		WebElement textArea = driver.findElement(By.cssSelector("textarea[ng-model='Adress'"));
		textArea.sendKeys("Al. Salerno, 75");

		// Escolhe o valor de Email
		WebElement inputEmail = driver.findElement(By.cssSelector("input[ng-model='EmailAdress'"));
		inputEmail.sendKeys("nilferraz@gmail.com");

		// Escolhe o valor de Phone
		WebElement inputPhone = driver.findElement(By.cssSelector("input[ng-model='Phone'"));
		inputPhone.sendKeys("+55 15 991611043");

		// Escolhe o valor de Gender
		WebElement inputGender = driver.findElement(By.cssSelector("input[value='Male'"));
		inputGender.click();

		// Escolhe o valor de Hobbies
		WebElement inputCheck1 = driver.findElement(By.cssSelector("input[id='checkbox1'"));
		inputCheck1.click();
		WebElement inputCheck2 = driver.findElement(By.cssSelector("input[id='checkbox2'"));
		inputCheck2.click();

		/* ***************** EM OBRAS ************************* */

		// **** Escolhe o valor de Languages ******

		

		/* **************************************************** */

		// Escolhe o valor de Skilss
		Select selectSkills = new Select(driver.findElement(By.cssSelector("select[id='Skills'")));
		selectSkills.selectByIndex(1);

		// Escolhe o valor de Country
		Select selectCountry = new Select(driver.findElement(By.cssSelector("select[id='countries'")));
		selectCountry.selectByVisibleText("Brazil");

		// Escolhe o valor de Date of Birth - Year
		Select selectYear = new Select(driver.findElement(By.id("yearbox")));
		selectYear.selectByVisibleText("1971");

		// Escolhe o valor de Date of Birth - Month
		Select selectMonth = new Select(driver.findElement(By.cssSelector("select[ng-model='monthbox'")));
		selectMonth.selectByVisibleText("January");

		// Escolhe o valor de Date of Birth - Day
		Select selectDay = new Select(driver.findElement(By.cssSelector("select[ng-model='daybox'")));
		selectDay.selectByVisibleText("17");

		// Escolhe o valor de First Password
		WebElement inputPassword = driver.findElement(By.id("firstpassword"));
		inputPassword.sendKeys("123456");

		// Escolhe o valor de Last Password
		WebElement inputConfirmPassword = driver.findElement(By.id("secondpassword"));
		inputConfirmPassword.sendKeys("123456");

		// Insere uma foto
		WebElement uploadImage = driver.findElement(By.id("imagesrc"));
		uploadImage.sendKeys("C:\\foto2.jpg");

		// Clica no botão Submit
		WebElement buttonSubmit = driver.findElement(By.cssSelector("button[value='sign up'"));
		buttonSubmit.click();

	}
}

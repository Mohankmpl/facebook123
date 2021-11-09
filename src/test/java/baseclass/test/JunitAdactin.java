package baseclass.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JunitAdactin {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void login() {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Mohan");
		String name = txtUser.getAttribute("value");
		Assert.assertEquals("Verify txtUser","Mohan", name);
		

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Hello@123");
		String pass = txtPass.getAttribute("value");
		Assert.assertEquals("Verify txtPass","Hello@123", pass);

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

}

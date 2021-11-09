package baseclass.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	
	WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void loadUrl(String Url) {
	driver.get(Url);
		
	}
	
	public void maximize() {
		driver.manage().window().maximize();
			}
	
//	public void findLocatorById(String data,String a) {
//	WebElement element = driver.findElement(By.id(data));
//	element.sendKeys(a);
//	String attribute = element.getAttribute(a);
//	return attribute;
//	}
	
	public WebElement findLocatorByName(String data) {
	return driver.findElement(By.name(data));
	}
	
//	public void findLocatorByXpath(String data, String insert) {
//		WebElement element = driver.findElement(By.xpath(data));
//		element.sendKeys(insert);
	
	public void findLocatorByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return;
		
		
	}
	
	
	
	
		
		

	}

	}
		 
		 
		

	
	




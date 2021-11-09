package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Mohan Kumar");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("301194");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		
		
		
		
		
		
		
		
	}

}

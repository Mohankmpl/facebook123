package org.screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotss {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohan\\eclipse-workspace\\AlertTask\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	
	TakesScreenshot sc= (TakesScreenshot)driver;
	
	File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
	
	File file = new File("C:\\Users\\Mohan\\test-data\\sample.png");
	
	FileUtils.copyFile(screenshotAs, file);
}


}

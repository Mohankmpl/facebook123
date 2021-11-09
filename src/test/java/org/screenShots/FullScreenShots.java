package org.screenShots;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenShots {
	
	public static void main(String[] args) throws IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			
			Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			ImageIO.write(sc.getImage(), "png", new File("C:\\Users\\Mohan\\test-data\\Mohanfull2.png"));
			

	}

}

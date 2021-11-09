package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\Mohan\\test-data\\Samplesheet.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		
			
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement dDnlink = driver.findElement(By.id("Skills"));
		Select select = new Select (dDnlink);
		List<WebElement> options = select.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			
			
		}
		
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		System.out.println("Done....");
		
		
	
	
}

}

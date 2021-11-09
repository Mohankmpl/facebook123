package pojonew.adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassPojo {
	
	WebDriver driver;
	
	//Close Current Window
	public void closeCurrentWindow() {
	driver.close();
	}
	
	//Closse all windows
	public void closeAllWindows() {
	driver.quit();

	}
		
	//Get the title
	public String getTitle() {
	String title = driver.getTitle();
	return title;
	}
	
	//Get the entered URL
	public String getCurrentUrl() {
	String url = driver.getCurrentUrl();		
	return url;
	
	}
	
	//ThreadSleep
	public void threadSleep(long data) throws InterruptedException {
		Thread.sleep(data);
		}
	//Find Element By ID
	public WebElement findElementById( String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
		
		
	}

	//Find Element By Xpath
	public WebElement findElementByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
		
	}
	//Find Element By Name
	public WebElement findElementByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}
	
	//Find Element By ClassName
	public WebElement findElementByClassName(String data) {
		WebElement element = driver.findElement(By.className(data));
		return element;
	}
	
	
	//Dropdown option Deselect Value
	public void dropDownDeSelectValue(WebElement element, String data) {
	Select select = new Select(element);
	select.deselectByValue(data);
	
	}
	
	//Dropdown option Index
			public void dropDownByIndex(WebElement element, int data) {
			Select select = new Select(element);
			select.selectByIndex(data);
			}
			
	//To get the attribute value
			public String getAttributeValue(WebElement element) {
			String data = element.getAttribute("value");
			return data;
			
			}
			
			
	//Dropdown option DeSelect Index
			public void dropDownByDeselectIndex(WebElement element, int data) {
			Select select = new Select(element);
			select.deselectByIndex(data);
			}
			
			
	//Get Dropdown All option
			public List<WebElement> getDropDownOptions(WebElement element) {
			Select select = new Select(element);	
			List<WebElement> options = select.getOptions();
			return options;
			}
			
	//Deselect All Dropdown
			public void deselectAllDropdown(WebElement element) {
			Select select = new Select(element);
			select.deselectAll();
			}
			
	
	//Get All Selected Option
			public List<WebElement> getDropDownAllOptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			return allSelectedOptions;
			}
				
	//Get first selected Options
			public WebElement getDropdownFirstSelectedOptions(WebElement element) {
			Select select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			return firstSelectedOption;
				
			}
			
			
	//Launch the Chrome Browser
			public void chromeBrowserLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			

			}
	
	//Enter the Url
			public void enterUrl(String data) {
			driver.get(data);
			
			}
			
	//Maximize the window
			public void maximize() {
			driver.manage().window().maximize();

			}
			
	//Insert the value in the text box
			public void sendKeys(WebElement element, String data) {
			element.sendKeys(data);

			}
			
			
	//Click Button
			public void clickButton(WebElement element) {
			element.click();
				

			}
			
	//Dropdown option by Text
			public void dropDownText (WebElement element,String data) {
			Select select = new Select(element);
			select.selectByVisibleText(data);
			}
			
	//Dropdown option by Value
			public void dropDownAttributeValue (WebElement element,String data) {
			Select select = new Select(element);
			select.selectByValue(data);
			}
			
			
	
			
			
	//ClickByJS
			public void clickByJs(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("return arguments[0].click()", element);
			

			}
			
			
	//PassingKeysByJS
			public void passingKeysByJs(WebElement element, String data) {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','"+ data +"')", element);
				

			}
			
	//Read value from excel and find out its a string number or date
			public String getData(String SheetName, int rownumber,int cellnumber) throws IOException {
				String data=null;
				File file = new File("C:\\Users\\Mohan\\eclipse-workspace\\Frameworksclass1\\Excel Folder\\Date to Sheet.xlsx");
				FileInputStream stream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(stream);
				Sheet sheet = workbook.getSheet(SheetName);
				Row row = sheet.getRow(rownumber);
				Cell cell = row.getCell(cellnumber);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					 data = cell.getStringCellValue();
				}
				if (cellType == 0) {									
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
						data = s.format(dateCellValue);
					}else {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						String.valueOf(l);
					}
					}			
				return data;
				}
			
			
		//Modify the value in excel
			public void changeData(String SheetName, int rownumber,int cellnumber, String data) throws IOException {
				
				File file = new File("C:\\Users\\Mohan\\eclipse-workspace\\Frameworksclass1\\Excel Folder\\Date to Sheet.xlsx");
				FileInputStream stream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(stream);
				Sheet sheet = workbook.getSheet(SheetName);
				Row row = sheet.createRow(10);
				Cell cell = row.createCell(0);
				cell.setCellValue(data);
				FileOutputStream out = new FileOutputStream(file);
				workbook.write(out);
				
			}
				

}
	



package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAdactin {
	
	WebDriver driver;
	Select select;
	
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
	}
		
	@Parameters({"username","password","location","hotel","roomtype","roomNos","checkin","checkout","adultsperroom","childperroom","first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
	@Test
	private void tc1(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17) throws InterruptedException {
			
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(s);
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s1);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement dDnLocation = driver.findElement(By.id("location"));
		select = new Select(dDnLocation);
		select.selectByVisibleText(s2);
		
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		select = new Select(dDnHotel);
		select.selectByVisibleText(s3);
		
		WebElement dDnRoomtype = driver.findElement(By.id("room_type"));
		select = new Select(dDnRoomtype);
		select.selectByVisibleText(s4);
		
		WebElement dDnNumberofRooms = driver.findElement(By.id("room_nos"));
		select = new Select(dDnNumberofRooms);
		select.selectByVisibleText(s5);
		
		WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
		txtCheckIn.sendKeys(s6);
		
		WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
		txtCheckOut.sendKeys(s7);
		
		WebElement dDnAdultPerRoom = driver.findElement(By.id("adult_room"));
		select = new Select(dDnAdultPerRoom);
		select.selectByVisibleText(s8);
		
		WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
		select = new Select(dDnChildPerRoom);
		select.selectByVisibleText(s9);
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(s10);
		
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(s11);
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(s12);
		
		WebElement txtCardno = driver.findElement(By.id("cc_num"));
		txtCardno.sendKeys(s13);
		
		WebElement dDnCardType = driver.findElement(By.id("cc_type"));
		select = new Select(dDnCardType);
		select.selectByVisibleText(s14);
		
		WebElement dDnExpMonth = driver.findElement(By.id("cc_exp_month"));
		select = new Select(dDnExpMonth);
		select.selectByVisibleText(s15);
		
		WebElement dDnExpYear = driver.findElement(By.id("cc_exp_year"));
		select = new Select(dDnExpYear);
		select.selectByVisibleText(s16);
		
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys(s17);
		
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
		
		Thread.sleep(5000);
		
		WebElement txtOrderID = driver.findElement(By.id("order_no"));
		String data = txtOrderID.getAttribute("value");
		System.out.println(data);
		
		}
	

		

	}



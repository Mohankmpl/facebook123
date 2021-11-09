package baseclass.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotelExcel {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Base ref = new Base();
		ref.chromeBrowserLaunch();
		ref.maximize();
		ref.enterUrl("http://adactinhotelapp.com/");
		String username = ref.getData("Datas", 0, 1);
		String password = ref.getData("Datas", 1, 1);
		
		WebElement txtUser = ref.findElementById("username");
		ref.sendKeys(txtUser, username);
		
		WebElement txtPass = ref.findElementById("password");
		ref.sendKeys(txtPass, password);
		
		WebElement btnLogin = ref.findElementById("login");
		ref.clickButton(btnLogin);
		
		String location = ref.getData("Datas", 3, 0);
		String hotel = ref.getData("Datas", 3, 1);
		String roomType = ref.getData("Datas", 3, 2);
		String numberOfRooms = ref.getData("Datas", 3, 3);
		String checkInDate = ref.getData("Datas", 3, 4);
		String checkOutDate = ref.getData("Datas", 3, 5);
		String adultsPerRoom = ref.getData("Datas", 3, 6);
		String childrensPerRoom = ref.getData("Datas", 3, 7);
		
		
		WebElement dDnLocation = ref.findElementById("location");
		ref.dropDownText(dDnLocation, location);
		WebElement dDnHotel = ref.findElementById("hotels");
		ref.dropDownText(dDnHotel, hotel);
		WebElement dDnRoomType = ref.findElementById("room_type");
		ref.dropDownText(dDnRoomType, roomType);
		WebElement dDnNumberOfRooms = ref.findElementById("room_nos");
		ref.dropDownText(dDnNumberOfRooms, numberOfRooms);
		WebElement txtCheckInDate = ref.findElementById("datepick_in");
		ref.sendKeys(txtCheckInDate, checkInDate);
		WebElement txtCheckOutDate = ref.findElementById("datepick_out");
		ref.sendKeys(txtCheckOutDate, checkOutDate);
		WebElement dDnAdultsPerRoom = ref.findElementById("adult_room");
		ref.dropDownText(dDnAdultsPerRoom, adultsPerRoom);
		WebElement dDnChildrensPerRoom = ref.findElementById("child_room");
		ref.dropDownText(dDnChildrensPerRoom, childrensPerRoom);
		
		WebElement btnSearch = ref.findElementById("Submit");
		ref.clickButton(btnSearch);
		
		WebElement radiobtnClick = ref.findElementById("radiobutton_0");
		ref.clickButton(radiobtnClick);
		WebElement btnContinue = ref.findElementById("continue");
		ref.clickButton(btnContinue);
		
		
		String firstName = ref.getData("Datas", 6, 0);
		String lastName = ref.getData("Datas", 6, 1);
		String billingAddress = ref.getData("Datas", 6, 2);
		String creditCardNumber= ref.getData("Datas", 6, 3);
		String creditCardType = ref.getData("Datas", 6, 4);
		String expiryMonth = ref.getData("Datas", 6, 5);
		String expiryYear = ref.getData("Datas", 6, 6);
		String cvvNumber = ref.getData("Datas", 6, 7);
		
		WebElement txtFirstName = ref.findElementById("first_name");
		ref.sendKeys(txtFirstName, firstName);
		WebElement txtLastName = ref.findElementById("last_name");
		ref.sendKeys(txtLastName, lastName);
		WebElement txtAddress = ref.findElementById("address");
		ref.sendKeys(txtAddress, billingAddress);
		WebElement txtCCnumber = ref.findElementById("cc_num");
		ref.sendKeys(txtCCnumber, creditCardNumber);
		WebElement dDnCreditCardType = ref.findElementById("cc_type");
		ref.dropDownText(dDnCreditCardType, creditCardType);
		WebElement dDnExpiryMonth = ref.findElementById("cc_exp_month");
		ref.dropDownText(dDnExpiryMonth, expiryMonth);
		
		WebElement dDnExpiryYear = ref.findElementById("cc_exp_year");
		ref.dropDownAttributeValue(dDnExpiryYear,expiryYear);
		
		WebElement txtCVVnumber = ref.findElementById("cc_cvv");
		ref.sendKeys(txtCVVnumber, cvvNumber);
		
		
		WebElement btnBookNow = ref.findElementById("book_now");
		ref.clickButton(btnBookNow);
		
		ref.threadSleep(20000);
		
		WebElement generateOrderId = ref.findElementById("order_no");
		String attributeValue = ref.getAttributeValue(generateOrderId);
		ref.changeData("Datas", 9, 0, attributeValue);
		
		
		
		
	}
	

}

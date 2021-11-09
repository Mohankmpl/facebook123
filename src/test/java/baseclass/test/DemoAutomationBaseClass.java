package baseclass.test;

import org.openqa.selenium.WebElement;

public class DemoAutomationBaseClass {

	public static void main(String[] args){

		Base ref = new Base();
		ref.chromeBrowserLaunch();
		ref.enterUrl("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = ref.findElementByXpath("//input[@placeholder='First Name']");
		ref.passKeys(txtFirstName, "Mohan");
		WebElement txtLastName = ref.findElementByXpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
		ref.passKeys(txtLastName, "Kumar");
		WebElement txtAddress = ref.findElementByXpath("//textarea[@ng-model='Adress']");
		ref.passKeys(txtAddress, "America");
		WebElement txtMail = ref.findElementByXpath("//input[@ng-model='EmailAdress']");
		ref.passKeys(txtMail, "mohankumarkmpl@gmail.com");
		WebElement txtPhoneNo = ref.findElementByXpath("//input[@ng-model='Phone']");
		ref.passKeys(txtPhoneNo, "8939330345");
		WebElement btnRadio = ref.findElementByXpath("//input[@value='Male']");
		ref.clickButton(btnRadio);
		WebElement btnCheck = ref.findElementByXpath("//input[@value='Cricket']");
		ref.clickButton(btnCheck);
		WebElement dDnSkills = ref.findElementByXpath("//select[@ng-model='Skill']");
		ref.dropDownText(dDnSkills, "Adobe InDesign");
		WebElement count = ref.findElementById("country");
		ref.dropDownText(count, "India");
		WebElement dDnYear = ref.findElementByXpath("//select[@placeholder='Year']");
		ref.dropDownText(dDnYear, "1994");
		WebElement dDnMonth = ref.findElementByXpath("//select[@placeholder='Month']");
		ref.dropDownText(dDnMonth, "January");
		WebElement dDnDay = ref.findElementById("daybox");
		ref.dropDownText(dDnDay, "28");
		WebElement txtPass = ref.findElementById("firstpassword");
		ref.passKeys(txtPass, "Mohan");
		WebElement txtPassTwo = ref.findElementById("secondpassword");
		ref.passKeys(txtPassTwo, "Mohan");
		WebElement dDnLanguage = ref.findElementById("msdd");
		ref.clickByJs(dDnLanguage);
		WebElement btnLang = ref.findElementByXpath("//a[text()='Dutch']");
		ref.clickByJs(btnLang);
		
		
		

	}

}

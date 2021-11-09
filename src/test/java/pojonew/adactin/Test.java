package pojonew.adactin;

import org.openqa.selenium.WebElement;

public class Test extends BaseClassPojo{
	
public static void main(String[] args) {
	
	Test ts = new Test();
	ts.chromeBrowserLaunch();
	ts.enterUrl("https://adactinhotelapp.com/");
	
	PojoLogin p = new PojoLogin();
	WebElement txtusername = p.getUsername();
	txtusername.sendKeys("Mohan3011");
	WebElement txtPass = p.getPassword();
	txtPass.sendKeys("Mohan3011");
	WebElement btnLogin = p.getLogin();
	btnLogin.click();
}
		
		
}
		

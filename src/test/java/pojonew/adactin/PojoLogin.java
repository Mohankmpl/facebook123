package pojonew.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pojo.com.BaseClassPojo;


	public class PojoLogin extends BaseClassPojo {
		
		public PojoLogin() {
			PageFactory.initElements(driver, this);
		}
		
		private WebElement username;
		
		private WebElement password;
		
		private WebElement login;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
		
		
		
	}


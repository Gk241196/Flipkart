package basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.LoginTest;

public class Loginpage {

	    @FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	    private  WebElement emailInput;

	    @FindBy(xpath = "//input[@type='password']")
	    private WebElement passwordInput;

	    @FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	    private  WebElement loginButton;

	    public Loginpage(WebDriver driver) {
	 
	        PageFactory.initElements(driver, LoginTest.class);
	    }

		public void enterEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public  void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public  void clickLogin() {
	        loginButton.click();
	    }
	}




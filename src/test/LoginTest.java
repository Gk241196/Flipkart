package test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basepage.Loginpage;
	public class LoginTest{
		 private WebDriver driver;
		    private Properties properties;
		    public void setUp() throws IOException {
		        // Load the configuration properties
		        properties = new Properties();
		        FileInputStream configFile = new FileInputStream("src/Config.properties");
		        properties.load(configFile); 
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get(properties.getProperty("url"));
		    }
		    @Test
		    public void loginTest() {
		  
		  	   PageFactory.initElements(driver, Loginpage.class);
		  	    pages.Loginpage loginpage=new pages.Loginpage(driver);
				loginpage2.enterEmail(properties.getProperty("email"));
                loginpage2.enterPassword(properties.getProperty("password"));
		        //loginpage2.clickLogin();


		    }
	    
	}


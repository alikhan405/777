package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.LoginPage;

public class testtest {
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\eclipse-workspace1\\practicalexam2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	
		//got to website
	driver.get("http://techfios.com/test/101/");
	//call login method from LoginPage

	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

	loginpage.ClickOnAddaCategoryButton("BMW 7 Series");
	Thread.sleep(5000);

	// Validate a user is not able to add duplicate category

	Assert.assertTrue(loginpage.isWarningMessageDisplayed(), "Warning Message is not Displayed");
	Thread.sleep(5000);


	//Validate the month drop down

	loginpage.clickOnBackButton();
	Thread.sleep(500);
	loginpage.selectMonthDropDown();
	Thread.sleep(500);
	loginpage.isMonthDropDownHasMonthsDisplayed();
	Thread.sleep(500);
	Assert.assertTrue(loginpage.isMonthDropDownHasMonthsDisplayed(), "Months in the drop down box do not match");


	}













	}
	
	
	
	
	


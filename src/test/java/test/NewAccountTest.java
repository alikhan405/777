package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class NewAccountTest {
WebDriver driver;

// Every Page must have a constructor to invite the driver
public NewAccountTest(WebDriver driver) {
	this.driver = driver;
}

@BeforeMethod
public void launcBrowser() {
	driver = BrowserFactory.startBrowser();	
	
}

@Test
public void validUsersShouldBeAbleToAddaCategory() throws InterruptedException
{
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
loginpage.selectMonthDropDown();
loginpage.isMonthDropDownHasMonthsDisplayed();
Assert.assertTrue(loginpage.isMonthDropDownHasMonthsDisplayed(), "Months in the drop down box do not match");


}













}


	
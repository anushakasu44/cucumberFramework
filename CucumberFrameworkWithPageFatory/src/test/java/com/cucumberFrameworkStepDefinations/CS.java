package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberFrameworkPages.ColdStorage;
import com.cucumberFrameworkPages.LoginPage;

import Utilities.ReadPropertiesAndBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CS extends ReadPropertiesAndBrowser {

	public CS() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;
	

	@Given("^user launch browser$")
	public void user_launch_browser() throws Throwable {
	
    ReadPropertiesAndBrowser prop=new ReadPropertiesAndBrowser();
   this.driver= prop.openBrowser();
	}
	
	@Given("^user enters username and password and clicks on login button$")
	public void user_enters_username_and_password_and_clicks_on_login_button() throws Throwable {

    LoginPage lp1=new LoginPage(this.driver);
    lp1.enterusername("cs");
    lp1.enterPassword("Password@123");
    lp1.clickonsubmit();
}

@When("^user clicks on farmingorders viewdetails$")
public void user_clicks_on_farmingorders_viewdetails() throws Throwable {
	ColdStorage cs1=new ColdStorage(this.driver);
	cs1.clickOnFarmingOrders();
}

@When("^user  clicks on PCorders viewdetails$")
public void user_clicks_on_PCorders_viewdetails() throws Throwable {
   
	ColdStorage cs1=new ColdStorage(this.driver);
	cs1.clickOnPCOrders();
}

@When("^user  clicks on CAS Stock viewdetails$")
public void user_clicks_on_CAS_Stock_viewdetails() throws Throwable {
	ColdStorage cs1=new ColdStorage(this.driver);
  cs1.clickOnCS_CASStock();
}

@When("^user logout from the site$")
public void user_logout_from_the_site() throws Throwable {
	ColdStorage cs1=new ColdStorage(this.driver);
    cs1.clickOnuserimg();
    driver.quit();
}
}

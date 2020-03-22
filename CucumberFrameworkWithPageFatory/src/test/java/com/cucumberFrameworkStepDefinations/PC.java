package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberFrameworkPages.ProcessingCenter;

import cucumber.api.java.en.When;

public class PC {

	WebDriver driver;
	

	

@When("^user clicks on CSCSorders viewdetails$")
public void user_clicks_on_CSCSorders_viewdetails() throws Throwable {
	ProcessingCenter pce=new ProcessingCenter(this.driver);
	pce.clickOnCSCSOrders();
}

@When("^user  clicks on DCorders viewdetails$")
public void user_clicks_on_DCorders_viewdetails() throws Throwable {
	ProcessingCenter pce=new ProcessingCenter(this.driver);
    pce.clickOnDCOrders();
}

@When("^user  clicks on CACASStock viewdetails$")
public void user_clicks_on_CACASStock_viewdetails() throws Throwable {
	ProcessingCenter pce=new ProcessingCenter(this.driver);
    pce.clickOnCSCASStock();
}


}

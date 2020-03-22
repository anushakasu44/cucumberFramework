package com.cucumberFrameworkStepDefinations;

import org.openqa.selenium.WebDriver;

import com.cucumberFrameworkPages.DistributionCenter;
import com.cucumberFrameworkPages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DC {
WebDriver driver;

	

//@And("^user enters the username and the password and clicks on login button$")
//public void user_enters_the_username_and_the_password_and_clicks_on_login_button() throws Throwable {
// 
//	LoginPage lp2=new LoginPage(this.driver);
//lp2.enterusername("dist1");
//lp2.enterPassword("Password@123");
//lp2.clickonsubmit();
//}


	@When("^user clicks on PCorders viewdetails$")
	public void user_clicks_on_PCorders_viewdetails() throws Throwable {
		DistributionCenter dcs=new DistributionCenter(this.driver);
		dcs.clickOnPcOrders();
	    
	}

	@When("^user  clicks on Buyerorders viewdetails$")
	public void user_clicks_on_Buyerorders_viewdetails() throws Throwable {
		DistributionCenter dcs=new DistributionCenter(this.driver);
		dcs.clickOnBuyerOrders();
	}

	@When("^user  clicks on DStock viewdetails$")
	public void user_clicks_on_DStock_viewdetails() throws Throwable {
		DistributionCenter dcs=new DistributionCenter(this.driver);
		dcs.clickOnDStock();
	}


}

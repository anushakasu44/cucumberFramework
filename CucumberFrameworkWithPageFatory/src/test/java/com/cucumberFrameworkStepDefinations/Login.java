package com.cucumberFrameworkStepDefinations;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberFrameworkPages.LoginPage;

import Utilities.ReadPropertiesAndBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login extends ReadPropertiesAndBrowser{

	

	public Login() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChromeDriver driver;
	LoginPage page;
	ReadPropertiesAndBrowser brow=new ReadPropertiesAndBrowser();
	
@Given("^user navigates to browser$")
public void user_navigates_to_browser() throws Throwable {
	driver=brow.openBrowser();
	
}

@When("^user enters \"(.*?)\" and \"(.*?)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	 page=new LoginPage(driver);
	page.enterusername(username);
	page.enterPassword(password);	
}

@When("^user clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
   page.clickonsubmit();
}

@Then("^user can able to login sucessfully$")
public void user_can_able_to_login_sucessfully() throws Throwable {
    System.out.println("logged in sucessfully");
}

@Then("^\"(.*?)\" can able to login sucessfully$")
public void can_able_to_login_sucessfully(String user) throws Throwable {
    //Assert.assertTrue(driver.getCurrentUrl().contains(user));
	System.out.println(user);
}
//@When("^user enters pc1 and Password(\\d+)g@(\\d+)$")
//public void user_enters_JohnSmith_and_Greenfr_g(int arg1, int arg2) throws Throwable {
//	page=new LoginPage(driver);
//	page.enterusername("JohnSmith");
//	page.enterPassword("Greenfr0g@123");
//	Thread.sleep(3000);
//	page.takeScreenshot("orangeHRM");
//}


}

package com.cucumberFrameworkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessingCenter {
WebDriver driver;
	
	@FindBy(xpath="//span[text()='View Details'][1]")
	WebElement pendingCSCSOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[2]")
	WebElement pendingDCOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[3]")
	WebElement CSCASStock;
	
	@FindBy(xpath="//div[@class='header-user-info-icon']")
	WebElement userimg;
	
	public ProcessingCenter(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnCSCSOrders() {
		pendingCSCSOrders.click();
	}
   public void clickOnDCOrders() {
	   pendingDCOrders.click();
		
	}
   public void clickOnCSCASStock() {
	   CSCASStock.click();
}
	
   public void clickOnuserimg() {
	   userimg.click();
	   driver.findElement(By.xpath("//span[text()='Logout']")).click();
   }
}



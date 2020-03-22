package com.cucumberFrameworkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistributionCenter {
WebDriver driver;
	
	@FindBy(xpath="//span[text()='View Details'][1]")
	WebElement pendingPcOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[2]")
	WebElement pendingBuyerOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[3]")
	WebElement DStock;
	
	@FindBy(xpath="//div[@class='header-user-info-icon']")
	WebElement userimg;
	
	 public DistributionCenter(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnPcOrders() {
		pendingPcOrders.click();
	}
   public void clickOnBuyerOrders() {
	   pendingBuyerOrders.click();
		
	}
   public void clickOnDStock() {
	   DStock.click();
}
	
   public void clickOnuserimg() {
	   userimg.click();
	   driver.findElement(By.xpath("//span[text()='Logout']")).click();
   }
}




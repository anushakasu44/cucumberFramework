package com.cucumberFrameworkPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColdStorage {
WebDriver driver;
	
	
	@FindBy(xpath="//span[text()='View Details'][1]")
	WebElement pendingFarmingOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[2]")
	WebElement pendingPCOrders;
	
	@FindBy(xpath="(//span[text()='View Details'])[3]")
	WebElement CS_CASStock;
	
	@FindBy(xpath="//div[@class='header-user-info-icon']")
	WebElement userimg;
	
	public ColdStorage(WebDriver driver2){
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnFarmingOrders() throws InterruptedException {
		pendingFarmingOrders.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
   public void clickOnPCOrders() throws InterruptedException {
	   pendingPCOrders.click();
	   Thread.sleep(3000);
	   driver.navigate().back();
	  
	}
   public void clickOnCS_CASStock() throws InterruptedException {
	   CS_CASStock.click();
	   Thread.sleep(3000);
	   driver.navigate().back();
	  
}
	
   public void clickOnuserimg() throws InterruptedException {
	   userimg.click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='Logout']")).click();
   }
}

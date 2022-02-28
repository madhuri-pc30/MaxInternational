package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxLandingPage {
 WebDriver driver;
  public MaxLandingPage(WebDriver ldriver) {
	  driver=ldriver;
	  PageFactory.initElements(ldriver, this);
  }
  
  
   @FindBy(xpath="//button[@id='en']")
   WebElement Language;
   
   @FindBy(xpath= "//*[text()='United States']")
   WebElement Country;
   
   @FindBy(xpath="//a[contains(text(),'Why')]")
   WebElement WhyMax;
   
   @FindBy(xpath="//a[contains(text(),'Products')]")
   WebElement Products;
   
   
   @FindBy(xpath="//a[contains(text(),'Shop')]")
   WebElement Shop;
   
   @FindBy(xpath="//a[contains(text(),'JOIN')]")
   WebElement Join;
    
   
   
   public void Language() {
	   Language.click();
	  
   }
  public void Country() throws InterruptedException {
	  Thread.sleep(3000); 
	  Country.click();
   }
  public void validateTitle() {
	  String expectedUrl="Max International - Home";
	  String actualURL = driver.getTitle();
	 Assert.assertEquals(actualURL, expectedUrl);
  }
  
  
	public void verifyMenuLinks() {
		Assert.assertTrue(WhyMax.isDisplayed());
		
		
		}
	
	
	public void verifyProductsLinks() {
		Assert.assertTrue(Products.isDisplayed());
		
	}
	

	public void verifyShopLinks() {
		Assert.assertTrue(Shop.isDisplayed());
	}
	
	public void verifyJoinLinks() {
		Assert.assertTrue(Join.isDisplayed());
	}
    
	public void contactUs() {
		
	}
	  }
	
	
	
	
	

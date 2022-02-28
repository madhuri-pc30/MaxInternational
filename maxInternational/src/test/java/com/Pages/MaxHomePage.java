package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaxHomePage {
	 WebDriver driver;
	 public MaxHomePage(WebDriver ldriver) {
		  driver=ldriver;
		  PageFactory.initElements(ldriver, this);
	  }
		  
		  
   @FindBy(xpath="//a[@class='text-white head-login reloader-alert']")
   WebElement memberlogin;
   
   @FindBy(xpath="//input[@id='myusername']")
   WebElement username;
   
   @FindBy(xpath="//input[@id='mypassword']")
   WebElement password;
   
   @FindBy(xpath="//button[@id='submit']")
   WebElement login;
   
	
public void memberLogin() {
	memberlogin.click();
	
}

public void usernameLogin()  {
	  username.sendKeys("newautoship967");
	 
	  }


public void passwordLogin() throws InterruptedException {
	  password.sendKeys("Pass123@");
     Thread.sleep(3000); 
 }

public void loginpage() throws InterruptedException {
    login.click();
    
}
}

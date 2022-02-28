package com.TestCases;

import com.BaseClass.LibraryClass;
import com.Pages.MaxHomePage;
import com.Pages.MaxLandingPage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

// This class is to run all landing page tests cases

public class MaxLandingTestCase extends LibraryClass {
	

	MaxLandingPage maxlanding =null;
	MaxHomePage maxhome =null;

	
	@BeforeSuite
	public  void intialize() throws IOException {
	 	LaunchApplication();
		 maxlanding =new MaxLandingPage(driver);
		 maxhome =new MaxHomePage(driver);

	
	}
	
	
	
	@BeforeTest
	public void start() throws IOException {
	//LaunchApplication();
	}
	
	
	@Test 
	public void Landing_Page() throws InterruptedException {
		////MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.Language();
		maxlanding.Country();
    
	}
	
	@Test
	public void getTitle() {
		////MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.validateTitle();
	}
	 
	@Test (dependsOnMethods = {"Landing_Page"},groups = {"verifylandinglinks"})
	public void verifyWhyMaxPageLinks() {
		//MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.verifyMenuLinks();
	}
	
	
	@Test (dependsOnMethods = {"Landing_Page"},groups = {"verifylandinglinks"})
	public void verifyProductsPageLinks() {
		//MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.verifyProductsLinks();
	}
		
		

	@Test (dependsOnMethods = {"Landing_Page"},groups = {"verifylandinglinks"})
	public void verifyShopPageLinks() {
		//MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.verifyShopLinks();
	}	
		
		
		

	@Test (dependsOnMethods = {"Landing_Page"},groups = {"verifylandinglinks"})
	public void verifyJoinPageLinks() {
		//MaxLandingPage maxlanding =new MaxLandingPage(driver);
		maxlanding.verifyJoinLinks();
	}	
		
	
	@Test (dependsOnGroups = {"verifylandinglinks"})
	public void clickMemberLogin() throws InterruptedException {
		//MaxHomePage maxhome =new MaxHomePage(driver);
		maxhome.memberLogin();
	}
	
		
	@Test (dependsOnMethods = {"clickMemberLogin"})
	public void usernameOfAccount() throws InterruptedException {
		//MaxHomePage maxhome =new MaxHomePage(driver);
		maxhome.usernameLogin();
	
	
	}

	@Test (dependsOnMethods = {"usernameOfAccount"})
	public void passwordOfAccount() throws InterruptedException {
		//MaxHomePage maxhome =new MaxHomePage(driver);
		maxhome.passwordLogin();
	
	}
	

	@Test (dependsOnMethods = {"passwordOfAccount"})
	public void loginToAccount() throws InterruptedException {
		//MaxHomePage maxhome =new MaxHomePage(driver);
		maxhome.loginpage();
	}
	
	
	
	
	
	
	
	
	
	
}
	
	


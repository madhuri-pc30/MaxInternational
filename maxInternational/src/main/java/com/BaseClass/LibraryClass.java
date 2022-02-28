package com.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;

public class LibraryClass {
	public static WebDriver driver;
	public static Properties prop;
 
	public void LaunchApplication() throws IOException {
		FileInputStream file= new FileInputStream("D:\\Users\\madhuprash\\eclipse-workspace\\maxInternational\\src\\test\\resources\\configeProperties\\config.properties");
		prop=new Properties();
		prop.load(file);
		
		
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",prop.getProperty("chromepath"));
			 driver= new ChromeDriver();
			 
		 }
		 else {
			 System.out.println("driver not found");
		 }
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.navigate().to(prop.getProperty("url"));
	}
	public void Teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	

}

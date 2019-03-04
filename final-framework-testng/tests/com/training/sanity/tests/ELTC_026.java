package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ELTC_026_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_026 {

	private WebDriver driver;
	private String baseUrl;
	private ELTC_026_POM ELTC_026_Admin;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		ELTC_026_Admin = new ELTC_026_POM(driver); 
		baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void CreateClass() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		ELTC_026_Admin.classesLink();
		ELTC_026_Admin.addClasses();
		ELTC_026_Admin.addClassName("demo");
		ELTC_026_Admin.addClassdesc("demo");
		ELTC_026_Admin.clickGrpPermissionDropDown();
		ELTC_026_Admin.grpPermission();
		Thread.sleep(3000);
		ELTC_026_Admin.clickaddBtn();
		Thread.sleep(3000);
		ELTC_026_Admin.assertCheck();
		
}
}
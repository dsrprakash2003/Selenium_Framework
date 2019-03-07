package com.training.sanity.tests;

import java.awt.Component;
import java.awt.List;
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

import com.training.pom.ELTC_026_POM;
import com.training.pom.SessionCategoriesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_056 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SessionCategoriesPOM eltc_056;
	
	
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
		eltc_056 = new SessionCategoriesPOM(driver);
		baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
	@Test	
	public void SessionCategories() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		String title;
		Assert.assertEquals(title = "Administration", title);
		//screenShot.captureScreenShot("First");
		eltc_056.clickSessionCategoryList();
		eltc_056.clickTrainingSessionList();
		eltc_056.clickSubsribeusersSession();
		eltc_056.addaddusersession("sunil");
		eltc_056.clickuserlink();
		eltc_056.addbtn();
		System.out.println("Clicked subscribed user to session");
		eltc_056.sessionlistlink();
		System.out.println("Clicked session list link");
		eltc_056.addcoursessession();
		eltc_056.addcourselist();
		eltc_056.addcoursebtn();
		eltc_056.addsuccessbtn();
		
	}    
	
}
	
	
		


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
import com.training.pom.CareerAndPromotionsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_057 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SessionCategoriesPOM eltc_056;
	private CareerAndPromotionsPOM eltc_057;
	
	
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
		eltc_057 = new CareerAndPromotionsPOM(driver);
		eltc_056= new SessionCategoriesPOM(driver);
		baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
	@Test	
	public void careerandpromotion() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		eltc_057.careersandpromotions();
		eltc_057.addcareers();
		eltc_057.addicon();
	    eltc_057.txbox("QA");
		eltc_057.addcarrercourse();
		eltc_057.careerandpromotionslink();
		eltc_057.promotionicon();
		eltc_057.addpromotionicon();
		eltc_057.txtboxpromotionname("QA for Testers");
		eltc_057.submitpromotion();
		eltc_057.addtrainingsessionicon();
		eltc_057.addtrainingsessionname("selenium training session8");
		eltc_057.submitbtntraining();
		eltc_057.selectcoursename();
		eltc_057.courselist();
		eltc_057.addcoursebtn();
		eltc_056.addaddusersession("sunil");
		eltc_056.clickuserlink();
		eltc_057.finalsessionbtn();
	}    
	
}
	
	
		


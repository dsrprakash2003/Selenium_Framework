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
import com.training.pom.CourseAndSessionPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_058 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SessionCategoriesPOM eltc_056;
	private CareerAndPromotionsPOM eltc_057;
	private CourseAndSessionPOM eltc_058;
	
	
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
		eltc_058= new CourseAndSessionPOM(driver);
		baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
	@Test	
	public void CourseTitleAdd() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		eltc_058.createcourselink();
		eltc_058.titlenametxtbox("testing");
		eltc_058.credentialtxtbox("tes");
		eltc_058.clickteachers();
		eltc_058.selectcredentialsteacher();
		eltc_058.clickcategory();
		eltc_058.selectcategorycredentials();
		eltc_058.clicklanguage();
		eltc_058.selectlanguagecredentials();
		eltc_058.coursebtn();
		ELTC_026_Admin.clickadmintab();
		eltc_058.addtrainingsessionlink();
		eltc_058.addtrainingsession("selenium training session9");
		eltc_057.submitbtntraining();
		eltc_057.selectcoursename();
		eltc_057.courselist();
		eltc_057.addcoursebtn();
		eltc_056.addaddusersession("sunil");
		eltc_056.clickuserlink();
		eltc_057.finalsessionbtn();
		
		
	}    
	
}
	
	
		


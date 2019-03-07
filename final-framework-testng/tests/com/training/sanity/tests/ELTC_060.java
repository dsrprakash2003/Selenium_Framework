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
import com.training.pom.RegisterUserToClassPOM;
import com.training.pom.SessionCategoriesPOM;
import com.training.pom.SubscribeClassCourse_POM;
import com.training.pom.SubscribeUsersPOM;
import com.training.pom.CareerAndPromotionsPOM;
import com.training.pom.CourseAndSessionPOM;
import com.training.pom.CourseAndSubscribUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.RegisterUserToClassPOM;


public class ELTC_060 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SessionCategoriesPOM eltc_056;
	private CareerAndPromotionsPOM eltc_057;
	private CourseAndSessionPOM eltc_058;
	private SubscribeUsersPOM eltc_027_subscribe;
	private SubscribeClassCourse_POM eltc_028_subscribeCourse;
	private CourseAndSubscribUsersPOM eltc_059;
	private RegisterUserToClassPOM eltc_060;
	
	
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
		eltc_027_subscribe = new SubscribeUsersPOM(driver);
		eltc_028_subscribeCourse = new SubscribeClassCourse_POM(driver);
		eltc_059 = new CourseAndSubscribUsersPOM(driver);
		eltc_060 = new RegisterUserToClassPOM(driver);
		baseUrl = properties.getProperty("baseURL");
			//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	
	
	@Test	
	public void CourseAddedtoSession() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		eltc_060.clickadduserlink();
		eltc_060.sendFirstName("Prakash10");
		eltc_060.sendLastName("Ramesh10");
		eltc_060.sendEmail("dsrprakash2003@yahoo.co.in");
		eltc_060.sendPhone("2222222222");
		eltc_060.sendUserName1("dsrprakash7009");
		eltc_060.clickPasswordRadio();
		eltc_060.sendPassword1("welcome");
		eltc_060.clickProfile();
		eltc_060.clickSubmit();
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
		eltc_027_subscribe.clicksubscribeUsers();
		eltc_060.clickselectuserOption();
		eltc_060.clickaddusersbtn();
		eltc_060.clickadduserstoclassbtn();
		eltc_028_subscribeCourse.clicksubscribeCourses();
		eltc_028_subscribeCourse.selectkcourseName();
		eltc_028_subscribeCourse.addCoursetowindow();
		eltc_028_subscribeCourse.clickaddCoursetoclass();
		
		
	}    
	
}
	
	
		


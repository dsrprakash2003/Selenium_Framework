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
import com.training.pom.SubscribeClassCourse_POM;
import com.training.pom.SubscribeUsersPOM;
import com.training.pom.CareerAndPromotionsPOM;
import com.training.pom.CourseAndSessionPOM;
import com.training.pom.CourseAndSubscribUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_059 {

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
		eltc_058.createcourselink();
		eltc_059.titlenametxtbox("testing1");
		eltc_059.credentialtxtbox("JYT");
		eltc_058.clickteachers();
		eltc_058.selectcredentialsteacher();
		eltc_058.clickcategory();
		eltc_058.selectcategorycredentials();
		eltc_058.clicklanguage();
		eltc_058.selectlanguagecredentials();
		eltc_058.coursebtn();
		ELTC_026_Admin.clickadmintab();
		ELTC_026_Admin.classesLink();
		ELTC_026_Admin.addClasses();
		ELTC_026_Admin.addClassName("demo");
		ELTC_026_Admin.addClassdesc("demo");
		ELTC_026_Admin.clickGrpPermissionDropDown();
		ELTC_026_Admin.grpPermission();
		ELTC_026_Admin.clickaddBtn();
		eltc_027_subscribe.clicksubscribeUsers();
		eltc_027_subscribe.clickusergrp();
		eltc_027_subscribe.addusers();
		eltc_027_subscribe.clicksubscribeuserstoclass();
		eltc_028_subscribeCourse.clicksubscribeCourses();
		eltc_028_subscribeCourse.selectkcourseName();
		eltc_028_subscribeCourse.addCoursetowindow();
		eltc_028_subscribeCourse.clickaddCoursetoclass();
		
		
		
	}    
	
}
	
	
		


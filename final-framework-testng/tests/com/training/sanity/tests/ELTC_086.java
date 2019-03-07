package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.CareerAndPromotionsPOM;
import com.training.pom.CourseAndSessionPOM;
import com.training.pom.CourseAndSubscribUsersPOM;
import com.training.pom.ELTC_026_POM;
import com.training.pom.RegisterUserToClassPOM;
import com.training.pom.SessionCategoriesPOM;
import com.training.pom.SubscribeClassCourse_POM;
import com.training.pom.SubscribeUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.TeacherStudentAdminReportPOM;

public class ELTC_086 {
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
	private TeacherStudentAdminReportPOM eltc_086;
	
	
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
		eltc_086 = new com.training.pom.TeacherStudentAdminReportPOM(driver);
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
		eltc_086.mycouresmenu();
		eltc_086.createcourselink();
		eltc_086.title("SeleniumPraksahTest192");
		eltc_086.settingsbtn();
		eltc_086.categorydropdown();
		eltc_086.selectcategory();
		eltc_086.coursecode("SVU");
		eltc_086.languagedropdown();
		eltc_086.selectlanguagedropdown();
		eltc_086.createcoursebtn();
		eltc_086.addintroicon();
		eltc_086.FrameDesc();
		eltc_086.sendAddFrameDescText("test2");
		eltc_086.FrameDesce2out();
		eltc_086.saveintrotext();
		eltc_086.coursedescicon();
		eltc_086.descicon();
		eltc_086.titletextbox("test2");
		eltc_086.FrameDesc1();
		eltc_086.sendAddFrameDescText1("test2");
		eltc_086.FrameDesce2out1();
		eltc_086.savebtncourse();		
		
		
}
}

package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.DeleteClassPOM;
import com.training.pom.ELTC_026_POM;
import com.training.pom.SubscribeUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.SubscribeUsersPOM;
import com.training.pom.SubscribeClassCourse_POM;
import com.training.pom.DeleteClassPOM;
import com.training.pom.LogOutPOM;

public class ELTC_030 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SubscribeUsersPOM eltc_027_subscribe;
	private SubscribeClassCourse_POM eltc_028_subscribeCourse;
	private DeleteClassPOM eltc_029_deleteClass;
	private LogOutPOM eltc_030_logOutAdmin;
	
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
		eltc_027_subscribe = new SubscribeUsersPOM(driver);
		eltc_028_subscribeCourse = new SubscribeClassCourse_POM(driver);
		eltc_030_logOutAdmin = new LogOutPOM (driver);
		eltc_029_deleteClass = new DeleteClassPOM(driver);
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
	public void LogOutAdmin() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		eltc_030_logOutAdmin.ClickLogOutAdmin();
		eltc_030_logOutAdmin.ClickLogOut();
		WebElement msg=driver.findElement(By.id("formLogin_submitAuth"));
		String text=msg.getText();
		String expectedText = "Login";
		Assert.assertEquals(text,expectedText);
		
		
		
	}
		
}
/**
 * The objective of this test whether application gives error message for inValid Credentials by fetching data from excel
 */

package com.training.sanity.tests;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.CareerAndPromotionsPOM;
import com.training.pom.StudentRegistrationPagePOM;
import com.training.pom.TeacherStudentAdminReportPOM;
import com.training.readexcel.ReadExcel;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_088 {
	private WebDriver driver;
	private String baseUrl;
	private StudentRegistrationPagePOM eltc_087;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		eltc_087 = new StudentRegistrationPagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(dataProvider = "testcase88", dataProviderClass = LoginDataProviders.class)
	public void SignUpExcelTest(String firstName, String lastName, String email, String userName, String password, String confirmpassword, String phone, String lang) throws InterruptedException {
		eltc_087.clickSignUp();
		eltc_087.firstname(firstName);
		eltc_087.lastname(lastName);
		eltc_087.email(email);
		eltc_087.SenduserName(userName);
		eltc_087.Sendpassword(password);
		eltc_087.Confirmpassword(confirmpassword);
		eltc_087.phone(phone);
		eltc_087.SelectLanguageFromDD(lang);
		eltc_087.ProfileRadioButton();
		boolean Expected = true;
		boolean Actual = eltc_087.StudentRadioButtonIsSelected();
		Assert.assertEquals(Expected, Actual);
		System.out.println("The Student Profile is Selected " + Expected + " " + Actual);
		eltc_087.ClickRegistrationButton();
		 boolean ExpMsg = true;
		boolean ActMsg = eltc_087.GetSuccessMessage();
		Assert.assertEquals(ExpMsg, ActMsg);
		System.out.println("The Success Message is Displayed " + ExpMsg + " " + ActMsg);
		Thread.sleep(3000);
		//driver.navigate().back();
		driver.get(baseUrl);
		Thread.sleep(3000);
		
		}
		
		

	}
	


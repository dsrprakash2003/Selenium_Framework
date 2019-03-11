/**
 * The objective of this test is to login as a teacher and create a test for the students and generate  report for the same
 */
package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.MultipleUsersRegisterAsStudentPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class ELTC_090 {
	
	private WebDriver driver;
	private String baseUrl;
	private MultipleUsersRegisterAsStudentPOM MultipleUsersRegisterAsStudentPOM;
	private ScreenShot screenShot;
	private static Properties properties;
	
	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		MultipleUsersRegisterAsStudentPOM = new MultipleUsersRegisterAsStudentPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
	
	
	
		
	@Test
	public void MultipleUserTest() throws InterruptedException
	{
		MultipleUsersRegisterAsStudentPOM.SendUserName("prakash123");
		MultipleUsersRegisterAsStudentPOM.SendPassword("welcome");
		MultipleUsersRegisterAsStudentPOM.ClickLoginBtn();
		MultipleUsersRegisterAsStudentPOM.ClickCourseLink();
		MultipleUsersRegisterAsStudentPOM.ClickTestIcon();
		MultipleUsersRegisterAsStudentPOM.ClickCreateTestButton();
		MultipleUsersRegisterAsStudentPOM.EnterTestNameTextbox("test136");
		MultipleUsersRegisterAsStudentPOM.ClickAdvancedSettingsButton();
		
		//To verify if fields are displayed after clicking on Advanced Settings button
		String ExpLabel1 = "Give a context to the test";
		String ActLabel1 = MultipleUsersRegisterAsStudentPOM.GetLabel1Text();
		Assert.assertEquals(ExpLabel1, ActLabel1);
		System.out.println("The Label1 is " + ExpLabel1  +  " " +   ActLabel1);
		
		String ExpLabel2 = "Show score to learner";
		String ActLabel2 = MultipleUsersRegisterAsStudentPOM.GetLabel2Text();
		Assert.assertEquals(ExpLabel2, ActLabel2);
		System.out.println("The Label2 is " + ExpLabel2  +  " " +   ActLabel2);
		
		String ExpLabel3 = "Pass percentage";
		String ActLabel3 = MultipleUsersRegisterAsStudentPOM.GetLabel3Text();
		Assert.assertEquals(ExpLabel3, ActLabel3);
		System.out.println("The Label3 is " + ExpLabel3  +  " " +   ActLabel3);		
		
		//To Verify if At end of test is selected in Feedback section
		boolean Expfeedback = true;
		boolean Actfeedback = MultipleUsersRegisterAsStudentPOM.FeedbackRadioButtonIsSelected();
		Assert.assertEquals(Expfeedback, Actfeedback);
		System.out.println("At End of Test Radio button is Selected " + Expfeedback + " "  + Actfeedback);
		
		//To Click on Start Time Check box and verify if Start time is displayed 
		boolean ExpStTime = false;
		boolean ActStTime = MultipleUsersRegisterAsStudentPOM.StartTimeIsDisplayed();
		Assert.assertEquals(ExpStTime, ActStTime);
		System.out.println("At End of Test Radio button is Selected " + ExpStTime + " "  + ActStTime);
						
		//To Input the pass percentage value
		MultipleUsersRegisterAsStudentPOM.EnterPassPercentageTextbox("50");
		
		MultipleUsersRegisterAsStudentPOM.ClickProceedQuestions();
		
		//To verify if ExerciseAdded Msg is displayed
		String ExpMsg = "Exercise added";
		String ActMsg = MultipleUsersRegisterAsStudentPOM.GetSuccessMsg();
		Assert.assertEquals(ExpMsg, ActMsg);
		System.out.println("The Message displayed is " + ExpMsg + " " + ActMsg);
		
		//To Enter the First question of the Quiz
		MultipleUsersRegisterAsStudentPOM.ClickMutipleChoiceQuestions();
		MultipleUsersRegisterAsStudentPOM.EnterQuestionTextbox("Test");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterFirstOption("test1");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterSecondOption("test2");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterThirdOption("test3");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterFourthOption("test4");
		
		//To verify if First Option is selected 
		boolean Expfirstoption = true;
		boolean Actfirstoption = MultipleUsersRegisterAsStudentPOM.FistOptionIsSelected();
		Assert.assertEquals(Expfirstoption, Actfirstoption);
		System.out.println("The First Option Radio button is Selected " + Expfirstoption + " "  + Actfirstoption);
		
		MultipleUsersRegisterAsStudentPOM.ClickSubmitQuestionButton();
		
		//To verify if Success Msg is displayed 
		boolean Expalertmsg = true;
		boolean Actalertmsg = MultipleUsersRegisterAsStudentPOM.AlertMessageIsDisplayed();
		Assert.assertEquals(Expalertmsg, Actalertmsg);
		System.out.println("The Success Msg is displayed " + Expalertmsg + " "  + Actalertmsg);
		
		
		//To Enter the Second question of the Quiz
		MultipleUsersRegisterAsStudentPOM.ClickMutipleChoiceQuestions();
		MultipleUsersRegisterAsStudentPOM.EnterQuestionTextbox("Test2");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterFirstOption("test1");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterSecondOption("test2");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterThirdOption("test3");
		MultipleUsersRegisterAsStudentPOM.ClickAndEnterFourthOption("test4");
		
		//To verify if Second Option is selected 
		boolean Expsecondoption = true;
		boolean Actsecondoption = MultipleUsersRegisterAsStudentPOM.SecondOptionIsSelected();
		Assert.assertEquals(Expsecondoption, Actsecondoption);
		System.out.println("The Second Option Radio button is Selected " + Expsecondoption + " "  + Actsecondoption);
		
		MultipleUsersRegisterAsStudentPOM.ClickSubmitQuestionButton();
		
		//To Click on preview icon;
		MultipleUsersRegisterAsStudentPOM.ClickPreviewIcon();
		
		//To verify if Start Test Button is enabled 
		boolean Expstart = true;
		boolean Actstart = MultipleUsersRegisterAsStudentPOM.StartTestIsEnabled();
		Assert.assertEquals(Expstart, Actstart);
		System.out.println("The Start test is enabled " + Expstart + " "  + Actstart);
		
		//To Logout as a teacher;
		MultipleUsersRegisterAsStudentPOM.ClickLogOutButton();
		
		//To Login as a student
		MultipleUsersRegisterAsStudentPOM.SendUserName("dsrprakash2003");
		MultipleUsersRegisterAsStudentPOM.SendPassword("welcome");
		MultipleUsersRegisterAsStudentPOM.ClickLoginBtn();
		
		//To Click on Course Catalog and select a value
		MultipleUsersRegisterAsStudentPOM.ClickCourseCatalog();
		MultipleUsersRegisterAsStudentPOM.EnterCourseSearchTextbox("test136");
		MultipleUsersRegisterAsStudentPOM.ClickSearchButton();
		MultipleUsersRegisterAsStudentPOM.ClickSubscribeButton();
		MultipleUsersRegisterAsStudentPOM.clickmycoursemenu();
		MultipleUsersRegisterAsStudentPOM.clickcoursename();
		MultipleUsersRegisterAsStudentPOM.ClickTestsIcon();
		MultipleUsersRegisterAsStudentPOM.ClickTestsLink();	
		
		MultipleUsersRegisterAsStudentPOM.ClickStartTestButton();
		MultipleUsersRegisterAsStudentPOM.ClickFirstOption();
		MultipleUsersRegisterAsStudentPOM.ClickNextButton();
		MultipleUsersRegisterAsStudentPOM.ClickSecondOption();
		MultipleUsersRegisterAsStudentPOM.ClickEndTestButton();
		
		//To verify if Start Test Button is enabled 
		boolean Expscore = true;
		boolean Actscore = MultipleUsersRegisterAsStudentPOM.ResultPageIsDisplayed();
		Assert.assertEquals(Expscore, Actscore);
		System.out.println("The Result of the Quiz is displayed " + Expscore + " "  + Actscore);
		
		MultipleUsersRegisterAsStudentPOM.ClickLogOutButton();
		
		MultipleUsersRegisterAsStudentPOM.SendUserName("prakash123");
		MultipleUsersRegisterAsStudentPOM.SendPassword("welcome");
		MultipleUsersRegisterAsStudentPOM.ClickLoginBtn();
		MultipleUsersRegisterAsStudentPOM.ClickCourseLink();
		MultipleUsersRegisterAsStudentPOM.ClickTestIcon();
		MultipleUsersRegisterAsStudentPOM.correctandrateicon();
		MultipleUsersRegisterAsStudentPOM.gradeactivityicon();
		MultipleUsersRegisterAsStudentPOM.sendemailcheckbox();
		MultipleUsersRegisterAsStudentPOM.correcttestsubmitbutton();
		
		//To verify if Message Sent message is displayed
				String ExpMsg1 = "Message Sent";
				String ActMsg1 = MultipleUsersRegisterAsStudentPOM.GetSuccessMsg();
				Assert.assertEquals(ExpMsg1, ActMsg1);
				System.out.println("The Message displayed is " + ExpMsg1 + " " + ActMsg1);
		
}
}
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
import com.training.pom.SubscribeUsersPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.pom.SubscribeUsersPOM;

public class ELTC_027 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private String element;
	//private ScreenShot screenShot;
	private ELTC_026_POM ELTC_026_Admin;
	private SubscribeUsersPOM eltc_027_subscribe;
	
	
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
	public void subscriberAdd() throws Throwable {
		ELTC_026_Admin.sendUserName("admin");
		ELTC_026_Admin.sendPassword("admin@1234");
		ELTC_026_Admin.clickLoginBtn(); 
		ELTC_026_Admin.clickadmintab();
		String title;
		Assert.assertEquals(title = "Administration", title);
		//screenShot.captureScreenShot("First");
		ELTC_026_Admin.classesLink();
		WebElement actmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[1]"));
		String  actmsgval = actmsg.getText();
		int num1 = Integer.parseInt(actmsgval);
        System.out.println("value is " +actmsgval);
		eltc_027_subscribe.clicksubscribeUsers();
		eltc_027_subscribe.clickusergrp();
		eltc_027_subscribe.addusers();
		eltc_027_subscribe.clicksubscribeuserstoclass();
		WebElement expmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[1]"));
		String expmsgval = expmsg.getText();
		int num2 = Integer.parseInt(expmsgval);
        System.out.println("value is " +expmsgval);
        Assert.assertTrue (num1 < num2);
     }
		
        	
	}    
	
		
	
	
		


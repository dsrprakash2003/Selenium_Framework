package com.training.sanity.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTestDemo {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver;
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL("http://9.81.196.151:4444/wd/hub"),capability);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
package com.training.pom;



import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LogOutPOM {
private WebDriver driver; 
	
public  LogOutPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Test Step --> Click on Delete icon of class

@FindBy(xpath ="/html/body/div[1]/nav/div/div[2]/ul[2]/li[2]/a")
private WebElement LogOutAdmin;

@FindBy(id = "logout_button")
private WebElement logOut;



public void ClickLogOutAdmin() {
	 this.LogOutAdmin.click();
	 System.out.println("Clicked user icon drop down");
	// TODO Auto-generated method stub
	
}
public void ClickLogOut() {
	 this.logOut.click();
	 System.out.println("Clicked Logout button");
	// TODO Auto-generated method stub
}

public void assertcheck() {	
	WebElement msg=driver.findElement(By.id("formLogin_submitAuth"));
	String text=msg.getText();
	String expectedText = "Login";
	Assert.assertEquals(text,expectedText);	 
	 }

}


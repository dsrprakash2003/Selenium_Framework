package com.training.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CourseAndSubscribUsersPOM {
private WebDriver driver; 
	
public  CourseAndSubscribUsersPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

// Text Box to enter Title of course name 
@FindBy(id ="update_course_title")
private WebElement titlenametxtbox;

// Enter credential in  code text box
@FindBy(xpath =" //*[@id='visual_code']")
private WebElement credentialtxtbox;



//Method for adding title name in text box
public void titlenametxtbox(String title) {
	this.titlenametxtbox.sendKeys(title); 
}

//Method for adding credentials in text box
public void credentialtxtbox(String code) {
	this.credentialtxtbox.sendKeys(code); 



}

}
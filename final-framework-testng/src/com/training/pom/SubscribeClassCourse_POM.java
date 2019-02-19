package com.training.pom;



import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SubscribeClassCourse_POM {
private WebDriver driver; 
	
public  SubscribeClassCourse_POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Test Step -->Click on Subscribe class to courses icon of class

@FindBy(xpath =" //table//tbody//tr//td[@title='demo']//following-sibling::td//a//img[@title='Subscribe class to courses']")
private WebElement subscribeCourses;


//Test Step -->  Select Course name to subscribe in Courses on the platform. : window


@FindBy(xpath =" /html/body/div[1]/section/div/form/table/tbody/tr[3]/td[1]/div/div/select/option[2]")
private WebElement courseName;


//Test Step --> Click on --> icon 

@FindBy(xpath ="/html/body/div[1]/section/div/form/table/tbody/tr[3]/td[2]/button[1]")
private WebElement addCourse;

//Test Step --> click on Subscribe class to Courses button

@FindBy(xpath ="/html/body/div[1]/section/div/form/table/tbody/tr[3]/td[3]/select/option")
private WebElement selectOption; 

@FindBy(xpath ="/html/body/div[1]/section/div/form/table/tbody/tr[4]/td/button")
private WebElement addCourses;





public void clicksubscribeCourses() {
	 this.subscribeCourses.click();
	 System.out.println("Clicked courses");
	// TODO Auto-generated method stub
	
}

public void clickcourseName() {
	 this.courseName.click();
	 System.out.println("Clicked courses");
	// TODO Auto-generated method stub
	
}


public void addCourse() {
	this.addCourse.click();
	System.out.println("add courses to select");
}

public void clickselectOption() {
	this.selectOption.click();
	System.out.println("select courses");
	// TODO Auto-generated method stub
}
	
public void clickaddCourses(){
     this.addCourses.click();
     System.out.println("added courses");

}
}

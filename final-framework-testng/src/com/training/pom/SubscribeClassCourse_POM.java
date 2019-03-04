package com.training.pom;



import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



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


@FindBy(xpath ="//*[@id='elements_not_in']/option[contains(text(),'testing1')]")
private WebElement courseName;


//Test Step --> Click on --> icon 

@FindBy(xpath ="//*[@id=\"content-section\"]/div/form/table/tbody/tr[3]/td[2]/button[1]")
private WebElement selectcourse;

//Test Step --> click on Subscribe class to Courses button

@FindBy(xpath ="//*[@id=\"content-section\"]/div/form/table/tbody/tr[4]/td/button")
private WebElement addbutton;


private int num1; 

//@FindBy(xpath ="/html/body/div[1]/section/div/form/table/tbody/tr[4]/td/button")
//private WebElement addCourses;





public void clicksubscribeCourses() {
	WebElement actmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[2]"));
	String  actmsgval = actmsg.getText();
	int num1 = Integer.parseInt(actmsgval);
    System.out.println("value is " +actmsgval);	
	 this.subscribeCourses.click();
	 System.out.println("Clicked courses");
	// TODO Auto-generated method stub
	
}

public void selectkcourseName() {
	 this.courseName.click();
	 System.out.println("Clicked courses");
	// TODO Auto-generated method stub
	
}

public void addCoursetowindow() {
	this.selectcourse.click();
	System.out.println("Sect a course to be added to Class Demo");
}

	
public void clickaddCoursetoclass(){
	WebElement expmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[2]"));
	String expmsgval = expmsg.getText();
	int num2 = Integer.parseInt(expmsgval);
    System.out.println("value is " +expmsgval);
    Assert.assertTrue (num1 < num2);
     this.addbutton.click();
     System.out.println("The selected Course Testing1 has been added to the Class Demo");

}
}

package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class CourseAndSessionPOM {
private WebDriver driver; 
	
public  CourseAndSessionPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}



// Click on Create a Course link

@FindBy(xpath ="//*[@id='tabs-2']/div/div[2]/div[2]/ul/li[2]/a")
private WebElement createcourselink;

// Text Box to enter Title of course name 
@FindBy(id ="update_course_title")
private WebElement titlenametxtbox;

// Enter credential in  code text box
@FindBy(xpath =" //*[@id='visual_code']")
private WebElement credentialtxtbox;

//Click the Teachers list box
@FindBy(xpath ="//span[contains(@class,'filter-option pull-left')]")
private WebElement clickteachers;

// Select Valid Credentials in Teacher list box
@FindBy(xpath ="//span[contains(@class,'text')]  [contains(text(),'Radhakrishnan k')]")
private WebElement selectcredentialsteachers;


//Click the category list box
@FindBy(xpath ="//span[contains(@class,'filter-option pull-left')]  [contains(text(),'none')]")
private WebElement clickcategory;


//Select Valid credentials from Category list box
@FindBy(xpath ="//span[contains(@class,'text')]  [contains(text(),'Projects')]")
private WebElement selectcategorycredentials;

//Click the language list box
@FindBy(xpath ="//span[contains(@class,'filter-option pull-left')]  [contains(text(),'English')] ")
private WebElement clicklanguage;


//Select Valid credentials from Language list box
@FindBy(xpath ="//span[contains(@class,'text')]  [contains(text(),'English')]")
private WebElement selectlanguagecredentials;

//Click on Create a course button
@FindBy(id ="update_course_submit")
private WebElement coursebtn;

//Click on Add a training session link
@FindBy(xpath ="//*[@id='tabs-4']/div/div[2]/div[2]/ul/li[2]/a")
private WebElement addtraningsessionlink;

//Add a Training Session text box
@FindBy(xpath ="//*[@id='add_session_name']")
private WebElement addtrainingsession;






// Method for Create course link
public void createcourselink() {
	this.createcourselink.click(); 
}

// Method for adding title name in text box
public void titlenametxtbox(String title) {
	this.titlenametxtbox.sendKeys(title); 
}

// Method for adding credentials in text box
public void credentialtxtbox(String code) {
	this.credentialtxtbox.sendKeys(code); 

}



// Method for clicking drop down for teachers

public void clickteachers()  {
	this.clickteachers.click();
}




// Method for selecting teachers credentials
public void selectcredentialsteacher()  {
	this.selectcredentialsteachers.click();
	
}


//Method for clicking drop down for Category

public void clickcategory()  {
	this.clickcategory.click();
}


// Method for selecting category credentials

public void selectcategorycredentials() {
	this.selectcategorycredentials.click(); 
}

//Method for clicking drop down for language

public void clicklanguage()  {
	this.clicklanguage.click();
}

// Method for selecting language credentials
public void selectlanguagecredentials() {
	this.selectlanguagecredentials.click(); 
}

// Method for clicking add course button
public void coursebtn() {
	this.coursebtn.click();
	WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
	String text=msg.getText();
	String expectedText = "Course testing1 added";
	Assert.assertEquals(text,expectedText);
}

// Method for Add training session link
public void addtrainingsessionlink() {
	this.addtraningsessionlink.click();
}

//Method for Add training name
	public void addtrainingsession(String trainingsession) {
		this.addtrainingsession.sendKeys(trainingsession);
}

	
		
					

}
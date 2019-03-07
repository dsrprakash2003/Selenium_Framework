package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class SessionCategoriesPOM {
private WebDriver driver; 
	
public  SessionCategoriesPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

// Session Category List Element

@FindBy(xpath =" /html/body/div[1]/section/div/div[2]/div/section/section/div[2]/div[2]/div/div[2]/div[2]/ul/li[3]/a")
private WebElement sessioncategorylist;

// Training Session List Element
@FindBy(xpath =" /html/body/div[1]/section/div/div[2]/div/div[1]/a[2]/img")
private WebElement TrainingSessionList;

//Subscribe users session element
@FindBy(xpath =" //table//tbody//tr//td[@title='ABC']//following-sibling::td/a//img[@title='Subscribe users to this session']")
private WebElement SubsribeusersSession;

//Add user session element
@FindBy(id ="user_to_add")
private WebElement addusersession;

//Add user link element
@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[1]/div/div/a")
private WebElement userlink;

//Add button element
@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[2]/div/button")
private WebElement addbtn;

//Add session list link element
@FindBy(xpath ="/html/body/div[1]/section/div/div[1]/ul/li[2]/a")
private WebElement sessionlistlink;

//Add course session element
@FindBy(xpath ="//table//tbody//tr//td[@title='ABC']//following-sibling::td/a//img[@title='Add courses to this session']")
private WebElement addcoursesession;

//Add course list element
@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[1]/div/select/option[2]")
private WebElement addcourselist;

//Add success button element
@FindBy(name ="next")
private WebElement addsuccessbtn;

//Add course button element
@FindBy(name ="add_course")
private WebElement addcoursebtn;


// Method for Session Category List
public void clickSessionCategoryList() {
	this.sessioncategorylist.click(); 
}

// Method for Training Session List
public void clickTrainingSessionList() {
	this.TrainingSessionList.click(); 
}

// Method for Subscribe users Session

public void clickSubsribeusersSession() {
	this.SubsribeusersSession.click(); 

}

// Method for Add User Session
public void addaddusersession(String addClassName)  {
	this.addusersession.sendKeys(addClassName);
	
}

// Method for Clicking user link

public void clickuserlink() {
	this.userlink.click(); 
}

// Method for Add Button
public void addbtn() {
	this.addbtn	.click(); 
}

// Method for Session List Link
public void sessionlistlink() {
	this.sessionlistlink.click(); 
}

// Method for Add Course Session
public void addcoursessession() {
	this.addcoursesession.click();
}

// Method for Add Course List
public void addcourselist() {
	this.addcourselist.click();
}

// Method for  Add Course Button

public void addcoursebtn() {
	this.addcoursebtn.click();
}	

// Method for Add Success Button
	public void addsuccessbtn() {
		this.addsuccessbtn.click();
		
}
	
	
}
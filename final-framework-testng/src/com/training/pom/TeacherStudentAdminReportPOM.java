package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class TeacherStudentAdminReportPOM {
private WebDriver driver; 
	
public  TeacherStudentAdminReportPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//click on MyCourses menu
@FindBy(xpath ="//*[@id='menuone']/ul[1]/li[2]/a")
private WebElement mycoursesmenu;

//Click on Create a course link on the left side navigation
@FindBy(xpath ="//*[@id='courseCollapse']/div/ul/li[1]/a")
private WebElement createcourselink;


//Enter name of the course
@FindBy(id ="title")
private WebElement title;

// Click Advanced Settings button
@FindBy(xpath ="//*[@id='advanced_params']")
private WebElement settingsbtn;

//Click on Category Drop down
@FindBy(xpath ="//*[@id='advanced_params_options']/div[1]/div[1]/div/button/span[1]")
private WebElement categorydropdown;

//Select Category value - Project
@FindBy(xpath ="//*[@id='advanced_params_options']/div[1]/div[1]/div/div/ul/li[3]/a/span[1]")
private WebElement selectcategory;

//Enter courese code
@FindBy(xpath ="//*[@id='add_course_wanted_code']")
private WebElement coursecode;


//Click language drop down
@FindBy(xpath ="//*[@id='advanced_params_options']/div[3]/div[1]/div/button/span[1]")
private WebElement lagnuagedropdown;

//Click language drop down
@FindBy(xpath ="//*[@id='advanced_params_options']/div[3]/div[1]/div/div/ul/li[6]/a")
private WebElement selectlanguagedropdown;

//Click Create course button
@FindBy(id="add_course_submit")
private WebElement createcoursebtn;

//click on Add an introduction icon
@FindBy(xpath ="//*[@id='course_tools']/div[1]/div/div[1]/a")
private WebElement addintroicon;

//Enter valid credentials in textbox
@FindBy(xpath = "//iframe[@title='Rich Text Editor, intro_content']")
private WebElement descriptiontxtbox;

//adding description in iframe text box
@FindBy(xpath = "//body[@contenteditable='true']")
private WebElement addescriptiontxtbox;


//Click on Save intro text
@FindBy(xpath ="//*[@id='introduction_text_intro_cmdUpdate']")
private WebElement saveintrotext;


//Click on Course description icon
@FindBy(xpath ="//img[@alt='Course description']")
private WebElement coursedescicon;

//Click on Description icon
@FindBy(xpath =" //*[@id='content-section']/div/div[2]/a[1]/img")
private WebElement descicon;

//Enter valid credentials in Title textbox
@FindBy(xpath =" //*[@id='course_description_title']")
private WebElement titletextbox;

//Enter valid credentials in textbox
@FindBy(xpath = "//iframe[@title='Rich Text Editor, contentDescription']")
private WebElement contenttextbox;

//adding description in iframe text box
@FindBy(xpath = "//body[@contenteditable='true']")
private WebElement addcontenttextbox;


//Click on Save button
@FindBy(xpath =" //*[@id='course_description_submit']")
private WebElement savebtn_course;

//Click on Objectives icon
@FindBy(xpath ="//*[@id='content-section']/div/div[3]/a[2]/img")
private WebElement objicon;

//Enter valid credentials in Title textbox
@FindBy(xpath =" //*[@id='course_description_title']")
private WebElement objtitlebox;

//Click in the objective content text box
@FindBy(xpath ="//iframe[@title='Rich Text Editor, contentDescription']")
private WebElement objcontentbox1;

//Add objective content text box
@FindBy(xpath ="//body[@contenteditable='true']")
private WebElement addobjcontentbox1;

//Click on Save button
@FindBy(xpath =" //*[@id='course_description_submit']")
private WebElement savebtn;


//Click on Topics icon
@FindBy(xpath ="//*[@id='content-section']/div/div[3]/a[3]/img")
private WebElement topicicon;



//Enter valid credentials in Title textbox
@FindBy(xpath ="//*[@id='course_description_title']")
private WebElement topictitle;




//Click in the Topicks content text box
@FindBy(xpath ="//iframe[@title='Rich Text Editor, contentDescription']")
private WebElement topiccontentbox;

//Add text to Topic content text box
@FindBy(xpath ="//body[@contenteditable='true']")
private WebElement addtopiccontentbox;



//Click on Save button
@FindBy(xpath ="//*[@id='course_description_submit']")
private WebElement savebtncourse;


//Click on projectlinktext
@FindBy(xpath ="//*[@id='page-breadcrumb']/ul/li[1]/a")
private WebElement prjlink;


//Click on Project icon
@FindBy(xpath ="//img[@alt='Projects']")
private WebElement prjicon;


//click on create a new project icon
@FindBy(xpath =" //*[@id='content-section']/div/div[2]/a/img")
private WebElement newprjicon;


//enter valid credential in title text box
@FindBy(xpath ="//*[@id='add_blog_blog_name']")
private WebElement titleblog;


//enter valid credential in sub title text box
@FindBy(xpath ="//*[@id='add_blog_blog_subtitle']")
private WebElement subtitle;

//Click on save blog button
@FindBy(xpath =" //*[@id='add_blog_submit']")
private WebElement saveblog;


//click on project link
@FindBy(xpath =" //a[contains(text(),'test123')]")
private WebElement prjlink1;


//click on new task icon
@FindBy(xpath ="//*[@id='toolbar']/div/div/a[2]/img")
private WebElement newtaskicon;

//enter valid credential in title text box
@FindBy(xpath ="//*[@id='add_post_title']")
private WebElement titlepost;


//click on save button

@FindBy(xpath ="//*[@id='add_post_save']")
private WebElement savetitle;

//click on Role management icon
@FindBy(xpath ="//*[@id='toolbar']/div/div/a[3]/img")
private WebElement rolemanagementicon;

//click on add a new role icon
@FindBy(xpath =" //*[@id='main_content']/div/div/div/div/a[1]")
private WebElement addnewroleicon;

//enter valid credential in title text box
@FindBy(xpath =" //*[@id='main_content']/div/div/div/form/div[1]/div/input")
private WebElement titlerole;

//click on save button
@FindBy(xpath =" //*[@id='main_content']/div/div/div/form/div[5]/div/button")
private WebElement saverole;

//click on Assign role icon
@FindBy(xpath =" //*[@id='main_content']/div/div/div/div/a[2]")
private WebElement assignrole;


//select student / teacher name in user list box
@FindBy(xpath =" //*[@id='assign_task']/fieldset/div[1]/div[1]/div")
private WebElement studentteacher;


//select student / teacher name in user list box
@FindBy(xpath =" //*[@id='assign_task']/fieldset/div[1]/div[1]/div/div/ul/li/a")
private WebElement studentteacherselect;

//Click Validate button
@FindBy(xpath =" //*[@id='assign_task_submit']")
private WebElement validatebutton;






//Method for clicking mycourses menu
public void mycouresmenu() {
	this.mycoursesmenu.click();
}

public void createcourselink() {
	this.createcourselink.click();
}


public void title(String title) {
	this.title.sendKeys(title);
}


public void settingsbtn() {
	this.settingsbtn.click();
}
	
public void categorydropdown() {
	this.categorydropdown.click();
}

public void selectcategory() {
	this.selectcategory.click();
}
	
public void coursecode(String cde) {
	this.coursecode.sendKeys(cde);
}

public void languagedropdown() {
	this.lagnuagedropdown.click();
	
}

public void selectlanguagedropdown() {
	this.selectlanguagedropdown.click();
}

public void createcoursebtn() {
	this.createcoursebtn.click();
}

public void addintroicon() {
	this.addintroicon.click();
}

	public void FrameDesc() {
	
		driver.switchTo().frame(descriptiontxtbox);
	}
	
	public void sendAddFrameDescText(String AddFrameDescText) {
		this.addescriptiontxtbox.clear();
		this.addescriptiontxtbox.sendKeys(AddFrameDescText);
	}
	
	
	public void FrameDesce2out() {
	
		driver.switchTo().defaultContent();
	} 

	public void saveintrotext() {
	this.saveintrotext.click();
}

public void coursedescicon() {
	this.coursedescicon.click();
}

public void descicon() {
	this.descicon.click();
}

public void titletextbox(String tit) {
	this.titletextbox.sendKeys(tit);
	
}
public void FrameDesc1() {
	
	driver.switchTo().frame(contenttextbox);
}

public void sendAddFrameDescText1(String AddFrameDescText1) {
	this.addcontenttextbox.clear();
	this.addcontenttextbox.sendKeys(AddFrameDescText1);
}


public void FrameDesce2out1() {

	driver.switchTo().defaultContent();
} 


public void savebtncourse() {
	this.savebtncourse.click();
}

public void objicon() {
	this.objicon.click();
}

public void objtitlebox(String objtitle) {
	this.objtitlebox.sendKeys(objtitle);
}

public void FrameDesc2() {
	
	driver.switchTo().frame(objcontentbox1);
}

public void sendAddFrameDescText11(String AddFrameDescText2) {
	this.addobjcontentbox1.clear();
	this.addobjcontentbox1.sendKeys(AddFrameDescText2);
}


public void FrameDesce2out11() {

	driver.switchTo().defaultContent();
} 
	
public void savbtn() {
	this.savebtn.click();
	}


public void topicicon(){
	this.topicicon.click();
}
public void titlecoursedesc(String desc1) {
	this.topictitle.sendKeys(desc1);
}

public void FrameDesc3() {
	
	driver.switchTo().frame(topiccontentbox);
}

public void sendAddFrameDescText12(String AddFrameDescText3) {
	this.addtopiccontentbox.clear();
	this.addtopiccontentbox.sendKeys(AddFrameDescText3);
}


public void FrameDesce2out12() {

	driver.switchTo().defaultContent();
} 


public void savebtncourse1() {
	this.savebtncourse.click();
	
}


public void prjlink() {
	this.prjlink.click();
	
}
public void prjicon() {
	this.prjicon.click();
}
public void newprjicon() {
	this.newprjicon.click();
}
public void titleblog(String titleblog) {
	this.titleblog.sendKeys(titleblog);
}
public void subtitle(String subtitleblog) {
	this.subtitle.sendKeys(subtitleblog);
}
public void saveblog() {
	this.saveblog.click();
}


public void prjlink1() {
	this.prjlink1.click();
	
}


public void newtaskicon() {
	this.newtaskicon.click();
}

public void titlepost(String post) {
	this.titlepost.sendKeys(post);
}

public void savetitle() {
	this.savetitle.click();
}
public void rolemanagementicon() {
	this.rolemanagementicon.click();
}
public void addnewroleicon() {
	this.addnewroleicon.click();
}
public void titlerole(String role) {
	this.titlerole.click();
}
public void saverole() {
	this.saverole.click();
}
public void assignrole() {
	this.assignrole.click();
	
}
public void studentteacher() {
	this.studentteacher.click();
}
public void studentteacherselect() {
	this.studentteacherselect.click();
}
public void clickvalidatebtn() {
	this.validatebutton.click();
}
}
	
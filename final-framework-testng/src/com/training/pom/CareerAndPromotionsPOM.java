package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class CareerAndPromotionsPOM {
private WebDriver driver; 
	
public  CareerAndPromotionsPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

// Click on Careers and Promotions link

@FindBy(xpath ="//*[@id='tabs-4']/div/div[2]/div[2]/ul/li[8]/a")
private WebElement careersandpromotions;

// Click on Careers Icon Element
@FindBy(xpath ="//*[@id='toolbar-career']/div/div/a[2]/img")
private WebElement addcareers;

//Click on add Icon element
@FindBy(xpath =" //*[@id='content-section']/div/div[2]/a[2]/img")
private WebElement addicon;

//enter valid name for career (QA)
@FindBy(id ="career_name")
private WebElement txbox;

//Add Career button after entering career name
@FindBy(id ="career_submit")
private WebElement addcarrercourse;


// Click on Careers and Promotions link after successfully adding a career
@FindBy(xpath =" /html/body/div[1]/section/div/div[1]/ul/li[2]/a")
private WebElement careerandpromotionslink;

//click on Promotions icon
@FindBy(xpath ="//*[@id='toolbar-career']/div/div/a[3]/img")
private WebElement promotionicon;

//click on Add icon
@FindBy(xpath ="//*[@id='content-section']/div/div[2]/a[2]/img")
private WebElement addpromotionicon;

//enter valid credentials in Name textbox (QA Testers)
@FindBy(xpath ="//*[@id='name']")
private WebElement txtboxpromotionname;

//Submit for Promotion 
@FindBy(id ="promotion_submit")
private WebElement submitpromotion;


//Click on Add a training session icon
@FindBy(xpath ="//*[@id='content-section']/div/div[3]/a[3]/img")
private WebElement addtrainingsessionicon;


// Enter valid credentials in Session name textbox (selenium training session)
@FindBy(xpath ="//*[@id='add_session_name']")
private WebElement addtrainingsessionname;


//Add a Training Session Submit button
@FindBy(id ="add_session_submit")
private WebElement submitbtntraining;


//Select a course
@FindBy(xpath ="//*[@id='origin']/option[contains(text(),'1Selenium11')]")
private WebElement selectcoursename;

//Add course to the list window
@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[2]/div[2]/div[1]/button")
private WebElement courselist;

//Add course button element
@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[2]/div[2]/div[4]/button")
private WebElement addcoursebtn;

// Add button for session creation
@FindBy(xpath ="//*[@id='multiple-add-session']/div[2]/div/button")
private WebElement finalsessionbtn;



// Method for clicking careers and promotions
public void careersandpromotions() {
	this.careersandpromotions.click(); 
}

// Method for clicking add careers icon
public void addcareers() {
	this.addcareers.click(); 
}

// Method for clicking add icon

public void addicon() {
	this.addicon.click(); 

}

// Method for add session name
public void txbox(String sessionname)  {
	this.txbox.sendKeys(sessionname);
	
}

// Method for submit session name

public void addcarrercourse() {
	this.addcarrercourse.click();
	WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
	String text=msg.getText();
	String expectedText = "Item added";
	Assert.assertEquals(text,expectedText);
}

// Method for clicking careers and promotion link
public void careerandpromotionslink() {
	this.careerandpromotionslink.click(); 
}

// Method for clicking promotion icon
public void promotionicon() {
	this.promotionicon.click(); 
}

// Method for clicking add promotion icon
public void addpromotionicon() {
	this.addpromotionicon.click();
}

// Method for entering coursename
public void txtboxpromotionname(String courselist) {
	this.txtboxpromotionname.sendKeys(courselist);
}

// Method for adding coursename

public void submitpromotion() {
	this.submitpromotion.click();
	WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
	String text=msg.getText();
	String expectedText = "Item added";
	Assert.assertEquals(text,expectedText);
}	

// Method for Add Training Name Icon

public void addtrainingsessionicon() {
	this.addtrainingsessionicon.click();
}	


//Method for Add training name
	public void addtrainingsessionname(String trainingsession) {
		this.addtrainingsessionname.sendKeys(trainingsession);
	}
	
	
// Method for Add Success Button
	public void submitbtntraining() {
		this.submitbtntraining.click();
		
	}
	
	
		// Method for selecting course name
	public void selectcoursename() {
		this.selectcoursename.click();
        } 
		

				
				// Method for selecting course name to window list
				public void courselist() {
					this.courselist.click();	
				}
				
					// Method for Add Success Button
					public void addcoursebtn() {
						this.addcoursebtn.click();
						WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-info')]"));
						String text=msg.getText();
						String expectedText = "Update successful";
						Assert.assertEquals(text,expectedText);
						
					}
					// Method for Final button session
					public void finalsessionbtn() {
						this.finalsessionbtn.click();	
						
						
					}

					
}
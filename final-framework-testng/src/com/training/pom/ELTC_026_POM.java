package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ELTC_026_POM {
	private WebDriver driver; 
	
	public ELTC_026_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	// Login elements identification in Elearning Application for Selenium Test
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	// Clicking Admin Tab
	@FindBy(xpath ="//*[@id='menuone']/ul[1]/li[7]/a)")
	private WebElement adminTab; 
	
	// Clicking Classes Link in Admin Page
	
	@FindBy(xpath =" //*[@id='tabs-1']/div/div[2]/div[2]/ul/li[7]/a)")
	private WebElement classesLink; 
	
	// Clicking Add Icon in the Classes Page
	
	@FindBy(xpath =" //*[@id='content-section']/div/div[2]/a[2]/img)")
	private WebElement addClasses; 
	
	// Entering Class Name in Text Box
	@FindBy(id ="usergroup_name")
	private WebElement addClassName;
	
	// Entering Class Description in Description Box
	@FindBy(id ="usergroup_description")
	private WebElement addClassDesc;
	
	// Click the Drop down for group Permission
	@FindBy(xpath ="//*[@id='usergroup']/fieldset/div[6]/div[1]/div/button")
	private WebElement grpPermissionDropDown;
	
	// Select Open option from drop down
	@FindBy(xpath="//*[@id='usergroup']/fieldset/div[6]/div[1]/div/div/ul/li[1]/a/span[1]")
	private WebElement grpPermission; 
	
	// Click Submit button
	@FindBy(name ="submit")
	private WebElement addBtn;
	
	
	
	
	// Methods
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clickadmintab() {
		this.adminTab.click();
		// TODO Auto-generated method stub
		
	}

	public void classesLink() {
		this.classesLink.click();
		// TODO Auto-generated method stub
		
	}
		
		public void addClasses()  {
			this.addClasses.click();
			
		
	}
		public void addClassName(String addClassName)  {
			this.addClassName.sendKeys(addClassName);
}
		public void addClassdesc(String addClassdesc)  {
			this.addClassDesc.sendKeys(addClassdesc);
		}
		
		public void clickGrpPermissionDropDown()  {
			this.grpPermissionDropDown.click();
			System.out.println("Clicked Group drop down");
		}
				
		
		public void grpPermission()  {
			this.grpPermission.click();
			System.out.println("Drop Down selected with Open");
}
		public void clickaddBtn() throws InterruptedException  {
					this.addBtn.click();
				
				
			}
		
		public void assertCheck(){
			WebElement msg=driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
			String text=msg.getText();
			String expectedText = "Item added";
			Assert.assertEquals(text,expectedText);
		}
		
			
			
		}


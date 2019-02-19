package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_026_POM {
	private WebDriver driver; 
	
	public ELTC_026_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath =" /html/body/div[1]/nav/div/div[2]/ul[1]/li[7]/a")
	private WebElement adminTab; 
	
	@FindBy(xpath =" /html/body/div[1]/section/div/div[2]/div/section/section/div[1]/div[1]/div/div[2]/div[2]/ul/li[7]/a")
	private WebElement classesLink; 
	
	@FindBy(xpath =" /html/body/div[1]/section/div/div[2]/a[2]/img")
	private WebElement addClasses; 
	
	@FindBy(id ="usergroup_name")
	private WebElement addClassName;
	
	@FindBy(id ="usergroup_description")
	private WebElement addClassDesc;
	
	@FindBy(xpath ="/html/body/div[1]/section/div/form/fieldset/div[6]/div[1]/div/button")
	private WebElement grpPermissionDropDown;
	
	@FindBy(xpath="//*[@id='usergroup']/fieldset/div[6]/div[1]/div/div/ul/li[1]/a/span[1]")
	private WebElement grpPermission; 
	
	
	
	
	@FindBy(name ="submit")
	private WebElement addBtn;
	
	@FindBy(className="alert alert-success")
	private WebElement alertmsg;
	
	
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
		public void clickaddBtn()  {
			this.addBtn.click();
					
				
			}
		
			
			
		}


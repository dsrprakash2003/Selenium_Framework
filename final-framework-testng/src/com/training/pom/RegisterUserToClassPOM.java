package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class RegisterUserToClassPOM {
private WebDriver driver; 
	
public  RegisterUserToClassPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Click on Add User Link

	@FindBy(xpath="//*[@id='tabs-1']/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement adduserlink;
	
	
	@FindBy(name="firstname")
	private WebElement firstName;

	@FindBy(name="lastname")
	private WebElement lastName;

	@FindBy(name="email")
	private WebElement email;

	@FindBy(name="phone")
	private WebElement phone;

	@FindBy(name="username")
	private WebElement username1;

	@FindBy(name="password[password_auto]")
	private WebElement passwordRadio;

	@FindBy(name="password[password]")
	private WebElement password1;

	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[11]/div[1]/div/button/span[1]")
	private WebElement profile;

	@FindBy(xpath="//*[@id=\"user_add\"]/fieldset/div[11]/div[1]/div/div/ul/li[1]/a/span[1]")
	private WebElement trainer;

	//Click on Submit
	@FindBy(name="submit")
	private WebElement submit;
	
	// CLick Add user button after selecting users
	@FindBy(xpath="//*[@id=\"content-section\"]/div/form/div/div[2]/div/button[1]")
	private WebElement adduserbtn;

	// Select the users
	@FindBy(xpath="//*[@id='elements_not_in']/option[contains(text(),'Prakash Ramesh')]")
	private WebElement selectuserOption;

	

	// Add button to add users to the Class demo
		@FindBy(xpath="//*[@id=\"content-section\"]/div/form/button")
		private WebElement addusertoclass;
		
	private Object addusers;
	
	
	

	public void clickadduserlink() {
               this.adduserlink.click();  
 }

	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	public void sendUserName1(String userName) {
		this.username1.clear();
		this.username1.sendKeys(userName);
	}
	public void clickPasswordRadio() {
		this.passwordRadio.click(); 
    }

	public void sendPassword1(String password) {
		this.password1.clear(); 
		this.password1.sendKeys(password); 
	}

	public void clickProfile() {
		this.profile.click(); 
		this.trainer.click();
    }

	public void clickSubmit() {
		this.submit.click(); 
    }

	
	public void clickselectuserOption() {
		this.selectuserOption.click();
		System.out.println("selected users");
	}
	
	
	public void clickaddusersbtn() {
		this.adduserbtn.click();
		
		}
	
	public void clickadduserstoclassbtn() {
		this.addusertoclass.click();
        
	}
}

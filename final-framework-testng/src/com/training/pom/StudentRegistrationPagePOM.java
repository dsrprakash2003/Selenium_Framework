
package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class StudentRegistrationPagePOM {
private WebDriver driver; 
	
public  StudentRegistrationPagePOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Click Signup

@FindBy(xpath ="//*[@id='login_block']/div/ul/li[1]/a")
private WebElement signup;

	

//Enter valid credential in First name textbox
@FindBy(xpath ="//*[@id='registration_firstname']")
private WebElement firstname;


//Enter valid credential in Last name textbox
@FindBy(xpath ="//*[@id='registration_lastname']")
private WebElement lastname;


//Enter valid credential in e-mail textbox
@FindBy(xpath ="//*[@id='registration_email']")
private WebElement email;

//Enter valid credential in username textbox

@FindBy(xpath ="//*[@id='username']")
private WebElement username;

//Enter valid credential in pass textbox
@FindBy(xpath ="//*[@id='pass1']")
private WebElement pswd;


//Enter valid credential in confirm password textbox
@FindBy(xpath ="//*[@id='pass2']")
private WebElement confirmpswd;


//Enter valid credential in phone textbox
@FindBy(xpath ="//*[@id='registration_phone']")
private WebElement phone;


@FindBy(xpath="//button[@data-id='registration_language']")
private WebElement langdd;

@FindBy(xpath="//div[@class='bs-searchbox']/input[@class='form-control']")
private WebElement langtextbox;

@FindBy(xpath="//ul[@class='dropdown-menu inner']/li[@class='selected active']/a/span[contains(text(),'English')]")
private WebElement langselected;

@FindBy(xpath ="//input[@name='status' and @value='5']")
private WebElement Studentradiobtn;

@FindBy(id="registration_submit")
private WebElement RegisterButton;

@FindBy(xpath = "//li[@class='dropdown avatar-user']/a/img")
private WebElement ClickUser;

@FindBy(xpath="//ul[@class='dropdown-menu']/li[5]/a")
private WebElement DDOptionLogout;

@FindBy(xpath="//div[@class='col-xs-12 col-md-12']")
private WebElement successmsg;

public void clickSignUp() {
	this.signup.click();
}

public void firstname(String firstName) {
	this.firstname.sendKeys(firstName);
}
public void lastname(String lastName) {
	this.lastname.sendKeys(lastName);
}
public void email(String email){
    this.email.sendKeys(email);
}
public void SenduserName(String userName) {
	this.username.sendKeys(userName);
}
public void Sendpassword(String password){
	this.pswd.sendKeys(password);
}
public void Confirmpassword(String confirmpassword){
	this.confirmpswd.sendKeys(confirmpassword);
}
public void phone(String phone){
	this.phone.sendKeys(phone);
}	
public void SelectLanguageFromDD(String lang)
{
	this.langdd.click();
	this.langtextbox.clear();
	this.langtextbox.sendKeys(lang);
	Actions action = new Actions(driver);		
	action.click(langselected).sendKeys(Keys.TAB).build().perform();		
}

public void ProfileRadioButton()
{
	this.Studentradiobtn.click();
}

public boolean StudentRadioButtonIsSelected()
{
	if (this.Studentradiobtn.isSelected())
	{
		return true;
	}
	
	else
	{
		return false;
	}
}

public void ClickRegistrationButton()
{
	this.RegisterButton.click();
}

public boolean GetSuccessMessage()
{
	if (this.successmsg.isDisplayed())
	{
		return true;
	}
	else
	{
		return false;
	}
}	

public void ClickLogOutButton()
{
	this.ClickUser.click();
	this.DDOptionLogout.click();
}


}
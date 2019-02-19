package com.training.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SubscribeUsersPOM {
private WebDriver driver; 
	
public  SubscribeUsersPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Test Step -->click on Subscribe users to class icon

@FindBy(xpath =" //table//tbody//tr//td[@title='demo']//following-sibling::td//a//img[@title='Subscribe users to class']")
private WebElement subscribeUsers;
 
//Test Step -->  Select Course name to subscribe in Courses on the platform. : window


@FindBy(xpath =" /html/body/div[1]/section/div/form/div/div[1]/select/option[1]")
private WebElement usergrp;


//Test Step --> Click on --> icon 

@FindBy(xpath ="/html/body/div[1]/section/div/form/div/div[2]/div/button[1]")
private WebElement addusers;

//Test Step --> Click on Subscribe Users in any class button

@FindBy(xpath ="/html/body/div[1]/section/div/form/button")
private WebElement subscribuserstoclasss;





public void clicksubscribeUsers() {
	 this.subscribeUsers.click();
	// TODO Auto-generated method stub
	
}


public void addusers() {
	this.addusers.click();
}

public void clickusergrp() {
	this.usergrp.click();
	// TODO Auto-generated method stub
	
}public void clicksubscribeuserstoclass(){
     this.subscribuserstoclasss.click();

}


}
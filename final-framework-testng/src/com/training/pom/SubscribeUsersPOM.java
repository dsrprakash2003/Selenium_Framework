package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



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


@FindBy(xpath =" //*[@id=\"elements_not_in\"]/option[contains(text(),'Prakash Ramesh')]")
private WebElement usergrp;


//Test Step --> Click on --> icon 

@FindBy(xpath ="//*[@id=\"content-section\"]/div/form/div/div[2]/div/button[1]")
private WebElement addusers;

//Test Step --> Click on Subscribe Users in any class button

@FindBy(xpath ="//*[@id=\"content-section\"]/div/form/button")
private WebElement subscribuserstoclasss;

private int num1;



public void clicksubscribeUsers() {
	WebElement actmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[1]"));
	String  actmsgval = actmsg.getText();
	int num1 = Integer.parseInt(actmsgval);
    System.out.println("value is " +actmsgval);
	 this.subscribeUsers.click();
	// TODO Auto-generated method stub
	
}


public void addusers() {
	this.addusers.click();
}

public void clickusergrp() {
		this.usergrp.click();
	// TODO Auto-generated method stub
	
}

public void clicksubscribeuserstoclass(){
	    this.subscribuserstoclasss.click();

}

public void assertcheck(){
	WebElement expmsg=driver.findElement(By.xpath("//table//tbody//tr//td[@title='demo']//following-sibling::td[1]"));
	String expmsgval = expmsg.getText();
	int num2 = Integer.parseInt(expmsgval);
    System.out.println("value is " +expmsgval);
    Assert.assertTrue (num1 < num2);
}


}
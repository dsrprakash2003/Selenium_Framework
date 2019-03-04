package com.training.pom;



import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DeleteClassPOM {
private WebDriver driver; 
	
public  DeleteClassPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

//Test Step --> Click on Delete icon of class

@FindBy(xpath ="/html/body/div[1]/section/div/div[3]/div[3]/div[3]/div/table/tbody/tr[2]/td[6]/a[5]/img")
private WebElement deleteCourse;





public void clickDeleteCourse() {
	 this.deleteCourse.click();
	 System.out.println("Clicked Delete Course");
	 Alert deleteClass = driver.switchTo().alert();
		deleteClass.accept();
	 
	// TODO Auto-generated method stub
	
}



}

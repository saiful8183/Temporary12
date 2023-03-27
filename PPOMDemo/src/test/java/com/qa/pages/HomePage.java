package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	// creating a constructor of homepage class
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// login as a manager
	@FindBy(xpath = "//button[@ng-click='manager()']")
	WebElement managerLoginBtn;

   //  add customer button
	
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	WebElement addCustomer;
	
	// adding customer details
	
	@FindBy(xpath = "//input[@ng-model='fName']")
	WebElement fName;

	@FindBy(xpath = "//input[@ng-model='lName']")
	WebElement lName;

	@FindBy(xpath = "//input[@ng-model='postCd']")
	WebElement zipCode;
	
	// clicking on add customer button
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement addBtn;

	// login manager// login as a manager
	public void loginAsManager() {

		managerLoginBtn.click();
	}

	public void addCustomer(String fname, String lname, String zip) {
		addCustomer.click();    // click on  add customer button
		
		// adding customer details
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		zipCode.sendKeys(zip);
		// clicking on add customer button
		addBtn.click();
		driver.switchTo().alert().accept();
	}


}
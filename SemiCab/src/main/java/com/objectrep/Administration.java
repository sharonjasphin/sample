package com.objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Administration {
	@FindBy(xpath = "//a[text()='Administration']")
	private WebElement Administration;
	
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement AdministrationUsers;
	
	@FindBy(xpath = "//div[text()='Create']")
	private WebElement CreateUser;
	
	@FindBy(xpath = "//div[contains(text(),'Organization')]/following-sibling::div/descendant::input")
	private WebElement CreateUserOrg;
	
	@FindBy(id = "firstName")
	private WebElement CreateUserFirstName;
	
	@FindBy(id = "lastName")
	private WebElement CreateUserLastName;
	
	@FindBy(id = "email")
	private WebElement CreateUserEmail;
	
	@FindBy(xpath = "//span[text()='Save']")
	private WebElement CreateUserSave;
	
	@FindBy(xpath = "//div[text()='TOOLBOX']/parent::div/preceding-sibling::div")
	private WebElement AdministrationToolbox;
	
	@FindBy(xpath = "//span[text()='Notification Logs']")
	private WebElement NotificationLogs;
	
	@FindBy(xpath = "//div[text()='SemiCab Verification Code']/following-sibling::div//*[name()='svg']")
	private WebElement NotificationsLogFirst;
	
	@FindBy(xpath = "//div[text()='SemiCab Verification Code']/following-sibling::div/following-sibling::div/div/span")
	private WebElement VerificationCode;
	
	@FindBy(xpath = "//div[@id='react-autowhatever-organization']/descendant::span")
	private WebElement CreateUserFirstOrg;
	
	@FindBy(xpath = "//div[text()='DRIVERS']")
	private WebElement Drivers;
	
	@FindBy(xpath = "//input[@placeholder='Search Driver']")
	private WebElement SearchDriver;
	
	@FindBy(xpath = "//div[text()='Carrier']/parent::div/following-sibling::div/div//*[name()='svg']")
	private WebElement FirstSearchResultDriver;
	
	@FindBy(xpath = "//div[text()='First Name']/following-sibling::div")
	private WebElement FirstNameDriverDetails;
	
	@FindBy(xpath = "//div[text()='Last Name']/following-sibling::div")
	private WebElement LastNameDriverDetails;
	
	@FindBy(xpath = "//div[text()='Email']/following-sibling::div")
	private WebElement EmailDriverDetails;
	
	@FindBy(xpath = "//div[text()='Carrier']/following-sibling::div")
	private WebElement CarrierDriverDetails;
	
	
	//Getters

	public WebElement getDrivers() {
		return Drivers;
	}

	public WebElement getSearchDriver() {
		return SearchDriver;
	}

	public WebElement getFirstSearchResultDriver() {
		return FirstSearchResultDriver;
	}

	public WebElement getFirstNameDriverDetails() {
		return FirstNameDriverDetails;
	}

	public WebElement getLastNameDriverDetails() {
		return LastNameDriverDetails;
	}

	public WebElement getEmailDriverDetails() {
		return EmailDriverDetails;
	}

	public WebElement getCarrierDriverDetails() {
		return CarrierDriverDetails;
	}

	public WebElement getCreateUserFirstOrg() {
		return CreateUserFirstOrg;
	}

	public WebElement getAdministration() {
		return Administration;
	}

	public WebElement getAdministrationUsers() {
		return AdministrationUsers;
	}

	public WebElement getCreateUser() {
		return CreateUser;
	}

	public WebElement getCreateUserOrg() {
		return CreateUserOrg;
	}

	public WebElement getCreateUserFirstName() {
		return CreateUserFirstName;
	}

	public WebElement getCreateUserLastName() {
		return CreateUserLastName;
	}

	public WebElement getCreateUserEmail() {
		return CreateUserEmail;
	}

	public WebElement getCreateUserSave() {
		return CreateUserSave;
	}

	public WebElement getAdministrationToolbox() {
		return AdministrationToolbox;
	}

	public WebElement getNotificationLogs() {
		return NotificationLogs;
	}

	public WebElement getNotificationsLogFirst() {
		return NotificationsLogFirst;
	}

	public WebElement getVerificationCode() {
		return VerificationCode;
	}
	
}

package com.objectrep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Invoices {
	@FindBy(id = "loadNum")
	private WebElement InvoiceSearchLoadNum;
	
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement InvoiceSearch;
	
	@FindBy(xpath = "//span[text()='Reset']")
	private WebElement InvoiceReset;
	
	@FindBy(xpath = "//div[text()='Created On']/parent::div/following-sibling::div//*[name()='svg' and @stroke='currentColor']")
	private WebElement invoicedetails;
	
	@FindBy(xpath = "//div[text()='Customer']/following-sibling::div")
	private WebElement InvoiceCustomer;
	
	@FindBy(xpath = "//div[text()='Load#']/following-sibling::div/div")
	private WebElement InvoiceLoadNum;
	
	@FindBy(xpath = "//div[text()='Payment Terms (Days)']/following-sibling::div")
	private WebElement InvoicePaymentTerms;
	
	@FindBy(xpath = "//div[text()='Contract#']/following-sibling::div/div")
	private WebElement InvoiceContractNum;
	
	@FindBy(xpath = "//div[text()='Payment Terms (days)']/parent::div/following-sibling::div/div")
	private WebElement ContractPaymentTerms;
	
	@FindBy(xpath = "//div[text()='Status']/following-sibling::div/span")
	private WebElement InvoiceStatus;
	
	
	//Getters

	public WebElement getInvoiceSearchLoadNum() {
		return InvoiceSearchLoadNum;
	}

	public WebElement getInvoiceSearch() {
		return InvoiceSearch;
	}

	public WebElement getInvoiceReset() {
		return InvoiceReset;
	}

	public WebElement getInvoicedetails() {
		return invoicedetails;
	}

	public WebElement getInvoiceCustomer() {
		return InvoiceCustomer;
	}

	public WebElement getInvoiceLoadNum() {
		return InvoiceLoadNum;
	}

	public WebElement getInvoiceStatus() {
		return InvoiceStatus;
	}

	public WebElement getInvoicePaymentTerms() {
		return InvoicePaymentTerms;
	}

	public WebElement getInvoiceContractNum() {
		return InvoiceContractNum;
	}

	public WebElement getContractPaymentTerms() {
		return ContractPaymentTerms;
	}
}

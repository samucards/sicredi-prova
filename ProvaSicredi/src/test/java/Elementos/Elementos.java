package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By BtnAddRecord = By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a");
	private By CustomerName = By.id("field-customerName");
	private By FirstName = By.id("field-contactFirstName");
	private By Phone = By.id("field-phone");
	private By AndressLine1 = By.id("field-addressLine1");
	private By AndressLine2 = By.id("field-addressLine2");
	private By City = By.id("field-city");
	private By state = By.id("field-state");
	private By postalCode = By.id("field-postalCode");
	private By country = By.id("field-country");
	private By SalesRepEmployeeNumber = By.id("field-salesRepEmployeeNumber");
	private By creditLimite = By.id("field-creditLimit");
	private By btnSave = By.id("form-button-save");
	private By fraseValidacao = By.id("report-success");
	public By getBtnAddRecord() {
		return BtnAddRecord;
	}
	public By getCustomerName() {
		return CustomerName;
	}
	public By getFirstName() {
		return FirstName;
	}
	public By getPhone() {
		return Phone;
	}
	public By getAndressLine1() {
		return AndressLine1;
	}
	public By getAndressLine2() {
		return AndressLine2;
	}
	public By getCity() {
		return City;
	}
	public By getState() {
		return state;
	}
	public By getPostalCode() {
		return postalCode;
	}
	public By getCountry() {
		return country;
	}
	public By getSalesRepEmployeeNumber() {
		return SalesRepEmployeeNumber;
	}
	public By getCreditLimite() {
		return creditLimite;
	}
	public By getBtnSave() {
		return btnSave;
	}
	public By getFraseValidacao() {
		return fraseValidacao;
	}
	
}

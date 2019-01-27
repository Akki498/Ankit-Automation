package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Testbase;

public class HomePage extends Testbase {

	// Page factory

	//@FindBy(xpath = "//body/table[1]/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[1]/font")
	@FindBy(xpath = "//td[contains(text(),'User: Ankit Tyagi ')]")
	//td[contains(text(),'User: Naveen K')]
	WebElement LoginPageusername;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactsTab;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement NewContactslink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsTab;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TaskTab;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean verifyHomePageusername() {
		return LoginPageusername.isDisplayed();

	}

	public ContactsPage clickOnContactsTab() {
		ContactsTab.click();

		return new ContactsPage();
	}

	public DealsPage clickOnDealsTab() {

		DealsTab.click();

		return new DealsPage();

	}

	public TaskPage clickOnTaskTab() {
		TaskTab.click();

		return new TaskPage();

	}

	public void clickOnContactsLink() {

		Actions action = new Actions(driver);
		action.moveToElement(ContactsTab).build().perform();
		
		NewContactslink.click();

	}
	
	

}

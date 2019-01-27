package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.Testbase;

public class ContactsPage extends Testbase {

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactsPageLabel;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@name='surname']")
	WebElement LastName;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement Companylookup;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement SaveBtn;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement Menu_Xpath;
	
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean VerifyContactsPageLabel() {
		return ContactsPageLabel.isDisplayed();
	}

	public void SelectContactsCheckbox(String name) {

		driver.findElement(By.xpath("//a[text()='" + name + "']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
				
	}

	public void CreateNewContacts(String title, String FName, String LName, String CompanyName) {

		Select select = new Select(driver.findElement(By.name("title")));

		select.selectByVisibleText(title);
		
		FirstName.sendKeys(FName);
		
		LastName.sendKeys(LName);
		
		Companylookup.sendKeys(CompanyName);
		
		SaveBtn.click();
		
		//https://www.youtube.com/watch?v=H2-3w-GQZ3g&list=PLFGoYjJG_fqq6cHeqfsDes3pdVh3kpl74&index=4
		
	}

}

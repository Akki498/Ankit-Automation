package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.base.Testbase;

public class SignUpPage  extends Testbase {
	
	
	// page factory
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement SignUpButton;
	
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement SelectEditiondropdown;
	
	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	WebElement SelectEditiond;
	
}

package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.base.Testbase;

public class LoginPage extends Testbase {

	// Page factory

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up')]")
	static WebElement SignUpbtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	static WebElement CrmLogo;

	// Initialize the page object

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	// Actions

	public static String validateLoginpagetitle() {

		return driver.getTitle();
	}

	public static boolean validateCRMLogo() {
		return CrmLogo.isDisplayed();
	}

	public HomePage login(String Uname, String Pwd) throws InterruptedException {
		username.sendKeys(Uname);
		password.sendKeys(Pwd);
		Thread.sleep(2000);
		loginbtn.click();

		return new HomePage();
	}

	/*public void clickOnSign() {

		if (loginbtn.isEnabled()) {
			loginbtn.click();
		} else {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));

			loginbtn.click();

		}

	}*/
}

package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.Testbase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.google.common.base.Throwables;

public class LoginPageTest extends Testbase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@Test(priority = 1)
	public void launchBrowserAndGetUrl() throws Exception {
		
		loginpage = new LoginPage();
	}

	@Test(priority = 2)
	public void LoginPagetitleTest() throws Exception {
		
		try {
			
		String title = LoginPage.validateLoginpagetitle();
		Assert.assertEquals(title, "CRMPRO Log In Screen");
		}catch(Throwable t){
			throw new Exception(Throwables.getStackTraceAsString(t));
		}
	}

	@Test(priority = 3)
	public void CRMImageTest() {
		boolean flag = LoginPage.validateCRMLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 4)
	public void loginTest() throws InterruptedException {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));


	}

	/*@AfterTest
	public void tearDown() {

		driver.close();

	}*/

}

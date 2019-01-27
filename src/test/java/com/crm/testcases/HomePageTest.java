package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.Testbase;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.TestUtil;
import com.google.common.base.Throwables;

public class HomePageTest extends Testbase {

	public static boolean isTestCasePass = true;
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;

	public HomePageTest() {
		super();
	}

	@Test(priority = 1)
	public void launchBrowserAndGetUrl() throws Exception {
		
		try{
			
		loginpage = new LoginPage();
		homepage = new HomePage();
		testutil = new TestUtil();
	//	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		}catch(Throwable t){
			isTestCasePass = false;
			throw new Exception(Throwables.getStackTraceAsString(t));
		}
		
	}

	@Test(priority = 2)
	public void HomePageTitle() throws Exception {
		
		
		try {
			
			String HomePageTitle = homepage.verifyLoginPageTitle();
			System.out.println(HomePageTitle);
			Assert.assertEquals(HomePageTitle, "CRMPRO", "Home Page title not matched");

		
			Thread.sleep(300);
			
		}catch(Throwable t){
			isTestCasePass = false;
			throw new Exception(Throwables.getStackTraceAsString(t));
		}

		
	}

	@Test(priority = 3)
	public void VerifyUsernameTest() throws InterruptedException {

		testutil.SwitchToFrame("mainpanel");
		Thread.sleep(200);
		
		Assert.assertTrue(homepage.verifyHomePageusername());

	}

	@Test(priority = 4)
	public void ContactsTabTest() throws InterruptedException {

		homepage.clickOnContactsTab();

		//testutil.fnaclickOnMenu(homepage.DealsTab, 20);
		Thread.sleep(300);

	}

	@Test(priority = 5)
	public void DealsTabTest() throws InterruptedException {

		homepage.clickOnDealsTab();
		Thread.sleep(300);
	}

	@Test(priority = 6)
	public void TaskPageTest() throws InterruptedException {
		homepage.clickOnTaskTab();
		Thread.sleep(300);

	}
	/*@AfterTest
	public void teardown() {
		driver.close();
	}
*/
}
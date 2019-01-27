package com.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.base.Testbase;
import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.TestUtil;

public class ContactPageTest extends Testbase {

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	TestUtil testutil;
	
	
	public static String title = null;

	public ContactPageTest() {
		super();
	}

	@Test(priority = 1)
	public void launchBrowserAndGetUrl() throws Throwable {
		
		loginpage = new LoginPage();
		homepage = new HomePage();
		contactspage = new ContactsPage();
		// loginpage = PageFactory.initElements(driver, LoginPage.class);
		

		contactspage = new ContactsPage();
		testutil = new TestUtil();
	//	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		//testutil.SwitchToFrame("mainpanel");
		//contactspage = homepage.clickOnContactsTab();
		
		//title = fnsReturn_ExcelCellValue_ByMatchingColumnName(this.getClass().getSimpleName(),"Title");

	}

	@Test(priority = 2)
	public void VerifycontactsLabelTest() throws InterruptedException {

		Assert.assertTrue(contactspage.VerifyContactsPageLabel(), "Contacts Label is missing");
		Thread.sleep(3000);
	}
	
	
	@Test(priority=3)
	public void CreateContactsTest() throws InterruptedException{
		homepage.clickOnContactsLink();
		contactspage.CreateNewContacts("Mr.", "F_Name", "L_Name", "ABC technology");
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void SelectContactsTest() throws InterruptedException{
		
		homepage.clickOnContactsTab();
		contactspage.SelectContactsCheckbox("F_Name L_Name");
		//contactspage.SelectContactsCheckbox("aaa ccc");
		
		Thread.sleep(3000);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}

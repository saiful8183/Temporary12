 package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;

public class TestBanking extends BaseClass {

	// WebDriver driver;
	@Test(priority=1)
	public void openBankSite() {
		
		logger=report.createTest("Client creation Test");

		// driver=BrowserFactory.openApplication(driver,"firefox","https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		// Capturing driver from factory class
		// Try with ( chrome,firefox,edge)

		// System.out.println(driver.getTitle()); //just for validation.to get title in
		// colsol

		// creating an object of Homepage class
		HomePage home = new HomePage(driver);
		home.loginAsManager();
		logger.info("Logged in as a manager");
		home.addCustomer(excel.getStringData("Client", 1, 0), excel.getStringData("Client", 1, 1),
				excel.getStringData("Client", 1, 2));
		logger.info("Added a client");

		/*
		 * }
		 * 
		 * @Test(priority=2) public void logout() {
		 * 
		 * logger=report.createTest("Logout test"); logger.info("Attempting to logout");
		 * logger.fail("Failed to logout"); Assert.fail();
		 */
	// It goes to base class
	/*
	 * @BeforeClass public void setup() {
	 * 
	 * driver=BrowserFactory.openApplication(driver,"firefox",
	 * "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"); }
	 * 
	  @AfterClass public void tearDown() throws InterruptedException {
	 * 
	 * Thread.sleep(1000); driver.close(); }
	 */

		
		
		
		
		
		
		
	}
}

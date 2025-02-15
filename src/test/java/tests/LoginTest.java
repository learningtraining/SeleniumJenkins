package tests;

import org.testng.annotations.Test;

import pages.LoginPage;



public class LoginTest extends BaseTest{
	
	
		
	@Test
	public void verifyLoginFeature() throws Exception {
		
		lp = new LoginPage(driver);
		
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		
		
		//verification
		lp.verifyApplicationTitle("OrangeHRM");
		
		lp.clickOnUserDropDown();
		lp.clickOnLogout();
//		
		//verification
		
		
		
	}
	
	
	//@Test
	public void verifyLoginFeature1() throws Exception {
		
		
		
//		lp.login("Admin", "admin123");
//		
//		
//		//verification
//		lp.verifyApplicationTitle("OrangeHRM");
//		
//		lp.clickOnUserDropDown();
//		lp.clickOnLogout();
		
		//verification
		
		
		
	}

}

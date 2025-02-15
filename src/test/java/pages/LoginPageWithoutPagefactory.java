package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageWithoutPagefactory {

	WebDriver driver;
	
	
	public LoginPageWithoutPagefactory(WebDriver rdriver) {
		
		
//		this.driver = driver;
		driver = rdriver;
		
		
	}
	
	
	//Identification
	
	By txtUserName = 	By.name("username");
	By txtPassword = 	By.xpath("//input[@placeholder='Password']");
	By btnLogin = 		By.tagName("button");
	By listUserDropDown =By.cssSelector(".oxd-userdropdown-name");
	By btnLogout = 		By.partialLinkText("Logo");
	
	
	//Actions/methods
	
	
	public void login(String user, String pass) {
		
		
		enterUserName(user);
		enterPassword(pass);
		clickOnLogin();
	}
	
	
	
	
	public void enterUserName(String uName) {
		
		driver.findElement(txtUserName).sendKeys(uName);
		
	}
	
	public void enterPassword(String pwd) {
		
		driver.findElement(txtPassword).sendKeys(pwd);
		
	}
	
	
	public void clickOnLogin() {
		
		driver.findElement(btnLogin).click();;
		
	}
	
	public void clickOnUserDropDown() {
		
		driver.findElement(listUserDropDown).click();
		
	}
	
	
	public void clickOnLogout() {
		
		driver.findElement(btnLogout).click();;
		
	}
	
	
	
	public void verifyApplicationTitle(String expValue) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expValue);
		
	}
	
	
	
	
	
	
	
	
	
	
	public void enterUserName() {
		
		driver.findElement(txtUserName).sendKeys("DefaultAdminValue");
		
	}
	
	public void enterPassword() {
		
		driver.findElement(txtPassword).sendKeys("Admin");
		
	}
	
	
	public boolean verifyUserNameDisplayed() {
		
//		return driver.findElement(txtUserName).isDisplayed();
		
		return verifyElementDisplayed(txtUserName);
	}
	
	
	public boolean verifyElementDisplayed(By locator) {
		
		return driver.findElement(locator).isDisplayed();
	}

}

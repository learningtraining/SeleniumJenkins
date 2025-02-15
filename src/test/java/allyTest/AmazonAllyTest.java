package allyTest;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

public class AmazonAllyTest {
	
	
	WebDriver driver;
	private static final URL scriptURL = AmazonAllyTest.class.getResource("/axe.min.js");
	
	
	@BeforeTest
	public void setup() {

			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
//			driver.get("https://www.ea.com/sports");
		
		
	}
	
	
	@Test
	public void verifyAmazonAllyTest() {
		
		
		JSONObject responseJSON =  new AXE.Builder(driver, scriptURL).analyze();
		JSONArray violations = responseJSON.getJSONArray("violations");
		
		
		if(violations.length()==0) {
			
			System.out.println("no violations !!");
			
		}
		
		else {
			
			AXE.writeResults("verifyAmazonAllyTest", responseJSON);
			Assert.assertTrue(false, AXE.report(violations));
			
		}
		
		
	}
	
	
	//@Test
	public void verifyAmazonAllyTestTitle() {
		
		
		JSONObject responseJSON =  new AXE.Builder(driver, scriptURL).include("title").analyze();
		JSONArray violations = responseJSON.getJSONArray("violations");
		
		
		if(violations.length()==0) {
			
			System.out.println("no violations !!");
			
		}
		
		else {
			
			AXE.writeResults("verifyAmazonAllyTest", responseJSON);
			Assert.assertTrue(false, AXE.report(violations));
			
		}
		
		
	}
	
	//@Test
	public void verifyAmazonAllyTestElement() {
		
		
		JSONObject responseJSON =  new AXE.Builder(driver, scriptURL).analyze(driver.findElement(By.linkText("Today's Deals")));
		JSONArray violations = responseJSON.getJSONArray("violations");
		
		
		if(violations.length()==0) {
			
			System.out.println("no violations !!");
			
		}
		
		else {
			
			AXE.writeResults("verifyAmazonAllyTest", responseJSON);
			Assert.assertTrue(false, AXE.report(violations));
			
		}
		
		
	}
	
	
	@AfterTest
	public void teardown() {
		
		
		//driver.close();
	}

}

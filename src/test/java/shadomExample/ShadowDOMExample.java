package shadomExample;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOMExample {

	
	@Test
	public void verifydomTest() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		
		
		WebElement shadowElement = driver.findElement(By.cssSelector("#shadow_host"));
		
		//Selenium 3
//		JS.executeScript("retrun javascript", shadowElement)
		
		//selenium 4
		SearchContext shadowRoot = shadowElement.getShadowRoot();
		
		
		WebElement shadow_content = shadowRoot.findElement(By.cssSelector("#shadow_content"));
		
		
		System.out.println("****************: "+shadow_content.getText());
		
		
	}
	
	
	

}

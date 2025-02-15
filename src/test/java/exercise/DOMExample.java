package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DOMExample {
	
	WebDriver driver;
	
	@Test
	public void domTestExample() {
		
		driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
//		WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
		
		WebElement shadowContent = shadowRoot.findElement(By.cssSelector(".info"));
		System.out.println("************: "+ shadowContent);
		Assert.assertEquals("some text", shadowContent.getText());
		
	}

}

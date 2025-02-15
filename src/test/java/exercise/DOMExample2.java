package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DOMExample2 {
	
	WebDriver driver;
	
	@Test
	public void domTestExample() throws Exception {
		
		driver = new ChromeDriver();
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		WebElement shadowHost = driver.findElement(By.cssSelector(".smart-ui-component"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		
		
		WebElement smartMenuOption = shadowRoot.findElement(By.cssSelector(".smart-element .smart-menu-main-container .smart-element"));
		
		
		smartMenuOption.click();
		Thread.sleep(3000);
		WebElement New_ele = smartMenuOption.findElement(By.cssSelector("smart-menu-item[label='New']"));
		New_ele.click();
	}

}

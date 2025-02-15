package shadomExample;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOMExample2 {

	
	@Test
	public void verifydomTest() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		
		
		WebElement shadowElement = driver.findElement(By.cssSelector(".smart-ui-component"));
		SearchContext shadowRoot = shadowElement.getShadowRoot();
		
		
		
		
		
		WebElement smartmenuOption = shadowRoot.findElement(By.cssSelector(".smart-element .smart-menu-main-container .smart-element"));
		
		smartmenuOption.click();
		
		
		Thread.sleep(2000);
		
		//click on New
		
		
		WebElement NewLabel = smartmenuOption.findElement(By.cssSelector("smart-menu-item[label=\"New\"]"));
		
		NewLabel.click();
		
	}
	
	
	

}

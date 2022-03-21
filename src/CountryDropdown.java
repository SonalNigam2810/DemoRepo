import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Country - Auto suggestive drop down - Base on input it will show options 
		
		driver1.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(2000L); 
		
		List<WebElement> options = driver1.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				
				option.click(); 
				break; 
			}
		
		
			
			
		}		
		
		
		
		
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CurrencyDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Currency Static Dropdown with select tag 
		
		//Note - Select method will work on drop downs which are available with select tag 
		//Note - Deselect method will work with dropdowns only if multi selection is available - It will select few and it will De-select few 

		
		WebElement staticDropdown = driver1.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		Select currency = new Select(staticDropdown); 
		currency.selectByIndex(3);
		System.out.println(currency.getFirstSelectedOption().getText()); 
		
		currency.selectByValue("AED");
		System.out.println(currency.getFirstSelectedOption().getText());
		
		currency.selectByVisibleText("INR"); 
		System.out.println(currency.getFirstSelectedOption().getText());
		

	
	}
}

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchFlights {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe"); 
		
		WebDriver dummy = new ChromeDriver(); 
		
		dummy.get("https://rahulshettyacademy.com/dropdownsPractise/");
		dummy.manage().window().maximize(); 
		
		//Validate We have landed on correct page 
		
		String title = dummy.getTitle();
		
		
		//Country - Handling Autosuggestive dropdown 
		
		dummy.findElement(By.id("autosuggest")).sendKeys("IND"); 
		Thread.sleep(2000L);
		
		List<WebElement> options = dummy.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				
				option.click(); 
				break; 
			}

		}
		
		
		// Rount Trip - Handling Radio button 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		
		// From&TO - Handling dynamic dropdown 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		dummy.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click(); 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); 
		dummy.findElement(By.xpath("(//a[@value='PNQ'])[2]")).click(); 
		
		//Depart date and Return date - Handling calender 
		
		Thread.sleep(2000L);
		dummy.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click(); 
		dummy.findElement(By.id("ctl00_mainContent_view_date2")).click(); 
		dummy.findElement(By.linkText("19")).click();
		
		//Passengers - Handle dropdown with multiple value selection 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("divpaxinfo")).click(); 
		
		Thread.sleep(2000L);
		for(int i=1; i<5; i++) {
			
				dummy.findElement(By.id("hrefIncAdt")).click();  
		}
		
		for(int j=1; j<3; j++) {
			
				dummy.findElement(By.id("hrefIncChd")).click(); 
		}
		
		for(int k=1; k<3; k++) {
				dummy.findElement(By.id("hrefIncInf")).click(); 
				k++; 
		}
		
		dummy.findElement(By.id("btnclosepaxoption")).click(); 
		System.out.println(dummy.findElement(By.id("divpaxOptions")).getText()); 
		
		//SpecialAssistance - Selecting Radio button 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click(); 
		
		//Currency - Handling dropdown with Select tag 
		
		Thread.sleep(2000L);
		WebElement CurrencyDropDown = dummy.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		Select currency = new Select(CurrencyDropDown);		
		currency.selectByVisibleText("INR"); 
		
		//Click on Search 
		
		Thread.sleep(2000L);
		dummy.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); 
		
		
}
}

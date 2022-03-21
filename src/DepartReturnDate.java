import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class DepartReturnDate {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Depart date and return date checkbox selection 
		
		driver1.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver1.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); 
		driver1.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		driver1.findElement(By.id("ctl00_mainContent_view_date2")).click(); 
		driver1.findElement(By.linkText("19")).click();
		System.out.println(driver1.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); 
		driver1.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); 
		
		//Selenium feature isEnabled() is returning incorrect value - Use below method and assertion for this 
		
		System.out.println(driver1.findElement(By.id("Div1")).getAttribute("style")); 
		driver1.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		System.out.println(driver1.findElement(By.id("Div1")).getAttribute("style")); 
		driver1.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		if(driver1.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("Is Enabled"); 
			Assert.assertTrue(true);
		}

		
	}
}

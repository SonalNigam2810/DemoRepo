import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FromToDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//From To Dynamic Dropdown with index 
		
		driver1.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver1.findElement(By.xpath("//a[@text='Belagavi (IXG)']")).click();
		
		//Note - With Value as JAI selenium identified 2 values one from From dropdown and another from To dropdown 
		//To dropdown JAI was on 2nd index so default index will be one, As from drop down was closed it was not picking Jaipur 
		//from To dropdown in this case provide index in xpath (//a[@value='JAI'])[2]
		
		driver1.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver1.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();

		//From To Dynamic Dropdown without index ( Parent child relationship locator)
		
		driver1.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver1.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Belagavi (IXG)']")).click();
		
		driver1.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver1.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']")).click();
		
	}
}

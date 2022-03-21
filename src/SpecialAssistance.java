import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class SpecialAssistance {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Checkbox selection 
		
		System.out.println(driver1.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver1.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		//System.out.println(driver1.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver1.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected()); 
		
		//Getting size of checkbox -- Number of checkboxes 
		
		System.out.println(driver1.findElements(By.xpath("//input[@type='checkbox']")).size()); 
		
	}
	
	public void testModify() {
		System.out.println("Test Modify");
	}
}

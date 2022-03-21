import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PassengersDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Web Application Automation Session\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Passenger dropdown multiple value selection with loops
		
		System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		
		driver1.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		int i = 1; 
		while(i<5){
			
			driver1.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		
//		for(int i=1; i<5; i++) {
//			driver1.findElement(By.id("hrefIncAdt")).click();
//		}
		
		int j = 1; 
		while(j<3){
			
			driver1.findElement(By.id("hrefIncChd")).click();
			j++;
			
		}
		
		int k = 1; 
		while(k<3){
			
			driver1.findElement(By.id("hrefIncInf")).click();
			k++;
			
		}
	
		driver1.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		

	
	}
}

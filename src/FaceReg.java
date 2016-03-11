import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class FaceReg {

	public static void main(String[] args) {

		// initializing WebDriver instance, opening facebook webpage,
		// maximizing browser's window
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// preparing data for input
		String firstName = "John";
		String lastName = "Stropenberg";
		String emailOrPhone = "+380991112222";
		String newPass = "45678jhj";
		
		//Birthday
		String month3Letters = "Apr";
		String day = "14";
		String year = "1987";
		boolean female = false;
		
		//entering text data
		driver.findElement(By.id("u_0_1")).sendKeys(firstName);
		driver.findElement(By.id("u_0_3")).sendKeys(lastName);
		driver.findElement(By.id("u_0_6")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_9")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_b")).sendKeys(newPass);
		
		//entering birthday into dropdown menus
		
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText(month3Letters);		
		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByValue(day);		
		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByVisibleText(year);	
		
		if (female){driver.findElement(By.id("u_0_e")).click();} 
			else {driver.findElement(By.id("u_0_f")).click();}
		
		driver.findElement(By.id("u_0_j")).click();
		
		

	}
	

}

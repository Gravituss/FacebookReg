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
		String lastName = "Stroppenberg";
		String emailOrPhone = "+380991234567";
		String newPass = "45678jhj";
		
		//Birthday
		String month3Letters = "Apr";
		int day = 14;
		int year = 1987;
		boolean female = false;
		
		//entering text data
		driver.findElement(By.id("u_0_1")).sendKeys(firstName);
		driver.findElement(By.id("u_0_3")).sendKeys(lastName);
		driver.findElement(By.id("u_0_6")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_9")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_b")).sendKeys(newPass);
		
		//entering birthday into dropdown menus

		insertText("month", month3Letters);
		
		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByVisibleText(month3Letters);		
		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByVisibleText(month3Letters);		
		
		
		
		

	}
	
	public static void insertText (String id, String txt){
		WebDriver driver2 = new FirefoxDriver();
		Select dropdownX = new Select(driver2.findElement(By.id(id)));
		dropdownX.selectByVisibleText(txt);
		
	}
	
	public static void insertText (){
		
		
	}	

}

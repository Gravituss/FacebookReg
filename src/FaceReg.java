import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceReg {

	public static void main(String[] args) {

		// initializing WebDriver instance, opening facebook webpage,
		// waiting for the last used web element appear on the webpage

		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_j")));

		// maximizing browser's window
		driver.manage().window().maximize();

		// preparing data for input (preferably change name and email, please)
		String firstName = "Gregory";
		String lastName = "Wondershultz";
		String emailOrPhone = "x4fzpors0kl364z5f@gmail.com";
		String newPass = "45sd91oj";

		// Birthday & gender
		String month3Letters = "May";
		String day = "22";
		String year = "1985";
		boolean female = false;

		// entering text data
		driver.findElement(By.id("u_0_1")).sendKeys(firstName);
		driver.findElement(By.id("u_0_3")).sendKeys(lastName);
		driver.findElement(By.id("u_0_6")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_9")).sendKeys(emailOrPhone);
		driver.findElement(By.id("u_0_b")).sendKeys(newPass);

		// entering birthday into dropdown menus
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByVisibleText(month3Letters);
		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByValue(day);
		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByVisibleText(year);

		// selecting gender depending of input data
		if (female) {
			driver.findElement(By.id("u_0_e")).click();
		} else {
			driver.findElement(By.id("u_0_f")).click();
		}

		// clicking Sign Up button
		driver.findElement(By.id("u_0_j")).click();

	}

}

package cucumberTest;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.co.nz");
		driver.findElement(By.id("lst-ib")).sendKeys("infobae");
		System.out.println("LogOut Successfully");
		driver.quit();

	}

}
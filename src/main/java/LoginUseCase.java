import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUseCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
		driver.findElement( By.id("email")).sendKeys("prudhvi.kothapalli@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Selenium");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		driver.findElement(By.name("submit_search")).submit();
		//driver.findElement(By.className("replace-2x img-responsive")).click();
		//assertThat(driver.findElement(By.id("our_price_display"),is(lessThan("$17.00"))));
		//driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.className("logout")).click();
		
		Thread.sleep(4000);
		driver.quit();
	}

	private static Object is(Object lessThan) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object lessThan(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

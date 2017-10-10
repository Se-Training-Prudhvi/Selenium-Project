import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUseCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();
		driver.findElement( By.id("email")).sendKeys("prudhvi.kothapalli@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Selenium");
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement ExWait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id("search_query_top")));
		ExWait.sendKeys("T-Shirts");
		driver.findElement(By.name("submit_search")).submit();
	    System.out.println("Wait for a sec");
	    WebElement ExWait1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")));
		ExWait1.click();
		
		//String amount = driver.findElement(By.xpath("//*[@id=\”our_price_display\"]")).getAttribute("Value");
	    //System.out.println("amount" +amount);
		//assertThat(,is(lessThan("$17.00"))));
		//driver.findElement(By.name("Submit")).click();
		
		//driver.findElement(By.className("logout")).click();
		
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


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
       driver.get("http://www.google.com");
       WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        //Insert code here to locate and click on Search button
       driver.findElement(By.name("btnK")).click();


        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        //if (actualTitle.contentEquals(expectedTitle))
        //finds the given string on the page
       if(driver.getPageSource().contains("Selenium - Web Browser Automation"))
        {
          System.out.println("Test Passed!");
        } else {
         System.out.println("Test Failed");
        }

        Thread.sleep(10000);
        //close Fire fox
        //driver.close();
        driver.quit();
    }

}

    //Write an Automation Script to search the Dress code as “Saree”. Verify
      //  there is no record for the Dress with message “0 results have been found”package AutomationAssignment;package AutomationAssignment;
    package AutomationAssignment;
    import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2sareee {  WebDriver wd;

    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    public void verifySaree () throws InterruptedException {
        wd.findElement(By.id("search_query_top")).sendKeys("saree");
        Thread.sleep(8000);


    }
    @After
    public  void exit () {wd.quit();}
}

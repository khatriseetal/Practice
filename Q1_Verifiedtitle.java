package AutomationAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Verifiedtitle {
    WebDriver wd;

    @Before
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
        Thread.sleep(5000);
    }


    @Test
    public void verifyTitle() {
        String Actualtitle = wd.getTitle();
        String ExpectedTitle = "My Store";
        Assert.assertEquals(Actualtitle, ExpectedTitle);
    }
    @After
    public  void exit () {wd.quit();}
}


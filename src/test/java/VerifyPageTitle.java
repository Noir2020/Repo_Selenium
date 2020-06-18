import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {

    @Test
    public void VerifyPageTitle() {

        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.yahoo.com/";
        driver.get(url);

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Yahoo";

        Assert.assertEquals(actualPageTitle,expectedPageTitle);


       driver.close();

    }
}

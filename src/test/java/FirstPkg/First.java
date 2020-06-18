package FirstPkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}

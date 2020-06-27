import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumInClass {


    @Test
    public void verifyErrorMsg() {

        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();


        By femaleRBLocator = By.xpath("//input[@type='radio' and @value='1']");
        WebElement femaleRB = driver.findElement(femaleRBLocator);

        boolean isFemaleSelected = femaleRB.isSelected();

        Assert.assertFalse(isFemaleSelected, "Female radio button is default selected");

        if (!isFemaleSelected) {
            femaleRB.click();
        }

        isFemaleSelected = femaleRB.isSelected();
        Assert.assertTrue(isFemaleSelected, "Female radio button is now selected");

        driver.close();
    }


    @Test
    public void dropDown() {


        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        // 1. find locator
        By monthDropdownLocator = By.id("month");
        // 2. find dropdown web-element
        WebElement monthDropdown = driver.findElement(monthDropdownLocator);
        // 3. Create object of Select Class and provide dropdownWebElement as input to Constructor.
        Select month = new Select(monthDropdown);
        // 4. use Select object to pick any value.
        month.selectByVisibleText("May");
        // month.selectByValue("9");
        // month.selectByIndex(4);
        month.selectByVisibleText("Feb");


        By dateDropdownLocator = By.id("day");
        WebElement dayDropdown = driver.findElement(dateDropdownLocator);
        Select day = new Select(dayDropdown);
        day.selectByValue("5");


        By yearDropdownLocator = By.id("year");
        WebElement yearDropdown = driver.findElement(yearDropdownLocator);
        Select year = new Select(yearDropdown);
        year.selectByValue("1987");

        }


    }


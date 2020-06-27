package TagsAttrPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingLocators {


    @Test
    public void linkedinLogin() {

        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        By findSignIn = By.className("nav__button-secondary");
        WebElement signInBox = driver.findElement(findSignIn);
        signInBox.click();


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        By idUser = By.id("username");
        WebElement element = driver.findElement(idUser);
        element.sendKeys("mmm@yahoo.com");


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        By idPassword = By.id("password");
        WebElement element1 = driver.findElement(idPassword);
        element1.sendKeys("abcd");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        By classSignIn = By.tagName("button");
        WebElement element2 = driver.findElement(classSignIn);
        element2.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }



        driver.close();

    }


}

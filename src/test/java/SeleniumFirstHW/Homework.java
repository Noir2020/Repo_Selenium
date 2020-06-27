package SeleniumFirstHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Homework {

    // Task 1
    // 1. Login to Facebook
    // 2. Fill below data in Sign Up form
    //      First name
    //      Last name
    //      Email-address
    //      Password(s)
    //      Click Sign Up button
    // 3. Verify Error msg: "Please choose a gender. You can change who can see this later."





    // Task 2
    // Go to darksky.net
    // Verify Feels-Like-temp value is in between Low-temp and High-temp

    @Test
    public void verifyErrorMsg() {

        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // First name button
        By firstNameLocator = By.xpath("//input[@name='firstname']");
        WebElement firstName = driver.findElement(firstNameLocator);
        firstName.sendKeys("Mariya");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Last name button
        By lastNameLocator = By.xpath("//input[@name='lastname']");
        WebElement lastName = driver.findElement(lastNameLocator);
        lastName.sendKeys("Bazeleva");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Email-address
        By emailLocator = By.xpath("//input[@aria-label='Mobile number or email']");
        WebElement email = driver.findElement(emailLocator);
        email.sendKeys("mb@yahoo.com");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Re-enter email-address
        By reEnterEmailLocator = By.xpath("//input[@aria-label='Re-enter email']");
        WebElement reEnterEmail = driver.findElement(reEnterEmailLocator);
        reEnterEmail.sendKeys("mb@yahoo.com");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Password button
        By passwordButtonLocator = By.xpath("//input[@type='password' and @autocomplete='new-password']");
        WebElement password = driver.findElement(passwordButtonLocator);
        password.sendKeys("kkk");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Sign Up button
        By signUpButtonLocator = By.xpath("//button[@type='submit' and @name='websubmit']");
        WebElement signUp = driver.findElement(signUpButtonLocator);
        signUp.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Verify Error msg
        By redErrorMsgBoxLocator = By.xpath("//div[contains(text(), 'Please choose a gender')]");
        WebElement redErrorMsgBox = driver.findElement(redErrorMsgBoxLocator);

        String redErrorMsgBoxText = redErrorMsgBox.getText();
        //System.out.println(redErrorMsgBoxText);
        String compareTo = "Please choose a gender. You can change who can see this later.";
        Assert.assertEquals(redErrorMsgBoxText, compareTo);


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.close();
    }

    @Test
    public void darkSkyTemperature () {

        System.setProperty("webdriver.chrome.driver", "/Users/mariyabazeleva/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.darksky.net");
        driver.manage().window().maximize();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Feels-Like-Temp
        By feelsLikeLocator = By.xpath("//span[@class='feels-like-text']");
        WebElement feelsLike = driver.findElement(feelsLikeLocator);

        String feelsLikeText = feelsLike.getText();
//      System.out.println(feelsLikeText);

        int i = Integer.parseInt(feelsLikeText.substring(0,2));
        System.out.println(i);



        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Low-Temp
        By LowTempLocator = By.xpath("//span[@class='low-temp-text']");
        WebElement lowTemp = driver.findElement(LowTempLocator);

        String lowTempText = lowTemp.getText();
//      System.out.println(lowTempText);

        int y = Integer.parseInt(lowTempText.substring(0,2));
        System.out.println(y);


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        // High-Temp
        By highTempLocator = By.xpath("//span[@class='high-temp-text']");
        WebElement highTemp = driver.findElement(highTempLocator);

        String highTempText = highTemp.getText();
//      System.out.println(highTempText);

        int k = Integer.parseInt(highTempText.substring(0,2));
        System.out.println(k);


        try{
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(i>y & i<k) {
            System.out.println("Feels-Like-temp in between Low-temp and High-temp");
        }else{
            System.out.println("Wrong calculation");
        }



        driver.close();

    }

}

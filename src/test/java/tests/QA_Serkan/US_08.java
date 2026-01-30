package tests.QA_Serkan;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_08 {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @Test
    public void test0801(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters email adress contains certainly '@' and '.com'
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys("hesoric947@tohup.com"+Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests whether green text of 'Check your mail inbox' is appeared or not.
        Assert.assertTrue(loginPage.greenCheckInboxText.isDisplayed());
        //Driver.closeDriver();


    }
    @Test
    public void test0805(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters email adress not registered before in system.
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests the existence of the warning message "user not found"
        Assert.assertTrue(loginPage.warningOfUserNotFoundText.isDisplayed());
        //Driver.closeDriver();


    }
    @Test
    public void test0806(){

        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirm cookie
        //homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //User wants to go back login section and click back login
        loginPage.gobackLoginLink.click();
        //User tests to see the login section back
        Assert.assertTrue(loginPage.loginSectionLoginText.isDisplayed());
        //Driver.closeDriver();


    }

    @Test
    public void test0807(){

        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirm cookie
        //homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters the valid email adress
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys("hesoric947@tohup.com"+Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests to see the "Check your inbox for the request" in the upper corner
        Assert.assertTrue(loginPage.greenCheckInboxText.isDisplayed());
        //User tests to see the login section back
        Assert.assertTrue(loginPage.loginSectionLoginText.isDisplayed());
        Driver.closeDriver();


    }





















    }




























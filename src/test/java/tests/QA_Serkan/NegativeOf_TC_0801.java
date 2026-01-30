package tests.QA_Serkan;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

public class NegativeOf_TC_0801 {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();


    @Test
    public void test0802(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters email adress without ".com "
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys("hesoric947@tohup"+ Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests whether green text of 'Check your mail inbox' is appeared or not.
        Assert.assertTrue(loginPage.warningOfInvalidEmailText.isDisplayed());
        //Driver.closeDriver();


    }


    @Test
    public void test0803(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters email adress without "@"
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys("hesoric947tohup.com"+ Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests whether green text of 'Check your mail inbox' is appeared or not.
        Assert.assertTrue(loginPage.forgotPasswordPageText.isDisplayed());
        //Driver.closeDriver();



    }

    @Test
    public void test0804(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on Log_in button top-right corner of the home page
        homePage.loginLink.click();
        //click on 'forgot my password' button
        loginPage.loginSectionForgotPasswordLink.click();
        //click on E mail textbox and enters email adress without "@" and ".com"
        loginPage.forgotPasswordSectionEmailTextbox.sendKeys("hesoric947tohup"+ Keys.ENTER);
        //click on 'send request' button
        loginPage.forgotPasswordSectionSendRequestButton.click();
        //User tests whether green text of 'Check your mail inbox' is appeared or not.
        Assert.assertTrue(loginPage.forgotPasswordPageText.isDisplayed());
        Driver.closeDriver();



    }


}

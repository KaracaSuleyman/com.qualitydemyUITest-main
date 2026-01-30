package tests.QA_Serkan;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ObjectInputFilter;

public class US_06 {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    Faker faker = new Faker();
    @Test
    public void test0601(){
    //User goes to "qa.qualitidemy.com" main page
     Driver.getDriver().get("https://qa.qualitydemy.com/");
     HomePage homePage = new HomePage();
     //confirms cookie
    homePage.cookieKabul.click();
    //click on sign up button top-right corner of the home page
    homePage.signupLink.click();
    //click on the first name textbox and inserts first name with at least two letters
    loginPage.firstNameTextbox.sendKeys(faker.name().firstName());
    //click on the last name textbox and inserts the last name with at least two letters
    loginPage.lastNameTextbox.sendKeys(faker.name().lastName());
    //click on E mail textbox and enters email adress
    loginPage.emailTextbox.sendKeys(faker.internet().emailAddress());
    //click on password textbox and enters password
    loginPage.passwordTextbox.sendKeys(faker.internet().password(10,15,true,true,true));
    //click on Sign up button
    loginPage.blueSignupButton.click();
    //Users tests whether it is visible a green registration message or not.
    Assert.assertTrue(loginPage.signupSuccessfullyDoneText.isDisplayed());
    //Users tests whether was redirected to login page or not
    Assert.assertTrue(loginPage.loginSectionLoginText.isDisplayed());
    //Driver.closeDriver();




    }
    @Test
    public void test0602(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on log in button top-right corner of the home page
        homePage.loginLink.click();
        //Then User tests whether was directed to login page or not
        Assert.assertTrue(loginPage.loginSectionLoginText.isDisplayed());
        //Driver.closeDriver();


    }
    @Test
    public void test0603(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName()+Keys.ENTER);
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName()+Keys.ENTER);
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on password textbox and enters password
        loginPage.passwordTextbox.sendKeys(faker.internet().password(9,15,true,true,true)+Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //Users tests whether it is visible a green registration message or not.
        Assert.assertTrue(loginPage.signupSuccessfullyDoneText.getText().contains("Your registration has been successfully done"));
        //Driver.closeDriver();




    }

    @Test
    public void test0607(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName()+Keys.ENTER);
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName()+Keys.ENTER);
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters
        loginPage.passwordTextbox.sendKeys("Asd.1234"+Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //Users tests whether it is visible a green registration message or not.
        Assert.assertTrue(loginPage.signupSuccessfullyDoneText.isDisplayed());
        //Driver.closeDriver();


    }
    @Test
    public void test0613() {
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        //click on E mail textbox and enters email adress contains certainly '@' and '.com'
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters.
        loginPage.passwordTextbox.sendKeys(faker.internet().password(10,12,true,true,true) + Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //Users tests whether it is visible a green registration message or not.
        Assert.assertTrue(loginPage.signupSuccessfullyDoneText.isDisplayed());
        //Driver.closeDriver();

    }

    @Test
    public void test0617() {
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        //click on E mail textbox and enters email adress which PREVIOUSLY USED
        loginPage.emailTextbox.sendKeys("befos53092@ibansko.com" + Keys.ENTER);
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters.
        loginPage.passwordTextbox.sendKeys(faker.internet().password(10, 12, true, true, true) + Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //Users tests seeing the Warning message because off the email previousy used.
        Assert.assertTrue(loginPage.redAlreadyRegisteredText.isDisplayed());
        Driver.closeDriver();
    }






}

package tests.QA_Serkan;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class NegativeOf_TC_0607 extends TestBaseRapor {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    Faker faker = new Faker();

    @Test
    public void test0608(){
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using password without special character", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        extentTest.info("User goes to homepage");

        //confirms cookie
        homePage.cookieKabul.click();
        extentTest.info("confirms cookie");

        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");

        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName()+ Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");

        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName()+Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");

        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress");

        //click on password textbox and enters password which contains uppercase, lowercase, numbers.
        loginPage.passwordTextbox.sendKeys("Anhu1234"+Keys.ENTER);
        extentTest.info("click on password textbox and enters password which contains uppercase, lowercase, numbers.");

        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");

        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertFalse(loginPage.signupSuccessfullyDoneText.getText().contains("Your registration has been successfully done"));
        extentTest.pass("REGISTRATION HAD BEEN DONE WITHOUT SPECIAL CHARACTER,THAT IS A BUG");

        //Driver.closeDriver();





    }
    @Test
    public void test0609() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using password without DIGITS", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        extentTest.info("confirms cookie");
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress");
        //click on password textbox and enters password which contains uppercase, lowercase,special characters.
        loginPage.passwordTextbox.sendKeys("Asd,.err" + Keys.ENTER);
        extentTest.info("click on password textbox and enters password which contains uppercase, lowercase,special characters.");
        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertFalse(loginPage.signupSuccessfullyDoneText.getText().contains("Your registration has been successfully done"));
        extentTest.pass("REGISTRATION HAD BEEN DONE WITHOUT digits CHARACTER,THAT IS A BUG");
        //Driver.closeDriver();

    }

    @Test
    public void test0610() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using password without LOWER CASE", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        extentTest.info("User goes to homepage");
        //confirms cookie
        //homePage.cookieKabul.click();
        extentTest.info("confirms cookie");
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress");
        //click on password textbox and enters password which contains uppercase,special characters and number.
        loginPage.passwordTextbox.sendKeys("A48,.1254" + Keys.ENTER);
        extentTest.info("click on password textbox and enters password which contains uppercase,special characters and number.");
        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        extentTest.pass("User verifies that is not to see the text of \"Your registration has been successfully done\".");
        //Driver.closeDriver();
    }

    @Test
    public void test0611() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using password without UPPER CASE", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        extentTest.info("User goes to homepage");
        //confirms cookie
        //homePage.cookieKabul.click();
        extentTest.info("confirms cookie");
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress");
        //click on password textbox and enters password which contains special characters,lowercase and number.
        loginPage.passwordTextbox.sendKeys("bhz48,.1254" + Keys.ENTER);
        extentTest.info("click on password textbox and enters password which contains special characters,lowercase and number.");
        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        extentTest.pass("User verifies that is not to see the text of \"Your registration has been successfully done\".");
        //Driver.closeDriver();
    }
    @Test
    public void test0614() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using email without '.COM'", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        //click on E mail textbox and enters email adress without ".com"
        loginPage.emailTextbox.sendKeys("ser@liver" + Keys.ENTER);
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters.
        loginPage.passwordTextbox.sendKeys("Abh-,89521" + Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        //Driver.closeDriver();
    }

    @Test
    public void test0615() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using email without '@'", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        extentTest.info("User goes to homepage");
        //confirms cookie
        //homePage.cookieKabul.click();
        extentTest.info("confirms cookie");
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");
        //click on E mail textbox and enters email adress without "@" character.
        loginPage.emailTextbox.sendKeys("dermancompany.com" + Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress without \"@\" character");
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters
        loginPage.passwordTextbox.sendKeys("Azd,1257656" + Keys.ENTER);
        extentTest.info("click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters");
        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        extentTest.pass("User verifies that is not to see the text of \"Your registration has been successfully done\".");
        //Driver.closeDriver();
    }

    @Test
    public void test0616() {
        //User goes to "qa.qualitidemy.com" main page
        extentTest= extentReports.createTest("signUp Test using email without '@' and '.COM'", "User goes to homepage");
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        extentTest.info("User goes to homepage");
        //confirms cookie
        //homePage.cookieKabul.click();
        extentTest.info("confirms cookie");
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        extentTest.info("click on sign up button top-right corner of the home page");
        //click on the first name textbox and inserts first name
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName() + Keys.ENTER);
        extentTest.info("click on the first name textbox and inserts first name");
        //click on the last name textbox and inserts the last name
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName() + Keys.ENTER);
        extentTest.info("click on the last name textbox and inserts the last name");
        //click on E mail textbox and enters email adress without '@' and '.COM' characters.
        loginPage.emailTextbox.sendKeys("fermancompany.net" + Keys.ENTER);
        extentTest.info("click on E mail textbox and enters email adress without '@' and '.COM' characters.");
        //click on password textbox and enters password which contains uppercase, lowercase, numbers and special characters
        loginPage.passwordTextbox.sendKeys("Wer.12584" + Keys.ENTER);
        extentTest.info("lick on password textbox and enters password which contains uppercase, lowercase, numbers and special characters");
        //click on Sign up button
        loginPage.blueSignupButton.click();
        extentTest.info("click on Sign up button");
        //User verifies that is not to see the text of "Your registration has been successfully done".
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        extentTest.pass("User verifies that is not to see the text of \"Your registration has been successfully done\".");
        Driver.closeDriver();
    }

}

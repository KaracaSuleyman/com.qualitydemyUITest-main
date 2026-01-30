package tests.QA_Serkan;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

public class negativeOf_TC_0603 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    Faker faker = new Faker();
    @Test
    public void test0604(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name  with less than two letters
        loginPage.firstNameTextbox.sendKeys("l"+Keys.ENTER); //*****please change it at every test execution
        //click on the last name textbox and inserts the last name  with at least two letters
        loginPage.lastNameTextbox.sendKeys(faker.name().lastName()+Keys.ENTER);
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on password textbox and enters password
        loginPage.passwordTextbox.sendKeys(faker.internet().password(6,9,true,true,true)+Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //User verifies that is not being at verification_page
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        //Driver.closeDriver();


    }

    @Test
    public void test0605(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie
        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name  with at least two letters
        loginPage.firstNameTextbox.sendKeys(faker.name().firstName()+Keys.ENTER);
        //click on the last name textbox and inserts the last name with less than two letters
        loginPage.lastNameTextbox.sendKeys("u"+Keys.ENTER);//*****please change it at every test execution
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on password textbox and enters password
        loginPage.passwordTextbox.sendKeys(faker.internet().password(6,9,true,true,true)+Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //User verifies that is not being at verification_page
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        //Driver.closeDriver();


    }

    @Test
    public void test0606(){
        //User goes to "qa.qualitidemy.com" main page
        Driver.getDriver().get("https://qa.qualitydemy.com/");
        //confirms cookie

        //homePage.cookieKabul.click();
        //click on sign up button top-right corner of the home page
        homePage.signupLink.click();
        //click on the first name textbox and inserts first name  with less than two letters
        loginPage.firstNameTextbox.sendKeys("f"+Keys.ENTER);//*****please change it at every test execution
        //click on the last name textbox and inserts the last name with less than two letters
        loginPage.lastNameTextbox.sendKeys("d"+Keys.ENTER);//*****please change it at every test execution
        //click on E mail textbox and enters email adress
        loginPage.emailTextbox.sendKeys(faker.internet().emailAddress()+Keys.ENTER);
        //click on password textbox and enters password
        loginPage.passwordTextbox.sendKeys(faker.internet().password(6,9,true,true,true)+Keys.ENTER);
        //click on Sign up button
        loginPage.blueSignupButton.click();
        //User verifies that is not being at verification_page
        Assert.assertTrue(loginPage.signupPageText.isDisplayed());
        Driver.closeDriver();


    }

}

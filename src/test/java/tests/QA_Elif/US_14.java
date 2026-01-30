package tests.QA_Elif;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_14 {
    @Test
    public void test1401(){

        /*
         User goes to https://qa.qualitydemy.com homepage
         accepts the cookie
         click the login link
         Writes email address to email textbox
         Writes password to password textbox
         Click the login button
         Hover over the profile tab
         Makes click on Purchase history from dropdown list when cursor is over Profile tab
         Clicks the Invoice button on the opened page
         Tests that you go to the invoice page
         */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");

        RegistrationPage registrationPage=new RegistrationPage();
        ReusableMethods.bekle(5);
        //Hover over the profile tab
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(3);
        registrationPage.profileImageButton.click();
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(3);

        //Makes click on Purchase history from dropdown list when cursor is over Profile tab
        registrationPage.purchaseHistoryLink.click();
        ReusableMethods.bekle(3);

        //Clicks the Invoice button on the opened page
        registrationPage.invoiceButton.click();

        ReusableMethods.bekle(3);

        //Tests that you go to the invoice page
        Assert.assertTrue(registrationPage.invoicepage.isDisplayed());

        ReusableMethods.logOut();

        Driver.quitDriver();

    }
    @Test
    public void test1402(){

        /*
        User goes to https://qualitydemy.com homepage
        accepts the cookie
        click the login link
        Writes email address to email textbox
        Writes password to password textbox
        Click the login button
        Hover over the profile tab
        Makes click on Purchase history from dropdown list when cursor is over Profile tab
        Clicks the course name button on the opened page
        Tests that you go to the course name
         */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);
        RegistrationPage registrationPage=new RegistrationPage();

        //Hover over the profile tab
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(3);

        //Makes click on Purchase history from dropdown list when cursor is over Profile tab
        registrationPage.purchaseHistoryLink.click();
        ReusableMethods.bekle(3);

        //Clicks the course name button on the opened page
        registrationPage.CourseNameText.click();

        ReusableMethods.bekle(3);

        //Tests that you go to the course name page
        Assert.assertTrue(registrationPage.coursePageLink.isDisplayed());

        Driver.quitDriver();


    }
}

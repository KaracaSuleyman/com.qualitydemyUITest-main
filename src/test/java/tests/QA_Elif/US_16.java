package tests.QA_Elif;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_16 {

    @Test
    public void test1601() {
/*
    User goes to https://qualitydemy.com homepage
    accepts the cookie
    Clicks the log in link
    Writes the email address to the email textbox
    Writes password to password textbox
    Clicks the login button
    Hover over profile tab
    When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
    Clicks the Account button on the page that opens
    It confirms that it went to the Credentials page.

     Writes password to current password textbox
     Verifies that the current password has been entered
     Writes new password to new password textbox
     Verifies that a new password has been entered
     Writes new password leaver to Confirm password textbox
     Confirm password (new p) confirms retyped
     */


        ReusableMethods.loginMethodu("userNameElif", "passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();
        //ReusableMethods.bekle(3);

        //Hover over the profile tab
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(7);

        //Makes click on User profile from dropdown list when cursor is over Profile tab
        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        //Clicks the Account button on the page that opens
        registrationPage.accountButton.click();

        //It confirms that it went to the Credentials page.
        Assert.assertTrue(registrationPage.credentialsTitle.isDisplayed());

        //Writes password to current password textbox
        ReusableMethods.bekle(3);
        actions.scrollToElement(registrationPage.currentPasswordTextbox);
        registrationPage.currentPasswordTextbox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //Assert.assertTrue(registrationPage.currentPasswordTextbox.isDisplayed());
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Faker faker = new Faker();
        actions.click(registrationPage.newPasswordTextbox).sendKeys(faker.internet().password()).perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(registrationPage.newPasswordTextbox.isDisplayed());

        String newPassword = registrationPage.newPasswordTextbox.getText();
        actions.click(registrationPage.confirmPasswordTextbox).sendKeys(newPassword);
        String newPasswordAgain = registrationPage.confirmPasswordTextbox.getText();
        ReusableMethods.bekle(3);

        //Verifies that the current password has been entered
        Assert.assertTrue(newPassword.contains(newPasswordAgain));
        System.out.println("Password confirmed");

        Driver.quitDriver();

    }

    @Test
    public void test1602() {
        /*
        User goes to https://qualitydemy.com homepage
        accepts the cookie
        Clicks the log in link
        Writes the email address to the email textbox
        Writes password to password textbox
        Clicks the login button
        Hover over profile tab
        When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
        Clicks the Account button on the page that opens
        It confirms that it went to the Credentials page.
        Writes new password to new password textbox
        Writes new password leaver to Confirm password textbox
        Clicks the save button!!!! no save button
        Save changes if New p and Confirm p are the same (if there was a Save button)
         */

        ReusableMethods.loginMethodu("userNameElif", "passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();
        //ReusableMethods.bekle(3);

        //Hover over the profile tab
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(7);

        //Makes click on User profile from dropdown list when cursor is over Profile tab

        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        //Clicks the Account button on the page that opens

        registrationPage.accountButton.click();

        //It confirms that it went to the Credentials page.

        Assert.assertTrue(registrationPage.credentialsTitle.isDisplayed());

        //Writes password to current password textbox
        ReusableMethods.bekle(3);
        actions.scrollToElement(registrationPage.currentPasswordTextbox);
        registrationPage.currentPasswordTextbox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //Assert.assertTrue(registrationPage.currentPasswordTextbox.isDisplayed());
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Faker faker = new Faker();
        actions.click(registrationPage.newPasswordTextbox).sendKeys(faker.internet().password()).perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(registrationPage.newPasswordTextbox.isDisplayed());

        String newPassword = registrationPage.newPasswordTextbox.getText();
        actions.click(registrationPage.confirmPasswordTextbox).sendKeys(newPassword);
        String newPasswordAgain = registrationPage.confirmPasswordTextbox.getText();
        ReusableMethods.bekle(3);

        //Verifies that the current password has been entered
        Assert.assertTrue(newPassword.contains(newPasswordAgain));
        System.out.println("Password confirmed");
        Assert.assertTrue(registrationPage.userProfileSaveButton.isDisplayed());
        System.out.println("No Save Button!!! This is a BUG!");

        Driver.quitDriver();

    }

    @Test
    public void test1603() {
        /*
        User goes to https://qualitydemy.com homepage
        accepts the cookie
        Clicks the log in link
        Writes the email address to the email textbox
        Writes password to password textbox
        Clicks the login button
        Hover over profile tab
        When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
        Clicks the Account button on the page that opens
        It confirms that it went to the Credentials page.
        Writes new password to new password textbox
        Writes new password leaver to Confirm password textbox
        Clicks the save button!!!! no save button
        If New p and Confirm p are different, Mismatch password warning message is displayed.
         */

        ReusableMethods.loginMethodu("userNameElif", "passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();
        //ReusableMethods.bekle(3);

        //Hover over the profile tab
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(7);

        //Makes click on User profile from dropdown list when cursor is over Profile tab

        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        //Clicks the Account button on the page that opens

        registrationPage.accountButton.click();

        //It confirms that it went to the Credentials page.

        Assert.assertTrue(registrationPage.credentialsTitle.isDisplayed());

        //Writes password to current password textbox
        ReusableMethods.bekle(3);
        actions.scrollToElement(registrationPage.currentPasswordTextbox);
        registrationPage.currentPasswordTextbox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //Assert.assertTrue(registrationPage.currentPasswordTextbox.isDisplayed());
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Faker faker = new Faker();
        actions.click(registrationPage.newPasswordTextbox).sendKeys(faker.internet().password()).perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(registrationPage.newPasswordTextbox.isDisplayed());

        String newPassword = registrationPage.newPasswordTextbox.getText();
        actions.click(registrationPage.confirmPasswordTextbox).sendKeys(newPassword);
        String newPasswordAgain = registrationPage.confirmPasswordTextbox.getText();
        ReusableMethods.bekle(3);

        //Verifies that the current password has been entered
        Assert.assertTrue(newPassword.contains(newPasswordAgain));
        System.out.println("Password confirmed");
        Assert.assertTrue(registrationPage.userProfileSaveButton.isDisplayed());
        System.out.println("No Save Button!!! This is a BUG!");


        Driver.quitDriver();
    }
}

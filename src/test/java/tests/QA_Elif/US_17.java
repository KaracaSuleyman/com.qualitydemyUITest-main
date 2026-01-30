package tests.QA_Elif;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_17 {
    @Test
    public void test1701() {
        /*
          User goes to https://qualitydemy.com homepage
          accepts the cookie
          Clicks the log in link
          Writes the email address to the email textbox
          Writes password to password textbox
          Clicks the login button
          Hover over profile tab
          When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
          Clicks the Photo button on the page that opens
          Clicks on Datei Auswählen on the page that opens
          Selects jpg/png file from the opened computer folder (file-input stream)
          When he selects the image file, he clicks on Öffnen.
          Clicks the upload button
          Tests that the image is loaded
         */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();

        //Hover over the profile tab
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(5);

        //When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Clicks the Photo button on the page that opens
        registrationPage.photoButton.click();
        ReusableMethods.bekle(5);

        //Selects jpg/png file from the opened computer folder (file-input stream)
        //String FilePath = System.getProperty("user.home")+"\\Desktop\\3cf4504a-bc3b-4c0e-80ec-8d9b5a8cd55e.jpg";
        registrationPage.chooseAFileButton.sendKeys("C:\\Users\\User\\IdeaProjects\\com.qdUIProje\\src\\test\\java\\tests\\QA_Elif\\3cf4504a-bc3b-4c0e-80ec-8d9b5a8cd55e.jpg");
        ReusableMethods.bekle(3);

        //Clicks the upload button
        registrationPage.uploadButton.click();

        //Tests that the image is loaded
        Assert.assertTrue(registrationPage.photoSuccessfullyMessageText.isDisplayed());
        ReusableMethods.bekle(3);

        Driver.quitDriver();

    }
    @Test
    public void test1702() {
         /*
           User goes to https://qualitydemy.com homepage
           accepts the cookie
           Clicks the log in link
           Writes the email address to the email textbox
           Writes password to password textbox
           Clicks the login button
           Hover over profile tab
           When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
           Clicks the Photo button on the page that opens
           Clicks on Datei Auswählen on the page that opens
           Selects excel file from the opened computer folder (file-input stream)
           When you select the Excel file, Öffnen clicks
           Clicks the upload button
           Verifies that it gives a warning for a plug-in other than the image format. (Red at top right)
           */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();

        //Hover over the profile tab
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(5);

        //When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Clicks the Photo button on the page that opens
        registrationPage.photoButton.click();
        ReusableMethods.bekle(3);

        //Clicks on Datei Auswählen on the page that opens
        //Selects excel file from the opened computer folder
        registrationPage.chooseAFileButton.sendKeys("C:\\Users\\User\\IdeaProjects\\com.qdUIProje\\src\\test\\java\\tests\\QA_Elif\\Teams (1).xlsx");
        ReusableMethods.bekle(3);

        //Clicks the upload button
        registrationPage.uploadButton.click();

        //Verifies that it gives a warning for a plug-in other than the image format. (Red at top right)
        Assert.assertTrue(registrationPage.warningMessageText.isDisplayed());
        ReusableMethods.bekle(3);
        Driver.quitDriver();
    }
}

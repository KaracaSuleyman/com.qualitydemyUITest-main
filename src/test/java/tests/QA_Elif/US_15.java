package tests.QA_Elif;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_15 {

    @Test
    public void test1501(){
         /*
        User goes to https://qualitydemy.com homepage
        accepts the cookie
        click the login link
        Writes email address to email textbox
        writes password to password textbox
        Click the login button
        Hover over the profile tab
        Makes click on User profile from dropdown list when cursor is over Profile tab
        Clicks the First name textbox on the opened page
        Tests that text can be written/entered in the First Name textbox
        Deletes the text in the First Name textbox
        Writes text to First Name textbox
        Clicks the Last Name textbox on the opened page
        Tests that text can be entered in the Last Name textbox
        Deletes the text in the Last Name textbox
        Writes text to last Name textbox
        Clicks the Title textbox on the opened page
        Tests that text can be entered in the title textbox
        Deletes the text in the title textbox
        Writes text to title textbox
        Clicks on Your Skills textbox on the opened page
        Tests that text can be entered in the Your Skills textbox
        Deletes the text in the Your skills textbox
        Writes text to your skills textbox
        Clicks on the Biography textbox on the opened page
        Tests that text can be entered in the Biography textbox
        Deletes the text in the Biography textbox
        Writes text to Biography textbox
        Click on the Add your tweeter link textbox on the opened page.
        Tests that text can be entered in the tweeter textbox
        Click on the Add your Facebook link textbox on the opened page.
        Tests that text can be entered in the Facebook textbox
        Click on the Add your linkedin link textbox on the opened page.
        Tests that text can be entered into the Linkedin textbox
        Clicks the save button
        Tests that the changes are saved (if the deleted value differs from the new value, it is saved)

         */

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage=new RegistrationPage();

        //Hover over the profile tab
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(5);

        //Makes click on User profile from dropdown list when cursor is over Profile tab
        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        //Clicks the First name textbox on the opened page
        registrationPage.firstNameTextbox.click();

        //Deletes the text in the First Name textbox
        registrationPage.firstNameTextbox.clear();

        //Writes text to First Name textbox
        registrationPage.firstNameTextbox.sendKeys("Team");

        //Clicks the Last Name textbox on the opened page
        registrationPage.lastNameTextbox.click();
        registrationPage.lastNameTextbox.clear();
        //Tests that text can be entered in the Last Name textbox
        Assert.assertTrue(registrationPage.lastNameTextbox.isEnabled());
        registrationPage.lastNameTextbox.sendKeys("04");

        //Clicks the Title textbox on the opened page
        registrationPage.titletextBox.click();
        registrationPage.titletextBox.clear();
        //Tests that text can be entered in the title textbox
        Assert.assertTrue(registrationPage.titletextBox.isEnabled());
        registrationPage.titletextBox.sendKeys("Super QA");

        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //actions.scrollToElement(registrationPage.yourSkillsTextbox).perform();

        //Clicks on Your Skills textbox on the opened page
        //registrationPage.yourSkillsTextbox.click();


        //Tests that text can be entered in the Your Skills textbox
        // Assert.assertTrue(registrationPage.yourSkillsTextbox.isEnabled());
/*
        registrationPage.yourSkillsTextbox.sendKeys("Selenium");
       actions
               .click(registrationPage.yourSkillsTextbox)
               .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
               .sendKeys("elenium")
                .sendKeys(Keys.ENTER)
               .perform();
 */

        //Clicks on the Biography textbox on the opened page
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().frame(registrationPage.iframeBiographyTextbox);
        ReusableMethods.bekle(3);
        registrationPage.biographyTextbox.click();
        registrationPage.biographyTextbox.clear();

        //Tests that text can be entered in the Biography textbox
        Assert.assertTrue(registrationPage.biographyTextbox.isEnabled());
        registrationPage.biographyTextbox.sendKeys("WiseQuarter");
        Driver.getDriver().switchTo().parentFrame();

        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        //Click on the Add your tweeter link textbox on the opened page.
        registrationPage.twetterTextbox.click();
        //Tests that text can be entered in the tweeter textbox
        Assert.assertTrue(registrationPage.twetterTextbox.isEnabled());
        //Click on the Add your Facebook link textbox on the opened page.
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        registrationPage.facebookTextbox.click();
        //Tests that text can be entered in the Facebook textbox
        Assert.assertTrue(registrationPage.facebookTextbox.isEnabled());
        ReusableMethods.bekle(5);
        //Click on the Add your linkedin link textbox on the opened page.
        registrationPage.linkedinTextbox.click();
        //Tests that text can be entered into the Linkedin textbox
        Assert.assertTrue(registrationPage.linkedinTextbox.isEnabled());

        //Clicks the save button
        registrationPage.userProfileSaveButton.click();
        ReusableMethods.bekle(5);

        //Tests that the changes are saved
        registrationPage.updateSuccessfullyAlert.isDisplayed();

        String actResult="Team";
        String expResult=registrationPage.firstNameTextbox.getText();
        Assert.assertTrue(actResult.contains(expResult));
        System.out.println("Team");

        String actResult2="04";
        String expResult2=registrationPage.lastNameTextbox.getText();
        Assert.assertTrue(actResult2.contains(expResult2));
        System.out.println("04");

         /*
        String actResult3="Selenium";
        String expResult3=registrationPage.yourSkillsTextbox.getText();
        Assert.assertTrue(actResult3.contains(expResult3));
        System.out.println("Selenium");
         */

        String actResult4="Super QA";
        String expResult4=registrationPage.titletextBox.getText();
        Assert.assertTrue(actResult4.contains(expResult4));
        System.out.println("Super QA");

        Driver.getDriver().switchTo().frame(registrationPage.iframeBiographyTextbox);
        String actResult5="WiseQuarter";
        String expResult5=registrationPage.biographyTextbox.getText();
        Assert.assertTrue(actResult5.contains(expResult5));
        System.out.println("WiseQuarter");
        Driver.getDriver().switchTo().parentFrame();
        //Driver.closeDriver();
    }

    @Test
    public void test1502(){
        /*
        User goes to https://qualitydemy.com homepage
        accepts the cookie
        Clicks the log in link
        Writes the email address to the email textbox
        Writes password to password textbox
        Clicks the login button
        Hover over profile tab (click on My Courses link)
        When the cursor is on the Profile tab, clicks on the user profile from the dropdown list.
        Clicks the profile button on the page that opens (according to the 2nd scenario, this is direct)
        It confirms that it went to the User Profile page.
         */

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage=new RegistrationPage();
        ReusableMethods.bekle(3);

        //Hover over the profile tab
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(registrationPage.profileImageButton).perform();
        ReusableMethods.bekle(5);
        actions.moveToElement(registrationPage.Profiledropdown).perform();
        ReusableMethods.bekle(7);

        //Makes click on User profile from dropdown list when cursor is over Profile tab
        registrationPage.userProfileButton.click();
        ReusableMethods.bekle(3);

        //Clicks the profile button on the page that opens
        registrationPage.ProfileButton.click();

        //It confirms that it went to the User Profile page.
        Assert.assertTrue(registrationPage.userProfileTitleText.isDisplayed());
        System.out.println("Went to the User Profile page,with the Profile button");
        Driver.closeDriver();

    }


}

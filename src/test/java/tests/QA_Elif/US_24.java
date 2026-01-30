package tests.QA_Elif;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_24 extends TestBaseRapor {

    @Test
    public void test2401() {
        /*
User goes to https://qualitydemy.com homepage
accepts the cookie
Clicks the log in link
Writes the email address to the email textbox
Writes password to password textbox
Clicks the login button
Clicks on the Instructor link
Tests that the Dashboard panel appears.
Clicks the Course manager tab
Click on the three dots under Actions
Click on Edit this course in the dropdown menu that pops up.
Clicks the Outcomes menu
Writes data into Outcomes textbox
Clicks the "+" button
Makes a click on the new outcomes textbox (there's a - next to it, but okay)
Verifies that the new outcomes textbox is enabled
Writes text to a new outcomes textbox (we're doing this part for use too)
Clicks the Finish menu
Clicks on the Submit menu
It waits for 5 seconds, for the update warning text to pass.
Clicks the View on frontend tab
Tests that Outcomes list is visible

Returns to the previous page (edit course page)
Clicks the "-" button
Clicks the Finish menu
Clicks on the Submit menu
Clicks the View on frontend tab
Tests that the Outcomes list has been updated (what-you-get-box)
Compares the expected result with the actual result
         */
        extentTest=extentReports.createTest("_US24","The functions of the course_form/course_edit Outcomes section should work correctly");
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);
        RegistrationPage registrationPage = new RegistrationPage();
        extentTest.info("went to the page and logged in with username and password");
        //Clicks on the Instructor link
        Actions actions = new Actions(Driver.getDriver());
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(5);
        extentTest.info("Clicked on the Instructor link");
        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);
        extentTest.info("Tested that the Dashboard panel appears");
        //Clicks the Course manager tab
        registrationPage.courseManagerLink.click();
        ReusableMethods.bekle(3);
        extentTest.info("Clicked the Course manager tab");
        //Click on the three dots under Actions
        registrationPage.dreiDotDropdown.click();
        extentTest.info("Clicked on the three dots under Actions");
        //Click on Edit this course in the dropdown menu that pops up.
        ReusableMethods.bekle(3);
        registrationPage.editThisCourseDropdown.click();
        extentTest.info("Clicked on Edit this course in the dropdown menu that pops up");
        //Clicks on the outcomes menu
        registrationPage.outcomesButton.click();
        extentTest.info("Clicked on the outcomes menu");
        //Writes data into the outcomes textbox
        registrationPage.outcomesTextbox.sendKeys("certificate");
        extentTest.info("Writed certificate into the outcomes textbox");
        //Clicks the "+" button
        registrationPage.outcomesPlusButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Clicked the + button");
        //new outcomes textbox clicks
        registrationPage.newOutcomesTextbox.click();
        extentTest.info("new outcomes textbox clicked");
        //Verifies that new outcomes textbox is enabled
        Assert.assertTrue(registrationPage.newOutcomesTextbox.isEnabled());
        extentTest.info("Verified that new outcomes textbox is enabled");
        //Writes data into theoutcomes textbox
        registrationPage.newOutcomesTextbox.sendKeys("soft skills");
        extentTest.info("Writed soft skills into requirements textbox");
        //Clicks the Finish menu
        registrationPage.finishButton.click();
        extentTest.info("Clicked the Finish menu");
        //Clicks the Submit menu
        registrationPage.submitButton.click();
        extentTest.info("Clicked the Submit menu");
        //Clicks the View on frontend tab
        registrationPage.viewOnFrontendButton.click();
        extentTest.info("Clicked the View on frontend tab");
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Tests that the outcomes is visible
        String ilksayfaWHD = Driver.getDriver().getWindowHandle();
        Set<String> whDegerleri = Driver.getDriver().getWindowHandles();
        String ikinciWHD = "";
        for (String each : whDegerleri
        ) {
            if (!each.equals(ilksayfaWHD)) {
                ikinciWHD = each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWHD);
        String expResult="soft skills";
        String actResult=registrationPage.outcomeslistText.getText();
        Assert.assertTrue(actResult.contains(expResult));
        extentTest.info("Tested that the outcomes is visible");
        //Returns to the previous page
        Driver.getDriver().switchTo().window(ilksayfaWHD);
        extentTest.info("Returned to the previous page");
        //Clicks on the outcomes menu
        registrationPage.outcomesButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Clicked on the outcomes menu");
        //Clicks the "-" button
        registrationPage.outcomesMinusButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Clicked the - button");
        //Clicks the Finish menu
        registrationPage.finishButton.click();
        extentTest.info("Clicked the Finish menu");
        //Clicks the Submit menu
        registrationPage.submitButton.click();
        extentTest.info("Clicks the Submit menu");
        //Tests that the Outcomes list has been updated
        registrationPage.greenalert.isDisplayed();
        extentTest.info("Tests that the Requirement list has been updated, Uploaded warning is displayed ");
        Driver.quitDriver();
    }
}

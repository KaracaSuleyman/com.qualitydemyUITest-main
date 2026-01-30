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

public class US_23 extends TestBaseRapor {

    @Test
    public void test2301() {
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
Clicks on the Requirement menu
Writes data into the Requirements textbox
Clicks the "+" button
new requirements textbox clicks (next to -, but ok)
Verifies that new requirements textbox is enabled
writes text to new requirements textbox (we do this part for use too)
Clicks the Finish menu
Clicks on the Submit menu
Clicks the View on frontend tab
Tests that the Requirement list is visible

Returns to the previous page (edit course page)
Clicks the "-" button
Clicks the Finish menu
Clicks on the Submit menu
Clicks the View on frontend tab
Tests that the requirement list has been updated
Compares the expected result with the actual result
         */
        extentTest=extentReports.createTest("_US23","The functions of the course_form/course_edit Outcomes section should work correctly");
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        //ReusableMethods.bekle(5);
        extentTest.info("went to the page and logged in with username and password");
        RegistrationPage registrationPage = new RegistrationPage();

        //Clicks on the Instructor link
        Actions actions = new Actions(Driver.getDriver());
        registrationPage.instructorLink.click();
        extentTest.info("Clicked on the Instructor link");
        //ReusableMethods.bekle(5);

        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        extentTest.info("Tested that the Dashboard panel appears");
        ////ReusableMethods.bekle

        //Clicks the Course manager tab
        registrationPage.courseManagerLink.click();
        extentTest.info("Clicked the Course manager tab");
        ////ReusableMethods.bekle

        //Click on the three dots under Actions
        registrationPage.dreiDotDropdown.click();
        extentTest.info("Clicked on the three dots under Actions");
        //Click on Edit this course in the dropdown menu that pops up.
        ////ReusableMethods.bekle
        registrationPage.editThisCourseDropdown.click();
        extentTest.info("Clicked on Edit this course in the dropdown menu that pops up");
        //Clicks on the Requirement menu
        registrationPage.requirementsButton.click();
        extentTest.info("Clicked on the requirements menu");
        //Writes data into the Requirements textbox
        registrationPage.requirementTextbox.sendKeys("camera");
        extentTest.info("Writed camera into the requirements textbox");
        //Clicks the "+" button
        registrationPage.requirementplusButton.click();
        ////ReusableMethods.bekle
        extentTest.info("Clicked the + button");
        //new requirements textbox clicks
        registrationPage.newrequirementTextbox.click();
        extentTest.info("new requirements textbox clicked");
        //Verifies that new requirements textbox is enabled
        Assert.assertTrue(registrationPage.newrequirementTextbox.isEnabled());
        extentTest.info("Verified that new requirement textbox is enabled");
        //Writes data into the Requirements textbox
        registrationPage.newrequirementTextbox.sendKeys("microphone");
        extentTest.info("Writed microphone into requirements textbox");
        //Clicks the Finish menu
        registrationPage.finishButton.click();
        extentTest.info("Clicked the Finish menu");
        //Clicks the Submit menu
        registrationPage.submitButton.click();
        extentTest.info("Clicked the Submit menu");
        //Clicks the View on frontend tab
        registrationPage.viewOnFrontendButton.click();
        extentTest.info("Clicked the View on frontend tab");
        //ReusableMethods.bekle(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Tests that the Requirement list is visible
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
        String expResult="microphone";
        String actResult=registrationPage.requirementlistText.getText();
        Assert.assertTrue(actResult.contains(expResult));
        extentTest.info("Tested that the requirememts is visible");
        //Returns to the previous page
        Driver.getDriver().switchTo().window(ilksayfaWHD);
        extentTest.info("Returned to the previous page");
        //Clicks on the Requirement menu
        registrationPage.requirementsButton.click();
        ////ReusableMethods.bekle
        extentTest.info("Clicked on the Requirement menu");
        //Clicks the "-" button
        registrationPage.minusButton.click();
        ////ReusableMethods.bekle
        extentTest.info("Clicked the - button");
        //Clicks the Finish menu
        registrationPage.finishButton.click();
        extentTest.info("Clicked the Finish menu");
        //Clicks the Submit menu
        registrationPage.submitButton.click();
        extentTest.info("Clicks the Submit menu");
        //Tests that the requirement list has been updated
        registrationPage.greenalert.isDisplayed();
        extentTest.info("Tests that the Requirement list has been updated, Uploaded warning is displayed ");
        Driver.closeDriver();
    }


    }


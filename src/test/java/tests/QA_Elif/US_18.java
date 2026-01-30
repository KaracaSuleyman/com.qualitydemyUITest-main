package tests.QA_Elif;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_18 {
    @Test
    public void test1801() {
        /*
       User goes to https://qualitydemy.com homepage
       accepts the cookie
       Clicks the log in link
       Writes the email address to the email textbox
       Writes password to password textbox
       Clicks the login button
       Clicks on the Instructor link
       Tests that the Dashboard panel appears.
       Clicks the Number of Courses tab
       Verifies that you went to the Courses page
         */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");

        ReusableMethods.bekle(5);
        RegistrationPage registrationPage = new RegistrationPage();

        //Clicks on the Instructor link
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(3);
        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);
        //Clicks the Number of Courses tab
        registrationPage.numberOfCoursesLink.click();
        ReusableMethods.bekle(3);
        //Verifies that you went to the Courses page
        Assert.assertTrue(registrationPage.coursePageTitle.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void test1802() {
        /*
       User goes to https://qualitydemy.com homepage
       accepts the cookie
       Clicks the log in link
       Writes the email address to the email textbox
       Writes password to password textbox
       Clicks the login button
       Clicks on the Instructor link
       Tests that the Dashboard panel appears.
       Clicks the Pending Balance tab
       Verifies that you went to the Payout report page
         */

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();
        //Clicks on the Instructor link
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(3);
        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);
        //Clicks the Pending balance tab
        registrationPage.pendingBalanceLink.click();
        ReusableMethods.bekle(3);
        //Verifies that you went to the Payout report page
        Assert.assertTrue(registrationPage.payoutReportLink.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test1803() {
        /*
       User goes to https://qualitydemy.com homepage
       accepts the cookie
       Clicks the log in link
       Writes the email address to the email textbox
       Writes password to password textbox
       Clicks the login button
       Clicks on the Instructor link
       Tests that the Dashboard panel appears.
       Clicks the Requested withdrawal amount tab
       Verifies that you went to the Payout report page
         */

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();

        //Clicks on the Instructor link
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(3);
        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);
        //Clicks the Requested withdrawal amount  tab
        registrationPage.RequestedWithdrawalAmountLink.click();
        ReusableMethods.bekle(3);
        //Verifies that you went to the Payout report page
        Assert.assertTrue(registrationPage.payoutReportLink.isDisplayed());

        Driver.closeDriver();
    }
}

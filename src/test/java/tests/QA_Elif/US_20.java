package tests.QA_Elif;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_20 {
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
Clicks the Back to course list tab
Confirms going to Courses--get locate here-- (Course manager)
     */

    @Test
    public void test2001() {

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);
        RegistrationPage registrationPage=new RegistrationPage();

        //Clicks on the Instructor link
        Actions actions = new Actions(Driver.getDriver());
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(5);

        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);

        //Clicks the Course manager tab

        registrationPage.courseManagerLink.click();
        ReusableMethods.bekle(3);

        //Click on the three dots under Actions
        registrationPage.dreiDotDropdown.click();
        ReusableMethods.bekle(3);

        //Click on Edit this course in the dropdown menu that pops up.
        registrationPage.editThisCourseDropdown.click();

        //Clicks the Back to course list tab
        registrationPage.backToCourseListButton.click();

        //Confirms going to Courses
        Assert.assertTrue(registrationPage.courseManagerLink.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void test2002(){

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
Clicks the View on frontend tab
Verifies that you went to the relevant course page (local=strong)
         */
        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);
        RegistrationPage registrationPage = new RegistrationPage();

        //Clicks on the Instructor link
        Actions actions = new Actions(Driver.getDriver());
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(5);

        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);

        //Clicks the Course manager tab
        registrationPage.courseManagerLink.click();
        ReusableMethods.bekle(3);

        //Click on the three dots under Actions
        registrationPage.dreiDotDropdown.click();

        //Click on Edit this course in the dropdown menu that pops up.
        ReusableMethods.bekle(3);

        registrationPage.editThisCourseDropdown.click();

        //Clicks the View on frontend tab
        registrationPage.viewOnFrontendButton.click();

        ReusableMethods.bekle(3);

        //Verifies that you went to the relevant course page
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="english";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        System.out.println("Ilgili ders sayfasinda");

        Driver.closeDriver();

    }

    @Test
    public void test2003(){
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
Clicks the right arrow button at the bottom of the page
Confirms access to Basic menu
Goes to the bottom of the page and clicks the Left arrow key.
Confirms that it has come to the Curriculum menu
         */

        ReusableMethods.loginMethodu("userNameElif","passwordElif");
        ReusableMethods.bekle(5);

        RegistrationPage registrationPage = new RegistrationPage();

        //Clicks on the Instructor link
        Actions actions = new Actions(Driver.getDriver());
        registrationPage.instructorLink.click();
        ReusableMethods.bekle(5);

        //Tests that the Dashboard panel appears.
        Assert.assertTrue(registrationPage.dashboardLink.isDisplayed());
        ReusableMethods.bekle(3);

        //Clicks the Course manager tab
        registrationPage.courseManagerLink.click();
        ReusableMethods.bekle(3);

        //Click on the three dots under Actions
        registrationPage.dreiDotDropdown.click();

        //Click on Edit this course in the dropdown menu that pops up.
        ReusableMethods.bekle(3);

        registrationPage.editThisCourseDropdown.click();

        //Clicks the right arrow button at the bottom of the page

        registrationPage.rightArrowButton.click();

        //Confirms access to Basic menu
        Assert.assertTrue(registrationPage.basicButton.isDisplayed());

        //Goes to the bottom of the page and clicks the Left arrow key.
        actions.scrollToElement(registrationPage.leftArrowButton);
        ReusableMethods.bekle(3);
        registrationPage.leftArrowButton.click();

        //Confirms that it has come to the Curriculum menu
        Assert.assertTrue(registrationPage.curriculumButton.isDisplayed());

        Driver.quitDriver();

    }
}


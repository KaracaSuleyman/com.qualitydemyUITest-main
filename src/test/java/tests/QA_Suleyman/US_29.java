package tests.QA_Suleyman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_29 extends TestBaseRapor {


    /*
    User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
click on instructor function than click to course manager
Click "Add new course" button
Test that course title, Short description and description sections should be accessible.
Test that the desired category should be selectable from the Category section.
Test that the desired level sshould be selectable from the Level section.
Test that enable drip content button shold be changeble
Test that check if this course is top course checkbox should be selectable

     */
    @Test
    public void TC_2901() {
        extentTest = extentReports.createTest("Add new Course Funtion", "Course title, Short description and description sections should be accessible.");
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        extentTest.info("The user goes to the \"qualitydemy.com/login\" Press the login then go to homepage\n" +
                "2-Accepts Cookie.");
        ReusableMethods.instructorAddNewCourse();
        Actions actions = new Actions(Driver.getDriver());
        InstractionPage instractionPage = new InstractionPage();
        extentTest.info("Clicks on add new course .");

        instractionPage.instructorPageAddNewCourseTitleTextBox.sendKeys("TestNG");
        instractionPage.instructorPageAddNewCourseTitleTextBox.clear();
        extentTest.info("Title text box send 'testNg and clear");
        String actualTitle = instractionPage.instructorPageAddNewCourseTitleTextBox.getText();
        Assert.assertEquals(actualTitle, "");
        extentTest.pass("Test that the desired category should be selectable from the Category section.");
        instractionPage.instructorPageAddNewCourseTitleTextBox.sendKeys("Team04");
        String actualSDescription = instractionPage.instructorPageAddNewCourseTitleTextBox.getText();
        instractionPage.instructorPageAddNewCourseTitleTextBox.clear();
        Assert.assertEquals(actualSDescription, "");
        extentTest.pass("Test that the desired level sshould be selectable from the Level section..");
        instractionPage.instructorPageAddNewCourseDescriptionTextBox.sendKeys("We are Team04!");
        String actualDescription = instractionPage.instructorPageAddNewCourseDescriptionTextBox.getText();
        instractionPage.instructorPageAddNewCourseDescriptionTextBox.clear();
        Assert.assertEquals(actualDescription, "We are Team04!");
        extentTest.pass("Test that the desired level sshould be selectable from the Level section..");
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);


        actions.click(instractionPage.instructorPageAddNewCourseCategoryDropdown).sendKeys("java" + Keys.ENTER).click().perform();
        String actualCategoryName = instractionPage.instructorPageAddNewCourseCategoryTest.getText();
        Assert.assertEquals(actualCategoryName, "Java Programming Language");
        extentTest.pass("Test that the desired category should be selectable from the Category section");
        instractionPage.instructorPageAddNewCourseDescriptionTextBox.click();
        actions.click(instractionPage.instructorPageAddNewCourseLevelDropdown).sendKeys("adv" + Keys.ENTER).perform();
        String actualLevel = instractionPage.instructorPageAddNewCourseLevelTest.getText();
        Assert.assertEquals(actualLevel, "Advanced");
        extentTest.pass("Test that the desired level sshould be selectable from the Level section.");
        instractionPage.instructorPageAddNewCourseDripContentCheckBox.click();
        Assert.assertTrue(instractionPage.instructorPageAddNewCourseDripContentCheckBox.isEnabled());
        extentTest.pass("Test that enable drip content button shold be changeble..");
        instractionPage.instructorPageAddNewCourseTopCourseCheckBox.click();
        Assert.assertTrue(instractionPage.instructorPageAddNewCourseTopCourseCheckBox.isEnabled());
        extentTest.pass("Test that check if this course is top course checkbox should be selectable..");
        Driver.quitDriver();


    }
}

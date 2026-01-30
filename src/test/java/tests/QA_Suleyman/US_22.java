package tests.QA_Suleyman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_22 {
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC_2201(){
        /*
        User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
click on instructor function than click to course manager
Click on the three overlapping dots under the Actions section
select to "edit this course" function
Click to "Basic"
Click to "Add new instructor" dropdown menu select one and test that it should be possible to choose from among the instructors added here.
Test that each "Course title, Short description and description" can be selected
Tests that the desired category should be able to get selected from the Category section.
test that the desired level should be able to get selected from the Level section.
Test that the enable droplet content button can be changed
Test that check if this course is top course checkbox be selectable

         */
        ReusableMethods.loginMethodu("userNameSuleyman","passwordSuleyman");
        ReusableMethods.instructorEditPage();

        InstractionPage instractionPage=new InstractionPage();
        instractionPage.instructorPageBasicFunction.click();
        instractionPage.instructorPageAddNewInstructorDropdown.click();
        ReusableMethods.bekle(1);
        instractionPage.instructorPageAddNewInstructorSelectFromDropDown.click();
        String actualInstructorName=instractionPage.instructorPageAddNewInstructorSelectFromDropDown.getText();
        String expectedInstructorName="John Doe";
        Assert.assertTrue(actualInstructorName.contains(expectedInstructorName));



        instractionPage.instructorPageCourseTitleTextBox.sendKeys("TestNG");
        instractionPage.instructorPageCourseTitleTextBox.clear();
        String actualTitleText=instractionPage.instructorPageCourseTitleTextBox.getText();
        Assert.assertEquals(actualTitleText,"");

        instractionPage.instructorPageAddNewCourseShortDescriptionTextBox.sendKeys("Team04");
        instractionPage.instructorPageAddNewCourseShortDescriptionTextBox.clear();
        String actualShortDescText=instractionPage.instructorPageAddNewCourseShortDescriptionTextBox.getText();
        Assert.assertEquals(actualShortDescText,"");

        instractionPage.instructorPageAddNewCourseDescriptionTextBox.sendKeys("TestNg Team04"+ Keys.PAGE_DOWN);
        ReusableMethods.bekle(1);
        instractionPage.instructorPageAddNewCourseDescriptionTextBox.clear();
        String actualText=instractionPage.instructorPageAddNewCourseDescriptionTextBox.getText();
        Assert.assertEquals(actualText,"");

        instractionPage.instructorPageCategoryDropdown.click();
        instractionPage.instructorPageCategorySelectDropdown.click();
        instractionPage.instructorPageLevelDropdown.click();
        instractionPage.instructorPageLevelSelectDropdown.click();
        instractionPage.instructorPageContentDripCheckBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);

        Assert.assertFalse(instractionPage.instructorPageContentDripCheckBox.isSelected());
        if (!instractionPage.instructorPageTopCourseCheckBox.isSelected()) {
            actions.click(instractionPage.instructorPageTopCourseCheckBox).perform();
            Assert.assertTrue(instractionPage.instructorPageTopCourseCheckBox.isSelected());
        }

        actions.sendKeys(Keys.PAGE_UP).perform();
        instractionPage.instructorPageFinishFunction.submit();
        instractionPage.instructorPageSubmitButton.submit();
        instractionPage.instructorPageCourseManagerLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String actualCategoryName=instractionPage.instructorPageCategoryTest.getText();
        String expectedCategoryName="HTML5 and CSS";

        Assert.assertTrue(actualCategoryName.contains(expectedCategoryName));
        Driver.quitDriver();

    }
}

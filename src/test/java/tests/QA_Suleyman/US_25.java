package tests.QA_Suleyman;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_25 {
    /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
click on instructor function than click to course manager
Click on the three overlapping dots under the Actions section
select to "edit this course" function and then click "Price"
Test that check if this is a free course checkbox should be selectable
Test that the desired price should be able to get entered as a number to course price textbox
Test that check if this course has discount checkbox can be selected
Test that the desired discount should be able to get entered as number to Discounted price textbox

   */
    @Test
    public void TC_2501(){

        ReusableMethods.loginMethodu("userNameSuleyman","passwordSuleyman");
        ReusableMethods.instructorEditPage();
        InstractionPage instractionPage=new InstractionPage();
        instractionPage.instructorPagePriceLink.click();
        instractionPage.instructorPageAddNewCourseFreeCourseCheckbox.click();
        Assert.assertTrue(instractionPage.instructorPageAddNewCoursePriceEnteredTextBox.isDisplayed());
        instractionPage.instructorPageAddNewCourseFreeCourseCheckbox.click();
        instractionPage.instructorPageAddNewCoursePriceEnteredTextBox.sendKeys("");
        instractionPage.instructorPageAddNewCoursePriceEnteredTextBox.clear();
        String priceText=instractionPage.instructorPageAddNewCoursePriceEnteredTextBox.getText();
        Assert.assertEquals(priceText,"");
        instractionPage.instructorPageDiscountCheckbox.click();
        Assert.assertTrue(instractionPage.instructorPageDiscountCheckbox.isDisplayed());
        instractionPage.instructorPageDiscountTextbox.sendKeys("");
        instractionPage.instructorPageDiscountTextbox.clear();
        String actualDiscountText=instractionPage.instructorPageDiscountTextbox.getText();
        Assert.assertEquals(actualDiscountText,"");
        Driver.quitDriver();



    }
}

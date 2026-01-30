package tests.QA_Suleyman;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_32 {
    @Test
    public void TC_3201(){

        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        ReusableMethods.instructorAddNewCourse();
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

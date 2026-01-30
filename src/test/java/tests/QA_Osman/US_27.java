package tests.QA_Osman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US_27 extends TestBaseRapor {

       // The functions of the course_form/course_edit seo section should work correctly
       // (Course_form/course_edit seo bölümünün fonksiyonları düzgün çalışmalıdır.)

    @Test
    public void test2701(){
        /* Objective

        It should be possible to write descriptions in Meta keywords and Meta description textboxes
        (Meta anahtar kelimeler ve Meta açıklama metin kutularına açıklama yazmak mümkün olmalıdır.)

        */
        extentTest=extentReports.createTest("_US27","The functionality of the course_form/course_edit seo section has been tested to work properly.");
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");

        extentTest.info("went to the page and logged in with username and password");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Seo tab
        extentTest.info("Clicked on the Seo Tab");
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.courseManagerSeoTab).perform();
        instractionPage.courseManagerSeoTab.click();
        ReusableMethods.bekle(1);

        //Writes a description in the meta keywords box
        extentTest.info("Typed a description in the meta keywords box.");
        instractionPage.courseManagerSeoMetaKey.sendKeys("Javadan Nerelere Geldik Böyle");
        String metaKeywords="Write a keyword and then press enter button";

        extentTest.info("It has been tested that Seo Meta Keywords is written.");
        Assert.assertNotEquals(metaKeywords,instractionPage.courseManagerSeoMetaKeywords.getText());
        Assert.assertTrue(instractionPage.courseManagerSeoMetaKeywords.isEnabled());

        //Writes a description in the meta description box
        extentTest.info("A description is written in the meta description box.");
        instractionPage.courseManagerSeoMetaDescription.sendKeys("Description Box is writable ");

        extentTest.info("Tested that a description is written in the meta description box.");
        Assert.assertTrue(instractionPage.courseManagerSeoMetaDescription.isEnabled());

        Driver.closeDriver();
    }
}

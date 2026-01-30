package tests.QA_Osman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_26 {

    // The functions of the course_form/course_edit media section should work correctly
    // (Course_form/course_edit medya bölümünün işlevleri düzgün çalışmalıdır)

    @Test
    public void test2601(){
        /* Objective

        The desired option should be searchable from the Course overview provider dropdown
        (İstenen seçenek, Derse genel bakış sağlayıcısı açılır menüsünden aranabilir olmalıdır)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Media tab
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.courseManagerMedia).perform();
        instractionPage.courseManagerMedia.click();

        //Click on the course overview provider dropdown
        // and select the desired option
        instractionPage.courseOverPro.click();
        ReusableMethods.bekle(2);
        Select select=new Select(instractionPage.courseOverviewProviderSelect);
        select.selectByIndex(1);

        instractionPage.courseOverPro.click();
        ReusableMethods.bekle(3);
        System.out.println(instractionPage.courseOverPro.getText());
        Assert.assertEquals(instractionPage.courseOverPro.getText(),"Vimeo");

        Driver.closeDriver();
    }
    @Test
    public void test2602(){
        /*Objektive         ***

        Relevant url should be entered in Course overview url textbox
        (Kursa genel bakış url metin kutusuna ilgili url girilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Media tab
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.courseManagerMedia).perform();
        instractionPage.courseManagerMedia.click();

        //Enter the relevant url in the course overview url textbox
        instractionPage.courseOverUrl.sendKeys("https://www.youtube.com/watch?v=iTa1W6479ME&t=4s");
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.courseOverUrl.isEnabled());

        Driver.closeDriver();
    }
    @Test
    public void test2603(){
        /* Objektive

        Image can be uploaded to Course thumbnail
        (Resim Kurs küçük resmine yüklenebilir)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Media tab
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.courseManagerMedia).perform();
        instractionPage.courseManagerMedia.click();

        //Loads the Image to Course thumbnail
        Actions actions2=new Actions(Driver.getDriver());
        actions2.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);

        String photoPath="C:\\Users\\ASUS2\\Desktop\\placeholder.png";
        instractionPage.courseThumb.sendKeys(photoPath);
        ReusableMethods.bekle(2);
        Assert.assertTrue(instractionPage.courseThumbnailAlbum.isDisplayed());

        Driver.closeDriver();
    }
}

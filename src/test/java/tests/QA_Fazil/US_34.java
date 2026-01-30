package tests.QA_Fazil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_34 {
    InstractionPage instractionPage=new InstractionPage();
    HomePage homePage= new HomePage();

    @Test
    public void test3401(){
        //The user "qualitydemy.com" goes to the homepage.
        //Accepts cookies.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters his password in the Password textbox
        //Makes the login button click
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //On the page that opens, the Instructor clicks the link
        homePage.instructorLink.click();
        //Click the course manager tab
        instractionPage.courseManagerLink.click();
        //In the Courses section that opens, click on the +Add new course link
        instractionPage.addNewCourseLink.click();
        //In the COURSE ADDING FORM section that opens, click the Seo tab
        instractionPage.courseManagerSeoTab.click();
        //Writes a message in the Meta keywords textbox that opens at the bottom
        instractionPage.metaKeywordsTextbox.sendKeys("Meryem");
        //Tests whether the meta keywords textbox is used.
        Assert.assertTrue(instractionPage.metaKeywordsTextbox.isEnabled());
        //Writes a message in the meta description textbox.
        instractionPage.metaDescriptionTextbox.sendKeys("Zahide");
        //Tests whether the meta description textbox is used.
        Assert.assertTrue(instractionPage.metaDescriptionTextbox.isEnabled());
        Driver.closeDriver();
    }
}


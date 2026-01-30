package tests.QA_Mert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04 {

    @Test
    public void TC_0401(){
        /*
        1-The user goes to the homepage "qualitydemy.com".
        2-Confirm cookies.
        3-He goes to the bottom of the page.
        4-He sees the tabs under top categories; "Web Design for Web Developers, Disney Magic English,
         English Speaking Course, English Conjunctions;" and clicks on them individually.
        5-After clicking on each tab, he sees that he goes to the relevant page.
         */

        ReusableMethods.loginMethodu();

        //He goes to the bottom of the page.
        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END);
        actions.perform();
        SoftAssert softAssert = new SoftAssert();

        //homePage>Top Categories>Web Design for Web Developers
        softAssert.assertTrue(homePage.webDesignforWebDevelopersLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.webDesignforWebDevelopersLink.click();
        ReusableMethods.bekle(3);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedKelime = "web-design-for-web-developers";
        softAssert.assertTrue(actualUrl.contains(expectedKelime));

        //homePage>Top Categories>Disney Magic English
        actions.sendKeys(Keys.END);
        actions.perform();
        ReusableMethods.bekle(3);

        String actualKelimeler1 =homePage.topCategoriesAllLink.getText();
        String disneyMagicEnglish = "Disney Magic English";

        softAssert.assertTrue(actualKelimeler1.contains(disneyMagicEnglish));

        //homePage>Top Categories>English Speaking Course
        actions.sendKeys(Keys.END);
        actions.perform();
        ReusableMethods.bekle(3);
        softAssert.assertTrue(homePage.englishSpeakingCourseLink.isDisplayed());

        homePage.englishSpeakingCourseLink.click();
        ReusableMethods.bekle(2);
        String actualUrl1 = Driver.getDriver().getCurrentUrl();
        String expectedKelime1 = "english-speaking-course";

        softAssert.assertTrue(actualUrl1.contains(expectedKelime1));

        //homePage>Top Categories>English Conjunctions
        actions.sendKeys(Keys.END);
        actions.perform();
        ReusableMethods.bekle(3);

        String actualKelimeler =homePage.topCategoriesAllLink.getText();
        String englishConjuctions = "English Conjunctions";

       softAssert.assertTrue(actualKelimeler.contains(englishConjuctions));

        Driver.closeDriver();

        softAssert.assertAll();


    }

    @Test
    public void TC_0402(){
        /*
        6-It sees the tabs under Useful links and clicks on them individually.
        7-After clicking each tab, it navigates to the relevant page.
         */

       ReusableMethods.loginMethodu();
       HomePage homePage = new HomePage();
       SoftAssert softAssert = new SoftAssert();

        //He goes to the bottom of the page.
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END);
        actions.perform();

        //homePage>Useful Links>Blog
        Assert.assertTrue(homePage.blogLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.blogLink.click();
        ReusableMethods.bekle(2);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "blog";
        softAssert.assertTrue(actualUrl.contains(expectedWord));

        //homePage>Useful Links>All courses
        actions.sendKeys(Keys.END);
        actions.perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.allCoursesLink.isDisplayed());


        homePage.allCoursesLink.click();
        ReusableMethods.bekle(2);

        String actualUrl1 = Driver.getDriver().getCurrentUrl();
        String expectedWord1 = "courses";
        softAssert.assertTrue(actualUrl1.contains(expectedWord1));


        //homePage>Useful Links>Sign Up
        actions.sendKeys(Keys.END);
        actions.perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(homePage.signUpLink.isDisplayed());
        homePage.signUpLink.click();
        ReusableMethods.bekle(2);

        String actualUrl2 = Driver.getDriver().getCurrentUrl();
        String expectedWord2 = "sign_up";
        softAssert.assertTrue(actualUrl2.contains(expectedWord2));

        Driver.closeDriver();

        softAssert.assertAll();



    }

    @Test
    public void TC_0403(){
        /*
        8-See the tabs under Help and click on them individually.
        9-After clicking each tab, it navigates to the relevant page
         */

        ReusableMethods.loginMethodu();
        HomePage homePage = new HomePage();
        SoftAssert softAssert = new SoftAssert();

        //He goes to the bottom of the page.
        Actions actions = new Actions(Driver.getDriver());


        //homePage>Help>About Us
        actions.sendKeys(Keys.END);
        actions.perform();
        Assert.assertTrue(homePage.aboutUsLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.aboutUsLink.click();
        ReusableMethods.bekle(2);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "about_us";
        softAssert.assertTrue(actualUrl.contains(expectedWord));


        //homePage>Help>Privacy Policy
        actions.sendKeys(Keys.END);
        actions.perform();
        Assert.assertTrue(homePage.privacyPolicyLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.privacyPolicyLink.click();
        ReusableMethods.bekle(2);

        String actualUrl1 = Driver.getDriver().getCurrentUrl();
        String expectedWord1 = "privacy_policy";
        softAssert.assertTrue(actualUrl1.contains(expectedWord1));


        //homePage>Help>Terms and Condition
        actions.sendKeys(Keys.END);
        actions.perform();
        Assert.assertTrue(homePage.termsandConditionLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.termsandConditionLink.click();
        ReusableMethods.bekle(2);

        String actualUrl2 = Driver.getDriver().getCurrentUrl();
        String expectedWord2 = "terms_and_condition";
        softAssert.assertTrue(actualUrl2.contains(expectedWord2));

        //homePage>Help>Refund Policy
        actions.sendKeys(Keys.END);
        actions.perform();
        Assert.assertTrue(homePage.refundPolicyLink.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.refundPolicyLink.click();
        ReusableMethods.bekle(2);

        String actualUrl3 = Driver.getDriver().getCurrentUrl();
        String expectedWord3 = "refund_policy";
        softAssert.assertTrue(actualUrl3.contains(expectedWord3));

        Driver.closeDriver();

        softAssert.assertAll();
    }

}

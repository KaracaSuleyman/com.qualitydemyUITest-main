package tests.QA_Mert;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CoursePage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_09 extends TestBaseRapor {

    /*
    1-The user goes to the "qualitydemy.com/login" Press the login then go to homepage
    2-Accepts Cookie.
    3-Clicks on all courses under Categories.
    4-He sees that he is on the Courses page.
    5-He sees the English Course Learn to Speak course and clicks on it.
    6-See that it is on the page related to the English Course Learn to Speak course and clicks added to cart.
    7-Clicks on the shopping cart at the top right.
    8-It sees that it goes to the shopping cart page.
    9-He clicks Remove and sees that the course he bought has been deleted
     */

    @Test
    public void TC_0901(){
        //1-The user goes to the "qualitydemy.com/login" Press the login then go to homepage
        //2-Accepts Cookie.
        extentTest = extentReports.createTest("Remove Course", "When click remove link can be deleted");
        ReusableMethods.loginMethodu();
        extentTest.info("The user goes to the \"qualitydemy.com/login\" Press the login then go to homepage\n" +
                "2-Accepts Cookie.");
        SoftAssert softAssert = new SoftAssert();

        //3-Clicks on all courses under Categories.
        HomePage homePage = new HomePage();
        homePage.categoriesLink.click();
        extentTest.info("Clicks on Categories.");
        CoursePage coursePage = new CoursePage();
        coursePage.categoriesSectionAllCoursesTab.click();
        extentTest.info("Clicks on all courses under Categories.");

        //4-He sees that he is on the Courses page.
        String actualUrl =Driver.getDriver().getCurrentUrl();
        String expectedKelime = "courses";
        Assert.assertTrue(actualUrl.contains(expectedKelime));
        extentTest.pass("He sees that he is on the Courses page");

        //5-He sees the English Course Learn to Speak course and clicks on it.
        coursePage.englishCourseLearnToSpeakLessonLink.click();
        extentTest.info("He sees the English Course Learn to Speak course and clicks on it.");

        //6-See that it is on the page related to the English Course Learn to Speak course and clicks added to cart.
        coursePage.addToCartButton.click();
        extentTest.info("See that it is on the page related to the English Course Learn to Speak course and clicks added to cart");

        //7-Clicks on the shopping cart at the top right
        homePage.shoppingCartLink.click();
        extentTest.info("Clicks on the shopping cart at the top right.");

        //9-He clicks Remove and sees that the course he bought has been deleted
        homePage.removeFromTheCart.click();
        extentTest.info("He clicks Remove ");
        ReusableMethods.bekle(2);

        String getText =homePage.shoppingCartNumberLink.getText();
        softAssert.assertTrue(getText.equals("0"));
        extentTest.pass("When click remove, shooping cart not deleted");

        softAssert.assertAll();

        Driver.closeDriver();


    }

    @Test
    public void TC_0902(){
        //10-Writes a valid coupon code in the box labeled Apply coupon code and clicks apply.

        ReusableMethods.loginMethodu();
        extentTest.info("The user goes to the \"qualitydemy.com/login\" Press the login then go to homepage\n" +
                "2-Accepts Cookie.");
        HomePage homePage = new HomePage();
        homePage.categoriesLink.click();
        extentTest.info("Clicks on Categories.");

        CoursePage coursePage = new CoursePage();
        coursePage.categoriesSectionAllCoursesTab.click();
        extentTest.info("Clicks on all courses under Categories.");

        coursePage.englishCourseLearnToSpeakLessonLink.click();
        extentTest.info("He sees the English Course Learn to Speak course and clicks on it.");
        coursePage.addToCartButton.click();
        extentTest.info("See that it is on the page related to the English Course Learn to Speak course and clicks added to cart");
        homePage.shoppingCartLink.click();
        extentTest.info("Clicks on the shopping cart at the top right.");
        homePage.couponCodeTextBox.sendKeys("PERCENT50" + Keys.ENTER);
        extentTest.info("Writes a valid coupon code in the box labeled Apply coupon code and clicks apply.");
        homePage.couponCodeApplyButton.click();
        extentTest.info("See while on the same page, the discount is applied");
        ReusableMethods.bekle(2);
        //11-See while on the same page, the discount is applied
        Assert.assertTrue(homePage.couponCodeDiscountText.getText().contains("applied"));
        extentTest.pass("the discount is applied");

        Driver.closeDriver();

    }

    @Test
    public void TC_0903(){
        //12-Writes a random coupon code in the box labeled Apply coupon code,
        // clicks apply and sees that the price has not changed.
        ReusableMethods.loginMethodu();
        extentTest.info("The user goes to the \"qualitydemy.com/login\" Press the login then go to homepage\n" +
                "2-Accepts Cookie.");
        HomePage homePage = new HomePage();
        homePage.categoriesLink.click();
        extentTest.info("Clicks on Categories.");
        CoursePage coursePage = new CoursePage();
        coursePage.categoriesSectionAllCoursesTab.click();
        extentTest.info("Clicks on all courses under Categories.");
        coursePage.englishCourseLearnToSpeakLessonLink.click();
        extentTest.info("He sees the English Course Learn to Speak course and clicks on it.");
        coursePage.addToCartButton.click();
        extentTest.info("See that it is on the page related to the English Course Learn to Speak course and clicks added to cart");
        homePage.shoppingCartLink.click();
        extentTest.info("Clicks on the shopping cart at the top right.");
        ReusableMethods.bekle(2);
        homePage.couponCodeTextBox.sendKeys("PERCENT" + Keys.ENTER);
        extentTest.info("Writes an invalid coupon code in the box labeled Apply coupon code.");
        homePage.couponCodeApplyButton.click();
        extentTest.info("clicks apply");
        ReusableMethods.bekle(2);

        Assert.assertEquals(homePage.shoppingCartTotalPrice.getText(),"$171");
        extentTest.pass(" the price has not changed.");

        Driver.closeDriver();

    }

    @Test
    public void TC_0904(){
        //14-He presses the checkout button and sees that he goes to the payment page
        ReusableMethods.loginMethodu();
        extentTest.info("The user goes to the \"qualitydemy.com/login\" Press the login then go to homepage\n" +
                "2-Accepts Cookie.");
        HomePage homePage = new HomePage();
        homePage.categoriesLink.click();
        extentTest.info("Clicks on Categories.");
        CoursePage coursePage = new CoursePage();
        coursePage.categoriesSectionAllCoursesTab.click();
        extentTest.info("Clicks on all courses under Categories.");
        coursePage.englishCourseLearnToSpeakLessonLink.click();
        extentTest.info("He sees the English Course Learn to Speak course and clicks on it.");
        coursePage.addToCartButton.click();
        extentTest.info("See that it is on the page related to the English Course Learn to Speak course and clicks added to cart");
        homePage.shoppingCartLink.click();
        extentTest.info("Clicks on the shopping cart at the top right.");
        ReusableMethods.bekle(2);

        coursePage.checkoutButton.click();
        extentTest.info("He presses the checkout button");
        ReusableMethods.bekle(3);

        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        String expectedKelime = "payment";
        Assert.assertTrue(actualUrl.contains(expectedKelime));
        extentTest.pass("Sees that he goes to the payment page");

        Driver.quitDriver();
    }
}

package tests.QA_Temel;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MyCoursePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class US_11 extends TestBaseRapor {

    @Test
    public void test1101(){

        extentTest = extentReports.createTest("As a user I should be able to use the functions of the my_wishlist page", "When the compare icon is clicked, it should redirect to the Course compare page");

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("User goes to qa.qualitydemy.com homepage");

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("confirms cookies");

        //Clicks Login Button
        homePage.firstLoginLink.click();
        extentTest.info("Clicks Login Button");

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Enters E-Mail and Password");

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);
        extentTest.info("Clicks on the Login button and logs in");

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();
        extentTest.info("Clicks \"Go to Wishlist\" in the Dropddown menu");

        //Clicks the Compare button on one of the available courses
        myCoursePage.wishlistCompareButton.click();
        extentTest.info("Clicks the Compare button on one of the available courses");

        //Tests the opening of the Course Compare page
        Assert.assertTrue(myCoursePage.courseCompareTitleText.isDisplayed());
        extentTest.pass("Opening of the course compare page is successful");

        //Closes the page
        Driver.closeDriver();
        extentTest.info("Closes the page");

    }

    @Test
    public void test1102(){

        extentTest = extentReports.createTest("As a user I should be able to use the functions of the my_wishlist page","Course should be searchable from the search box");

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("User goes to \"qa.qualitydemy.com\" homepage");

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("confirms cookies");

        //Clicks Login Button
        homePage.firstLoginLink.click();
        extentTest.info("Clicks Login Button");

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Enters E-Mail and Password");

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);
        extentTest.info("Clicks on the Login button and logs in");

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();
        extentTest.info("Clicks \"Go to Wishlist\" in the Dropddown menu");

        //The user enters the search value in the search bar
        myCoursePage.myWishlistSearchbox.sendKeys("react"+ Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("The user enters the search value in the search bar");

        //Tests that the searched word is in the results
        String searchResult = myCoursePage.wishlistCourseTitleText.getText();
        String searchedWord = "React";
        ReusableMethods.bekle(2);
        Assert.assertTrue(searchResult.contains(searchedWord));
        extentTest.pass("Search result test is successful");

        //Closes the page
        Driver.closeDriver();
        extentTest.info("Closes the page");

    }

    @Test
    public void test1103(){

        extentTest = extentReports.createTest("As a user I should be able to use the functions of the my_wishlist page","When the course name is clicked, it should redirect to the page of the relevant course.");

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("User goes to \"qa.qualitydemy.com\" homepage");

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("confirms cookies");

        //Clicks Login Button
        homePage.firstLoginLink.click();
        extentTest.info("Clicks Login Button");

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Enters E-Mail and Password");

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);
        extentTest.info("Clicks on the Login button and logs in");

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();
        extentTest.info("Clicks \"Go to Wishlist\" in the Dropddown menu");

        //User clicks on an available course in the wishlist
        myCoursePage.wishlistCourseTitleText.click();
        extentTest.info("User clicks on an available course in the wishlist");

        //Tests that the relevant course page is open
        Assert.assertTrue(myCoursePage.clickedRelevantCoursePage.isDisplayed());
        extentTest.pass("Relevant course page opened successfully");

        //Closes the page
        Driver.closeDriver();
        extentTest.info("Closes the page");

    }

    @Test
    public void test1104(){

        extentTest = extentReports.createTest("As a user I should be able to use the functions of the my_wishlist page","When the instructor icon is clicked, it should redirect to the relevant instructor page.");

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("User goes to \"qa.qualitydemy.com\" homepage");

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("confirms cookies");

        //Clicks Login Button
        homePage.firstLoginLink.click();
        extentTest.info("Clicks Login Button");

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Enters E-Mail and Password");

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);
        extentTest.info("Clicks on the Login button and logs in");

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();
        extentTest.info("Clicks \"Go to Wishlist\" in the Dropddown menu");

        //User clicks the Instructor button
        myCoursePage.instructorLink.click();
        extentTest.info("User clicks the Instructor button");

        //Tests that the title "Become An Instructor" appears on the relevant page
        Assert.assertTrue(myCoursePage.instructorPageRevenueText.isDisplayed());
        extentTest.pass("User goes to Intructor page successfully");

        //Closes the page
        Driver.closeDriver();
        extentTest.info("Closes the page");

    }

    @Test
    public void test1105(){

        extentTest = extentReports.createTest("As a user I should be able to use the functions of the my_wishlist page","The course should be able to verify the number and duration of the course on the relevant page when the course name is clicked.");

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("User goes to \"qa.qualitydemy.com\" homepage");

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("confirms cookies");

        //Clicks Login Button
        homePage.firstLoginLink.click();
        extentTest.info("Clicks Login Button");

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Enters E-Mail and Password");

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);
        extentTest.info("Clicks on the Login button and logs in");

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();
        extentTest.info("Clicks \"Go to Wishlist\" in the Dropddown menu");

        //Wishlist Course Duration und Lesson
        String WishlistDurationStr=myCoursePage.wishlistDurationText.getText();
        String[] WishListLessonArr = myCoursePage.wishlistLessonNumberText.getText().split(" ");
        extentTest.info("Wishlist Course Duration und Lesson");

        //User clicks on an available course in the wishlist
        myCoursePage.wishlistCourseTitleText.click();
        String DurationStr=myCoursePage.DurationText.getText();
        String[] LessonArr=myCoursePage.LessonText.getText().split(" ");
        extentTest.info("User clicks on an available course in the wishlist");

        //Creates soft assert
        SoftAssert softAssert=new SoftAssert();
        extentTest.info("Creates soft assert");

        //Tests whether the number and duration of the lessons can be seen on the opened course page.
        softAssert.assertEquals(DurationStr,WishlistDurationStr);
        softAssert.assertEquals(LessonArr[0],WishListLessonArr[0]);
        softAssert.assertAll();
        extentTest.pass("Whether the number and duration of the lessons can be seen on the opened course page succesfully.");

        //Closes the page
        Driver.closeDriver();
        extentTest.info("Closes the page");

    }


}

package tests.QA_Serkan;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02 {
/*
    *User goes to "qa.qualitidemy.com" main page
    *confirm cookies
    User tests these item are visible or not:
    Logo,Categories,Log in, Sign Up,shopping cart icon,Search icon,
    Search button, Available Online courses text, Expert instruction text,
    Lifetime access text, Top categories text,Top courses text,
    Top 10 Latest courses text,Featured instructor text ,
    Get started button,Join now button, facebook icon, twitter icon.*/


     HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void test0201(){
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //HomePage homePage = new HomePage();
        homePage.cookieKabul.click();

        WebElement qualitydemyLogo =homePage.qualitydemyLogoLink;
        softAssert.assertTrue(qualitydemyLogo.isDisplayed());

        WebElement categories = homePage.categoriesLink;
        softAssert.assertTrue(categories.isDisplayed());

        WebElement login = homePage.loginLink;
        softAssert.assertTrue(login.isDisplayed());

        WebElement signUp = homePage.signupLink;
        softAssert.assertTrue(signUp.isDisplayed());

        WebElement shoppingCart = homePage.shoppingCartLink;
        softAssert.assertTrue(shoppingCart.isDisplayed());

        WebElement searchIcon =homePage.searchButton;
        softAssert.assertTrue(searchIcon.isDisplayed());

        WebElement searchButtonDown = homePage.searchTextboxButton;
        softAssert.assertTrue(searchButtonDown.isDisplayed());

        //WebElement availableCourses = homePage.availableCoursesText;
        //softAssert.assertTrue(availableCourses.isDisplayed());

        WebElement expertInstructionTextItem = homePage.expertInstructionText;
        softAssert.assertTrue(expertInstructionTextItem.isDisplayed());

        WebElement lifetimeAccessTextItem = homePage.LifetimeAccessText;
        softAssert.assertTrue(lifetimeAccessTextItem.isDisplayed());

        WebElement topCategoriesTextItem = homePage.topCategoriesText;
        softAssert.assertTrue(topCategoriesTextItem.isDisplayed());

        WebElement topCourseslinkItem = homePage.topCoursesText;
        softAssert.assertTrue(topCourseslinkItem.isDisplayed());

        WebElement top10LatestcoursesTextItem = homePage.top10LatestCoursesText;
        softAssert.assertTrue(top10LatestcoursesTextItem.isDisplayed());

        WebElement featuredInstructorTextItem = homePage.featuredInstructorText;
        softAssert.assertTrue(featuredInstructorTextItem.isDisplayed());

        WebElement getStartedButtonItem = homePage.getStartedButton;
        softAssert.assertTrue(getStartedButtonItem.isDisplayed());

        WebElement joinNowButtonItem = homePage.joinNowButton;
        softAssert.assertTrue(joinNowButtonItem.isDisplayed());

        WebElement facebookLinkItem = homePage.facebookLink;
        softAssert.assertTrue(facebookLinkItem.isDisplayed());

        WebElement twitterLinkItem = homePage.twitterLink;
        softAssert.assertTrue(twitterLinkItem.isDisplayed());
        //Driver.closeDriver();

    }

    @Test
    public void test0202(){
        //User goes to "qa.qualitidemy.com" main page
        //confirm cookie
        //Users tests "about us" link  clickable or not
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        HomePage homePage = new HomePage();
        //homePage.cookieKabul.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);
        homePage.aboutUsLink.click();
        Assert.assertTrue(homePage.aboutUsTextAboutUsSection.isDisplayed());
        Driver.closeDriver();

    }

}

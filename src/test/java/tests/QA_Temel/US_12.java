package tests.QA_Temel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyCoursePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_12 {

    @Test
    public void test1201(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //Clicks Login Button
        homePage.firstLoginLink.click();

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();

        //Clicks the Compare button on the first course in the Wishlist
        myCoursePage.wishlistCompareButton.click();


        //Clicks on the 2.Dropdown/Select A Course button and select a course from the menu
        WebElement secondDropdown=myCoursePage.courseCompareSecondSearchDropdown;
        actions.moveToElement(secondDropdown).click().perform();
        WebElement secondSearchBox=myCoursePage.secondSearchBox;
        secondSearchBox.sendKeys("wordpress"+ Keys.ENTER);
        ReusableMethods.bekle(2);

        //Clicks on the 3.Dropdown/Select A Course button and select a course from the menu
        WebElement thirdDropdown=myCoursePage.courseCompareThirdSearchDropdown;
        actions.moveToElement(thirdDropdown).click().perform();
        WebElement thirdSearchBox= myCoursePage.thirdSearchBox;
        thirdSearchBox.sendKeys("react"+Keys.ENTER);
        ReusableMethods.bekle(2);

        //User scrolls down to see course details
        actions.keyDown(Keys.PAGE_DOWN).perform();

        //Three displayed Courses. That means 3 "Learn More"link
        List<WebElement> results=myCoursePage.courseCompareBlueButton;

        //tests that all 3 courses are displayed
        Assert.assertEquals(results.size(),3);

        //Closes the page
        Driver.closeDriver();

    }

    @Test
    public void test1202(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //Clicks Login Button
        homePage.firstLoginLink.click();

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();

        //Clicks the Compare button on the first course in the Wishlist
        myCoursePage.wishlistCompareButton.click();

        //Clicks on the 2.Dropdown/Select A Course button and select a course from the menu
        WebElement secondDropdown=myCoursePage.courseCompareSecondSearchDropdown;
        actions.moveToElement(secondDropdown).click().perform();
        WebElement secondSearchBox=myCoursePage.secondSearchBox;
        secondSearchBox.sendKeys("wordpress"+ Keys.ENTER);
        ReusableMethods.bekle(2);

        //Clicks on the 3.Dropdown/Select A Course button and select a course from the menu
        WebElement thirdDropdown=myCoursePage.courseCompareThirdSearchDropdown;
        actions.moveToElement(thirdDropdown).click().perform();
        WebElement thirdSearchBox=myCoursePage.thirdSearchBox;
        thirdSearchBox.sendKeys("react"+Keys.ENTER);
        ReusableMethods.bekle(2);

        //User scrolls down to see course details
        actions.keyDown(Keys.PAGE_DOWN).perform();

        //Clicks "Get Enrolled/Alreadypurchased" button
        myCoursePage.alreadyPurchasedLink.click();

        //Tests that the relevant page is displayed
        Assert.assertTrue(myCoursePage.clickedRelevantCoursePage.isDisplayed());

        //Closes the page
        Driver.closeDriver();

    }

    @Test
    public void test1203(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //Clicks Login Button
        homePage.firstLoginLink.click();

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();

        //Clicks the Compare button on the first course in the Wishlist
        myCoursePage.wishlistCompareButton.click();

        //User scrolls down to see course details
        actions.keyDown(Keys.PAGE_DOWN).perform();

        //Clicks "Learn More" button
        myCoursePage.courseCompareLearnMoreLink.click();
        ReusableMethods.bekle(2);

        //Tests that the relevant page is displayed
        Assert.assertTrue(myCoursePage.clickedRelevantCoursePage.isDisplayed());

        //Closes the page
        Driver.closeDriver();

    }

    @Test
    public void test1204(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //Clicks Login Button
        homePage.firstLoginLink.click();

        //Enters E-Mail and Password
        homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //Clicks on the Login button and logs in
        homePage.loginButton.click();
        ReusableMethods.bekle(6);

        //Clicks "Go to Wishlist" in the Dropddown menu
        MyCoursePage myCoursePage=new MyCoursePage();
        WebElement heart=myCoursePage.heartIconLink;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(heart).perform();
        myCoursePage.goToWishlistLink.click();

        //Clicks the Compare button on the first course in the Wishlist
        myCoursePage.wishlistCompareButton.click();

        //Clicks on the 2.Dropdown/Select A Course button and select a course from the menu
        WebElement secondDropdown=myCoursePage.courseCompareSecondSearchDropdown;
        actions.moveToElement(secondDropdown).click().perform();
        WebElement secondSearchBox=myCoursePage.secondSearchBox;
        secondSearchBox.sendKeys("wordpress"+ Keys.ENTER);
        ReusableMethods.bekle(2);

        //Clicks on the 3.Dropdown/Select A Course button and select a course from the menu
        WebElement thirdDropdown=myCoursePage.courseCompareThirdSearchDropdown;
        actions.moveToElement(thirdDropdown).click().perform();
        WebElement thirdSearchBox=myCoursePage.thirdSearchBox;
        thirdSearchBox.sendKeys("react"+Keys.ENTER);
        ReusableMethods.bekle(2);

        //User scrolls down to see course details
        actions.keyDown(Keys.PAGE_DOWN).perform();

        //Clicks on the Buy Now button
        myCoursePage.courseCompareBuyNowLink.click();
        ReusableMethods.bekle(3);

        ////Tests that the shopping_page appears
        String actualText=myCoursePage.courseCompareTitleText.getText();
        String expectedText="Shopping cart";
        //Assert.assertTrue(actualText.contains(expectedText));
        Assert.assertEquals(actualText,expectedText);

        //Closes the page
        Driver.closeDriver();

    }

}

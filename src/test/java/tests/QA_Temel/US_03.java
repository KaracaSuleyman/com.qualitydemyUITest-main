
package tests.QA_Temel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_03 extends TestBaseRapor {

    @Test
    public void test0301(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //scrolls end of the page
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

        //we are creating soft assert
        SoftAssert softAssert=new SoftAssert();
        //Tests that the facebook icon is visible
        softAssert.assertTrue(homePage.facebookLink.isDisplayed());
        //Tests that the twitter icon is visible
        softAssert.assertTrue(homePage.twitterLink.isDisplayed());
        //Tests that the linkedin icon is visible
        softAssert.assertTrue(homePage.linkedinLink.isDisplayed());

        //Asserts All
        softAssert.assertAll();

        //closes the page
        Driver.closeDriver();

    }


    @Test
    public void test0302(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        ReusableMethods.bekle(5);

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //scrolls end of the page
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        //clicks on Facebook icon
        homePage.facebookLink.click();

        //tests access to facebook page/icon is clickable
        String FacebookActualUrl=Driver.getDriver().getCurrentUrl();
        String FacebookExpectedText="facebook";
        Assert.assertTrue(FacebookActualUrl.contains(FacebookExpectedText));

        //comes to homePage
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        //clicks on Twitter icon
        homePage.twitterLink.click();

        //tests access to twitter page/icon is clickable
        String TwitterActualUrl=Driver.getDriver().getCurrentUrl();
        String TwitterExpectedText="twitter";
        Assert.assertTrue(TwitterActualUrl.contains(TwitterExpectedText));

        //comes to homePage
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        //clicks on Linkedin icon
        homePage.linkedinLink.click();

        //tests access to Linkedin page/icon is clickable
        String LinkedinActualUrl=Driver.getDriver().getCurrentUrl();
        String LinkedinExpectedText="linkedin";
        Assert.assertTrue(LinkedinActualUrl.contains(LinkedinExpectedText));

        //closes the page
        Driver.closeDriver();

    }
    @Test
    public void test0303(){

        //User goes to "qa.qualitydemy.com" homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //confirms cookies
        HomePage homePage=new HomePage();
        homePage.cookieKabul.click();

        //scrolls end of the page
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();

        //clicks on Facebook icon
        homePage.facebookLink.click();

        //tests that the company-related pages is visible in Facebook
        String FacebookCompanyActualUrl=Driver.getDriver().getCurrentUrl();
        String ExpectedText="qualitydemy";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(FacebookCompanyActualUrl.contains(ExpectedText));

        //comes to homePage
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        //clicks on Twitter icon
        homePage.twitterLink.click();

        //tests that the company-related pages is visible in Twitter
        String TwitterCompanyActualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(TwitterCompanyActualUrl.contains(ExpectedText));

        //comes to homePage
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

        //clicks on Linkedin icon
        homePage.linkedinLink.click();

        //tests that the company-related pages is visible in Linkedin
        String LinkedinCompanyActualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(LinkedinCompanyActualUrl.contains(ExpectedText));

        //Asserts All
        softAssert.assertAll();

        //closes the page
        Driver.closeDriver();
    }
}



package tests.QA_Fazil;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.HomePage;
import pages.MyCoursePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_38 {
    HomePage homePage=new HomePage();
    CoursePage coursePage= new CoursePage();
    @Test
    public void test01(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks the Categories tab on the homepage.
        homePage.categoriesDropDown.click();
        //In the section that opens, clicks the English Course tab.
        coursePage.englishCourseOption.click();
        //Clicks and selects English Course Learn To Speak
        coursePage.englishCourseLearnToSpeakLessonLink.click();
        //Compare this course with other posts clicks.
        coursePage.comparebutton.click();
        ReusableMethods.bekle(2);
        //Home / Tests whether to go to the course comparison chart.
        Assert.assertTrue(coursePage.homeCompareCourseText.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        Actions actions = new Actions(Driver.getDriver());
        //HomePage homePage =new HomePage();
        //CoursePage coursePage= new CoursePage();User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Login Click on the Link on the Homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in password textbox
        //Click the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Click the Categories tab on the homepage.
        homePage.categoriesDropDown.click();
        //In the opened section, clicks on the Web Design Course tab.
        coursePage.webDesignCourseLink.click();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Clicks on the link of the React and Typescript course on the page that opens.
        coursePage.reactAndTypeScriptCourseLink.click();
        ReusableMethods.bekle(1);
        //Clicks the buy now button on the React and Typescript demo page
        coursePage.buyNowButton.click();
        ReusableMethods.bekle(1);
        //It tests whether it goes to the Shopping Cart.
        Assert.assertTrue(coursePage.homeShoppingCartText.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test03(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Type "Piano" in the search box
        homePage.homePageSearchBox.sendKeys("Piano"+Keys.ENTER);
        //Clicks on Pianoforall - The Incredible New Way to Learn Piano and Keyboard
        coursePage.pianoForAllIncredibleCourseLink.click();
        //Clicks the add to cart button on the home page of the Pianoforall - Incredible New Way To Learn Piano & Keyboard course
        coursePage.addToCartButton.click();
        ReusableMethods.bekle(2);
        //Tests whether the Add to cart text has changed to Added to cart.
        Assert.assertTrue(coursePage.addedToCartButton.isDisplayed());
        ReusableMethods.bekle(2);
        coursePage.shoppingCartIcon.click();
        //Home / Shopping cart page of Free Java Lessons 01 Introduction to Programming lesson tests whether it is displayed.
        Assert.assertTrue(coursePage.homeShoppingCartText.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test04(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        MyCoursePage myCoursePage=new MyCoursePage();
        Actions actions = new Actions(Driver.getDriver());
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks the Categories tab on the main page
        homePage.categoriesDropDown.click();
        //In the opened section, clicks the Web Design Course tab.
        coursePage.englishCourseOption.click();
        //On the page that opens, he clicks on the Web Design for PHP text.
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        coursePage.disneyMagicEnglishCourseLink.click();
        ReusableMethods.bekle(2);
        //Clicks the Add to wishlist button on the Web Design for PHP course introduction page
        coursePage.addToWishlistButton.click();
        //Tests if the name of the button has changed to Added to wishlist
        Assert.assertTrue(coursePage.addedToWishlistButton.isDisplayed());
        //Clicks the My courses link
        homePage.myCoursesLink.click();
        //Clicks on the opened Wichlist button.
        coursePage.myWishlistPageWishListsLink.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        //Tests whether the Web Design for PHP course is displayed on the page.
        Assert.assertTrue(myCoursePage.disneyMagicEnglishInformationPageLink.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test05(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        MyCoursePage myCoursePage=new MyCoursePage();
        Actions actions = new Actions(Driver.getDriver());
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks the Categories tab on the main page
        homePage.categoriesDropDown.click();
        //In the section that opens, clicks the All courses tab.
        coursePage.categoriesSectionAllCoursesTab.click();
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        //Click and select the free button under the category section on the All courses / All category page
        coursePage.freeLessonSelectionButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //In the section that opens, clicks on the Wordpress article.
        ReusableMethods.bekle(1);
        coursePage.ultimateAWSCertifiedCourseLink.click();
        //Clicks the Get Enrolled button on the Wordpress course introduction page
        coursePage.getEnrolledButton.click();
        ReusableMethods.bekle(1);
        //Tests whether Allready purchased is displayed.
        Assert.assertTrue(coursePage.allreadyPurshasedButton.isDisplayed());
        //Clicks the My courses link
        homePage.myCoursesLink.click();
        ReusableMethods.bekle(1);
        //Tests whether the Wordpress course is displayed on the opened page
        Assert.assertTrue(myCoursePage.ultimateAWSCertifiedCourseLink.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void test06(){
        HomePage homePage =new HomePage();
        CoursePage coursePage= new CoursePage();
        MyCoursePage myCoursePage=new MyCoursePage();
        Actions actions = new Actions(Driver.getDriver());
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks the Categories tab on the main page
        homePage.categoriesDropDown.click();
        //In the opened section, clicks the Web Design Course tab.
        coursePage.webDesignCourseLink.click();
        //On the page that opens, he clicks on the Web Design for PHP text.
        coursePage.webDesignForPHPCourseLink.click();
        //Clicks the Buy now button on the course introduction page
        coursePage.buyNowButton.click();
        //Clicks the Checkout button in the payment section of the Home / Shopping cart page that opens.
        coursePage.checkoutButton.click();
        //On the Make payment page that opens, click on the stripe section and make it selected.
        coursePage.stripeIcon.click();
        //Clicks the Pay with stripe button under the total payment.
        coursePage.payWithStripeButton.click();
        ReusableMethods.bekle(2);
        //On the page that opens, writes the e-mail information for the credit card.
        //Enters Credit Card number
        //Enters the expiry date of the credit card as MM/YY
        //Enters the CVC number of the credit card
        //Enter the name on the credit card
        //Clicks on the pay button
        ReusableMethods.payWithCard();
        //On the My courses page that opens, he clicks on the video of the Web Design for PHP course.
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        myCoursePage.myCoursesWebDesignForPHPCourseImage.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //Click on the video link of the course under Curriculum for this course on the introduction page of the course.
        myCoursePage.WebDesignForPHPVideoLink.click();
        ReusableMethods.bekle(1);
        //It tests whether you go to the page where the video of the lesson is located.
        String expectedUrl="https://qa.qualitydemy.com/home/lesson/web-design-for-php/1/12";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        Driver.closeDriver();



    }
}



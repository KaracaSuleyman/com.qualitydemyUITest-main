package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // US-34_38_40  homepage locateleri fazil
    // on the home page
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement firstLoginLink;

    // on the home page
    @FindBy(id="login-email")
    public WebElement eMailHomePageTextbox;

    // on the home page
    @FindBy(id="login-password")
    public WebElement passwordTextBox;

    // on the home page
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    // on the home page
    @FindBy(linkText = "My courses")
    public WebElement successfulEntryCoursesLink;

    // on the home page
    @FindBy(xpath = "//div[@class='instructor-box menu-icon-box ms-md-3']")
    public WebElement instructorLink;

    // on the home page
    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement categoriesDropDown;

    // on the home page
    @FindBy (xpath = "//input[@name='query']")
    public WebElement homePageSearchBox;

    // on the home page
    @FindBy (xpath = "(//a[text()='My courses'])[1]")
    public WebElement myCoursesLink;
    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement cookieKabul;
    //finished



    //....................SERKAN......................................
    //Homepage
    @FindBy(xpath = "//*[@class='navbar-brand pt-2 mt-1']")
    public WebElement qualitydemyLogoLink;

    //Homepage
    @FindBy(linkText = "Categories")
    public WebElement categoriesLink;

    //Homepage
    @FindBy(xpath = "//*[@class='btn btn-sign-up']")
    public WebElement signupLink;

    //Homepage
    @FindBy(xpath = "//*[@class='btn btn-sign-in-simple']")
    public WebElement loginLink;

    //Homepage
    @FindBy(xpath = "(//*[@class='fas fa-shopping-cart'])[1]")
    public WebElement shoppingCartLink;

    //Homepage
    @FindBy(xpath = "(//button[@class='btn'])[2]")
    public WebElement searchTextboxButton;

    //Homepage
    @FindBy(xpath = "(//*[@class='fas fa-search'])[1]")
    public WebElement searchButton;

    //Homepage
    @FindBy(xpath = "//h4[text()='192 Online Courses']")
    public WebElement availableCoursesText;

    //Homepage
    @FindBy(xpath = "//h4[text()='Expert instruction']")
    public WebElement expertInstructionText;

    //Homepage
    @FindBy(xpath = "//h4[text()='Lifetime access']")
    public WebElement LifetimeAccessText;

    //Homepage
    @FindBy(xpath = "//*[text()='Top Categories']")
    public WebElement topCategoriesText;

    //Homepage
    @FindBy(xpath = "//*[text()='Top Courses']")
    public WebElement topCoursesText;

    //Homepage
    @FindBy(xpath = "//*[text()='Top 10 Latest Courses']")
    public WebElement top10LatestCoursesText;

    //Homepage
    @FindBy(xpath = "//*[text()='Featured Instructor']")
    public WebElement featuredInstructorText;

    //Homepage
    @FindBy(xpath = "//*[text()='Get started']")
    public WebElement getStartedButton;

    //Homepage
    @FindBy(xpath = "//a[text()='Join now']")
    public WebElement joinNowButton;

    //Homepage
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookLink;

    //Homepage
    @FindBy(xpath = " //*[@class='fab fa-twitter']")
    public WebElement twitterLink;

    //Homepage
    @FindBy(xpath = "(//*[@class='link-secondary footer-hover-link'])[10]")
    public WebElement aboutUsLink;

    //Homepage<About us Section
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement aboutUsTextAboutUsSection;

    @FindBy(xpath = "(//li[@class='mb-1 mt-2'])[3]")
    public WebElement linkedinLink;


    // US-04 Mert

    //homePage>Top Categories>Web Design for Web Developers
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[1]")
    public WebElement webDesignforWebDevelopersLink;

    //homePage>Top Categories>English Speaking Course
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[2]")
    public WebElement englishSpeakingCourseLink;

    //homePage>Top Categories
    @FindBy(xpath = "//div[@class='col-6 col-sm-6 col-xl-3 px-4']")
    public WebElement topCategoriesAllLink;
    


    //homePage>Useful Links>Blog
    @FindBy(xpath = "//a[@href='https://qa.qualitydemy.com/blog']")
    public WebElement blogLink;

    //homePage>Useful Links>All courses
    @FindBy(xpath = "//a[text()='All courses']")
    public WebElement allCoursesLink;

    //homePage>Useful Links>Sign Up
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[9]")
    public WebElement signUpLink;

    //homePage>Help>About Us
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[10]")
    public WebElement footerAboutUsLink;

    //homePage>Help>Privacy Policy
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[11]")
    public WebElement privacyPolicyLink;

    //homePage>Help>Terms and Condition
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[12]")
    public WebElement termsandConditionLink;

    //homePage>Help>Refund Policy
    @FindBy(xpath = "(//li[@class='mb-2 mt-1'])[13]")
    public WebElement refundPolicyLink;

    // US 09 Mert

    //Home>ShoppingCart>Remove
    @FindBy(xpath = "//div[@onclick='removeFaFromCartList(this)']")
    public WebElement removeFromTheCart;

    //Home>ShoppingCart>Number
    @FindBy(xpath = "(//span[@class='number'])[2]")
    public WebElement shoppingCartNumberLink;

    //Home>ShoopingCart>Courses in cart Text
    @FindBy(xpath = "//div[@class='title']")
    public WebElement coursesInCartText;

    //Home>ShoppingCart>CouponCodeTextBox
   @FindBy(xpath = "//input[@id='coupon-code']")
    public WebElement couponCodeTextBox;

   //Home>ShoppingCart>CouponCodeApplyButton
    @FindBy(xpath = "//button[@onclick='applyCoupon()']")
    public WebElement couponCodeApplyButton;

    //Home>ShoppingCart>CouponCodeDiscountText
    @FindBy(xpath = "//span[@class='discount-rate']")
    public WebElement couponCodeDiscountText;

    //Home>ShoppingCart>shoppingCartTotalPrice
    @FindBy(xpath = "//div[@class='total-price']")
    public WebElement shoppingCartTotalPrice;

    // US 37 Mert

    //Home>MyCourse>Course Details
    @FindBy(xpath= "(//a[@class='course_btn'])[3]")
    public WebElement courseDetailsLink;

    //Home>MyCourse>Course Content
    @FindBy(xpath = "(//i[@class='fa fa-minus'])")
    public WebElement closeCourseContentLink;

    //Home>MyCourse>Course Content
    @FindBy(xpath = "(//i[@class='fa fa-plus'])")
    public WebElement openCourseContentLink;

    //Home>MyCourse>courseCheckboxButton
    @FindBy(xpath = "//div[@class='form-group']")
    public WebElement courseCheckboxButton;

    //Home>MyCourse>Course Name14
    @FindBy(xpath = "//a[@id='14']")
    public WebElement courseDisplayNameText;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CoursePage{
    public CoursePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // US_038 Locate'leri (Fazıl)
    //On the course introduction pages
    @FindBy (xpath = " //i[@class='fas fa-balance-scale']")
    public WebElement comparebutton;

    // Student=> Under all courses
    @FindBy (xpath = "(//a[@class='course-title'])[1]")
    public WebElement englishCourseLearnToSpeakLessonLink;

    // Course introduction page=> Compare button=> Compare page
    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement homeCompareCourseText;

    //On the course introduction pages
    @FindBy(xpath = "//button[text()='Buy now']")
    public WebElement buyNowButton;

    //Course introduction page=>buy now button=> Home/Shopping Cart page
    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement homeShoppingCartText;

    //Student=> Under all courses
    @FindBy(xpath ="//span[text()='Web Design Course']" )
    public WebElement webDesignCourseLink;

    // Student=> Under all courses
    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement reactAndTypeScriptCourseLink;

    // Student=> Under all courses
    @FindBy (xpath = "(//a[@class='course-title'])[1]")
    public WebElement pianoForAllIncredibleCourseLink;

    // On the course introduction pages
    @FindBy (xpath = "//button[text()='Add to Cart']")
    public WebElement addToCartButton;

    // On the course introduction pages
    @FindBy (xpath = "//button[text()='Added to Cart']")
    public WebElement addedToCartButton;

    // Student=> Under all courses
    @FindBy (xpath = "(//a[@class='course-title'])[1]")
    public WebElement webDesignForPHPCourseLink;

    // On the course introduction pages
    @FindBy (xpath = "//button[@class='btn btn-add-wishlist ']")
    public WebElement addToWishlistButton;

    // On the course introduction pages
    @FindBy (xpath = "//button[text()='Added to wishlist']")
    public WebElement addedToWishlistButton;

    // course introduction pages=>AddToWishlist=>MyCourses=>WishListsLink
    @FindBy (xpath = "(//i[@class='far fa-heart'])[3]")
    public WebElement myWishlistPageWishListsLink;

    // Student=> Under all courses
    @FindBy (xpath = "(//a[@class='course-title'])[1]")
    public WebElement wordPressCourseLink;

    // On the course introduction pages
    @FindBy (xpath = "//a[@class='btn btn-buy-now']")
    public WebElement getEnrolledButton;

    // On the course introduction pages
    @FindBy (xpath = "//a[text()='Already purchased']")
    public WebElement allreadyPurshasedButton;

    // Student=> Under all courses
    @FindBy (xpath = "(//a[text()='Java Dersine Giriş'])[1]")
    public WebElement javaDersineGirisLink;

    // Categories=>All Courses=>Categories
    @FindBy (xpath = "//span[text()='All courses']")
    public WebElement categoriesSectionAllCoursesTab;

    // Categories=>All Courses=>Categories=>Free Button
    @FindBy (xpath = "//label[@for='price_free']")
    public WebElement freeLessonSelectionButton;

    // on the Home/Shopping Cart Page
    @FindBy (xpath = "//button[text()='Checkout']")
    public WebElement checkoutButton;

    // on the Make Payment Page
    @FindBy (xpath = "//img[@class='payment-gateway-icon']")
    public WebElement stripeIcon;

    // on the Make Payment Page
    @FindBy (xpath = "//button[@id='stripePayButton']")
    public WebElement payWithStripeButton;

    // Credit Card payment page
    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    // Credit Card payment page
    @FindBy (xpath = "//input[@id='cardNumber']")
    public WebElement cardNumberTextBox;

    // Credit Card payment page
    @FindBy (xpath = "//input[@id='cardExpiry']")
    public WebElement cardExpirationDateTextBox;

    // Credit Card payment page
    @FindBy(xpath = "//input[@id='cardCvc']")
    public WebElement cardCVCNumberTextBox;

    // Credit Card payment page
    @FindBy(xpath = "//input[@id='billingName']")
    public WebElement nameOnTheCardTextBox;

    // Credit Card payment page
    @FindBy (xpath = "//div[@class='Icon Icon--md']")
    public WebElement payButton;

    //On the course introduction pages
    @FindBy(xpath="//h1[text()='Wordpress']")
    public WebElement wordpressCourseText;

    //On the course introduction pages
    @FindBy(xpath="//h1[text()='Web Design for PHP']")
    public WebElement webDesignForPHPText;

    //Under All courses
    @FindBy(xpath="(//a[@class='course-title'])[1]")
    public WebElement freeJavaDersleri01ProgramlamayaGirisCourseLink;

    //On the course introduction pages
    @FindBy(xpath="//h1[text()='Free Java Dersleri 01 Programlamaya Giris']")
    public WebElement freeJavaDersleri01ProgramlamayaGirisCourseText;

    // Under Categories dropdown
    @FindBy(xpath = "//span[text()='English Course']")
    public WebElement englishCourseOption;

    // Under Categories dropdown
    @FindBy (xpath = "//span[text()='IT & Software']")
    public WebElement itSoftwareOption;

    //On the course page
    @FindBy(xpath="//h5[text()='Web Design for PHP']")
    public WebElement myWishListPageWebDesignCourseLink;

    //On the course page
    @FindBy(xpath="(//a[@href='https://qa.qualitydemy.com/home/course/wordpress/6'])[1])")
    public WebElement wordPressImage;

    //on the course page
    @FindBy(xpath="//h1[text()='Great Web Design']")
    public WebElement greatWebDesignCourseText;

    //On the course page
    @FindBy(xpath="(//a[@href='https://qa.qualitydemy.com/home/course/web-design-for-php/1'])[1]")
    public WebElement webDesignCourseLink1;

    //On the course page
    @FindBy(xpath="(//i[@class='fas fa-shopping-cart'])[1]")
    public WebElement shoppingCartIcon;

    // on the course page
    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement disneyMagicEnglishCourseLink;

    //on the course page
    @FindBy(xpath="(//a[@class='course-title'])[2]")
    public WebElement ultimateAWSCertifiedCourseLink;

}

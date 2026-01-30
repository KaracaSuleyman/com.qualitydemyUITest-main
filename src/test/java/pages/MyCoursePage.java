package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyCoursePage {

    public MyCoursePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    //              <<***SULEYMAN***>>

    //         -------------------------

    //          ****  Start of US_10  ****
    //homePage> my Courses link (on the top right)
    @FindBy( xpath ="(//a[text()='My courses'])[1]" )
    public WebElement homePageMyCoursesLink;

    // my course> Reset Button
    @FindBy(xpath = "//a[text()='Reset']")
    public  WebElement myCourseResetButton;



    // my course > search Box>> to top
    @FindBy(xpath = "//input[@placeholder='Search for courses']")
    public WebElement myCourseTopSearchBox;

    // my course top serach box result
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[1]")
    public WebElement myCourseTopSearchResultBox;


    // my course > search Box >> on the bottom
    @FindBy(xpath = "//*[@class='form-control py-2']")
    public WebElement myCourseBottomSearchBox;

    // my course > search result
    @FindBy(id = "my_courses_area")
    public WebElement myCourseSearchResultElement;


    // my course> categories dropdown menu
    @FindBy(xpath = "//a[@data-bs-toggle='dropdown']")
    public WebElement myCourseCategoriesDropdown;

    // my course> categories dropdown menu>> select web
    @FindBy(xpath = "//a[text()='Web Design Course']")
    public WebElement getMyCourseCategoriesWebDesingCourseDropdown;

    // my course > categories edit rating link
    @FindBy(id = "edit_rating_btn_1")
    public WebElement myCourseEditRatingLink;

    // my course > scooring screen
    @FindBy(id ="star_rating_of_course_1")
    public WebElement myCourseScooringScreenDropdown;

    // my course > cancel button
    @FindBy(xpath = "(//a[text()='Cancel'])[1]")
    public WebElement myCoursesCancelButton;

    // my course > publish rating button
    @FindBy(xpath = "(//button[text()='Publish rating'])[1]")
    public WebElement myCoursePublishRatingButton;

    // my course> rating box
    @FindBy(xpath = "(//div[@class='rating your-rating-box'])[1]")
    public WebElement myCourseRatingBox;

    // my course>  rating text box
    @FindBy(id = "review_of_a_course_1")
    public WebElement myCourseRatingTextBox;

    // my course > rating test
    @FindBy(xpath = "(//div[@class='rating your-rating-box'])[1]")
    public WebElement myCourseRatingTest;

    //my course > rating test> select 3 stars
    @FindBy(xpath = "//option[@value='3']")
    public WebElement myCourseRating3starText;

    // my Course start lesson Button
    @FindBy(xpath = "(//a[text()='Start lesson'])[1]")
    public  WebElement myCourseStartLessonButton;

    // my Course start lesson test link
    @FindBy(xpath = "(//div[@class='lesson_duration'])[1]")
    public  WebElement myCourseStartLessonTestLink;

    // -----------------------end of US_10 ------------------
    //          ****  Start of US_13  ****



    // My courses > message link
    @FindBy(xpath = "//*[text()=' Messages                  ']")
    public  WebElement  myCourseMessageLink;

    // My courses > message>  box Dropdown select name
    @FindBy(xpath = "//*[@name='receiver']")
    public  WebElement myCourseMessageboxDropdown;


    // My course > message > message text box
    @FindBy(xpath ="//*[@class='form-control radius-8']")
    public  WebElement myCourseMessageTextBox;


    //My courses> message> send button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement myCourseMessageSendButton;


    // My course > message > messaj send text
    @FindBy(xpath = "//div[@class='toast toast-success']")
    public  WebElement myCourseMessageSendText;

    //My courses> message> cancel button
    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement myCourseMessageCancelButton;

    //My courses Compos button (new message)
    @FindBy(xpath = "//button[@id='NewMessage']")
    public WebElement myCourseComposButton;

    //My courses> message> corresponded link (sent tomessage)
    @FindBy(xpath = "(//div[@class='message-sender-wrap'])[2]")
    public  WebElement myCourseCorrespondedLink;

    // Mycourse > message >corresponded test text box
    @FindBy(xpath = "//div[@class='message-content']")
    public WebElement myCourseCorrespondedTestTextBox;

    // ---------End of US_13 ------------------
     // *******Suleyman finished**********



    //               <<<<  TEMEL  >>>>

    //   -------------US_11 & US_12------------

    //   ------------- MY WISHLIST ------------

    //homePage > heartIcon(Wishlist)
    @FindBy(xpath = "(//div[@class='icon'])[3]")
    public  WebElement heartIconLink;

    //homepage > Go To Wishlist
    @FindBy(linkText = "Go to wishlist")
    public WebElement goToWishlistLink;

    //MyWishlist > Course Duration
    @FindBy(xpath = "(//*[@class='text-muted text-12px'])[1]")
    public WebElement wishlistDurationText;

    //MyWishlist Course Lectures
    @FindBy(xpath = "(//*[@class='text-muted text-12px'])[2]")
    public WebElement wishlistLessonNumberText;

    //MyWishlist Searchbox
    @FindBy(xpath = "//input[@class='form-control py-2']")
    public WebElement myWishlistSearchbox;

    //MyWishlist > Compare Button
    @FindBy(xpath = "//button[@class='btn-compare-sm float-end']")
    public WebElement wishlistCompareButton;

    //MyWishlist Course Title H5
    @FindBy(xpath = "//h5[@class='title']")
    public WebElement wishlistCourseTitleText;

    //MyWishlist > CourseCompare > Buy Now
    @FindBy(linkText = "Buy now")
    public WebElement courseCompareBuyNowLink;

    //MyWishlist > CourseCompare > Learn More
    @FindBy(xpath = "//a[@class='text-danger fw-500 pt-3 d-inline-block']")
    public WebElement courseCompareLearnMoreLink;

    //MyWishlist > CourseCompare > Get Enrolled
    @FindBy(linkText = "Get Enrolled")
    public WebElement courseCompareGetEnrolledLink;

    //MyWishlist > CourseCompare > Already Purchased
    @FindBy(linkText = "Already purchased")
    public WebElement alreadyPurchasedLink;

    //MyWishlist > CourseCompare > 1.Search Dropdown
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement courseCompareFirstSearchDropdown;

    //MyWishlist > CourseCompare > 2.Search Dropdown
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
    public WebElement courseCompareSecondSearchDropdown;

    //MyWishlist > CourseCompare > 3.Search Dropdown
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[3]")
    public WebElement courseCompareThirdSearchDropdown;

    //homePage > Instructor
    @FindBy(xpath = "(//div[@class='icon'])[1]")
    public  WebElement instructorLink;

    //InstruktorPage > Instructor Revenue Text
    @FindBy(xpath = "//*[text()='Instructor revenue']")
    public WebElement instructorPageRevenueText;

    //MyWishlist > Compare > Course Compare Title
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement courseCompareTitleText;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement clickedRelevantCoursePage;

    @FindBy(xpath = "//*[@class='total-time']")
    public WebElement DurationText;

    @FindBy(xpath = "//*[@class='total-lectures']")
    public WebElement LessonText;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement secondSearchBox;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement thirdSearchBox;

    @FindBy(xpath = "//*[@class='btn red radius-5 mt-3 py-2']")
    public List<WebElement> courseCompareBlueButton;

    // -----------------------end of US_11 & US_12 ------------------

 // fazil US_38  (26.01.2023)
 // on the My courses Page
 @FindBy(xpath= "(//a[@href='https://qa.qualitydemy.com/home/course/web-design-for-php/1'])[1]")
 public WebElement myCoursesWebDesignForPHPCourseImage;

    //on  the My courses page
    @FindBy(xpath="//span[text()='Web Design for PHP']")
    public WebElement WebDesignForPHPVideoLink;

    // on the My courses page
    @FindBy(xpath="plyr__control plyr__control--overlaid")
    public WebElement webDesignCorseYoutubeVideoLink;

    //on the myWishList Page
    @FindBy(xpath="//h5[text()='Disney Magic English']")
    public WebElement disneyMagicEnglishInformationPageLink;

    //on the My courses page
    @FindBy(xpath = "//div[@class='col-md-6 col-lg-3 px-2']")
    public WebElement ultimateAWSCertifiedCourseLink;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


                                  //ELIF

                                // US 14

    //Inctructor> Homepage
    @FindBy(xpath ="(//img[@class='img-fluid'])[2]")
    public WebElement profileImageButton;

    //Inctructor> Homepage> profil button>
    @FindBy(xpath = "//div[@class='dropdown user-dropdown corner-triangle top-right radius-10']")
    public WebElement Profiledropdown;

    //Inctructor> Homepage> profil button> dropdown>
    @FindBy(xpath ="(//li[@class='user-dropdown-menu-item'])[4]")
    public WebElement purchaseHistoryLink;

    //on the Purchase History  Page
    @FindBy(xpath = "//a[text()='Invoice']")
    public WebElement invoiceButton;

    //Purchase History  Page> inovice button
    @FindBy(xpath = "//h1[@class='page-title py-5 text-white print-hidden']")
    public WebElement invoicepage;

    //on the Purchase History  Page
    @FindBy(xpath = "(//a[@class='purchase-history-course-title'])[1]")
    public WebElement CourseNameText;

    //on the courses page
    @FindBy(xpath = "//section[@class='course-header-area']")
    public WebElement coursePageLink;

                               // US15

    //Inctructor> Homepage> profil button> dropdown>
    @FindBy(xpath = "//a[text()='User profile']")
    public WebElement userProfileButton;

    //Instructor> on the user profile page
    @FindBy(xpath = "//input[@id='FristName']")
    public WebElement firstNameTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//textarea[@name='title']")
    public WebElement titletextBox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//span[@class='input placeholder']")//div[@class='form-group mb-3'])[2]
    public WebElement yourSkillsTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//iframe[@id='Biography_ifr']")
    public WebElement iframeBiographyTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//body[@class='mce-content-body ']")
    public WebElement biographyTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement twetterTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement facebookTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement linkedinTextbox;

    //Instructor> on the user profile page
    @FindBy(xpath = "//div[@class='col-12 pt-4']")
    public WebElement iframeUserprofileSaveButton;

    //Instructor> on the user profile page
    @FindBy(xpath = "//div[@class='col-md-8 col-lg-9 mt-4 mt-md-0']")
    public WebElement editProfile;

    //Instructor> on the user profile page
    @FindBy(xpath = "//div[@class='col-12 pt-4']/button")
    public WebElement userProfileSaveButton;

    //Instructor> on the user profile page
    @FindBy(xpath = "//li[@class='active mb-3']")
    public WebElement ProfileButton;

    //Instructor> on the user profile page
    @FindBy(xpath = "(//*[text()='User profile'])[2]")
    public WebElement userProfileTitleText;

    //Instructor> on the user profile page
    @FindBy(xpath = "//div[text()='User update successfully']")
    public WebElement updateSuccessfullyAlert;

                            // US16

    //Instructor> on the user profile page
    @FindBy(xpath = "//*[text()=' Account']")
    public WebElement accountButton;

    //Instructor> on the credentials page
    @FindBy(xpath = "//*[text()='Credentials']")
    public WebElement credentialsTitle;

    //Instructor> on the credentials page
    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement currentPasswordTextbox;

    //Instructor> on the credentials page
    @FindBy(xpath = "(//div[@class='input-group'])[3]")
    public WebElement newPasswordTextbox;

    //Instructor> on the credentials page
    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement confirmPasswordTextbox;

                             // US17

    @FindBy(xpath = "//i[@class='fas fa-camera-retro']")
    public WebElement photoButton;

    @FindBy(xpath ="//input[@type='file']")
    public WebElement chooseAFileButton;

    @FindBy(xpath ="//button[@class='btn red px-5 py-2 radius-8']")
    public WebElement uploadButton;

    @FindBy(xpath ="//div[text()='Updated successfully']")
    public WebElement photoSuccessfullyMessageText;

    @FindBy(xpath ="//p[text()='Please select only jpg/png file.']")
    public WebElement warningMessageText;

                           // US18

    @FindBy(xpath = "//div[@class='instructor-box menu-icon-box ms-md-3']")
    public WebElement instructorLink;

    @FindBy(xpath = "//a[@class='side-nav-link active']")
    public WebElement dashboardLink;

    @FindBy(xpath = "//p[text()='Number of courses']")
    public WebElement numberOfCoursesLink;

    @FindBy(xpath = "//h4[@class='page-title']")
    public WebElement coursePageTitle;

    @FindBy(xpath = "//p[text()='Pending balance']")
    public WebElement pendingBalanceLink;

    @FindBy(xpath = "(//div[@class='card'])[1]")
    public WebElement payoutReportLink;

    @FindBy(xpath = "//p[text()='Requested withdrawal amount']")
    public WebElement RequestedWithdrawalAmountLink;

                                  // US20

    //Instructor> on Course Manager page
    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerLink;

    //Instructor> on Course Manager page
    @FindBy(xpath = "//i[@class='mdi mdi-dots-vertical']")
    public WebElement dreiDotDropdown;

    //Instructor> on Course Manager page> drei dot> dropdown
    @FindBy(xpath = "//a[text()='Edit this course']")
    public WebElement editThisCourseDropdown;

    //Instructor> on Course edit page
    @FindBy(xpath = "//a[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm my-1']")
    public WebElement backToCourseListButton;

    //Instructor> on Course edit page
    @FindBy(xpath = "//a[@class='alignToTitle btn btn-outline-secondary btn-rounded btn-sm ml-1 my-1']")
    public WebElement viewOnFrontendButton;

    //Instructor> on Course page
    @FindBy(xpath = "//section[@class='course-header-area']")
    public WebElement relevantCoursePageTitle;

    //Instructor> on Course edit page
    @FindBy(xpath = "//li[@class='next list-inline-item']")
    public WebElement rightArrowButton;

    //Instructor> on Course edit page
    @FindBy(xpath = "//span[text()='Basic']")
    public WebElement basicButton;

    //Instructor> on Course edit page
    @FindBy(xpath = "//i[@class='mdi mdi-arrow-left-bold']")
    public WebElement leftArrowButton;

    //Instructor> on Course edit page
    @FindBy(xpath = "//span[text()='Curriculum']")
    public WebElement curriculumButton;

                         //US23

    //Instructor> on the course manager page
    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;

    //Instructor> on the course manager page
    @FindBy(xpath = "(//input[@placeholder='Provide requirements'])[1]")
    public WebElement requirementTextbox;

    //Instructor> on the course manager page
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement requirementplusButton;

    //Instructor> on the course manager page
    @FindBy(xpath = "(//input[@placeholder='Provide requirements'])[3]")
    public WebElement newrequirementTextbox;

    //Instructor> on the course manager page
    @FindBy(xpath = "//span[text()='Finish']")
    public WebElement finishButton;

    //Instructor> on the course manager page
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    //Instructor> on the course manager page
    @FindBy(xpath = "//div[@class='requirements-box']")
    public WebElement requirementlistText;

    //Instructor> on the course manager page
    @FindBy(xpath = "(//i[@class='fa fa-minus'])[1]")
    public WebElement minusButton;

    //Instructor> on the course manager page
    @FindBy(xpath = "//div[@class='col-lg-8 order-last order-lg-first radius-10 mt-4 bg-white p-30-40 box-shadow-5']")
    public WebElement courseinfotext;

    //Instructor> on the course manager page
    @FindBy(xpath = "//h2[text()='Congratulations!']")
    public WebElement greenalert;

    // US24

    @FindBy(xpath = "//span[text()='Outcomes']")
    public WebElement outcomesButton;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement outcomesTextbox;

    @FindBy(xpath = "(//i[@class='fa fa-plus'])[2]")
    public WebElement outcomesPlusButton;

    @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[3]")
    public WebElement newOutcomesTextbox;

    @FindBy(xpath = "//ul[@class='what-you-get__items']")
    public WebElement outcomeslistText;

    @FindBy(xpath = "(//i[@class='fa fa-minus'])[2]")
    public WebElement outcomesMinusButton;



    // US 07 Mert

    @FindBy(xpath = "//a[@class='kopyala-link']")
    public WebElement newEmailAccountCopy;

    // US_36 Vural

    @FindBy(xpath = "//p[@class='fc-button-label']")
    public WebElement doNotConsentButton;

}

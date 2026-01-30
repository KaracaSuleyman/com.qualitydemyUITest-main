package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //              <<<<  SERKAN  >>>>

    //       -------------US_06,US_8------------


    //Homepage<SignupSection<firstNameTextbox
    @FindBy(xpath = "(//*[@id='first_name'])[1]")
    public WebElement firstNameTextbox;


    //Homepage<SignupSection<lastNameTextbox
    @FindBy(xpath = "(//*[@id='last_name'])[1]")
    public WebElement lastNameTextbox;


    //Homepage<SignupSection<emailTextbox
    @FindBy(xpath = "(//*[@id='registration-email'])[1]")
    public WebElement emailTextbox;


    //Homepage<SignupSection<passwordTextbox
    @FindBy(xpath = "//*[@id='registration-password']")
    public WebElement passwordTextbox;


     //Homepage<SignupSection<blueSignupButton
     // @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    // @FindBy(xpath = "//*[@class='btn btn-sign-up']")
    @FindBy(xpath = "//a[text()='Sign Up']")
    public WebElement blueSignupButton;


    //Homepage<SignupSection<alreadyAccountLoginLink
    @FindBy(xpath = "//*[@class='text-15px fw-700']")
    public WebElement alreadyAccountLoginLink;


    //Homepage<LoginSection<loginSectionEmailTextbox
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement loginSectionEmailTextbox;


    //Homepage<loginSection<loginSectionPasswordTextbox
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement loginSectionPasswordTextbox;


    //Homepage<loginSection<loginSectionForgotPasswordLink
    @FindBy(xpath = "//*[@class='text-muted text-12px fw-500 float-end']")
    public WebElement loginSectionForgotPasswordLink;


    //Homepage<loginSection<forgotPasswordSectionEmailTextbox
    @FindBy(xpath = "//*[@id='forgot-password-email']")
    public WebElement forgotPasswordSectionEmailTextbox;


    //Homepage<loginSection<forgotPasswordSectionSendRequestButton
    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement forgotPasswordSectionSendRequestButton;


    //Homepage<loginSection<greenCheckInboxText
    @FindBy(xpath = "//div[text()='Check your inbox for the request']")
    public WebElement greenCheckInboxText;


    //Homepage<loginSection<redAlreadyRegisteredText
    @FindBy(xpath = "//div[text()='You have already registered']")
    public WebElement redAlreadyRegisteredText;

    //Homepage<SignupSection<regist_OK_PleaseCheckYourEmailText
    @FindBy(xpath = "//*[text()='Your registration has been successfully done. Please check your mail inbox to verify your email address.']")
    public WebElement greentextCheckEmailbox;

    //Homepage<SignupSection<VerificationPageText
    @FindBy(xpath = "//*[text()='Email verification']")
    public WebElement emailVerificationPageText;


    //Homepage> log out icon
    @FindBy(xpath = "//div[@class='user-box menu-icon-box']")
    public WebElement logoutIconButton;

    //Homepage> log out button
    @FindBy(xpath = "//*[text()=' Log out']")
    public WebElement logoutButton;

    //Homepage<loginSection
    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement loginSectionLoginText;
    //Homepage<SignupSection
    @FindBy(xpath = "(//*[text()='Sign Up'])[2]")
    public WebElement signupPageText;

    //homepage<loginSection
    @FindBy(xpath = "text-muted text-12px fw-500 float-end")
    public WebElement forgotPasswordLink;

    //Homepage<loginSection
    @FindBy(xpath = "//*[text()='The Your email field must contain a valid email address.']")
    public WebElement warningOfInvalidEmailText;

    //Homepage<loginSection
    @FindBy(xpath = "//*[text()='Forgot password']")
    public WebElement forgotPasswordPageText;

    //Homepage<loginSection
    @FindBy(xpath = "//*[text()='User not found']")
    public WebElement warningOfUserNotFoundText;

    //Homepage<loginsection
    @FindBy(xpath = "//*[@class='text-15px fw-700']")
    public WebElement gobackLoginLink;

    //Homepage<loginSection
    @FindBy(xpath = "//*[text()='Your registration has been successfully done']")
    public WebElement signupSuccessfullyDoneText;

}

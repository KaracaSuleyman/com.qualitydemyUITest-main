/*

package tests.QA_Mert;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_07 {

    @Test
    public void TC_0701(){

        1-The user goes to the "qualitydemy.com" homepage.
        2-Confirm cookies.
        3-Clicks on the Sign up button.
        4-Fills in the First name, Last name, e-mail and password fields appropriately.
        5-Clicks the sign up button.
        6-He sees that he comes to the e-mail verification page.
        7-See the code sent to the e-mail address written while registering.


        // 1-The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

        //2-Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();


        // 3-Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(2);



        //4-Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("fsrgg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("egheh" + Keys.ENTER);

        //Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");

        ReusableMethods.bekle(10);

        // copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.newEmailAccountCopy.click();

        // Back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);

        // Paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");

        // create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);


    }

    @Test
    public void TC_0702(){
        // verification code error by qualitydemy site
    }

    @Test
    public void TC_0703(){
        // verification code error by qualitydemy site
    }


    @Test
    public void TC_0704(){

        HomePage homePage = new HomePage();
        homePage.loginButton.click();
        Assert.assertTrue(homePage.loginButton.isEnabled());

    }
}


 */
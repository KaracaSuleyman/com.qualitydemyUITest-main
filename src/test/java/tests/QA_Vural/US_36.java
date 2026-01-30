package tests.QA_Vural;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.InstractionPage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import javax.swing.*;

public class US_36 extends TestBaseRapor {

    @Test
    public void TC_3601(){

        extentTest = extentReports.createTest("Address Section Test", "The name and email address sections should not be changed.");
        Actions actions =new Actions(Driver.getDriver());

        /*

        1- User goes to "qa.qualitidemy.com" main page
        2- confirm cookie
        3- click on Log in
        4- click on E-mail box and enters user e-mail address
        5- click on password box and enter user password
        6- click on log in button
        7- click on the Instructor button
        8- tests that the name section should not be changed
        9- tests that the e-mail address section should not be changed
        10- closes the page

        */

        // 1- The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("The user goes to the \"qualitydemy.com\" homepage.");

        // 2- Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("Confirm cookies.");

        // 3- Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        ReusableMethods.bekle(1);
        actions.moveToElement( loginPage.blueSignupButton).perform();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(1);
        extentTest.info("Clicks on the Sign up button.");

        // 4- Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("asdfg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("yxcvb" + Keys.ENTER);
        ReusableMethods.bekle(1);
        extentTest.info("Fills in the First name, Last name, e-mail and password fields appropriately.");

        // 5- Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");
        ReusableMethods.bekle(3);
        extentTest.info("Create new E-mail account");

        // 6- copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();
        try {
            if (registrationPage.doNotConsentButton.isDisplayed()) {
                registrationPage.doNotConsentButton.click();
            }
        } catch (Exception e) {
            System.out.println("It can be encountered with the doNotConsentButton web element. But you didn't encounter the doNotConsentButton web element. Don't worry there is no problem :)");
        }
        ReusableMethods.bekle(1);
        registrationPage.newEmailAccountCopy.click();
        extentTest.info("copy the e-mail");

        // 7- back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        extentTest.info("back to qa site");

        // 8- paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");
        extentTest.info("paste the e-mail to e-mail text box");

        // 9- create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("create password");

        // 10- write email and password
        homePage.eMailHomePageTextbox.sendKeys(Keys.CONTROL, "v");
        homePage.passwordTextBox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("write email and password");

        // 11- click Instructor link
        ReusableMethods.bekle(2);
        homePage.instructorLink.click();
        extentTest.info("click Instructor link");

        // 12- tests that the name section should not be changed
        InstractionPage instractionPage = new InstractionPage();
        instractionPage.instructorApplicationFormName.sendKeys("New Value");
        String actualName = instractionPage.instructorApplicationFormName.getText();
        Assert.assertFalse(actualName.equals("New Value"));
        extentTest.pass("tests that the name section should not be changed");



        // 13- tests that the e-mail address section should not be changed
        instractionPage.instructorApplicationFormEmail.sendKeys("New Value");
        String actualEmail = instractionPage.instructorApplicationFormName.getText();
        Assert.assertFalse(actualEmail.equals("New Value"));
        ReusableMethods.bekle(2);
        extentTest.pass("tests that the e-mail address section should not be changed");

        // 14- quit Drivers
        Driver.quitDriver();
        extentTest.info("quit Drivers");


    }


    @Test
    public void TC_3602(){

        /*

        1- User goes to "qa.qualitidemy.com" main page
        2- confirm cookie
        3- click on Log in
        4- click on E-mail box and enters user e-mail address
        5- click on password box and enter user password
        6- click on log in button
        7- click on the Instructor button
        8- tests that the Address section should be accessible
        9- tests that the phone number section should be accessible
        10- tests that the any message section should be accessible
        11- closes the page

        */

        extentTest = extentReports.createTest("Address, Phone number and Any message Sections Test", "Address, phone number and any message sections should be accessible.");

        // 1- The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("The user goes to the \"qualitydemy.com\" homepage.");

        // 2- Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("Confirm cookies.");

        // 3- Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicks on the Sign up button.");

        // 4- Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("asdfg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("yxcvb" + Keys.ENTER);
        ReusableMethods.bekle(1);
        extentTest.info("Fills in the First name, Last name, e-mail and password fields appropriately.");

        // 5- Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");
        ReusableMethods.bekle(3);
        extentTest.info("Create new E-mail account");

        // 6- copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();

        try {
            if (registrationPage.doNotConsentButton.isDisplayed()) {
                registrationPage.doNotConsentButton.click();
            }
        } catch (Exception e) {
            System.out.println("It can be encountered with the doNotConsentButton web element. But you didn't encounter the doNotConsentButton web element. Don't worry there is no problem :)");
        }
        ReusableMethods.bekle(1);
        registrationPage.newEmailAccountCopy.click();
        extentTest.info("copy the e-mail");

        // 7- back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        extentTest.info("back to qa site");

        // 8- paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");
        extentTest.info("paste the e-mail to e-mail text box");

        // 9- create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("create password");

        // 10- write email and password
        homePage.eMailHomePageTextbox.sendKeys(Keys.CONTROL, "v");
        homePage.passwordTextBox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("write email and password");

        // 11- click Instructor link
        ReusableMethods.bekle(2);
        homePage.instructorLink.click();
        extentTest.info("click Instructor link");

        // 12- tests that the Address section should be accessible
        InstractionPage instractionPage = new InstractionPage();
        Assert.assertTrue(instractionPage.instructorApplicationFormAddress.isEnabled());
        extentTest.pass("tests that the Address section should be accessible");

        // 13- tests that the phone number section should be accessible
        Assert.assertTrue(instractionPage.instructorApplicationFormPhoneNumber.isEnabled());
        extentTest.pass("tests that the phone number section should be accessible");

        // 14- tests that the any message section should be accessible
        Assert.assertTrue(instractionPage.instructorApplicationFormAnyMessage.isEnabled());
        ReusableMethods.bekle(2);
        extentTest.pass("tests that the any message section should be accessible");

        // 15- quit Drivers
        Driver.quitDriver();
        extentTest.info("quit Drivers");



    }

    @Test
    public void TC_3603(){

       /*

        1- User goes to "qa.qualitidemy.com" main page
        2- confirm cookie
        3- click on Log in
        4- click on E-mail box and enters user e-mail address
        5- click on password box and enter user password
        6- click on log in button
        7- click on the Instructor button
        8- tests that the documents should be selectable in the document section
        9- closes the page

        */

        extentTest = extentReports.createTest("Document Section Test", "documents should be selectable in the document section");

        // 1- The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("The user goes to the \"qualitydemy.com\" homepage.");

        // 2- Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("Confirm cookies.");

        // 3- Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicks on the Sign up button.");

        // 4- Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("asdfg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("yxcvb" + Keys.ENTER);
        ReusableMethods.bekle(1);
        extentTest.info("Fills in the First name, Last name, e-mail and password fields appropriately.");

        // 5- Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");
        ReusableMethods.bekle(3);
        extentTest.info("Create new E-mail account");

        // 6- copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();
        try {
            if (registrationPage.doNotConsentButton.isDisplayed()) {
                registrationPage.doNotConsentButton.click();
            }
        } catch (Exception e) {
            System.out.println("It can be encountered with the doNotConsentButton web element. But you didn't encounter the doNotConsentButton web element. Don't worry there is no problem :)");
        }
        ReusableMethods.bekle(1);
        registrationPage.newEmailAccountCopy.click();
        extentTest.info("copy the e-mail");

        // 7- back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        extentTest.info("back to qa site");

        // 8- paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");
        extentTest.info("paste the e-mail to e-mail text box");

        // 9- create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("create password");

        // 10- write email and password
        homePage.eMailHomePageTextbox.sendKeys(Keys.CONTROL, "v");
        homePage.passwordTextBox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("write email and password");

        // 11- click Instructor link
        ReusableMethods.bekle(2);
        homePage.instructorLink.click();
        extentTest.info("click Instructor link");

        // 12- tests that the documents should be selectable in the document section
        InstractionPage instractionPage = new InstractionPage();
        // String filePath = "/home/user/IdeaProjects/com.qualitydemyUITest/src/test/java/tests/QA_Vural/denemeForTeam04Project.doc";
        String filePath = "C:\\Users\\ASUS2\\Desktop\\denemeForTeam04Project.doc";
        instractionPage.instructorApplicationFormDocument.sendKeys(filePath);
        ReusableMethods.bekle(2);
        String expectedFileName = "denemeForTeam04Project.doc";
        String actualFileName = instractionPage.instructorApplicationFormDocumentInputFileName.getText();
        Assert.assertEquals(actualFileName, expectedFileName);
        ReusableMethods.bekle(2);
        extentTest.pass("tests that the documents should be selectable in the document section");

        // 13- quit Drivers
        Driver.quitDriver();
        extentTest.info("quit Drivers");



    }

    @Test
    public void TC_3604(){

        /*

        1- User goes to "qa.qualitidemy.com" main page
        2- confirm cookie
        3- click on Log in
        4- click on E-mail box and enters user e-mail address
        5- click on password box and enter user password
        6- click on log in button
        7- click on the Instructor button
        8- click on the Apply button
        9- tests that  it should lead to the "YOUR APPLICATION" section
        10- tests the "click to activate" button should be seen
        11- closes the page

        */

        extentTest = extentReports.createTest("When the apply button is pressed", "When the apply button is pressed, it should lead to the \"YOUR APPLICATION\" section and the \"click to activate\" button should be seen.");

        // 1- The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("The user goes to the \"qualitydemy.com\" homepage.");

        // 2- Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("Confirm cookies.");

        // 3- Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicks on the Sign up button.");

        // 4- Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("asdfg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("yxcvb" + Keys.ENTER);
        ReusableMethods.bekle(1);
        extentTest.info("Fills in the First name, Last name, e-mail and password fields appropriately.");

        // 5- Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");
        ReusableMethods.bekle(3);
        extentTest.info("Create new E-mail account");

        // 6- copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();
        try {
            if (registrationPage.doNotConsentButton.isDisplayed()) {
                registrationPage.doNotConsentButton.click();
            }
        } catch (Exception e) {
            System.out.println("It can be encountered with the doNotConsentButton web element. But you didn't encounter the doNotConsentButton web element. Don't worry there is no problem :)");
        }
        ReusableMethods.bekle(1);
        registrationPage.newEmailAccountCopy.click();
        extentTest.info("copy the e-mail");

        // 7- back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        extentTest.info("back to qa site");

        // 8- paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");
        extentTest.info("paste the e-mail to e-mail text box");

        // 9- create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("create password");

        // 10- write email and password
        homePage.eMailHomePageTextbox.sendKeys(Keys.CONTROL, "v");
        homePage.passwordTextBox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("write email and password");

        // 11- click Instructor link
        ReusableMethods.bekle(2);
        homePage.instructorLink.click();
        extentTest.info("click Instructor link");

        // 12- write Address
        InstractionPage instractionPage = new InstractionPage();
        instractionPage.instructorApplicationFormAddress.sendKeys("Mamak/Ankara");
        extentTest.info("write Address");

        // 13- write Phone number
        instractionPage.instructorApplicationFormPhoneNumber.sendKeys("176526981");
        extentTest.info("Confirm cookies.");

        // 14- write Any message
        instractionPage.instructorApplicationFormAnyMessage.sendKeys("Kendinize iyi bakin!");
        extentTest.info("write Any message");

        // 15- upload a document
        // String filePath2 = "/home/user/IdeaProjects/com.qualitydemyUITest/src/test/java/tests/QA_Vural/denemeForTeam04Project.doc";
        String filePath2 = System.getProperty("user.home")+"/IdeaProjects/com.qualitydemyUITest/src/test/java/tests/QA_Vural/denemeForTeam04Project.doc";
        instractionPage.instructorApplicationFormDocument.sendKeys(filePath2);
        extentTest.info("upload a document");

        // 16- click Apply button
        instractionPage.instructorApplicationFormApplyButton.click();
        extentTest.info("click Apply button");

        // 17- tests that  it should lead to the "YOUR APPLICATION" section
        Assert.assertTrue(instractionPage.instructorYourApplicationSectionHeader.isDisplayed());
        extentTest.pass("tests that  it should lead to the \"YOUR APPLICATION\" section");

        // 18- tests the "click to activate" button should be seen
        Assert.assertTrue(instractionPage.instructorYourApplicationSectionClickToActivateButton.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.pass("tests the \"click to activate\" button should be seen");

        // 14- quit Drivers
        Driver.quitDriver();
        extentTest.info("quit Drivers");

    }


    @Test
    public void TC_3605(){

        /*

        1- User goes to "qa.qualitidemy.com" main page
        2- confirm cookie
        3- click on Log in
        4- click on E-mail box and enters user e-mail address
        5- click on password box and enter user password
        6- click on log in button
        7- click on the Instructor button
        8- click on the Apply button
        9- click on the click to activate button
        10- tests that the message "your application has been approved" should appear
        11- click on the  confirmation button
        12- verifies that the status part has changed to Approved
        13- closes the page

        */

        extentTest = extentReports.createTest("When the click to activate button is pressed", "When the click to activate button is pressed, the message \"your application has been approved\" should appear and when the confirmation button is pressed, it is verified that the status part has changed to Approved.");

        // 1- The user goes to the "qualitydemy.com" homepage.
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("The user goes to the \"qualitydemy.com\" homepage.");

        // 2- Confirm cookies.
        HomePage homePage = new HomePage();
        homePage.cookieKabul.click();
        extentTest.info("Confirm cookies.");

        // 3- Clicks on the Sign up button.
        LoginPage loginPage = new LoginPage();
        loginPage.blueSignupButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("Clicks on the Sign up button.");

        // 4- Fills in the First name, Last name, e-mail and password fields appropriately.
        loginPage.firstNameTextbox.sendKeys("asdfg" + Keys.ENTER);
        loginPage.lastNameTextbox.sendKeys("yxcvb" + Keys.ENTER);
        ReusableMethods.bekle(1);
        extentTest.info("Fills in the First name, Last name, e-mail and password fields appropriately.");

        // 5- Create new E-mail account
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://tempail.com/");
        ReusableMethods.bekle(3);
        extentTest.info("Create new E-mail account");

        // 6- copy the e-mail
        RegistrationPage registrationPage = new RegistrationPage();
        try {
            if (registrationPage.doNotConsentButton.isDisplayed()) {
                registrationPage.doNotConsentButton.click();
            }
        } catch (Exception e) {
            System.out.println("It can be encountered with the doNotConsentButton web element. But you didn't encounter the doNotConsentButton web element. Don't worry there is no problem :)");
        }
        ReusableMethods.bekle(1);
        registrationPage.newEmailAccountCopy.click();
        extentTest.info("copy the e-mail");

        // 7- back to qa site
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        extentTest.info("back to qa site");

        // 8- paste the e-mail to e-mail text box
        loginPage.emailTextbox.sendKeys(Keys.CONTROL, "v");
        extentTest.info("paste the e-mail to e-mail text box");

        // 9- create password
        loginPage.passwordTextbox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("create password");

        // 10- write email and password
        homePage.eMailHomePageTextbox.sendKeys(Keys.CONTROL, "v");
        homePage.passwordTextBox.sendKeys("12345Av-22" + Keys.ENTER);
        extentTest.info("write email and password");

        // 11- click Instructor link
        ReusableMethods.bekle(2);
        homePage.instructorLink.click();
        extentTest.info("click Instructor link");

        // 12- write Address
        InstractionPage instractionPage = new InstractionPage();
        instractionPage.instructorApplicationFormAddress.sendKeys("Mamak/Ankara");
        extentTest.info("write Address");

        // 13- write Phone number
        instractionPage.instructorApplicationFormPhoneNumber.sendKeys("176526981");
        extentTest.info("write Phone number");

        // 14- write Any message
        instractionPage.instructorApplicationFormAnyMessage.sendKeys("Kendinize iyi bakin!");
        extentTest.info("write Any message");

        // 15- upload a document
        // String filePath3 = "/home/user/IdeaProjects/com.qualitydemyUITest/src/test/java/tests/QA_Vural/denemeForTeam04Project.doc";
        String filePath3 = System.getProperty("user.home")+"/IdeaProjects/com.qualitydemyUITest/src/test/java/tests/QA_Vural/denemeForTeam04Project.doc";
        instractionPage.instructorApplicationFormDocument.sendKeys(filePath3);
        extentTest.info("upload a document");

        // 16- click Apply button
        instractionPage.instructorApplicationFormApplyButton.click();
        extentTest.info("click Apply button");

        // 17- click "Click to activate" button
        instractionPage.instructorYourApplicationSectionClickToActivateButton.click();
        ReusableMethods.bekle(2);
        extentTest.info("click \"Click to activate\" button");

        // 18- tests that the message "your application has been approved" should appear
        String expectedAlertText = "your application has been approved";
        String actualAlertText = Driver.getDriver().switchTo().alert().getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualAlertText, expectedAlertText);
        extentTest.pass("tests that the message \"your application has been approved\" should appear");

        // 19- click Alert Confirmation Button
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("click Alert Confirmation Button");

        // 20- verifies that the status part has changed to Approved
        softAssert.assertTrue(instractionPage.instructorYourApplicationSectionApprovedButton.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.pass("verifies that the status part has changed to Approved");

        // 21- quit Drivers
        Driver.quitDriver();
        extentTest.info("quit Drivers");

        softAssert.assertAll();

    }



}

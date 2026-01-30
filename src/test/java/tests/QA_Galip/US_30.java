package tests.QA_Galip;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_30 extends TestBaseRapor {

    @Test
    public void TC_3001 (){
        //requirementsAddedTextBoxTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        extentTest= extentReports.createTest("requirementsAddedTextBoxTest", "User goes to Instructor");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("Go to https://qualitydemy.com homepage.");
        // Click the login link
        homaPage.firstLoginLink.click();
        extentTest.info("Clicked on login link");
        // Writes email address to email text box
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Typed e-mail address in e-mail text box");
        // Writes password to password text box
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Typed password address in password text box");
        // Accepts the cookie
        homaPage.cookieKabul.click();
        ReusableMethods.bekle(2);
        extentTest.info("Cookies accepted");
        // Click the login button
        homaPage.loginButton.click();
        extentTest.info("Clicked on login button");
        // Click on the Instructor link.
        instractionPage.instructorButton.click();
        extentTest.info("Clicked on Instructor link");
        // Click on the course manager link
        instractionPage.courseManagerButton.click();
        extentTest.info("Clicked on Course Manager link");
        // Click on the add new course link
        instractionPage.addNewCourseLink.click();
        extentTest.info("Clicked on add new course link");
        // Click on the Requirements link
        instractionPage.courseAddRequirementsLink.click();
        extentTest.info("Clicked on Requirements link");
        // Type text in the Requirements text box
        instractionPage.courseAddRequirementsAddedTextBox.click();
        instractionPage.courseAddRequirementsAddedTextBox.sendKeys("Selenium" );
        ReusableMethods.bekle(1);
        extentTest.info("Text typed in the Requirements text box");
        // Checks that Buch is written in the requirements a dded text box.
        String actualRequirementsText= instractionPage.courseAddRequirementsAddedTextBox.getText();
        String ecpectedRequirementsText ="Selenium";

        Assert.assertTrue(ecpectedRequirementsText.contains(actualRequirementsText));
        Driver.closeDriver();
        extentTest.pass("Checked that text is written in the Requirements text box.");

    }

    @Test
    public void TC_3002 (){
        //requirementsDeletedTextBoxTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        extentTest= extentReports.createTest("requirementsDeletedTextBoxTest", "User goes to Instructor");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("Go to https://qualitydemy.com homepage.");
        // Click the login link
        homaPage.firstLoginLink.click();
        extentTest.info("Clicked on login link");
        // Writes email address to email text box
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Typed e-mail address in e-mail text box");
        // Writes password to password text box
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Typed password address in password text box");
        // Accepts the cookie
        homaPage.cookieKabul.click();
        ReusableMethods.bekle(2);
        extentTest.info("Cookies accepted");
        // Click the login button
        homaPage.loginButton.click();
        extentTest.info("Clicked on login button");
        // Click on the Instructor link.
        instractionPage.instructorButton.click();
        extentTest.info("Clicked on Instructor link");
        // Click on the course manager link
        instractionPage.courseManagerButton.click();
        extentTest.info("Clicked on Course Manager link");
        // Click on the add new course link
        instractionPage.addNewCourseLink.click();
        extentTest.info("Clicked on add new course link");
        // Click on the Requirements link
        instractionPage.courseAddRequirementsLink.click();
        extentTest.info("Clicked on Requirements link");
        // Click the added "+" button
        instractionPage.courseAddRequirementsAddedButton.click();
        extentTest.info("Clicked on added\"+\" button");
        // Type Buch in the Provide requirements minus text box
        instractionPage.courseAddRequirementsDeletedTextBox.click();
        instractionPage.courseAddRequirementsDeletedTextBox.sendKeys("Java");
        ReusableMethods.bekle(1);
        extentTest.info("Text typed in the Requirements text box");


         // Checks that Buch is written in the requirements deleted text box.
        String actualRequirementsText= instractionPage.courseAddRequirementsDeletedTextBox.getText();
        String ecpectedRequirementsText ="Java";
        Assert.assertTrue(ecpectedRequirementsText.contains(actualRequirementsText));
        Driver.closeDriver();

        extentTest.pass("Checked that text is written in the added requirements text box.");


    }

    @Test
    public void TC_3003 (){
        //requirementsDeletedButtonTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        extentTest= extentReports.createTest("requirementsDeletedTextBoxTest", "User goes to Instructor");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        extentTest.info("Go to https://qualitydemy.com homepage.");
        // Click the login link
        homaPage.firstLoginLink.click();
        extentTest.info("Clicked on login link");
        // Writes email address to email text box
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Typed e-mail address in e-mail text box");
        // Writes password to password text box
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("Typed password address in password text box");
        // Accepts the cookie
        homaPage.cookieKabul.click();
        ReusableMethods.bekle(2);
        extentTest.info("Cookies accepted");
        // Click the login button
        homaPage.loginButton.click();
        extentTest.info("Clicked on login button");
        // Click on the Instructor link.
        instractionPage.instructorButton.click();
        extentTest.info("Clicked on Instructor link");
        // Click on the course manager link
        instractionPage.courseManagerButton.click();
        extentTest.info("Clicked on Course Manager link");
        // Click on the add new course link
        instractionPage.addNewCourseLink.click();
        extentTest.info("Clicked on add new course link");
        // Click on the Requirements link
        instractionPage.courseAddRequirementsLink.click();
        extentTest.info("Clicked on Requirements link");
        // Click the added"+" button
        instractionPage.courseAddRequirementsAddedButton.click();
        ReusableMethods.bekle(1);
        extentTest.info("Clicked on added\"+\" button");
        // Click the  related "-" button
        instractionPage.courseAddRequirementsDeletedButton.click();
        ReusableMethods.bekle(1);
        extentTest.info("Clicked on related \"-\" button");
        // Check that it is deleted by the related button
        Assert.assertFalse(instractionPage.courseAddRequirementsDeletedButton.isDisplayed());
        extentTest.pass("Checked if the added button has been deleted\n" + "\n");

        Driver.closeDriver();

    }
}


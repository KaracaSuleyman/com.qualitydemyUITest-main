package tests.QA_Galip;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_28 {
    @Test
    public void TC_2801 (){
        //courseEditSubmitCurriculumConnectionTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email text box
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        // Writes password to password text box
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // Accepts the cookie
        homaPage.cookieKabul.click();
        ReusableMethods.bekle(3);
        // Click the login button
        homaPage.loginButton.click();
        ReusableMethods.bekle(2);
        // Click on the Instructor link.
        instractionPage.instructorButton.click();
        ReusableMethods.bekle(2);
        // Click on the course manager link
        instractionPage.courseManagerButton.click();
        ReusableMethods.bekle(2);
        // Click on the Actions button.
        instractionPage.actionsButton.click();
        // Click on the Edit this course link.
        instractionPage.editThisCourseLink.click();
        // Click on the basic link.
        instractionPage.courseEditBasicLink.click();
        // Click on the Course title text box
        instractionPage.courseEditBasicKursTitelTextBox.click();
        // clear Course title text box
        instractionPage.courseEditBasicKursTitelTextBox.clear();
        // Write  English C2 in the course title text box
        instractionPage.courseEditBasicKursTitelTextBox.sendKeys("English C2");
        // Click on the Fnisch link
        instractionPage.courseEditFnishLink.click();
        // Click the Submit button
        instractionPage.courseEditSubmitButton.click();
        ReusableMethods.bekle(2);
        // Checks that the curriculum connection is established.
        Assert.assertTrue(instractionPage.courseEditCurriculumLink.isDisplayed());
        Driver.closeDriver();
        //extentTest.pass("ana sayfa kapatildi");
    }

    @Test
    public void TC_2802 (){
        // courseEditSubmitCongratulationsMessageTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email text box
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        // Writes password to password text box
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // Accepts the cookie
        homaPage.cookieKabul.click();
        ReusableMethods.bekle(3);
        // Click the login button
        homaPage.loginButton.click();
        ReusableMethods.bekle(2);
        // Click on the Instructor link.
        instractionPage.instructorButton.click();
        ReusableMethods.bekle(2);
        // Click on the course manager link
        instractionPage.courseManagerButton.click();
        ReusableMethods.bekle(2);
        // Click on the Actions button.
        instractionPage.actionsButton.click();
        // Click on the Edit this course link.
        instractionPage.editThisCourseLink.click();
        // Click on the basic link.
        instractionPage.courseEditBasicLink.click();
        // Click on the Course title text box
        instractionPage.courseEditBasicKursTitelTextBox.click();
        // clear Course title text box
        instractionPage.courseEditBasicKursTitelTextBox.clear();
        // Write  English C2 in the course title text box
        instractionPage.courseEditBasicKursTitelTextBox.sendKeys("English C2");
        // Click on the Fnisch link
        instractionPage.courseEditFnishLink.click();
        // Click the Submit button
        instractionPage.courseEditSubmitButton.click();
        ReusableMethods.bekle(2);//
        // Congratulations! Checks that the message is seen.
        ReusableMethods.bekle(2);
        Assert.assertTrue(instractionPage.courseEditCongratulationsMessage.isDisplayed());
        Driver.closeDriver();
        //extentTest.pass("ana sayfa kapatildi");

    }
}

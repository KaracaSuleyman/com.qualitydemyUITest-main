package tests.QA_Galip;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_35 {
    @Test
    public void TC_3501 () {

        //courseAddSubmitCurriculumConnectionTest
        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        // Writes password to password textbox
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
        // Click on the add new course link
        instractionPage.addNewCourseLink.click();
        instractionPage.courseAddBasicLink.click();
        // Click on the Course title text box
        instractionPage.courseAddBasicKursTitelTextBox.click();
        // Write  English C2 in the course title text box
        instractionPage.courseAddBasicKursTitelTextBox.sendKeys("Englisch A2");
        // Click on Category link
        instractionPage.courseAddBasicCategoryLink.click();
        ReusableMethods.bekle(2);
        //Select a category
        instractionPage.courseAddBasicCategoryMenu.click();
        ReusableMethods.bekle(2);
        // Click on Finisch link.
        instractionPage.courseAddFnishLink.click();
        // Click the Submit button
        instractionPage.courseAddSubmitButton.click();
        // It checks that the Curriculum link is seen.
        Assert.assertTrue(instractionPage.courseAddCurriculumLink.isDisplayed());


        Driver.closeDriver();
    }
    @Test
    public void TC_3502 (){

        //courseAddSubmitCongratulationsMessageTest

        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        // Writes password to password textbox
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
        // Click on the add new course link
        instractionPage.addNewCourseLink.click();
        instractionPage.courseAddBasicLink.click();
        // Click on the Course title text box
        instractionPage.courseAddBasicKursTitelTextBox.click();
        // Write  English C2 in the course title text box
        instractionPage.courseAddBasicKursTitelTextBox.sendKeys("Englisch A2");
        // Click on Category link
        instractionPage.courseAddBasicCategoryLink.click();
        ReusableMethods.bekle(2);
        //Select a category
        instractionPage.courseAddBasicCategoryMenu.click();
        ReusableMethods.bekle(2);
        // Click on Finisch link.
        instractionPage.courseAddFnishLink.click();
        // Click the Submit button
        instractionPage.courseAddSubmitButton.click();
        ReusableMethods.bekle(2);
        // Checks that the Congratulations!message has been seen.
        Assert.assertTrue(instractionPage.courseAddCongratulationsMessage.isDisplayed());

        Driver.closeDriver();
    }
}


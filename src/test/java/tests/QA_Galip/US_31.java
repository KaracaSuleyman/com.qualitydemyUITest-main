package tests.QA_Galip;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_31 {
    @Test
    public void TC_3101 () {

        //outcomesAddedTextBoxTest
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
        // Click the Outcomes link
        instractionPage.courseAddOutcomesLink.click();
        ReusableMethods.bekle(2);
        // Click the Outcomes tex box
        instractionPage.courseAddOutcomesAddedTextBox.click();
        ReusableMethods.bekle(2);
        // Writes Buch in the Outcomes text box.
        instractionPage.courseAddOutcomesAddedTextBox.sendKeys("Buch");
        ReusableMethods.bekle(2);
        // Checks that Buch is written in the Outcomes text box.
        String actualRequirementsText= instractionPage.courseAddRequirementsDeletedTextBox.getText();
        String ecpectedRequirementsText ="Buch";
        Assert.assertTrue(ecpectedRequirementsText.contains(actualRequirementsText));
        Driver.closeDriver();


    }


    @Test
    public void TC_3102 () {
        //outcomesDeletedTextBoxTest

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
        // Click the Outcomes link
        instractionPage.courseAddOutcomesLink.click();
        ReusableMethods.bekle(2);
        // Click the Outcomes added button
        instractionPage.courseAddOutcomesAddedButton.click();
        ReusableMethods.bekle(2);
        // Click the Outcomes  Deleted Text Box
        instractionPage.courseAddOutcomesDeletedTextBox.click();
        // Type Buch in the Deleted text box Outcomes
        instractionPage.courseAddOutcomesDeletedTextBox.sendKeys("Buch");
        ReusableMethods.bekle(2);

        // Checks that Buch is written in the Outcomes text box.
        String actualRequirementsText= instractionPage.courseAddRequirementsDeletedTextBox.getText();
        String ecpectedRequirementsText ="Buch";

        Assert.assertTrue(ecpectedRequirementsText.contains(actualRequirementsText));
        Driver.closeDriver();

    }
    @Test
    public void TC_3103 () {
        //outcomesDeletedButtonTest

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
        // Click the Outcomes link
        instractionPage.courseAddOutcomesLink.click();
        // Click the added"+" button
        ReusableMethods.bekle(2);
        instractionPage.courseAddOutcomesAddedButton.click();
        ReusableMethods.bekle(2);
        //Click the related "-" button clicks.
        instractionPage.courseAddOutcomesDeletedButton.click();
        ReusableMethods.bekle(2);
        //Check if the outcomes Deleted Button is not seen
        Assert.assertFalse(instractionPage.courseAddRequirementsDeletedButton.isDisplayed());

        Driver.closeDriver();

    }
}


package tests.QA_Fatih;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_19 {
    @Test
public void Tc_1002SearchCourseNameTest (){


    InstractionPage instractionPage= new InstractionPage();
    HomePage homaPage = new HomePage();
    //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
    // User goes to https://qualitydemy.com homepage
    Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
    //extentTest.info("ana sayfaya gidildi");
    // Click the login link
    homaPage.firstLoginLink.click();
    // Writes email address to email textbox
    homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
    // Writes password to password textbox
    homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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


    instractionPage.courseNameinSearchBox.sendKeys("ameri"+ Keys.ENTER);
    Assert.assertTrue(instractionPage.courseNameinSearchBox.isEnabled());

    Driver.closeDriver();



}
    @Test
    public void Tc_1003courseViewonFrontend (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        instractionPage.courseManagerThreeDotsViewCourseFrontend.click();
        String actualDiscountText=instractionPage.courseManagerThreeDotsViewCourseFrontend.getText();
        Assert.assertEquals(actualDiscountText,"");

        Driver.closeDriver();
        //ViewCourseFrontendTestPassed.pass("ana sayfa kapatildi");




    } //confirm cookie
    //  click on Log in function
    // click on E mail box and enters user e mail adress
    // click on password box and enter user password
    // click on log in button
    // Click on the instructor then click course manager
    // Click on the three dots under Actions
    // Clicks the Go-to course playing page link
    // Verifies that you went to the relevant course page
    @Test
    public void Tc_1004coursePlayingPage (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        instractionPage.courseManagerThreeDotsGotoPlayingPage.click();
        String actualDiscountText=instractionPage.courseManagerThreeDotsGotoPlayingPage.getText();
        Assert.assertEquals(actualDiscountText,"");

        Driver.closeDriver();
        //goToPlayıngPageTestPassed.pass("ana sayfa kapatildi");





    } /*User goes to "qa.qualitidemy.com" main page
     confirm cookie
     click on Log in function
     click on E mail box and enters user e mail adress
click on password box and enter user password
click on log in button
Click on the instructor and click course manager
Click on the three dots under Actions
Clicks  the Edit this course link
Verifies that you went to the relevant course page

    */

         @Test
         public void Tc_1005courseeditpage (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        instractionPage.courseManagerThreeDotsEditThisCourse.click();
        ReusableMethods.bekle(3);

        // String actualDiscountText=instractionPage.courseManagerThreeDotsEditThisCourse.getText();
        //Assert.assertEquals(actualDiscountText,"");

        //Verifies that you went to the relevant course page
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="amerika";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        System.out.println("Ilgili ders sayfasinda");








        Driver.closeDriver();
        //editthiscourseTestPassed.pass("ana sayfa kapatildi");
        }
    /*User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e mail adress
click on password box and enter user password
click on log in button
Click on the instructor and click course manager
Click on the three dots under Actions
Clicks  the Section and lesson link
Verifies that you went to the relevant course page

     */
        @Test
        public void Tc_1006courseSectionandLesson (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        instractionPage.courseManagerSectionandLesson.click();


        //String actualDiscountText=instractionPage.courseManagerSectionandLesson.getText();

        // Assert.assertEquals(actualDiscountText,"");
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="amerika";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        System.out.println("Ilgili ders sayfasinda");






        Driver.closeDriver();
        //sectionandLesson TestPassed.pass("ana sayfa kapatildi");


        }  @Test
           public void Tc_1007courseStatusDrafted (){


    InstractionPage instractionPage= new InstractionPage();
    HomePage homaPage = new HomePage();
    //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
    // User goes to https://qualitydemy.com homepage
    Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
    //extentTest.info("ana sayfaya gidildi");
    // Click the login link
    homaPage.firstLoginLink.click();
    // Writes email address to email textbox
    homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
    // Writes password to password textbox
    homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
    ReusableMethods.bekle(3);

    instractionPage.courseManagerThreeDotsMarkAsDrafted.click();
    ReusableMethods.bekle(3);

    instractionPage.courseMarkAsDraftedContinueButton.click();


    Assert.assertTrue(instractionPage.coursestatusdrafted.isEnabled());
    Driver.closeDriver();
    //draftedTestPassed.pass("ana sayfa kapatildi");







    //Assert.assertTrue(instractionPage.instructorPageAddNewCourseTopCourseCheckBox.isEnabled())


}/* User goes to "qa.qualitidemy.com" main page
    confirm cookie
    click on Log in function
    click on E mail box and enters user e-mail
    click on password box and enter user password
    click on log in button
    Click on the instructor and click course manager
    Click on the three dots under Actions
    Click on the Publish this course link
    Test that confirmation message come
    Clicks the continue button
    test  that draft on  status section of the course is change to active

     */
    @Test
    public void Tc_1008courseStatusActive (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        ReusableMethods.bekle(3);

        instractionPage.courseManagerPublishThisCourse.click();
        ReusableMethods.bekle(3);

        instractionPage.courseMarkAsDraftedContinueButton.click();


        Assert.assertTrue(instractionPage.coursestatusActive.isEnabled());
        Driver.closeDriver();
        //ViewCourseFrontendTestPassed.pass("ana sayfa kapatildi");


    }  /*User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the instructor and click course manager
Click on the three dots under Actions
Click on the   add_course page
Verifies that you went to the relevant course page

     */
    @Test
    public void Tc_1010courseAddbuttonTest (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
        // Click the login link
        homaPage.firstLoginLink.click();
        // Writes email address to email textbox
        homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qaGecerliusernameFatih"));
        // Writes password to password textbox
        homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("qaGecerlipasswordFatih"));
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
        instractionPage.courseManagerAddCourseButton.click();

        // Assert.assertEquals(actualDiscountText,"");
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="amerika";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        System.out.println("Ilgili ders sayfasinda");

        // String actualDiscountText=instractionPage.courseManagerAddCourseButton.getText();
        //Assert.assertEquals(actualDiscountText,"");

        Driver.closeDriver();


    } /*sign up and become instructor	User goes to "qa.qualitidemy.com" main page
	confirm cookie
	click on Log in function
	click on E mail box and enters user e mail adress
	click on password box and enter user password
	click on log in button
	Click on the instructor and click course manager
	Click on  the course name in the list
	Verifies that you went to the relevant course page
	*/


    @Test
    public void Tc_1011courseNameTest (){


        InstractionPage instractionPage= new InstractionPage();
        HomePage homaPage = new HomePage();
        //extentTest= extentReports.createTest("courseEditFnishTest", "User goes to homepage");
        // User goes to https://qualitydemy.com homepage
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        //extentTest.info("ana sayfaya gidildi");
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
        instractionPage.courseNameTest.click();

        // Assert.assertEquals(actualDiscountText,"");
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="english";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        System.out.println("Ilgili ders sayfasinda");
    }

}




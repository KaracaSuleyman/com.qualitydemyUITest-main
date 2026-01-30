package tests.QA_Galip;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InstractionPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_33 {

    @Test
    public void TC_3301  () {
        //mediaCourseOverviewCourseProviderHtml5Test

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
        // Click on the media link.
        instractionPage.courseAddMediaLink.click();
        // Click on Course overview provider text box
        instractionPage.courseAddCourseOverviewProviderMenu.click();
        ReusableMethods.bekle(2);

        //Click on Course overview provider Html5
        instractionPage.courseAddCourseOverviewProviderMenuHtml5.click();

        // Check "Html5" selected status
        String actualOverviewProvider= instractionPage.courseAddCourseOverviewProviderMenu.getText();
        String ecpectedOverviewProvider ="Html5";
        Assert.assertTrue(ecpectedOverviewProvider.contains(actualOverviewProvider));

        //Assert.assertTrue(instractionPage.courseAddCourseOverviewProviderMenuHtml5.isDisplayed());
        ReusableMethods.bekle(2);

        Driver.closeDriver();

    }

    @Test
    public void TC_3302 () {
        //mediaCourseOverviewCourseProviderYoutubeTest

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
        // Click on the media link.
        instractionPage.courseAddMediaLink.click();
        // Click on Course overview provider text box
        instractionPage.courseAddCourseOverviewProviderMenu.click();
        ReusableMethods.bekle(2);

        //Click on Course overview provider Youtube
        instractionPage.courseAddCourseOverviewProviderMenuYoutube.click();

        // Check "Youtube" selected status

        String actualOverviewProvider= instractionPage.courseAddCourseOverviewProviderMenu.getText();
        String ecpectedOverviewProvider ="Youtube";
        Assert.assertTrue(ecpectedOverviewProvider.contains(actualOverviewProvider));

        //Assert.assertTrue(instractionPage.courseAddCourseOverviewProviderMenuYoutube.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.closeDriver();



    }@Test
    public void TC_3303 () {
        //mediaCourseOverviewCourseProviderWimeoTest

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
        // Click on the media link.
        instractionPage.courseAddMediaLink.click();
        // Click on Course overview provider text box
        instractionPage.courseAddCourseOverviewProviderMenu.click();
        ReusableMethods.bekle(2);

        //Click on Course overview provider Vimeo
        instractionPage.courseAddCourseOverviewProviderMenuVimeo.click();

        // Check "Vimeo" selected status.
        String actualOverviewProvider= instractionPage.courseAddCourseOverviewProviderMenu.getText();
        String ecpectedOverviewProvider ="Vimeo";
        Assert.assertTrue(ecpectedOverviewProvider.contains(actualOverviewProvider));


        //Assert.assertTrue(instractionPage.courseAddCourseOverviewProviderMenuVimeo.isDisplayed());
        ReusableMethods.bekle(3);

        Driver.closeDriver();

    }
    @Test
    public void TC_3304 () {
        //courseOverviewUrlTextBoxTest

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
        // Click on the media link.
        instractionPage.courseAddMediaLink.click();
        ReusableMethods.bekle(2);
        // Click on Course overview url text box
        instractionPage.courseAddCourseOverviewUrl.click();
        ReusableMethods.bekle(2);
        //Writes "https://www.youtube.com/watch?v=nre4Js7u7z0" in the Course overview url text box.
        instractionPage.courseAddCourseOverviewUrl.sendKeys("https://www.youtube.com/watch?v=nre4Js7u7z0");
        ReusableMethods.bekle(2);
        //Checks that the "https://www.youtube.com/watch?v=nre4Js7u7z0" url appears.
        String actualCourseOverviewUrl= instractionPage.courseAddCourseOverviewUrl.getText();
        String ecpectedCourseOverviewUrl ="https://www.youtube.com/watch?v=nre4Js7u7z0";
        ReusableMethods.bekle(2);
        Assert.assertTrue(ecpectedCourseOverviewUrl.contains(actualCourseOverviewUrl));
        Driver.closeDriver();



    }


    @Test
    public void TC_3305 () {
        //courseThumbnailImageUploadTest

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
        // Click on the media link.
        instractionPage.courseAddMediaLink.click();
        //Click on Course thumbnail (600x600) link
        instractionPage.courseAddCourseThumbnailFotoLink.click();
        ReusableMethods.bekle(2);

        //Upload the image.
        String photoPath="C:\\Users\\GALIP\\com.qualitydemyUITest\\src\\test\\java\\tests\\QA_Galip\\placeholder.png";
        instractionPage.courseThumb.sendKeys(photoPath);
        ReusableMethods.bekle(2);


        // Checks that the image is load
        Assert.assertTrue(instractionPage.courseThumbnailAlbum.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.closeDriver();

    }
}



package tests.QA_Mert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyCoursePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_37 {

    @Test
    public void TC_3701() {
        //1-The user goes to the "qualitydemy.com/login" Press the login then go to homepage
        //2-Accept the cookies.

        ReusableMethods.loginMethodu();

        //3-Clicks on My courses link at the top of the page.
        HomePage homePage = new HomePage();
        ReusableMethods.bekle(5);
        homePage.myCoursesLink.click();
        //4-He sees that he is on the My courses page
        ReusableMethods.bekle(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedKelime = "my_courses";
        Assert.assertTrue(actualUrl.contains(expectedKelime));

        Driver.closeDriver();

    }



    @Test
    public void TC_3702(){
        //5-He sees his courses and clicks on the start lesson button.
        ReusableMethods.loginMethodu();
        HomePage homePage = new HomePage();
        ReusableMethods.bekle(5);
        homePage.myCoursesLink.click();

        MyCoursePage myCoursePage = new MyCoursePage();
        myCoursePage.myCourseStartLessonButton.click();
        //6-He sees that he goes to the relevant page.
        ReusableMethods.bekle(2);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedKelime = "english-course-learn-to-speak";
        Assert.assertTrue(actualUrl.contains(expectedKelime));

        //8-Clicks "-" in the Section section under Course content and sees that it shrinks,
        // then clicks "+" and sees that it is restored.
        homePage.closeCourseContentLink.click();
        Assert.assertTrue(homePage.courseDisplayNameText.isDisplayed());
        ReusableMethods.bekle(2);

        homePage.openCourseContentLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.courseDisplayNameText.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void TC_3703(){
        //9-Checks the boxes under Section, then unchecks them and sees them.

        ReusableMethods.loginMethodu();
        HomePage homePage = new HomePage();
        ReusableMethods.bekle(5);
        homePage.myCoursesLink.click();
        MyCoursePage myCoursePage = new MyCoursePage();
        myCoursePage.myCourseStartLessonButton.click();

        ReusableMethods.bekle(2);
        homePage.courseCheckboxButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(homePage.courseCheckboxButton.isEnabled());

        ReusableMethods.bekle(2);

        homePage.courseCheckboxButton.click();
        Assert.assertTrue(homePage.courseCheckboxButton.isEnabled());

        Driver.closeDriver();


    }


    @Test
    public void TC_3704(){
        //7-Click on Course details and see that it goes to the course page with explanations.
        ReusableMethods.loginMethodu();
        HomePage homePage = new HomePage();
        ReusableMethods.bekle(5);
        homePage.myCoursesLink.click();
        MyCoursePage myCoursePage = new MyCoursePage();
        myCoursePage.myCourseStartLessonButton.click();
        ReusableMethods.bekle(3);

        homePage.courseDetailsLink.click();
        ReusableMethods.bekle(2);
        String actualUrl1 = Driver.getDriver().getCurrentUrl();
        String expectedKelime1 = "english-course-learn-to-speak";
        Assert.assertTrue(actualUrl1.contains(expectedKelime1));

        Driver.closeDriver();
    }
}

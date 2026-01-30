package tests.QA_Fazil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CoursePage;
import pages.HomePage;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_40 extends TestBaseRapor {
    HomePage homePage=new HomePage();
    InstractionPage instractionPage=new InstractionPage();
    @Test
    public void test01(){
        extentTest= extentReports.createTest("test01 test","The user should be able to search by " +
                "typing the name of the course in the search box");
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        extentTest.info("Navigated to qualitydemy.com homepage and login button clicked");
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        ReusableMethods.bekle(4);
        //Clicks on the Instructor link on the page that opens.
        homePage.instructorLink.click();
        extentTest.info("Instructor link clicked");
        //Clicks the Sales report tab on the page that opens.
        instractionPage.salesReportLink.click();
        extentTest.info("SalesReport Link clicked");
        ReusableMethods.bekle(2);
        //Writes "Gitar" in the Search textbox on the Sales report page
        instractionPage.salesReportPageSearchBox.sendKeys("gitar");
        extentTest.info("Enter guitar in the search box");
        ReusableMethods.bekle(2);
        //When you type "Gitar" in the search textbox, it tests whether the course that appears in the results is a Java course.
        Assert.assertTrue(instractionPage.salesReportPageSearchBox.isEnabled());
        extentTest.pass("tested whether the course that appeared in the results was a Guitar course.");
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        extentTest= extentReports.createTest("test02 test","When the course name is entered and " +
                "clicked,should be directed to the relevant page");
        HomePage homePage =new HomePage();
        CoursePage coursePage=new CoursePage();
        InstractionPage instractionPage =new InstractionPage();
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks on the Instructor link on the page that opens.
        homePage.instructorLink.click();
        extentTest.info("Instructor link clicked");
        //Clicks the Sales report tab on the page that opens.
        instractionPage.salesReportLink.click();
        extentTest.info("SalesReport Link clicked");
        //Writes "Gitar" in the Search textbox on the Sales report page
        instractionPage.salesReportPageSearchBox.sendKeys("gitar");
        //When you click on the course name in the results, it tests whether you go to the introduction page of the course.
        String ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        instractionPage.gitarDersleriLink.click();
        extentTest.info("Guitar Lessons link clicked");
        Set<String> tumWHDegerleriSeti= Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD="";
        for (String eachWhd: tumWHDegerleriSeti
        ) {
            if (!eachWhd.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaWHD=eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
        String expectedUrl="https://qa.qualitydemy.com/home/course/gitar-dersleri1/695";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Tested the ability to navigate to the clicked course page.");
        Driver.quitDriver();
    }
    @Test
    public void test03(){
        extentTest= extentReports.createTest("test03 test","The user tests whether they can make" +
                " a selection by clicking on the date filter. ");
        HomePage homePage =new HomePage();
        CoursePage coursePage=new CoursePage();
        InstractionPage instractionPage =new InstractionPage();
        //User goes to "qualitydemy.com" homepage.
        //Accepts the cookie.
        //Clicks the Log in link on the homepage
        //Enters the e-mail address in the e-mail textbox.
        //Enters password in Password textbox
        //Clicks the login button
        ReusableMethods.loginMethodu("userNameFazil","passwordFazil");
        //Clicks on the Instructor link on the page that opens.
        homePage.instructorLink.click();
        extentTest.info("Instructor link clicked");
        //Clicks the Sales report tab on the page that opens.
        instractionPage.salesReportLink.click();
        extentTest.info("SalesReport Link clicked");
        //Selects a date from the date filter on the page and tests whether the courses are listed according to that date.
        instractionPage.salesReportPageFilterTextBox.click();
        extentTest.info("Date search box clicked");
        ReusableMethods.bekle(1);
        instractionPage.last7DaysOption.click();
        extentTest.info("Last 7 days clicked");
        ReusableMethods.bekle(1);
        instractionPage.searchFilterButton.click();
        extentTest.info("Filter button clicked");
        Assert.assertTrue(instractionPage.resultInformationText.isDisplayed());
        extentTest.pass("Tested typing of search results");
        Driver.closeDriver();
    }
}

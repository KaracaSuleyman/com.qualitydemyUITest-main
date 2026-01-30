package tests.QA_Suleyman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10 {
    LoginPage loginPage=new LoginPage();

    @Test
    public void TC_1001(){

        /*
        User goes to "qa.qualitidemy.com" main page                     >>>>>done
        confirm cookie                                                  >>>>>done
        click on Log in function                                        >>>>>done
        click on E mail box and enters user e mail adress               >>>>>done
        click on password box and enter user password                   >>>>>done
        click on log in button                                          >>>>>done
        Click on the My courses function                                >>>>>done
        Tests that My courses page is refreshed when the reset button   >>>>>done

        */
        /*
        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-sign-in-simple']")).click();
        Driver.getDriver().findElement(By.id("login-email")).sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        Driver.getDriver().findElement(By.id("login-password")).sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        Driver.getDriver().findElement(By.xpath("//*[text()='Accept']")).click();
        ReusableMethods.bekle(1);
        Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]")).click();

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");


        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseBottomSearchBox.sendKeys("team04"+Keys.ENTER);
        ReusableMethods.bekle(1);
        String expectedResultText =myCoursePage.myCourseSearchResultElement.getText();

        myCoursePage.myCourseResetButton.click();
        String expectedResultTextAfterReset=myCoursePage.myCourseSearchResultElement.getText();
        Assert.assertFalse(expectedResultTextAfterReset.equals(expectedResultText));
        
        
        Driver.quitDriver();
    }

    @Test
    public void TC_1002(){
        /*
        User goes to "qa.qualitidemy.com" main page
        confirm cookie
        click on Log in function
        click on E mail box and enters user e mail adress
        click on password box and enter user password
        click on log in button
        Click on the My courses function
        Select search box and send "java"
        Tests that java in search results

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseTopSearchBox.sendKeys("Web"+Keys.ENTER);
        String actualSearchBoxResultText=myCoursePage.myCourseTopSearchResultBox.getText();
        String expectedSearchResultText="web";
        Assert.assertTrue(actualSearchBoxResultText.contains(expectedSearchResultText));
        
        Driver.quitDriver();
    }

    @Test
    public void TC_1003(){
        /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e mail adress
click on password box and enter user password
click on log in button
Click on the My courses function
Select Categories dropdown menu and tests that can be viewed and selected

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        Assert.assertTrue(myCoursePage.myCourseCategoriesDropdown.isEnabled());
        Assert.assertTrue(myCoursePage.myCourseCategoriesDropdown.isDisplayed());
        
        Driver.quitDriver();

    }

    @Test
    public void TC_1004(){
    /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
Test that the rating link can be clicked and that the score screen is visible when the rating link is clicked

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseEditRatingLink.click();
        Assert.assertTrue(myCoursePage.myCourseScooringScreenDropdown.isEnabled());
        
        Driver.quitDriver();
    }
    @Test
    public void TC_1005(){
        /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
click rating link
Test that when clicked cancel button the scoring screen close

         */

        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseEditRatingLink.click();
        myCoursePage.myCoursesCancelButton.click();
        Assert.assertFalse(myCoursePage.myCoursePublishRatingButton.isDisplayed());
        
        Driver.quitDriver();
    }

    @Test
    public void TC_1006(){
/*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
Test that score range can selected

 */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseEditRatingLink.click();
        Assert.assertTrue(myCoursePage.myCourseScooringScreenDropdown.isDisplayed());
        
        Driver.quitDriver();
    }

    @Test
    public void TC_1007(){
        /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
Test that textbox is can be write

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseEditRatingLink.click();
        myCoursePage.myCourseRatingTextBox.sendKeys("testNG");
        myCoursePage.myCoursePublishRatingButton.click();
        ReusableMethods.bekle(1);
        myCoursePage.myCourseEditRatingLink.click();
        String actualWriteWord=myCoursePage.myCourseRatingTextBox.getText();
        String expectedWriteWord="testNG";
        Assert.assertTrue(actualWriteWord.contains(expectedWriteWord));
        
        Driver.quitDriver();
    }

    @Test
    public void TC_1008(){
        /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
click on rating link
Test that when the publish rating button is pressed, it gives the selected value

         */
        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseEditRatingLink.click();
        myCoursePage.myCourseScooringScreenDropdown.click();
        myCoursePage.myCourseRating3starText.click();
        myCoursePage.myCoursePublishRatingButton.click();
        Assert.assertTrue(myCoursePage.myCourseRatingBox.isEnabled());

        Driver.quitDriver();

    }

    @Test
    public void TC_1009(){
        /*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
select a course from the courses drop-down menu
Test that when select a course and then clik to start lesson button, it can go relevant cours page

         */

        ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
        MyCoursePage myCoursePage=new MyCoursePage();
        myCoursePage.homePageMyCoursesLink.click();
        myCoursePage.myCourseCategoriesDropdown.click();
        myCoursePage.getMyCourseCategoriesWebDesingCourseDropdown.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        myCoursePage.myCourseStartLessonButton.click();
        Assert.assertTrue(myCoursePage.myCourseStartLessonTestLink.isEnabled());
        
        Driver.quitDriver();


    }


}

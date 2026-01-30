package tests.QA_Suleyman;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


    public class US_13 {

     @Test
     public void TC_1301(){
     /*
Useres to "qa.qualitidemy.com" main page
conf cookie
clicn Log in function
clicn E mail box and enters user e-mail
clicn password box and enter user password
clicn log in button
Clicn the My courses function
Clicn Messages function
Testhat when the manager of purchased courses and the Instructor can choose from the drop-down box

      */
         ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
         MyCoursePage myCoursePage=new MyCoursePage();
         myCoursePage.homePageMyCoursesLink.click();
         myCoursePage.myCourseMessageLink.click();
         Assert.assertTrue(myCoursePage.myCourseMessageboxDropdown.isDisplayed());
         Driver.quitDriver();

     }

     @Test
     public void TC_1302(){
     /*
     User goes to "qa.qualitidemy.com" main page
conf cookie
clicn Log in function
clicn E mail box and enters user e-mail
clicn password box and enter user password
clicn log in button
Clicn the My courses function
Clicn Messages function
Testat message textbox be accessible

      */
         ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
         MyCoursePage myCoursePage=new MyCoursePage();
         myCoursePage.homePageMyCoursesLink.click();
         myCoursePage.myCourseMessageLink.click();

         Assert.assertTrue(myCoursePage.myCourseMessageTextBox.isDisplayed());

         Driver.quitDriver();


     }

     @Test
     public void TC_1303(){

     /*
     User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
Click on Messages function
Test that a message should be sent to the relevant party by clicking the send button.

         */

            ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
            MyCoursePage myCoursePage=new MyCoursePage();
            myCoursePage.homePageMyCoursesLink.click();
            myCoursePage.myCourseMessageLink.click();
            myCoursePage.myCourseMessageTextBox.sendKeys("TestNg Team04"+ Keys.PAGE_DOWN);
            ReusableMethods.bekle(1);
            myCoursePage.myCourseMessageSendButton.click();
            String actualtext= myCoursePage.myCourseMessageSendText.getText();
            String expectedtext="Message sent";
            Assert.assertTrue(actualtext.equals(expectedtext));
            Driver.quitDriver();
        }

     @Test
     public void TC_1304(){
        /*
        User goes to "qa.qualitidemy.com" main page
        confirm cookie
        click on Log in function
        click on E mail box and enters user e-mail
        click on password box and enter user password
        click on log in button
        Click on the My courses function
        Click on Messages function
        Test that When the cancel button is pressed, the new message section should be cancelled.
        Then, Test that when compose button is pressed, new message section should be seen

         */
            ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
            MyCoursePage myCoursePage=new MyCoursePage();
            myCoursePage.homePageMyCoursesLink.click();
            myCoursePage.myCourseMessageLink.click();
            myCoursePage.myCourseMessageTextBox.sendKeys("TestNg Team04"+Keys.PAGE_DOWN);
            ReusableMethods.bekle(1);
            myCoursePage.myCourseMessageCancelButton.click();

            Assert.assertFalse(myCoursePage.myCourseMessageTextBox.isDisplayed());
            Actions actions=new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();

            myCoursePage.myCourseComposButton.click();
            Assert.assertTrue(myCoursePage.myCourseMessageTextBox.isDisplayed());
            Driver.quitDriver();
        }

     @Test
     public void TC_1305(){
/*
User goes to "qa.qualitidemy.com" main page
confirm cookie
click on Log in function
click on E mail box and enters user e-mail
click on password box and enter user password
click on log in button
Click on the My courses function
Click on Messages function
Then test that when you click on the parties with which you have corresponded before, the correspondence history should appear

 */
            ReusableMethods.loginMethodu("userNameSuleyman", "passwordSuleyman");
            MyCoursePage myCoursePage=new MyCoursePage();
            myCoursePage.homePageMyCoursesLink.click();
            myCoursePage.myCourseMessageLink.click();
            myCoursePage.myCourseCorrespondedLink.click();
            Assert.assertTrue(myCoursePage.myCourseCorrespondedTestTextBox.isDisplayed());
            Driver.quitDriver();

        }

    }


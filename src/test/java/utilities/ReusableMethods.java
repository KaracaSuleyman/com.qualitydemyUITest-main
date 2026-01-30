package utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import pages.CoursePage;
import pages.HomePage;
import pages.InstractionPage;
import pages.LoginPage;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class ReusableMethods {

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                bekle(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;
    }



    public static void loginMethodu(String gecerliUsername, String gecerliPassword ) {

        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        bekle(1);
        HomePage homePage=new HomePage();
        if (!homePage.firstLoginLink.isEnabled()){
            logOut();
        }else {
            homePage.firstLoginLink.click();
            homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty(gecerliUsername));
            homePage.passwordTextBox.sendKeys(ConfigReader.getProperty(gecerliPassword));
            if (homePage.cookieKabul.isDisplayed()) {
                homePage.cookieKabul.click();
            }
            ReusableMethods.bekle(1);
            homePage.loginButton.click();
        }
    }
    public static void loginMethodu() {

        Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));
        HomePage homePage=new HomePage();
        if (!homePage.firstLoginLink.isDisplayed()){
            logOut();
        }else {
            homePage.firstLoginLink.click();
            homePage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
            homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
            homePage.cookieKabul.click();
            ReusableMethods.bekle(1);
            homePage.loginButton.click();
        }
    }

    public static void logOut(){
        LoginPage loginPage=new LoginPage();
        Actions actions =new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
        actions.moveToElement(loginPage.logoutIconButton).moveToElement(loginPage.logoutIconButton).perform();
        loginPage.logoutButton.click();
    }

    public static void instructorEditPage(){
        Actions actions=new Actions(Driver.getDriver());
        InstractionPage instractionPage=new InstractionPage();
        instractionPage.homePageInstructorLink.click();
        instractionPage.instructorPageCourseManagerLink.click();

        if (instractionPage.instructorPagePlusButton.isDisplayed()) {
            instractionPage.instructorPagePlusButton.click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }else
        {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }

        ReusableMethods.bekle(1);
        instractionPage.courseActionsButton.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        instractionPage.instructorPageSectionAndLessonLink.click();
    }

    public static void instructorAddNewCourse(){
        Actions actions=new Actions(Driver.getDriver());
        InstractionPage instractionPage=new InstractionPage();
        instractionPage.homePageInstructorLink.click();
        instractionPage.instructorPageCourseManagerLink.click();
        instractionPage.addNewCourseLink.click();
    }


        public static void payWithCard(){
            CoursePage coursePage=new CoursePage();
            Actions actions=new Actions(Driver.getDriver());
            actions.sendKeys(coursePage.emailTextBox,"tufyibirke@gufum.com")
                    .sendKeys(Keys.TAB).sendKeys("4242424242424242")
                    .sendKeys(Keys.TAB).sendKeys("1124")
                    .sendKeys(Keys.TAB).sendKeys("325")
                    .sendKeys(Keys.TAB).sendKeys("ahmet").click(coursePage.payButton).perform();
        }


public static void instructorLoginMethod(String Username, String Password){

    //The user goes to https://qa.qualitydemy.com/
    Driver.getDriver().get(ConfigReader.getProperty("qaHomePageUrl"));

    HomePage homaPage = new HomePage();

    homaPage.firstLoginLink.click();

    //Writes the current Email address to the Email textbox
    homaPage.eMailHomePageTextbox.sendKeys(ConfigReader.getProperty("userNameOsman"));

    //Type valid Password in the Password textbox
    homaPage.passwordTextBox.sendKeys(ConfigReader.getProperty("passwordOsman"));

    //Accepts cookies
    homaPage.cookieKabul.click();
    ReusableMethods.bekle(2);

    //Log in makes you click on the link
    homaPage.loginButton.click();
    ReusableMethods.bekle(1);

    //Clicks on the Instructor tab
    InstractionPage instractionPage = new InstractionPage();

    instractionPage.instructorButton.click();
    ReusableMethods.bekle(1);

    //Clicks on the course manager tab
    instractionPage.courseManagerLink.click();
    ReusableMethods.bekle(1);

    //Clicks on the Actions menu
    Actions actions=new Actions(Driver.getDriver());
    actions.sendKeys(Keys.END).perform();
    ReusableMethods.bekle(1);
    actions.moveToElement(instractionPage.courseActionsButton).perform();
    ReusableMethods.bekle(1);
    instractionPage.courseActionsButton.click();

    //Selects the Section and lesson option from the Select list
    actions.sendKeys(Keys.END).perform();
    ReusableMethods.bekle(1);
    instractionPage.sectionandLessonDropdown.click();
    ReusableMethods.bekle(2);

}
}
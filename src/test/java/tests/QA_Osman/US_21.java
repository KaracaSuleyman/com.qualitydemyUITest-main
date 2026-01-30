package tests.QA_Osman;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InstractionPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;

public class US_21 {

    //as a user I should be able to use the functions
    //of the Curriculum section on the course_form/course_edit page
    //(bir kullanıcı olarak, Course_form/course_edit sayfasındaki
    //Müfredat bölümünün işlevlerini kullanabilmeliyim.)

    @Test
    public void test2101(){
        /*Objektive         ***

        Verify that the new section is added when the add section button is clicked
        and the data is entered in the title textbox on the screen that opens
        and the submit button is pressed.
        (Bölüm ekle butonuna tıklanıp açılan ekranda başlık metin kutusuna veri girilip
        gönder butonuna basıldığında yeni bölümün eklendiğini doğrulayınız.)
        */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Add section icon
        instractionPage.addSectionLink.click();

        //Enter the name of the Section in the Title section of the Add new section box
        LocalDateTime date = LocalDateTime.now();
        String NewSectionName="New Section - "+date;
        instractionPage.addNewSectionTitle.sendKeys(NewSectionName);

        // Click the Submit button
        instractionPage.addNewSectionSubmitButton.click();
        ReusableMethods.bekle(5);

        //New Section is displayed
        Assert.assertTrue(instractionPage.newSectionName.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void test2102(){
        /*Objektive         ***

        The screen that opens when the add section button is clicked should be closed with the close button.
        (Bölüm ekle butonuna tıklandığında açılan ekran kapat butonu ile kapatılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Add section button
        instractionPage.addSectionLink.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(instractionPage.addNewSectionText.isDisplayed());

        //Clicks on the Close button
        instractionPage.addNewSectionCloseButton.click();
        ReusableMethods.bekle(2);
        Assert.assertFalse(instractionPage.addNewSectionText.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void test2103(){
        /*Objektive         ***

        When the add lesson button is clicked, selections should be made for video types.
        (Ders ekle butonuna tıklandığında video türleri için seçim yapılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(2);

        Assert.assertFalse(instractionPage.selectLessonVimeoRadioButton.isSelected());

        //Select lesson type selects
        instractionPage.selectLessonVimeoRadioButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(instractionPage.selectLessonVimeoRadioButton.isEnabled());

        Driver.closeDriver();
    }
    @Test
    public void test2104(){
        /*Objektive         ***

        The screen that opens when the add lesson button is clicked should be closed with the close button.
        (Ders ekle butonuna tıklandığında açılan ekran kapat butonu ile kapatılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.addNewLessonType.isDisplayed());

        //Clicks on the Close button
        instractionPage.addLessonFirstCloseButton.click();
        ReusableMethods.bekle(1);
        Assert.assertFalse(instractionPage.addNewLessonType.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void test2105(){
        /*Objektive         ***

        After selecting the video type in the add lesson section, when the next button is clicked,
        the explanation screen related to the video should appear.
        (Ders ekle kısmından video türünü seçtikten sonra next butonuna tıklandığında
        video ile ilgili açıklama ekranı gelmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Select lesson type selects
        String expectedType= instractionPage.selectLessonVimeoRadioButton.getText();
        instractionPage.selectLessonVimeoRadioButton.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //The video type of the new lesson appears
        String actualType=instractionPage.addNewLessonType.getText();
        ReusableMethods.bekle(1);

        Assert.assertTrue(actualType.contains(expectedType));
        ReusableMethods.bekle(1);

        Driver.closeDriver();
    }

    @Test
    public void test2106(){
        /*Objektive         ***

        The name should be able to get entered in the title textbox on the description screen.
        (Açıklama ekranındaki başlık metin kutusuna isim girilebilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Enter the name in the title text box
        LocalDateTime date=LocalDateTime.now();
        String newLesson="Added Lesson - "+date;
        instractionPage.addNewLessonNameTitle.sendKeys(newLesson);
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.addNewLessonNameTitle.isEnabled());

        Driver.closeDriver();
    }

    @Test
    public void test2107(){
        /*Objektive         ***

        The desired section should be selected from the section dropbox on the description screen.
        (Açıklama ekranındaki bölüm açılır kutusundan istenilen bölüm seçilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Clicks on the Section box and selects a section
        instractionPage.addNewLessonSectionDrop.click();
        ReusableMethods.bekle(1);
        instractionPage.addNewLessonSectionDrop.click();
        Assert.assertTrue(instractionPage.addNewLessonSectionSelect.isEnabled());
        Assert.assertTrue(instractionPage.addNewLessonSectionDrop.isEnabled());

        Driver.closeDriver();
    }

    @Test
    public void test2108(){
        /*Objektive         ***

        A valid url should be able to get entered in the video url section on the description screen.
        (Açıklama ekranındaki video url kısmına geçerli bir url girilebilir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Enter a valid lesson url in the video url section
        instractionPage.addNewLessonVideoUrl.sendKeys("https://www.youtube.com/watch?v=iTa1W6479ME&t=4s");
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.addNewLessonVideoUrl.isEnabled());

        Driver.closeDriver();
    }

    @Test
    public void test2109(){
        /*Objektive         ***

        After a valid url is entered in the video url section on the description screen,
        the duration section should automatically capture the duration in the system.
        (Açıklama ekranındaki video url bölümüne geçerli bir url girildikten sonra
        süre bölümünün sistemdeki süreyi otomatik olarak yakalaması gerekir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Enter a valid lesson url in the video url section
        instractionPage.addNewLessonVideoUrl.sendKeys("https://www.youtube.com/watch?v=iTa1W6479ME&t=4s");

        //The duration section automatically capture the duration in the system
        instractionPage.addNewLessonDuration.click(); // OTOMATIK DEGIL AMA TIKLAYINCA SUREYI YAKALIYOR  BUG ??
        ReusableMethods.bekle(3);
        String actualDuration= instractionPage.addNewLessonDuration.getText();
        String expectedDuration="00:00:00";
        Assert.assertNotEquals(expectedDuration,actualDuration);

        Driver.closeDriver();
    }

    @Test
    public void test2110(){
        /*Objektive         ***

        When an invalid url is entered in the video url section on the description screen,
        a warning should appear under the textbox.
        (Açıklama ekranında video url kısmına geçersiz bir url girildiğinde
        textbox altında uyarı gelmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //A invalid url enters in the video url section
        instractionPage.addNewLessonVideoUrl.sendKeys("https://www.youtube.com/");

        //Invalid url warning appears under the textbox
        instractionPage.addNewLessonDuration.click(); // TIKLAYINCA SUREYI YAKALIYOR  BUG ??
        ReusableMethods.bekle(2);
        String expectedWarning="Invalid url";
        String actualWarning=instractionPage.invalidUrlWarning.getText();
        Assert.assertTrue(actualWarning.contains(expectedWarning));

        Driver.closeDriver();
    }

    @Test
    public void test2111(){
        /*Objektive     ***

        It should be possible to enter a description in the summary textbox on the description screen
        (Açıklama ekranındaki özet metin kutusuna açıklama girilebilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Enters the description in the Summary text box on the Description screen
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String summary="Enters the description in the Summary text box on the Description screen";
        instractionPage.addNewLessonSummary.sendKeys(summary);
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.addNewLessonSummary.isEnabled());

        Driver.closeDriver();
    }

    @Test
    public void test2112(){
        /*Objektive         ***

        Mark as free lesson checkbox should be clickable on the description screen
        (Açıklama ekranında ücretsiz ders olarak işaretle onay kutusu tıklanabilir olmalıdır)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Clicks the Mark as free lesson checkbox
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertFalse(instractionPage.updateLessonFreeCheckbox.isSelected());
        ReusableMethods.bekle(1);
        instractionPage.updateLessonFreeCheckbox.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonFreeCheckbox.isSelected());

        Driver.closeDriver();
    }

    @Test
    public void test2113(){
        /*Objektive         ***

        After filling the relevant sections on the explanation screen,
        the course should be added to the lesson section when the add lesson button is clicked.
        (Açıklama ekranında ilgili bölümler doldurulduktan sonra ders ekle butonuna tıklandığında
        ders ders bölümüne eklenmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();
        ReusableMethods.bekle(1);

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Enter the name in the title text box
        LocalDateTime date=LocalDateTime.now();
        String newLesson="New Lesson - "+date;
        //System.out.println(newLesson);
        instractionPage.addNewLessonNameTitle.sendKeys(newLesson);
        ReusableMethods.bekle(1);

        //Enter a valid lesson url in the video url section
        instractionPage.addNewLessonVideoUrl.sendKeys("https://www.youtube.com/watch?v=iTa1W6479ME&t=4s");
        instractionPage.addNewLessonDuration.click();

        //Enters the description in the Summary text box on the Description screen
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String summary="Enters the description in the Summary text box on the Description screen";
        instractionPage.addNewLessonSummary.sendKeys(summary);

        //Clicks the Mark as free lesson checkbox
        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        instractionPage.updateLessonFreeCheckbox.click();

        //Clicks the add lesson button
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);
        instractionPage.addLessonButton.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(instractionPage.uptdateLessonCongratulationsText.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2114(){
        /*Objektive         ***

        Clicking the close button on the description screen should close the window
        (Açıklama ekranındaki kapat düğmesine tıklandığında pencere kapatılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the add lesson button
        instractionPage.addLessonLink.click();

        //Clicks the Next button
        instractionPage.selectLessonTypeNextButton.click();
        ReusableMethods.bekle(1);

        //Clicks on the Close button
        instractionPage.addNewLessonSecondCloseButton.click();
        ReusableMethods.bekle(2);
        Assert.assertFalse(instractionPage.addNewLessonText.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2115(){
        /*Objektive         ***

        When the Sort sections button is pressed,
        it should be possible to change the order between the sections with drag drop.
        (Bölümleri sırala düğmesine basıldığında,
        sürükle bırak ile bölümler arasındaki sıralamayı değiştirmek mümkün olmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks the Sort sections button
        instractionPage.sortSectionsLink.click();
        ReusableMethods.bekle(1);

        //Clicks and holds the relevant section with drag drop and drop it on one of the other sections.
        //Changes the order between the sections
        WebElement dragSection= instractionPage.listOfsectionsOne;
        String beforedragSectionText= dragSection.getText();
        WebElement dropSection= instractionPage.listOfsectionsTwo;
        String beforedropSectionText= dropSection.getText();
        ReusableMethods.bekle(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dropSection,dragSection).perform();
        String afterdragSectionText=instractionPage.listOfsectionsOne.getText();
        String afterdropSectionText=instractionPage.listOfsectionsTwo.getText();

        Assert.assertEquals(beforedragSectionText,afterdropSectionText);

        Driver.closeDriver();
    }

    @Test
    public void test2116(){
        /*Objektive         ***

        When the sort sections button is pressed and changes are made,
        the change made with the update sorting button should be saved.
        (Bölümleri sırala butonuna basıldığında ve değişiklik yapıldığında
        sıralama güncelle butonu ile yapılan değişiklik kaydedilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks the Sort sections button
        instractionPage.sortSectionsLink.click();
        ReusableMethods.bekle(1);

        //Clicks and holds the relevant section with drag drop and drop it on one of the other sections.
        //Changes the order between the sections
        WebElement dragSection= instractionPage.listOfsectionsOne;
        WebElement dropSection= instractionPage.listOfsectionsTwo;
        ReusableMethods.bekle(1);
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(dropSection,dragSection).perform();
        ReusableMethods.bekle(1);
        String drag=dragSection.getText();

        //Clicks the update sorting button
        instractionPage.sectionUpdateSortingLink.click();
        ReusableMethods.bekle(2);

        //New update sorting is displayed
        Assert.assertTrue(instractionPage.sectionOne.getText().contains(drag));

        Driver.closeDriver();
    }

    @Test
    public void test2117(){
        /*Objektive         ***

        When hovering over the sections with the mouse, the sort lesson,
        edit section and delete section buttons should appear.
        (Mouse ile bölümlerin üzerine geldiğinizde
        dersi sırala, bölümü düzenle ve bölümü sil butonları gelmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Goes hovering over the sections with the mouse
        Actions actions=new Actions(Driver.getDriver());
        actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSections).perform();
        ReusableMethods.bekle(3);

        //The sort lesson, edit section and delete section buttons are displayed
        Assert.assertTrue(instractionPage.sortLessonButton.isDisplayed());
        Assert.assertTrue(instractionPage.editSectionButton1.isDisplayed());
        Assert.assertTrue(instractionPage.deleteSectionButton.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2118(){
        /*Objektive         ***

        It should be possible to change the order between the lessons with the drag drop
        where the sort lesson button is pressed.
        (Ders sırala butonuna basılan sürükle bırak ile
        dersler arasındaki sıralamayı değiştirmek mümkün olmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Sort lesson button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSection).perform();
        ReusableMethods.bekle(2);
        instractionPage.sortLessonLink.click();
        ReusableMethods.bekle(2);

        //Clicks and holds the relevant section with drag drop and drop it on one of the other lessons
        //Changes the order between the lessons

        WebElement dragSectionBefore= instractionPage.firstLessonSort;
        String firstLessonBefore=instractionPage.firstLessonSort.getText();

        WebElement dropSectionBefore= instractionPage.secondLessonSort;
        String secondLessonBefore=instractionPage.secondLessonSort.getText();

        actions.dragAndDrop(dropSectionBefore,dragSectionBefore).perform();
        ReusableMethods.bekle(2);

        String firstLessonAfter=instractionPage.firstLessonSort.getText();
        String secondLessonAfter=instractionPage.secondLessonSort.getText();

        Assert.assertNotEquals(firstLessonAfter,firstLessonBefore);
        Assert.assertNotEquals(secondLessonAfter,secondLessonBefore);
        Assert.assertEquals(firstLessonAfter,secondLessonBefore);
        Assert.assertEquals(firstLessonBefore,secondLessonAfter);

        Driver.closeDriver();
    }

    @Test
    public void test2119(){
        /*Objektive         ***

        When the sort lesson button is pressed and a change is made,
        the change made by pressing the update sorting button should be saved.
        (Ders sırala butonuna basıldığında değişiklik yapıldığında
        sıralamayı güncelle butonuna basılarak yapılan değişiklik kaydedilmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Sort lesson button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSections).perform();
        ReusableMethods.bekle(2);

        String afterFirstSectionFirstLesson=instractionPage.firstSectionFirstLesson.getText();
        String afterFirstSectionSecondLesson=instractionPage.firstSectionSecondLesson.getText();

        instractionPage.sortLessonLink.click();
        ReusableMethods.bekle(2);

        //Clicks and holds the relevant section with drag drop and drop it on one of the other lessons
        //Changes the order between the lessons

        WebElement dragSectionBefore= instractionPage.firstLessonSort;
        String firstLessonBefore=instractionPage.firstLessonSort.getText();

        WebElement dropSectionBefore= instractionPage.secondLessonSort;
        String secondLessonBefore=instractionPage.secondLessonSort.getText();

        actions.dragAndDrop(dropSectionBefore,dragSectionBefore).perform();
        ReusableMethods.bekle(2);

        String firstLessonAfter=instractionPage.firstLessonSort.getText();
        String secondLessonAfter=instractionPage.secondLessonSort.getText();

        //Clicks the update sorting button
        instractionPage.lessonUpdateSortingButton.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //New update sorting is displayed
        String beforeFirstSectionFirstLesson=instractionPage.firstSectionFirstLesson.getText();
        String beforeFirstSectionSecondLesson=instractionPage.firstSectionSecondLesson.getText();

        Assert.assertNotEquals(afterFirstSectionFirstLesson,beforeFirstSectionFirstLesson);
        Assert.assertNotEquals(afterFirstSectionSecondLesson,beforeFirstSectionSecondLesson);

        Driver.closeDriver();
    }

    @Test
    public void test2120(){
        /*Objektive         ***

        When the Update section button is pressed,
        the title section should be able to be changed in the window that opens.
        (Bölümü güncelle butonuna basıldığında açılan pencerede başlık bölümü değiştirilebiliyor olmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Edit section button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSections).perform();
        ReusableMethods.bekle(1);
        actions.moveToElement(instractionPage.editSectionButton1).click().perform();
        ReusableMethods.bekle(1);
        String beforeFirstSection= instractionPage.firstSection.getText();

        //Update section window opens
        //Changes the Title section
        instractionPage.updateSectionTitle.clear();
        ReusableMethods.bekle(1);

        LocalDateTime date = LocalDateTime.now();
        String updateSectionTitle="Team 04 - "+date;

        instractionPage.updateSectionTitle.sendKeys(updateSectionTitle);
        ReusableMethods.bekle(2);

        //Clicks on the Submit button
        instractionPage.updateSectionSubmitButton.click();
        ReusableMethods.bekle(2);

        //Section title is seen to change
        String afterFirstSection= instractionPage.firstSection.getText();
        System.out.println(beforeFirstSection);
        System.out.println(afterFirstSection);
        Assert.assertNotEquals(beforeFirstSection,afterFirstSection);

        Driver.closeDriver();
    }

    @Test
    public void test2121(){
        /*Objektive         ***

        When the update section button is pressed,
        the window that opens should be closed with the close button.
        (Bölümü güncelle butonuna basıldığında açılan pencere kapat butonu ile kapatılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Edit section button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSections).perform();
        ReusableMethods.bekle(1);
        actions.moveToElement(instractionPage.editSectionButton1).click().perform();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateSectionText.isDisplayed());

        //Clicks on the Close button
        instractionPage.updateLessonCloseButton.click();
        ReusableMethods.bekle(1);
        Assert.assertFalse(instractionPage.updateSectionText.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2122(){
        /*Objektive         ***

        The desired section should be get deleted with the delete section button.
        (Bölüm sil butonu ile istenilen bölüm silinmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Add section icon
        instractionPage.addSectionLink.click();

        //Enter the name of the Section in the Title section of the Add new section box
        LocalDateTime date = LocalDateTime.now();
        String newSectionName="New Section -"+date;
        instractionPage.addNewSectionTitle.sendKeys(newSectionName);
        ReusableMethods.bekle(1);

        // Click the Submit button
        instractionPage.addNewSectionSubmitButton.click();
        ReusableMethods.bekle(1);

        String firstSectionName=instractionPage.firstSection.getText();

        //Clicks on the Delete section button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.overTheSections).perform();
        ReusableMethods.bekle(2);
        instractionPage.deleteSectionLink.click();
        ReusableMethods.bekle(1);

        //Information windows opens
        //Clicks the Continue link
        instractionPage.deleteSectionContinueLink.click();
        ReusableMethods.bekle(2);

        //The name of the deleted section does not appear in the Section list
        Assert.assertNotEquals(instractionPage.firstSection.getText(),firstSectionName);

        Driver.closeDriver();
    }

    @Test
    public void test2123(){
        /*Objektive         ***

        When you hover over the lesson with your mouse, the edit and delete icons should appear.
        (Farenizle dersin üzerine geldiğinizde düzenle ve sil simgeleri görünmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Goes hovering over the lesson with the mouse
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.firstSectionFirstLesson).perform();
        ReusableMethods.bekle(1);

        // Appears the Edit  and the Delete icon
        Assert.assertTrue(instractionPage.lessonEditSymbol.isDisplayed());
        Assert.assertTrue(instractionPage.lessonDeleteSymbol.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2124(){
        /*Objektive         ***

        When the edit icon is clicked, the update lesson window should open.
        (Düzenle ikonuna tıklandığında dersi güncelle penceresi açılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Edit icon
        //The Update lesson window opens
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.firstSectionFirstLesson).perform();
        ReusableMethods.bekle(1);
        instractionPage.lessonEditSymbol.click();
        ReusableMethods.bekle(1);

        Assert.assertTrue(instractionPage.updateLessonWindow.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2125(){
        /*Objektive         ***

        Changes can be made in the sections of the update lesson window
        (Ders güncelleme penceresinin bölümlerinde değişiklik yapılabilir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Edit icon
        //The Update lesson window opens
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.firstSectionFirstLesson).perform();
        ReusableMethods.bekle(1);
        instractionPage.lessonEditSymbol.click();
        ReusableMethods.bekle(1);

        //Makes changes to all sections of the lesson update window

        instractionPage.updateLessonTitle.clear();
        ReusableMethods.bekle(1);
        LocalDateTime date = LocalDateTime.now();
        instractionPage.updateLessonTitle.sendKeys("Update Lesson Title "+date);
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonTitle.isEnabled());

        instractionPage.updateLessonVideoUrlWeb.clear();
        ReusableMethods.bekle(1);
        instractionPage.updateLessonVideoUrlWeb.sendKeys("https://www.youtube.com/watch?v=iTa1W6479ME&t=4s");
        ReusableMethods.bekle(1);

        instractionPage.updateLessonDurationWeb.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonVideoUrlWeb.isEnabled());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);

        instractionPage.updateLessonVideoUrlMobile.clear();
        ReusableMethods.bekle(1);
        instractionPage.updateLessonVideoUrlMobile.sendKeys("https://www.html5rocks.com/en/tutorials/video/basics/devstories.webm");
        ReusableMethods.bekle(1);
        instractionPage.updateLessonDurationMobile.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonVideoUrlMobile.isEnabled());

        instractionPage.updateLessonSummaryBox.clear();
        ReusableMethods.bekle(1);
        instractionPage.updateLessonSummaryBox.sendKeys("Makes changes to all sections of the lesson update window");
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonSummaryBox.isEnabled());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        instractionPage.updateLessonFreeCheckbox.click();
        Assert.assertTrue(instractionPage.updateLessonFreeCheckbox.isEnabled());

        //Clicks the update lesson button
        instractionPage.updateLessonButton.click();
        ReusableMethods.bekle(1);

        Driver.closeDriver();
    }

    @Test
    public void test2126(){
        /*Objektive         ***

        The update lesson window should be closed with the close button.
        (Kapat butonu ile ders güncelleme penceresi kapatılmalıdır.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Edit icon
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.firstSectionFirstLesson).perform();
        ReusableMethods.bekle(3);
        instractionPage.lessonEditSymbol.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(instractionPage.updateLessonWindow.isDisplayed());

        //Clicks on the Close button
        instractionPage.updateLessonCloseButton.click();
        ReusableMethods.bekle(1);
        Assert.assertFalse(instractionPage.updateLessonWindow.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void test2127(){
        /*Objektive         ***

        When the delete lesson icon is clicked, the desired lesson should be deleted
        (Ders sil ikonuna tıklandığında istenilen ders silinmelidir.)

         */
        ReusableMethods.instructorLoginMethod("userNameOsman","passwordOsman");
        InstractionPage instractionPage=new InstractionPage();

        //Clicks on the Delete lesson icon
        WebElement firstSectionFirstLessonName=instractionPage.firstSectionFirstLesson;
        System.out.println(firstSectionFirstLessonName.getText());

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(instractionPage.firstSectionFirstLesson).perform();
        ReusableMethods.bekle(3);

        //Delete button is clicked
        instractionPage.lessonDeleteSymbol.click();
        ReusableMethods.bekle(1);

        //Clicks the Continue link
        instractionPage.lessonDeleteContinueLink.click();
        ReusableMethods.bekle(5);
        System.out.println(instractionPage.firstSectionFirstLesson.getText());

        //The name of the deleted lesson does not appear in the Lesson list
        Assert.assertNotEquals(instractionPage.firstSectionFirstLesson.getText(),firstSectionFirstLessonName);

        Driver.closeDriver();
    }
}

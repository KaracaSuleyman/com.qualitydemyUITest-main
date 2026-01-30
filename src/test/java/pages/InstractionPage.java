package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InstractionPage {


    public InstractionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US_21 Lokasyonları
    //instructor> course manager
    @FindBy(xpath="//*[text()='Course manager']")
    public WebElement courseManagerLink;

    //instructor> course manager> actions button
    @FindBy(xpath="(//button[@type='button'])[1]")
    public WebElement courseActionsButton;

    //instructor> course manager> actions> section and lesson
    @FindBy(xpath="(//*[text()='Section and lesson'])[1]")
    public WebElement sectionandLessonDropdown;

    //instructor> course manager> actions> section and lesson> add section link
    @FindBy(xpath="(//a[@class='btn btn-outline-primary btn-rounded btn-sm ml-1'])[1]")
    public WebElement addSectionLink;

    //instructor> course manager> actions> section and lesson> add section> add new section title
    @FindBy(xpath="(//input[@class='form-control'])[9]")
    public WebElement addNewSectionTitle;

    //instructor> course manager> actions> section and lesson> add section> add new section title> submit button
    @FindBy(xpath="(//button[text()='Submit'])[2]")
    public WebElement addNewSectionSubmitButton;

    //instructor> course manager> actions> section and lesson> new section name
    @FindBy(xpath="//h5[@class='card-title']")
    public WebElement newSectionName;

    //instructor> course manager> actions> section and lesson> add section> close button
    @FindBy(xpath="//button[text()='Close']")
    public WebElement addNewSectionCloseButton;

    //instructor> course manager> actions> section and lesson> add lesson link
    @FindBy(xpath="(//a[@class='btn btn-outline-primary btn-rounded btn-sm ml-1'])[2]")
    public WebElement addLessonLink;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type radio button
    @FindBy(xpath="//label[@for='youtube']")
    public WebElement selectLessonTypeRadioButton;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> close button
    @FindBy(xpath="//*[text()='Close']")
    public WebElement addLessonFirstCloseButton;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button
    @FindBy(xpath="//a[text()='Next']")
    public WebElement selectLessonTypeNextButton;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> add new lesson type
    @FindBy(tagName="strong")
    public WebElement addNewLessonType;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> title
    @FindBy(xpath="(//input[@name='title'])[2]")
    public WebElement addNewLessonNameTitle;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> section
    @FindBy(id="select2-section_id-ii-container")
    public WebElement addNewLessonSectionDropbox;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> video url
    @FindBy(id="video_url")
    public WebElement addNewLessonVideoUrl;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> duration
    @FindBy(id="duration")
    public WebElement addNewLessonDuration;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> invalid url warning
    @FindBy(id="invalid_url")
    public WebElement invalidUrlWarning;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> summary
    @FindBy(xpath="(//div[@class='note-editable card-block'])[2]")
    public WebElement addNewLessonSummary;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> mark as free lesson
    @FindBy(id="free_lesson")
    public WebElement addNewLessonFreeCheckbox;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> add lesson button
    @FindBy(xpath="//*[text()='Add lesson']")
    public WebElement addLessonButton;

    //instructor> course manager> actions> section and lesson> new section name> new lesson name
    @FindBy(xpath="//h5[@class='card-title mb-0']")
    public WebElement newLessonName;

    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> close button
    @FindBy(xpath="//button[text()='Close']")
    public WebElement addNewLessonSecondCloseButton;

    //instructor> course manager> actions> section and lesson> sort section link
    @FindBy(xpath=" //a[text()=' Sort sections']")
    public WebElement sortSectionsLink;

    //instructor> course manager> actions> section and lesson> sort section link> list of sections> first
    @FindBy(xpath="(//h5[@class='card-title'])[1]")
    public WebElement firstSection;

    //instructor> course manager> actions> section and lesson> sort section link> list of sections> second
    @FindBy(xpath="(//h5[@class='card-title'])[2]")
    public WebElement secondSection;

    //instructor> course manager> actions> section and lesson> sort section link> update sorting button
    @FindBy(xpath="(//button[text()='Update sorting']")
    public WebElement sectionUpdateSortingButton;

    //instructor> course manager> actions> section and lesson> over the sections
    @FindBy(xpath="(//div[@class='card-body'])[3]")
    public WebElement overTheSections;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button
    @FindBy(xpath="(//div[@class='card bg-light text-seconday on-hover-action mb-5'])[1]")
    public WebElement sortLessonButton;

    //instructor> course manager> actions> section and lesson> over the sections> edit section button
    @FindBy(xpath="(//button[@class='btn btn-outline-secondary btn-rounded btn-sm ml-1'])[1]")
    public WebElement editSectionButton;

    //instructor> course manager> actions> section and lesson> over the sections> delete section button
    @FindBy(xpath="(//button[@class='btn btn-outline-secondary btn-rounded btn-sm ml-1'])[2]")
    public WebElement deleteSectionButton;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button> first lesson in the sort
    @FindBy(xpath="(//div[@class='card-body'])[6]")
    public WebElement firstLessonInTheSort;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button> second lesson in the sort
    @FindBy(xpath="(//div[@class='card-body'])[7]")
    public WebElement secondLessonInTheSort;

    //instructor> course manager> actions> section and lesson> over the sections> update sorting button
    @FindBy(id="lesson-sort-btn")
    public WebElement lessonUpdateSortingButton;

    //instructor> course manager> actions> section and lesson> first section first lesson
    @FindBy(xpath="(//h5[@class='card-title mb-0'])[1]")
    public WebElement firstSectionFirstLesson;

    //instructor> course manager> actions> section and lesson> first section second lesson
    @FindBy(xpath="(//h5[@class='card-title mb-0'])[2]")
    public WebElement firstSectionSecondLesson;

    //instructor> course manager> actions> section and lesson> over the sections> edit section button> update section title
    @FindBy(xpath="(//input[@name='title'])[2]")
    public WebElement updateSectionTitle;

    //instructor> course manager> actions> section and lesson> over the sections> edit section button> submit button
    @FindBy(xpath="(//button[text()='Submit'])[2]")
    public WebElement updateSectionSubmitButton;

    //instructor> course manager> actions> section and lesson> over the sections> edit section button> close button
    @FindBy(xpath="//button[text()='Close']")
    public WebElement updateSectionCloseButton;

    //instructor> course manager> actions> section and lesson> over the sections> delete section button> continue link
    @FindBy(id="update_link")
    public WebElement deleteSectionContinueLink;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol
    @FindBy(xpath="//a[@data-original-title='Edit']")
    public WebElement lessonEditSymbol;

    //instructor> course manager> actions> section and lesson> over the lesson> delete symbol
    @FindBy(xpath="//a[@data-original-title='Delete']")
    public WebElement lessonDeleteSymbol;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window
    @FindBy(id="scrollableModalTitle")
    public WebElement updateLessonWindow;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> title
    @FindBy(xpath="(//input[@class='form-control'])[9]")
    public WebElement updateLessonTitle;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> section
    @FindBy(id="select2-section_id-container")
    public WebElement updateLessonSection;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> video url mobil
    @FindBy(xpath="(//input[@class='form-control'])[10]")
    public WebElement updateLessonVideoUrlMobil;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> duration mobil
    @FindBy(xpath="(//input[@class='form-control'])[11]")
    public WebElement updateLessonDurationMobil;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> video url app
    @FindBy(xpath="(//input[@class='form-control'])[12]")
    public WebElement updateLessonVideoUrlApp;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> duration app
    @FindBy(xpath="(//input[@class='form-control'])[13]")
    public WebElement updateLessonDurationApp;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> summary box
    @FindBy(xpath="(//div[@class='note-editable card-block'])[2]")
    public WebElement updateLessonSummaryBox;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> mark as free checkbox
    @FindBy(id="free_lesson")
    public WebElement updateLessonFreeCheckbox;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> update lesson button
    @FindBy(xpath="//button[text()='Update lesson']")
    public WebElement updateLessonButton;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> close button
    @FindBy(xpath="//button[text()='Close']")
    public WebElement updateLessonCloseButton;

    //instructor> course manager> actions> section and lesson> over the lesson> delete symbol> continue link
    @FindBy(id="update_link")
    public WebElement lessonDeleteContinueLink;

    //US_26 Lokasyonları
    //instructor> course manager> actions> section and lesson> media
    @FindBy(xpath="//a[@class='nav-link rounded-0 pt-2 pb-2 active']")
    public WebElement courseManagerMediaTab;

    //instructor> course manager> actions> section and lesson> media> course overview provider
    @FindBy(id="select2-course_overview_provider-container")
    public WebElement courseOverviewProvider;

    //instructor> course manager> actions> section and lesson> media> course overview url
    @FindBy(id="course_overview_url")
    public WebElement courseOverviewUrl;

    //instructor> course manager> actions> section and lesson> media> course thumbnail
    @FindBy(xpath="//label[@for='course_thumbnail']")
    public WebElement courseThumbnail;

    //US_27 Lokasyonları
    //instructor> course manager> actions> section and lesson> seo
    @FindBy(xpath="//span[text()='Seo']")
    public WebElement courseManagerSeoTab;

    //instructor> course manager> actions> section and lesson> meta keywords
    @FindBy(xpath="//div[@class='bootstrap-tagsinput']")
    public WebElement courseManagerSeoMetaKeywords;

    //instructor> course manager> actions> section and lesson> meta description
    @FindBy(xpath="//textarea[@name='meta_description']")
    public WebElement courseManagerSeoMetaDescription;
    
     //US_040
    // Instructor=> Sales Report Link
    @FindBy (xpath = "//span[text()='Sales report']")
    public WebElement salesReportLink;

    // Instructor=> Sales Report Link=>Sales Report Page
    @FindBy (xpath = "//input[@type='search']")
    public WebElement salesReportPageSearchBox;

   // Instructor=> Sales Report Link=>Sales Report Page
    @FindBy (xpath = "//span[@id='selectedValue']")
    public WebElement salesReportPageFilterTextBox;


    // ********** Suleyman started **************


    // ---------Start of US_22----------------


    // Homepage>Instructor Link
    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement homePageInstructorLink;

    //Instructor> course manager link
    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement instructorPageCourseManagerLink;

    // Instructor > course manager > "+" buttton
    @FindBy (xpath = "//td[@class='sorting_1']")
    public  WebElement instructorPagePlusButton;

    // Instructor > course manager > actions buttton
    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[2]")
    public  WebElement instructorPageActionsButton;

    // Instructor > course manager > actions buttton>edit link
    @FindBy (xpath = "(//a[text()='Edit this course'])[2]")
    public  WebElement instructorPageEditLink;

    // Instructor > course manager > actions buttton>section and lesson
    @FindBy (xpath = "(//*[text()='Section and lesson'])[1]")
    public  WebElement instructorPageSectionAndLessonLink;



    //Instructor >edit course> basic funtion
    @FindBy(xpath = "//*[text()='Basic']")
    public WebElement instructorPageBasicFunction;

    //Instructor >edit course> add new instructor dropdown
    @FindBy(xpath = "//ul[@class='select2-selection__rendered']")
    public WebElement instructorPageAddNewInstructorDropdown;

    //Instructor >edit course> add new instructor dropdown select
    @FindBy(xpath ="//*[text()='John Doe ( a@a.com )']")
    public WebElement instructorPageAddNewInstructorSelectFromDropDown;



    //*[text()='Instructor of this course']





    //Instructor >edit course> add new instructor dropdown test
    @FindBy(id = "select2-new_instructors-t5-result-ou46-1")
    public WebElement instructorPageAddNewInstructorTest;


    //Instructor >edit course> course title textbox
    @FindBy(id = "course_title")
    public WebElement instructorPageCourseTitleTextBox;

    //Instructor >edit course> course title test
    @FindBy(xpath = "//a[@href='https://qa.qualitydemy.com/user/course_form/course_edit/67']")
    public WebElement instructorPageCourseTitleTest;


    //Instructor >edit course> description text box
    @FindBy(xpath = "course_title")
    public WebElement instructorPageDescriptionTextBox;

    //Instructor >edit course> category dropdown
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public WebElement instructorPageCategoryDropdown;

    //Instructor >edit course> category dropdown
    @FindBy(xpath = "(//*[text()='HTML5 and CSS'])[2]")
    public WebElement instructorPageCategorySelectDropdown;

    //Instructor >edit course> category dropdown
    @FindBy(xpath = "(//*[text()='HTML5 and CSS'])[2]")
    public WebElement instructorPageCategoryTest;




    //Instructor >edit course> level dropdown
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
    public WebElement instructorPageLevelDropdown;

    //Instructor >edit course> level dropdown
    @FindBy(xpath = "(//*[text()='Advanced'])[2]")
    public WebElement instructorPageLevelSelectDropdown;

    //Instructor >edit course> content drip checkbox
    @FindBy(xpath = "((//*[@for='enable_drip_content']))[2]")
    public WebElement instructorPageContentDripCheckBox;

    //Instructor >edit course> top cour secheckbox
    @FindBy(xpath = "//input[@id='is_top_course']")
    public WebElement instructorPageTopCourseCheckBox;

    //Instructor >edit course> finish function
    @FindBy(xpath = "//a[@href='#finish']")
    public WebElement instructorPageFinishFunction;

    //Instructor >edit course> finish >submit
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement instructorPageSubmitButton;

    // -------------End of US_22----------------


    //-------------Strat of US_25----------------


    //Instructor > edit course> price link
    @FindBy(xpath = "//*[text()='Pricing']")
    public WebElement instructorPagePriceLink;

    //Instructor > edit course> price link>free course checkbox
    @FindBy(xpath = "//*[@for='is_free_course']")
    public WebElement instructorPageFreeCourseCheckbox;

    //Instructor > edit course> price link>price entered textbox
    @FindBy(id = "price")
    public WebElement instructorPagePriceEnteredTextBox;

    //Instructor > edit course> price link>price discount checkbox
    @FindBy(xpath = "//*[@for='discount_flag']")
    public WebElement instructorPageDiscountCheckbox;

    //Instructor > edit course> price link>price discount textbox
    @FindBy(xpath = "//*[@name='discounted_price']")
    public WebElement instructorPageDiscountTextbox;

    // -------------End of US_25----------------

    //-------------Strat of US_29----------------


    //Instructor> Course Manger> Add new course > course title textbox
    @FindBy(id= "course_title" )
    public WebElement instructorPageAddNewCourseTitleTextBox;

    //Instructor> Course Manger> Add new course > short description text box
    @FindBy(id= "short_description" )
    public WebElement instructorPageAddNewCourseShortDescriptionTextBox;

    //Instructor> Course Manger> Add new course >  description text box
    @FindBy(xpath= "//*[@class='note-editable card-block']" )
    public WebElement instructorPageAddNewCourseDescriptionTextBox;


    //Instructor> Course Manger> Add new course >  category dropdown
    @FindBy(xpath= "(//*[text()='Select a category'])[2]")
    public WebElement instructorPageAddNewCourseCategoryDropdown;

    //Instructor> Course Manger> Add new course >  category dropdown
    @FindBy(xpath= "//*[@class='select2-search__field']")
    public WebElement instructorPageAddNewCourseCategoryClick;




    //Instructor> Course Manger> Add new course >  category dropdown test
    @FindBy(xpath= "(//*[text()='Java Programming Language'])[2]")
    public WebElement instructorPageAddNewCourseCategoryTest;


    //Instructor> Course Manger> Add new course >  level dropdown
    @FindBy(xpath= "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement instructorPageAddNewCourseLevelDropdown;

    //Instructor> Course Manger> Add new course >  level dropdown test
    @FindBy(xpath= "//*[@title='Advanced']")
    public WebElement instructorPageAddNewCourseLevelTest;

    //Instructor> Course Manger> Add new course > drip content
    @FindBy(xpath = "(//*[@for='enable_drip_content'])[2]")
    public WebElement instructorPageAddNewCourseDripContentCheckBox;


    //Instructor> Course Manger> Add new course >  top course checkbox
    @FindBy(xpath = "//*[text()='Check if this course is top course']")
    public WebElement instructorPageAddNewCourseTopCourseCheckBox;

    // -------------End of US_29----------------

    //-------------Strat of US_32----------------

    //Instructor > Add new course> price link
    @FindBy(xpath = "//*[text()='Pricing']")
    public WebElement instructorPageAddNewCoursePriceLink;

    //Instructor > Add new course> price link>free course checkbox
    @FindBy(xpath = "//*[@for='is_free_course']")
    public WebElement instructorPageAddNewCourseFreeCourseCheckbox;

    //Instructor > Add new course > price link>price entered textbox
    @FindBy(id = "price")
    public WebElement instructorPageAddNewCoursePriceEnteredTextBox;

    //Instructor > Add new course > price link>price discount checkbox
    @FindBy(xpath = "//*[@for='discount_flag']")
    public WebElement instructorPageAddNewCourseDiscountCheckbox;

    //Instructor > Add new course> price link>price discount textbox
    @FindBy(xpath = "//*[@name='discounted_price']")
    public WebElement instructorPageAddNewCourseDiscountTextkbox;

    // -------------End of US_29----------------


    //           *******  Suleyman finished  **********


    // US_34 Fazıl

    // On the Instructor Course Manager Courses page
    @FindBy(xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
    public WebElement addNewCourseLink;
       // finished

    //fazil 26.01.2023
    //Instructor=>Sales Report Page
    @FindBy(xpath="//a[text()='Great Web Design']")
    public WebElement greatWebDesignCourseLink;

    //on the Sale Report Page
    @FindBy (xpath ="//li[text()='Last 7 Days']")
    public WebElement last7DaysOption;

    // on the Sale Report Page
    @FindBy(xpath="//button[@class='btn btn-info']")
    public WebElement searchFilterButton;

    //on Sale Report Page
    @FindBy(xpath="//div[@id='sales-report-datatable_info']")
    public WebElement resultInformationText;


    // On the Instructor Course Manager Courses Add new course page
    @FindBy(xpath = "//input[@size='43']")
    public WebElement metaKeywordsTextbox;

    // On the Instructor Course Manager Courses Add new course page
    @FindBy (xpath = "//textarea[@name='meta_description']")
    public WebElement metaDescriptionTextbox;

    //on Sale Report Page
    @FindBy (xpath = "//a[text()='Great Java Lesson']")
    public WebElement greatJavaCourseLink;




    //Fatihodyo

    //-------------Start of US_19----------------
    //Instructor > Course manager >Filter button >
    @FindBy(xpath = "//button[text()='Filter']")
    public WebElement courseManagerFilterButton;

    //Instructor > course manager> Dropdown categories >
    @FindBy(xpath = "(//*[text()='All'])[2]")
    public WebElement courseManagerCategories;

    //Instructor > course manager> Dropdown status >
    @FindBy(xpath = "(//*[text()='All'])[4]")
    public WebElement courseManagerStatus;

    //Instructor > course manager> dropdown Price >
    @FindBy(xpath = "(//*[text()='All'])[6]")
    public WebElement courseManagerPrice;

    //Instructor > course manager> dropdown Three Dots >
    @FindBy(xpath = "//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon']")
    public WebElement courseManagerThreeDots;

    //Instructor > course manager> dropdown Three dots >View Course on Frontend Link >
    @FindBy(xpath = "//*[text()='View course on frontend']")
    public WebElement courseManagerThreeDotsViewCourseFrontend;

    //Instructor > course manager> dropdown Three dots >Go to Course Playing Page >
    @FindBy(xpath = "//*[text()='Go to course playing page']")
    public WebElement courseManagerThreeDotsGotoPlayingPage;

    //Instructor > course manager> dropdown Three dots >Edit this Course >
    @FindBy(xpath = "//*[text()='Edit this course']")
    public WebElement courseManagerThreeDotsEditThisCourse;

    @FindBy(xpath = "//*[text()='Section and lesson']")
    public WebElement courseManagerSectionandLesson;

    //Instructor > course manager> dropdown Three dots >Mark as Drafted >
    @FindBy(xpath = "//*[text()='Mark as drafted']")
    public WebElement courseManagerThreeDotsMarkAsDrafted;

    //Instructor > course manager> add course button
    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement courseManagerAddCourseButton;

    //*[text()='Add new course']
    //Instructor > course manager> CourseNameTest
    @FindBy(xpath = "//*[text()='Englisch C1']")
    public WebElement courseNameTest;



    //Instructor > course manager> search box > coursename
    @FindBy(xpath = "//*[text()='Search:']")
    public WebElement courseNameinSearchBox;



    //Instructor > course manager> actıon >mark as drafted >contınue button
    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement courseMarkAsDraftedContinueButton;


    //Instructor > course manager> actıon >publish this course
    @FindBy(xpath = "//*[text()='Publish this course']")
    public WebElement courseManagerPublishThisCourse;

    //Instructor > course manager> status > drafted
    @FindBy(xpath = " //*[text()='Draft']")
    public WebElement coursestatusdrafted;


    //Instructor > course manager> status > active
    @FindBy(xpath = " //*[text()='Active']")
    public WebElement coursestatusActive;










    // -------------End of US_19----------------



    // ********** Galip started **************

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginLinki;

    @FindBy(id="login-email")
    public WebElement emailTextBox;

    @FindBy(id="login-password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;

    @FindBy(xpath ="//a[text()='Accept']")
    public WebElement cookies;

    //instructor button
    @FindBy(xpath = "(//div[@class='icon'])[1]")
    public WebElement instructorButton;

    //instructor> course manager>
    @FindBy(xpath = "(//li[@class='side-nav-item'])[2]")
    public WebElement courseManagerButton;

    //instructor> course manager> actions button
    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement actionsButton;

    //instructor> course manager> actions button> edit This Course Link
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement editThisCourseLink;

    //instructor> course manager> actions button> edit This Course Link> Basic Link
    @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
    public WebElement courseEditBasicLink;

    //instructor> course manager> actions button> edit This Course Link> Basic Kurs Titel Text Box
    @FindBy(id="course_title")
    public WebElement courseEditBasicKursTitelTextBox;

    //instructor> course manager> actions button> edit This Course Link> Fnish Link
    @FindBy(xpath = "(//a[@data-toggle='tab'])[8]")
    public WebElement courseEditFnishLink;

    //instructor> course manager> actions button> edit This Course Link> Submit Button
    @FindBy(xpath = "//button[@onclick='checkRequiredFields()']")
    public WebElement courseEditSubmitButton;

    //instructor> course manager> actions button> edit This Course Link> Curriculum Link
    @FindBy(xpath = "(//span[@class='d-none d-sm-inline'])[1]")
    public WebElement courseEditCurriculumLink;

    //instructor> course manager> add New Course Link>
    @FindBy(xpath = "//i[@class='mdi mdi-plus']")
    public WebElement aaddNewCourseLink;

    //instructor> course manager> add New Course Link>Congratulations! Checks that the message is seen.
    @FindBy(xpath = "//div[@class='jq-toast-wrap top-right']")
    public WebElement courseEditCongratulationsMessage;

    //instructor> course manager> add New Course Link>Congratulations! Checks that the message is seen.
    @FindBy(xpath = "//div[@class='jq-toast-wrap top-right']")
    public WebElement courseAddCongratulationsMessage;

    //instructor> course manager> add New Course Link> Requirements Link
    @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
    public WebElement courseAddRequirementsLink;

    //instructor> course manager> add New Course Link> Requirements Added Text Box
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement courseAddRequirementsAddedTextBox;

    //instructor> course manager> add New Course Link> Requirements Added Button
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement courseAddRequirementsAddedButton;

    //instructor> course manager> add New Course Link> Requirements Added Button
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement courseAddRequirementsDeletedTextBox;

    //instructor> course manager> add New Course Link> Requirements Deleted Button
    @FindBy(xpath = "(//button[@style='margin-top: 0px;'])[2]")
    public WebElement courseAddRequirementsDeletedButton;

    //instructor> course manager> add New Course Link> Outcomes Link
    @FindBy(xpath = "(//a[@data-toggle='tab'])[3]")
    public WebElement courseAddOutcomesLink;

    //instructor> course manager> add New Course Link> Outcomes Added Text Box
    @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[1]")
    public WebElement courseAddOutcomesAddedTextBox;

    //instructor> course manager> add New Course Link> Outcomes Added Button
    @FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[2]")
    public WebElement courseAddOutcomesAddedButton;

    //instructor> course manager> add New Course Link> Outcomes Deleted Button
    @FindBy(xpath = "(//button[@onclick='removeOutcome(this)'])[2]")
    public WebElement courseAddOutcomesDeletedButton;

    //instructor> course manager> add New Course Link> Outcomes Deleted Text Box
    @FindBy(xpath = "(//input[@placeholder='Provide outcomes'])[3]")
    public WebElement courseAddOutcomesDeletedTextBox;

    //instructor> course manager> add New Course Link> Media Link
    @FindBy(xpath = "(//a[@data-toggle='tab'])[5]")
    public WebElement courseAddMediaLink;

    //instructor> course manager> add New Course Link> Course Overview Provider Menu
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[4]")
    public WebElement courseAddCourseOverviewProviderMenu;

    //instructor> course manager> add New Course Link> Course Overview Provider Menu Youtube Html5 Vimeo
    @FindBy(xpath = "//ul[@class='select2-results__options']")
    public WebElement courseAddCourseOverviewProviderMenuYoutubeMimeoHtml5;

    //instructor> course manager> add New Course Link> Course Overview Provider Menu Html5
    @FindBy(xpath = "//li[text()='Html5']")
    public WebElement courseAddCourseOverviewProviderMenuHtml5;

    //instructor> course manager> add New Course Link> Course Overview Provider Menu Youtube
    @FindBy(xpath = "//li[text()='Youtube']")
    public WebElement courseAddCourseOverviewProviderMenuYoutube;

    //instructor> course manager> add New Course Link> Course Overview Provider Menu Vimeo
    @FindBy(xpath = "//li[text()='Vimeo']")
    public WebElement courseAddCourseOverviewProviderMenuVimeo;

    @FindBy(xpath = "//span[@class='play-btn']")
    public WebElement fotoUptadePlayButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement viewcourseOnFrontend;

    //instructor> course manager> add New Course Link> Course Overview Url
    @FindBy(id = "course_overview_url")
    public WebElement courseAddCourseOverviewUrl;

    //instructor> course manager> add New Course Link> Course Thumbnail Foto Link
    @FindBy(xpath = "//label[@for='course_thumbnail']")
    public WebElement courseAddCourseThumbnailFotoLink;


    //instructor> course manager> add New Course Link> Fnish Link
    @FindBy(xpath = "(//span[@class='d-none d-sm-inline'])[7]")
    public WebElement courseAddFnishLink;


    //instructor> course manager> add New Course Link> Submit Button
    @FindBy(xpath = "//button[@class='btn btn-primary text-center']")
    public WebElement courseAddSubmitButton;

    //instructor> course manager> add New Course Link> Basic Link
    @FindBy(xpath = "(//span[@class='d-none d-sm-inline'])[1]")
    public WebElement courseAddBasicLink;

    //instructor> course manager> add New Course Link> Basic Kurs Titel Text Box
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement courseAddBasicKursTitelTextBox;

    //instructor> course manager> add New Course Link> Basic Category Link
    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[1]")
    public WebElement courseAddBasicCategoryLink;

    //instructor> course manager> add New Course Link> Basic Category Menu
    @FindBy(xpath = "(//li[@aria-selected='false'])[3]")
    public WebElement courseAddBasicCategoryMenu;

    //li[@data-select2-id='select2-sub_category_id-result-nigl-7']
    //li[@data-select2-id='select2-sub_category_id-result-vll8-6']

    //instructor> course manager> add New Course Link> Curriculum Link
    @FindBy(xpath = "(//span[@class='d-none d-sm-inline'])[1]")
    public WebElement courseAddCurriculumLink;

    // *******  Galip finished  **********

    // ******** Vural started  ***********+

    //instructor> Become an Insructor> nameInput
    @FindBy(xpath = "//input[@id='name']")
    public WebElement instructorApplicationFormName;

    //instructor> Become an Insructor> emailAddressInput
    @FindBy(xpath = "//input[@id='email']")
    public WebElement instructorApplicationFormEmail;

    //instructor> Become an Insructor> AddressInput
    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement instructorApplicationFormAddress;

    //instructor> Become an Insructor> phoneNumberInput
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement instructorApplicationFormPhoneNumber;

    //instructor> Become an Insructor> anyMessageInput
    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement instructorApplicationFormAnyMessage;

    //instructor> Become an Insructor> documentInput
    @FindBy(xpath = "//input[@id='document']")
    public WebElement instructorApplicationFormDocument;

    //instructor> Become an Insructor> documentInputFileName
    @FindBy(xpath = "//label[@for='document']")
    public WebElement instructorApplicationFormDocumentInputFileName;

    //instructor> Become an Insructor> applyButton
    @FindBy(xpath = "//button[@class='btn btn-primary text-center']")
    public WebElement instructorApplicationFormApplyButton;

    //instructor> Become an Insructor> YourApplicationSection> yourApplicationHeader
    @FindBy(xpath = "//h4[text()='Your application']")
    public WebElement instructorYourApplicationSectionHeader;

    //instructor> Become an Insructor> YourApplicationSection> clickToActivateButton
    @FindBy(xpath = "//a[@class='fake_status btn btn-danger']")
    public WebElement instructorYourApplicationSectionClickToActivateButton;

    //instructor> Become an Insructor> YourApplicationSection> approvedButton
    @FindBy(xpath = "//div[text()='Approved']")
    public WebElement instructorYourApplicationSectionApprovedButton;

    //US_2701
    //instructor> course manager> actions> section and lesson> meta keywords
    @FindBy(xpath = "(//input[@placeholder='Write a keyword and then press enter button'])[2]")
    public WebElement courseManagerSeoMetaKey;

    //US_2601
    //instructor> course manager> actions> section and lesson> media
    @FindBy(xpath = "//span[text()='Media']")
    public WebElement courseManagerMedia;

    //instructor> course manager> actions> section and lesson> media> course overview provider
    @FindBy(xpath = "//select[@name='course_overview_provider']")
    public WebElement courseOverviewProviderSelect;

    //instructor> course manager> actions> section and lesson> media> course overview provider
    @FindBy(id = "select2-course_overview_provider-container")
    public WebElement courseOverPro;

    //US_2602
    //instructor> course manager> actions> section and lesson> media> course overview url
    @FindBy(id = "course_overview_url")
    public WebElement courseOverUrl;

    //US_2603
    @FindBy(xpath = "//div[@class='js--image-preview js--no-default']")
    public WebElement courseThumbnailAlbum;

    //instructor> course manager> actions> section and lesson> media> course thumbnail
    @FindBy(xpath = "//input[@class='image-upload']")
    public WebElement courseThumb;

    // 26.01.2023 fazil
    // 26.01.2023 Fazil US_40
    //on the Sale Report Page
    @FindBy(xpath="//a[@href='https://qa.qualitydemy.com/home/course/gitar-dersleri1/695']")
    public WebElement gitarDersleriLink;



    // ******** Osman started (2.Tur)  ***********+
    //US_2105
    //instructor> course manager> actions> section and lesson> add lesson> select lesson type
    @FindBy(xpath = "//label[@for='vimeo']")
    public WebElement selectLessonVimeoRadioButton;

    //US_2113
    //instructor> course manager> actions> section and lesson> new section name> new lesson name
    @FindBy(xpath = "//*[text()='Congratulations!']")
    public WebElement uptdateLessonCongratulationsText;

    //US_2114
    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> close button
    @FindBy(xpath = "//h5[text()='Add new lesson']")
    public WebElement addNewLessonText;

    //US_2115
    //instructor> course manager> actions> section and lesson> sort section link> list of sections> first
    @FindBy(xpath = "(//div[@class='card mb-0 mt-2 draggable-item'])[1]")
    public WebElement listOfsectionsOne;

    @FindBy(xpath = "(//div[@class='card mb-0 mt-2 draggable-item'])[2]")
    public WebElement listOfsectionsTwo;

    @FindBy(xpath = "(//div[@class='card mb-0 mt-2 draggable-item'])[3]")
    public WebElement listOfsectionsThree;

    //US_2116
    //instructor> course manager> actions> section and lesson> sort section link> update sorting button
    @FindBy(id = "section-sort-btn")
    public WebElement sectionUpdateSortingLink;

    @FindBy(xpath = "//*[text()='Congratulations! Sections have been sorted']")
    public WebElement updateLessonSectionSortText;

    @FindBy(xpath = "(//div[@class='card bg-light text-seconday on-hover-action mb-5'])[1]")
    public WebElement sectionOne;

    //US_2117
    //instructor> course manager> actions> section and lesson> over the sections> edit section button

    @FindBy(xpath = "(//button[@class='btn btn-outline-secondary btn-rounded btn-sm ml-1'])[1]")
    public WebElement editSectionButton1;

    //US_2118
    //instructor> course manager> actions> section and lesson> over the sections
    @FindBy(xpath = "(//div[@class='card-body'])[3]")
    public WebElement overTheSection;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button
    @FindBy(xpath = "(//i[@class='mdi mdi-sort-variant'])[2]")
    public WebElement sortLessonLink;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button> first lesson in the sort
    @FindBy(xpath = "(//div[@class='media-body'])[1]")
    public WebElement firstLessonSort;

    //instructor> course manager> actions> section and lesson> over the sections> sort section button> second lesson in the sort
    @FindBy(xpath = "(//div[@class='media-body'])[2]")
    public WebElement secondLessonSort;

    //US_2121
    //instructor> course manager> actions> section and lesson> over the sections> edit section button> close button

    @FindBy(id = "scrollableModalTitle")
    public WebElement updateSectionText;

    //US_2122
    //instructor> course manager> actions> section and lesson> over the sections> delete section button
    @FindBy(xpath = "(//button[@class='btn btn-outline-secondary btn-rounded btn-sm ml-1'])[2]")
    public WebElement deleteSectionLink;

    //US_2107
    //instructor> course manager> actions> section and lesson> add lesson> select lesson type> next button> section

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[5]")
    public WebElement addNewLessonSectionDrop;

    @FindBy(xpath = "(//span[@class='select2-selection__rendered'])[5]")
    public WebElement addNewLessonSectionSelect;

    //US_2102
    //instructor> course manager> actions> section and lesson> add section link
    @FindBy(xpath = "//h5[text()='Add new section']")
    public WebElement addNewSectionText;

    //US_2125
    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> video url for web
    @FindBy(xpath = "(//input[@class='form-control'])[10]")
    public WebElement updateLessonVideoUrlWeb;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> duration for web
    @FindBy(xpath = "(//input[@class='form-control'])[11]")
    public WebElement updateLessonDurationWeb;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> video url for mobile
    @FindBy(xpath = "(//input[@class='form-control'])[12]")
    public WebElement updateLessonVideoUrlMobile;

    //instructor> course manager> actions> section and lesson> over the lesson> edit symbol> update lesson window> duration mobile
    @FindBy(xpath = "(//input[@class='form-control'])[13]")
    public WebElement updateLessonDurationMobile;

}

package core;

import com.google.common.base.Splitter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;
import utils.JsonFileParser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.BrowserUtils.*;

public class EnquiryPage extends Browser {

    @FindBy(css = ".question-year input")
    private WebElement yearBuilt;
    @FindBy(css = ".question-row-please-enter-the-cur input")
    private WebElement propertyCurrentValue;
    @FindBy(css = ".question-row-please-enter-the-reb input")
    private WebElement propertyRebuildCost;
    @FindBy(css = ".question-row-is-this-the-same-as button:nth-child(1)")
    private WebElement correspondence;
    @FindBy(css = ".question-row-what-type-of-propert select")
    private WebElement typeOfProperty;
    @FindBy(css = ".question-row-which-of-these-best select")
    private WebElement descProperty;
    @FindBy(css = ".question-row-how-many-bedrooms-do select")
    private WebElement bedrooms;
    @FindBy(css = ".question-row-do-you-own-the-prope select")
    private WebElement ownProperty;
    @FindBy(css = ".question-row-who-is-the-property select")
    private WebElement occupiedBy;
    @FindBy(css = ".question-row-when-is-the-property select")
    private WebElement occupiedWhen;
    @FindBy(css = ".question-row-are-there-trees-tall button:nth-child(2)")
    private WebElement tallTrees;
    @FindBy(xpath = "(//div[@class='row question-row-does-your-property-h']//button[2])[1]")
    private WebElement roof;
    @FindBy(xpath = "(//div[@class='row question-row-do-you-agree-with-th']//button[1])[2]")
    private WebElement statementAboutProperty;
    @FindBy(css = ".question-row-do-all-externally-ac button:nth-child(1)")
    private WebElement keyLocks;
    @FindBy(css = ".question-row-would-you-like-to-in button:nth-child(2)")
    private WebElement coverUpgradeNo;
    @FindBy(css = ".question-row-is-your-property-sel button:nth-child(2)")
    private WebElement selfContained;
    @FindBy(xpath = "(//div[@class='row question-row-does-your-property-h']//button[2])[2]")
    private WebElement frenchPatio;
    @FindBy(xpath = "(//div[@class='row question-row-does-your-property-h']//button[2])[3]")
    private WebElement externalDoors;
    @FindBy(xpath = "(//div[@class='row question-row-does-your-property-h']//button[2])[4]")
    private WebElement burglarAlarm;
    @FindBy(css = ".question-row-would-you-like-to-ad button:nth-child(2)")
    private WebElement joinPolicy;
    @FindBy(css = ".question-row-in-the-past-3-years button:nth-child(2)")
    private WebElement claimNo;
    @FindBy(css = "button[data-testid='tomorrow']")
    private WebElement coverStartDate;
    @FindBy(css = ".question-row-please-select-what-t select")
    private WebElement insuranceType;
    @FindBy(css = ".question-row-standard-excess-oth select")
    private WebElement excess;
    @FindBy(css = ".question-row-address-of-property input")
    private WebElement address;
    @FindBy(css = "ul.list-group")
    private List<WebElement> addressList;
    @FindBy(css = ".question-row-how-many-consecutive select")
    private WebElement insuranceYears;
    @FindBy(css = "button.submit")
    private WebElement gotoCompareQuotes;
    @FindBy(css = ".question-row-last-name input")
    private WebElement lastName;
    @FindBy(css = ".question-row-what-is-your-date-of div:nth-child(1)> select")
    private WebElement dobDay;
    @FindBy(css = ".question-row-what-is-your-date-of div:nth-child(2)> select")
    private WebElement dobMonth;
    @FindBy(css = ".question-row-what-is-your-date-of div:nth-child(3)> select")
    private WebElement dobYear;
    @FindBy(css = ".question-row-what-is-your-marital select")
    private WebElement maritalStatus;
    @FindBy(css = ".question-row-what-is-your-occupat input")
    private WebElement occupation;
    @FindBy(css = ".question-row-does-anybody-living button:nth-child(2)")
    private WebElement smokingYes;
    @FindBy(css = ".question-row-main-telephone-numbe input")
    private WebElement telephone;
    @FindBy(css = ".question-row-what-is-your-e-mail input")
    private WebElement email;
    @FindBy(css = ".question-row-do-you-agree-with-th button:nth-child(1)")
    private WebElement statementAboutYouAgree;
    @FindBy(css = ".question-row-title select")
    private WebElement title;
    @FindBy(css = ".question-row-first-name input")
    private WebElement firstName;
    @FindBy(css = ".questionset-input ul.list-group li")
    private List<WebElement> occupationList;
    private UserData data = JsonFileParser.getData();
    private List<String> dateOfBirth = Splitter.on(' ')
            .trimResults()
            .omitEmptyStrings()
            .splitToList(data.getDateOfBirth());

    public EnquiryPage() {
        super(aDriver);
        PageFactory.initElements(Browser.aDriver, this);
    }

    public Boolean pageTitle(String title) {
        return new WebDriverWait(aDriver,2L)
                .until(ExpectedConditions.titleIs(title));
    }

    public EnquiryPage setTitle() {
        selectListOption(title, data.getTitle());
        return this;
    }

    public EnquiryPage setFirstName() {
        setText(firstName, data.getFirstName());
        return this;
    }

    public EnquiryPage setLastName() {
        setText(lastName, data.getLastName());
        return this;
    }

    public EnquiryPage setBirthDay() {
        selectListOption(dobDay, dateOfBirth.get(0));
        return this;
    }

    public EnquiryPage setBirthMonth() {
        selectListOption(dobMonth, dateOfBirth.get(1));
        return this;
    }

    public EnquiryPage setBirthYear() {
        selectListOption(dobYear, dateOfBirth.get(2));
        return this;
    }

    public EnquiryPage setMaritalStatus() {
        selectListOption(maritalStatus, data.getMaritalStatus());
        return this;
    }

    public EnquiryPage setOccupation() {
        setText(occupation, data.getOccupation());
        occupationList.get(0).click();
        return this;
    }

    public EnquiryPage setAnySmoker() {
        clickWeBElement(smokingYes);
        return this;
    }

    public EnquiryPage setPhoneNumber() {
        setText(telephone, data.getPhoneNumber());
        return this;
    }

    public EnquiryPage setEmail() {
        setText(email, data.getEmail());
        return this;
    }

    public EnquiryPage setStatementAboutYouAgree() {
        clickWeBElement(statementAboutYouAgree);
        return this;
    }

    public EnquiryPage setStatementAboutProperty() {
        clickWeBElement(statementAboutProperty);
        return this;
    }

    public EnquiryPage setAddress() {
        setText(address, data.getAddressOfProperty());
        addressList.get(0).click();
        addressList.get(0).click();
        return this;
    }

    public EnquiryPage setIsCorrespondenceAddress() {
        clickWeBElement(correspondence);
        return this;
    }

    public EnquiryPage setTypeOfProperty() {
        selectListOption(typeOfProperty, data.getTypeOfProperty());
        return this;
    }

    public EnquiryPage setYearBuilt() {
        setText(yearBuilt, data.getYearOfBuilding());
        return this;
    }

    public EnquiryPage setPropertyDescription() {
        selectListOption(descProperty, data.getPropertyDescription());
        return this;
    }

    public EnquiryPage setNumberOfBedrooms() {
        selectListOption(bedrooms, data.getBedrooms().toString());
        return this;
    }

    public EnquiryPage setDoYouOwnProperty() {
        selectListOption(ownProperty, data.getOwnProperty());
        return this;
    }

    public EnquiryPage setPropertyOccupiedBy() {
        selectListOption(occupiedBy, data.getOccupiedBy());
        return this;
    }

    public EnquiryPage setPropertyOccupied() {
        selectListOption(occupiedWhen, data.getWhenOccupied());
        return this;
    }

    public EnquiryPage setTallTrees() {
        clickWeBElement(tallTrees);
        return this;
    }

    public EnquiryPage setFlatRoof() {
        clickWeBElement(roof);
        return this;
    }

    public EnquiryPage setAboutYourProperty() {
        clickWeBElement(statementAboutProperty);
        return this;
    }

    public EnquiryPage setKeyLocks() {
        clickWeBElement(keyLocks);
        return this;
    }

    public EnquiryPage setSelfContained() {
        clickWeBElement(selfContained);
        return this;
    }

    public EnquiryPage setFrenchOrPatioDoors() {
        clickWeBElement(frenchPatio);
        return this;
    }

    public EnquiryPage setExternalDoors() {
        clickWeBElement(externalDoors);
        return this;
    }


    public EnquiryPage setBurglarAlarm() {
        clickWeBElement(burglarAlarm);
        return this;
    }

    public EnquiryPage setJointPolicyHolders() {
        clickWeBElement(joinPolicy);
        return this;
    }

    public EnquiryPage setInsuranceYears() {
        selectListOption(insuranceYears, data.getInsuranceYears());
        return this;
    }

    public EnquiryPage setInsuranceClaim() {
        clickWeBElement(claimNo);
        return this;
    }

    public EnquiryPage setCoverStart() {
        clickWeBElement(coverStartDate);
        return this;
    }

    public EnquiryPage setTypeOfInsurance() {
        selectListOption(insuranceType, data.getInsuranceType());
        return this;
    }

    public EnquiryPage setPropertyValue() {
        setText(propertyCurrentValue, data.getPropertyValue());
        return this;
    }

    public EnquiryPage setCoverUpgrade() {
        clickWeBElement(coverUpgradeNo);
        return this;
    }

    public EnquiryPage setExcess(){

        selectListOption(excess,data.getStandardExcess());
        return this;
    }

    public EnquiryPage getQuotes() {
        clickWeBElement(gotoCompareQuotes);
        return this;
    }
}

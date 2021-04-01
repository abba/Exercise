import core.EnquiryPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Browser.initialiseDriver;
import static utils.Browser.quiteDriver;

public class EnquiryPageTest {

    private static final String HOME_URL = "https://insurance.policyexpert.co.uk/home";
    EnquiryPage page = new EnquiryPage();

    @BeforeAll
    public static void setUp() {
        initialiseDriver().get(HOME_URL);
    }

    @AfterAll
    public static void tearDown() {
        quiteDriver();
    }

    @Test
    @DisplayName("Home Insurance Enquiry Page")
    void homeInsuranceEnquiryPage() {
        assertTrue(page.pageTitle( "Details - Policy Expert"));
    }

    @Test
    @DisplayName("Get Home Insurance Quote")
    void getInsuranceQuoteWithValidDetails() {
        page.setTitle().setFirstName().setLastName().setBirthDay()
                .setBirthMonth().setBirthYear().setOccupation()
                .setMaritalStatus().setAnySmoker().setPhoneNumber()
                .setEmail().setStatementAboutYouAgree()
                .setAddress().setIsCorrespondenceAddress()
                .setTypeOfProperty().setPropertyDescription().setYearBuilt()
                .setNumberOfBedrooms().setDoYouOwnProperty()
                .setPropertyOccupiedBy().setPropertyOccupied()
                .setTallTrees().setFlatRoof().setAboutYourProperty()
                .setKeyLocks().setSelfContained().setFrenchOrPatioDoors()
                .setExternalDoors().setBurglarAlarm().setJointPolicyHolders()
                .setInsuranceYears().setInsuranceClaim().setCoverStart()
                .setExcess().setTypeOfInsurance().setPropertyValue()
                .setCoverUpgrade().getQuotes();

        assertTrue(page.pageTitle("Quotes - Policy Expert"));
    }

}

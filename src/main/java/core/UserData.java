package core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = UserData.class)
public class UserData {
    UserData userData;
    private String title;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String maritalStatus;
    private String occupation;
    private String anySmoker;
    private String phoneNumber;
    private String email;
    private String statementAboutYouAgree;
    private String propertyNotForBusiness;
    private String noBankrupt;
    private String ccJudgement;
    private String insuranceRenewalDeclined;
    private String noCancelledHomeInsurance;
    private String noConvictedOffence;
    private String addressOfProperty;
    private String isCorrespondenceAddress;
    private String typeOfProperty;
    private String propertyDescription;
    private String yearOfBuilding;
    private Integer bedrooms;
    private String ownProperty;
    private String occupiedBy;
    private String whenOccupied;
    private String tallTree;
    private String flatRoof;
    private String aboutYourPropertyInfoDoesAgree;
    private String aboutYourSafetyInfoKeyLocks;
    private String selfContained;
    private String frenchPatio;
    private String externalDoors;
    private String burglarAlarm;
    private String addJoinPolicy;
    private String insuranceYears;
    private String insuranceClaim;
    private String coverStartDate;
    private String insuranceType;
    private String propertyValue;
    private String coverUpgrade;
    private String standardExcess;

    public UserData() {

    }

    public static void main(String[] args) throws IOException {
        UserData a = new UserData();
        System.out.println(a.getFirstName());
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAnySmoker() {
        return anySmoker;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStatementAboutYouAgree() {
        return statementAboutYouAgree;
    }

    public String getPropertyNotForBusiness() {
        return propertyNotForBusiness;
    }

    public String getNoBankrupt() {
        return noBankrupt;
    }

    public String getCcJudgement() {
        return ccJudgement;
    }

    public String getInsuranceRenewalDeclined() {
        return insuranceRenewalDeclined;
    }

    public String getNoCancelledHomeInsurance() {
        return noCancelledHomeInsurance;
    }

    public String getNoConvictedOffence() {
        return noConvictedOffence;
    }

    public String getAddressOfProperty() {
        return addressOfProperty;
    }

    public String getIsCorrespondenceAddress() {
        return isCorrespondenceAddress;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    public String getYearOfBuilding() {
        return yearOfBuilding;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public String getOwnProperty() {
        return ownProperty;
    }

    public String getOccupiedBy() {
        return occupiedBy;
    }

    public String getWhenOccupied() {
        return whenOccupied;
    }

    public String getTallTree() {
        return tallTree;
    }

    public String getFlatRoof() {
        return flatRoof;
    }

    public String getAboutYourPropertyInfoDoesAgree() {
        return aboutYourPropertyInfoDoesAgree;
    }

    public String getAboutYourSafetyInfoKeyLocks() {
        return aboutYourSafetyInfoKeyLocks;
    }

    public String getSelfContained() {
        return selfContained;
    }

    public String getFrenchPatio() {
        return frenchPatio;
    }

    public String getExternalDoors() {
        return externalDoors;
    }

    public String getBurglarAlarm() {
        return burglarAlarm;
    }

    public String getAddJoinPolicy() {
        return addJoinPolicy;
    }

    public String getInsuranceYears() {
        return insuranceYears;
    }

    public String getInsuranceClaim() {
        return insuranceClaim;
    }

    public String getCoverStartDate() {
        return coverStartDate;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public String getCoverUpgrade() {
        return coverUpgrade;
    }

    public String getStandardExcess() {
        return standardExcess;
    }


}
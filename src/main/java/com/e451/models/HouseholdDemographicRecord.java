package com.e451.models;

import javax.persistence.*;

/**
 * Created by b527047 on 3/2/2017.
 */

@Entity
@Table(name="hh_demographic")
public class HouseholdDemographicRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long hshdKey;
    private String ageDescription;
    private String maritalStatusCode;
    private String incomeDesc;
    private String homeownerDesc;
    private String householdCompositionDesc;
    private String householdSizeDesc;
    private String kidCategoryDesc;

    public HouseholdDemographicRecord() {};

    public HouseholdDemographicRecord(String ageDescription, String maritalStatusCode, String incomeDesc, String homeownerDesc, String householdCompositionDesc, String householdSizeDesc, String kidCategoryDesc) {
        this.ageDescription = ageDescription;
        this.maritalStatusCode = maritalStatusCode;
        this.incomeDesc = incomeDesc;
        this.homeownerDesc = homeownerDesc;
        this.householdCompositionDesc = householdCompositionDesc;
        this.householdSizeDesc = householdSizeDesc;
        this.kidCategoryDesc = kidCategoryDesc;
    }

    public Long getHshdKey() {
        return hshdKey;
    }

    public void setHshdKey(Long hshdKey) {
        this.hshdKey = hshdKey;
    }

    public String getAgeDescription() {
        return ageDescription;
    }

    public void setAgeDescription(String ageDescription) {
        this.ageDescription = ageDescription;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getIncomeDesc() {
        return incomeDesc;
    }

    public void setIncomeDesc(String incomeDesc) {
        this.incomeDesc = incomeDesc;
    }

    public String getHomeownerDesc() {
        return homeownerDesc;
    }

    public void setHomeownerDesc(String homeownerDesc) {
        this.homeownerDesc = homeownerDesc;
    }

    public String getHouseholdCompositionDesc() {
        return householdCompositionDesc;
    }

    public void setHouseholdCompositionDesc(String householdCompositionDesc) {
        this.householdCompositionDesc = householdCompositionDesc;
    }

    public String getHouseholdSizeDesc() {
        return householdSizeDesc;
    }

    public void setHouseholdSizeDesc(String householdSizeDesc) {
        this.householdSizeDesc = householdSizeDesc;
    }

    public String getKidCategoryDesc() {
        return kidCategoryDesc;
    }

    public void setKidCategoryDesc(String kidCategoryDesc) {
        this.kidCategoryDesc = kidCategoryDesc;
    }
}
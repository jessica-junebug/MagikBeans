package com.MagicBeans.MagicBeans.Model.PersonalDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by penelope fox on 8/7/2017.
 */
@Entity
public class PhoneNum {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max = 3, message = "Must Enter Country Code")
    private int countryCode;

    @NotNull
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
            message="{invalid.phonenum}")
    private int phonenum;

    @NotNull
    @Size(min = 1, message = "Please select type of phone")
    private String phoneType;

    @ManyToOne
    private PersonalDetails personalDetails;

    public PhoneNum(){}

    public PhoneNum(int countryCode, int contactNo, String contactType){
        this.countryCode = countryCode;
        this.phonenum = contactNo;
        this.phoneType = contactType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getContactNo() {
        return phonenum;
    }

    public void setContactNo(int contactNo) {
        this.phonenum = contactNo;
    }

    public String getContactType() {
        return phoneType;
    }

    public void setContactType(String contactType) {
        this.phoneType = contactType;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}

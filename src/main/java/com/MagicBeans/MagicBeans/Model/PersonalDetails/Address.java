package com.MagicBeans.MagicBeans.Model.PersonalDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by penelope fox on 8/7/2017.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, message = "Enter Address")
    private String street;

    @NotNull
    @Size(min = 1, message = "Enter City")
    private String city;

    @NotNull
    @Size(min = 1, message = "Enter 'N/A' if not applicable")
    private String state;

    @NotNull
    @Size(min = 1, message = "Enter postcode or zip code")
    private String postCode;

    @NotNull
    @Size(min = 4, message = "Enter Country")
    private String country;

    @ManyToOne
    private PersonalDetails personalDetails;

    public Address(){ }

    public Address(String street, String city, String postCode, String country){
        this.street= street;
        this.city= city;
        this.postCode= postCode;
        this.country= country;
    }
    public Address(String street, String city, String state, String postCode, String country) {
        this(street, city, postCode, country);
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}

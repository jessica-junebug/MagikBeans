package com.MagicBeans.MagicBeans.Model.PersonalDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by penelope fox on 8/7/2017.
 */
@Entity
public class PersonalDetails {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private Name name;

    @OneToMany
    @JoinColumn(name = "contactDetails_id")
    private List<Address> addresses = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "contactDetails_id")
    private List<PhoneNum> phoneNums = new ArrayList<>();

    public PersonalDetails() { }

    public PersonalDetails(Name name, List<Address> addresses, List<PhoneNum> phoneNums) {
        this.name = name;
        this.addresses = addresses;
        this.phoneNums = phoneNums;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PhoneNum> getPhoneNums() {
        return phoneNums;
    }

    public void setPhoneNums(List<PhoneNum> phoneNums) {
        this.phoneNums = phoneNums;
    }

}

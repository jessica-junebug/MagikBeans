package com.MagicBeans.MagicBeans.Model.PersonalDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by penelope fox on 8/7/2017.
 */
@Entity
public class Name {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 1, max = 15, message = "Enter your name")
    private String firstName;

    @NotNull
    @Size(min = 1, max = 15, message = "Enter your last name")
    private String lastName;

    public Name(){}

    public Name(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

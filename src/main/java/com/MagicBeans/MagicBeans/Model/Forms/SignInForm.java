package com.MagicBeans.MagicBeans.Model.Forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by LaunchCode
 */
public class SignInForm {

    @NotNull
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
            +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
            +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "Please enter a valid email address")
    private String email;

    @NotNull
    @Pattern(regexp = "(\\S){8,20}", message = "Password must have a minimum of 8 non-whitespace characters")
    private String password;

    public SignInForm() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String userEmail) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

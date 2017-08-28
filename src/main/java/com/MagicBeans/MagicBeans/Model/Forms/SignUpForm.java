package com.MagicBeans.MagicBeans.Model.Forms;

import javax.validation.constraints.NotNull;

/**
 * Created by LaunchCode
 */
public class SignUpForm extends SignInForm {

    @NotNull(message = "Passwords do not match")
    private String verifyPassword;

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
        checkPasswordForSameness();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPasswordForSameness();
    }

    private void checkPasswordForSameness() {
        if (!getPassword().equals(verifyPassword)) {
            verifyPassword = null;
        }
    }
}

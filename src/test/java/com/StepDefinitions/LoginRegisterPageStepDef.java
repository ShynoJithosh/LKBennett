package com.StepDefinitions;

import com.Runners.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginRegisterPageStepDef extends BaseClass {

    @When("^I enters valid credentials for login$")
    public void i_enters_valid_credentials_for_login(DataTable userData) throws Throwable {
      loginregisterpage.entersValidCredentialsForLogin(userData);
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
      loginregisterpage.clickOnLoginButton();
    }

    @Then("^I should get the customer account page$")
    public void i_should_get_the_customer_account_page() throws Throwable {
      loginregisterpage.getTheCustomerAccountPage();
    }

    @When("^I enters valid email$")
    public void i_enters_valid_email() throws Throwable {
        loginregisterpage.enterValidEmail();
    }

    @When("^I click on forgot your password button$")
    public void i_click_on_forgot_your_password_button() throws Throwable {
     loginregisterpage.clickOnForgotPassword();
    }

    @Then("^I should direct to reset password page$")
    public void i_should_direct_to_reset_password_page() throws Throwable {
     loginregisterpage.directToResetPasswordPage();
    }

    @Then("^I click on reset password button$")
    public void i_click_on_reset_password_button() throws Throwable {
     loginregisterpage.clickOnResetPasswordButton();
    }

    @Then("^I should get the password reset confirmation$")
    public void i_should_get_the_password_reset_confirmation() throws Throwable {
       loginregisterpage.resetConfirmation();
    }


    @When("^I enters all valid credentials for register$")
    public void i_enters_all_valid_credentials_for_register(DataTable userData) throws Throwable {
     loginregisterpage.enterAllValidCredentials(userData);
    }

    @Then("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
     loginregisterpage.clickOnRegisterButton();
    }

    @Then("^I should see the register confirmation$")
    public void i_should_see_the_register_confirmation() throws Throwable {
     loginregisterpage.shouldSeeRegisterConfirmation();
    }








}

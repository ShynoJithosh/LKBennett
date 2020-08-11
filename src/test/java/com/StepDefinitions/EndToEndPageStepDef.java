package com.StepDefinitions;

import com.Runners.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndToEndPageStepDef extends BaseClass {

    @When("^I mouseover and click on view shopping bag icon$")
    public void i_mouseover_and_click_on_view_shopping_bag_icon() throws Throwable {
   endtoendpage.mouseOverAndClickOnViewShoppingBagIcon();
    }

    @When("^I click on 'Checkout Securely'button$")
    public void i_click_on_Checkout_Securely_button() throws Throwable {
    endtoendpage.clickOnCheckoutSecureButton();
    }

    @When("^I enter valid emailId in guest checkout$")
    public void i_enter_valid_emailId_in_guest_checkout() throws Throwable {
     endtoendpage.enterValidEmailGuestCheckout();
    }

    @When("^I click on the 'Checkout Securely'button$")
    public void i_click_on_the_Checkout_Securely_button() throws Throwable {
    endtoendpage.clickOnCheckoutSecure1Button();
    }

    @When("^I select click and collect from store option$")
    public void i_select_click_and_collect_from_store_option() throws Throwable {
     endtoendpage.clickAndCollectFromStoreButton();

    }

    @When("^I enter valid postcode$")
    public void i_enter_valid_postcode() throws Throwable {
    endtoendpage.enterValidPostCode();
    }

    @When("^I click on search and select The address from dropdown$")
    public void i_click_on_search_and_select_The_address_from_dropdown() throws Throwable {
    endtoendpage.clickOnSearchAndSelectTheAddressDropdown();
    }

    @When("^I enter valid informations in 'Your Details'$")
    public void i_enter_valid_informations_in_Your_Details(DataTable userData) throws Throwable {
    endtoendpage.enterValidInformationsInYourDetails(userData);
    }

    @When("^I click on 'next'button$")
    public void i_click_on_next_button() throws Throwable {
    endtoendpage.clickOnNextButton();
    }

    @When("^I select country from dropdownlist for 'Billing Address'$")
    public void i_select_country_from_dropdownlist_for_Billing_Address() throws Throwable {
    endtoendpage.selectCountryDropdown();
    }

    @When("^I click on 'Enter the Address manually'$")
    public void i_click_on_Enter_the_Address_manually(DataTable userData) throws Throwable {
    endtoendpage.clickOnEnterAddressManually(userData);
    }

    @When("^I click on 'Use This Address' button$")
    public void i_click_on_Use_This_Address_button() throws Throwable {
     endtoendpage.clickOnUseThisAddress();
    }

    @When("^I accept terms and conditions checkbox$")
    public void i_accept_terms_and_conditions_checkbox() throws Throwable {
     endtoendpage.acceptTermsAndConditionCheckBox();

    }

    @Then("^I click on payment card option and enter card details$")
    public void i_click_on_payment_card_option_and_enter_card_details(DataTable cardData) throws Throwable {
    endtoendpage.clickOnPaymentCardOptionAndCardDetails(cardData);
    }

    @Then("^I click on 'Purchase'button$")
    public void i_click_on_Purchase_button() throws Throwable {

    }

    @Then("^I accept terms and conditions$")
    public void i_accept_terms_and_conditions() throws Throwable {

    }

}

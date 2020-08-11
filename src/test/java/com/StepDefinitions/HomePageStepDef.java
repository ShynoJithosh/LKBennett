package com.StepDefinitions;

import com.Runners.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef extends BaseClass {

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
      homepage.verifyHomePage();
    }

    @When("^I click on my account Icon and signin button$")
    public void i_click_on_my_account_Icon_and_signin_button() throws Throwable {
       homepage.clickOnMyAccountIcon();
    }

    @When("^I click on my account Icon and create account button$")
    public void i_click_on_my_account_Icon_and_create_account_button() throws Throwable {
        homepage.clickOnCreateAccount();
    }

    @When("^I search for \"([^\"]*)\" keyword$")
    public void i_search_for_keyword(String searchWord) throws Throwable {
       homepage.searchWithValidProduct(searchWord);
    }

    @When("^I click on 'Accessories' category$")
    public void i_click_on_Accessories_category() throws Throwable {
        homepage.searchWithRightCategoryName();
    }

    @When("^I search with invalid product 'drinks'$")
    public void i_search_with_invalid_product_drinks() throws Throwable {
        homepage.searchWithInvalidProduct();
    }

    @When("^I click on 'shoes' category$")
    public void i_click_on_shoes_category() throws Throwable {
       homepage.clickOnShoesCategory();
    }



}

package com.StepDefinitions;

import com.Runners.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddBasketStepDef extends BaseClass {

    @When("^I select the product$")
    public void i_select_the_product() throws Throwable {
     addBasketpage.selectTheProduct();
    }

    @When("^I select the particular colour and size$")
    public void i_select_the_particular_colour_and_size() throws Throwable {
     addBasketpage.selectColourAndSize();
    }

    @When("^I click on'Add To Shopping Bag'$")
    public void i_click_on_Add_To_Shopping_Bag() throws Throwable {
    addBasketpage.clickOnAddToShoppingBag();
    }

    @Then("^I should see the mini shopping bag page$")
    public void i_should_see_the_mini_shopping_bag_page() throws Throwable {
    addBasketpage.shouldSeeMiniShoppingBagPage();
    }

}

package com.StepDefinitions;

import com.Runners.BaseClass;
import cucumber.api.java.en.Then;

public class SearchResultsStepDef extends BaseClass {

    @Then("^I should see the related results$")
    public void i_should_see_the_related_results() throws Throwable {
        searchresultspage.shouldSeeRelatedResults();
    }

    @Then("^I should not see any related results$")
    public void i_should_not_see_any_related_results() throws Throwable {
        searchresultspage.shouldnotSeeRelatedResult();
    }

}

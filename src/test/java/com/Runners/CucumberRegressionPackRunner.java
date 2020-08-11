package com.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Users\\jitho\\IdeaProjects\\LKBennett\\src\\test\\Features",
        glue = { "com.stepDefinitions" },
        tags= {"@Regression"},
        plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" })

public class CucumberRegressionPackRunner {
}

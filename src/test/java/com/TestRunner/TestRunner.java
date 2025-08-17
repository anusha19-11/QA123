package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./Features\\orangehrm.feature",
		glue = "usingScenario",
		dryRun = false,
		monochrome = true
		
		)


public class TestRunner {
	

}

package com.example.Team1webshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/example/Team1webshop/resources/features", glue = "com.example.Team1webshop.StepDefs", plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
}


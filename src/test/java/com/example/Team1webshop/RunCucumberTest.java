package com.example.Team1webshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/com/example/Team1webshop/resources/features", plugin = {"pretty", "html:target/cucumber-report.html"})
    //här ska sökväg till vår features mapp in
    public class RunCucumberTest {
    }


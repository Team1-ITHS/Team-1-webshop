package com.example.Team1webshop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.response.Response;
import org.junit.After;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;



@RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/com/example/Team1webshop/resources/features", plugin = {"pretty", "html:target/cucumber-report.html"})
    //här ska sökväg till vår features mapp in
    public class RunCucumberTest {

    }


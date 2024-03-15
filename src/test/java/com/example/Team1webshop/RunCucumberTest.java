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


    private Response response; // Deklarerar response som en privat instansvariabel

    @Test //Mia
    public void Test_Womens_Endpoint_With_Valid_StatusCode() {
        response = given().baseUri("https://produktapi-6ef53ba8f2f2.herokuapp.com/products/categories/women's%20clothing").when().get();
        int actualStatusCode = response.getStatusCode(); // get the actual status code
        int expectedStatusCode = 200; // the expected statuscode
        assertEquals(expectedStatusCode, actualStatusCode); // compare the expected value with the actual value
    }

    @Test // Mia
    public void Test_Womens_Endpoint_With_Invalid_StatusCode() {
        // give a wrong URL (womens clotehes instead of womens clothing)
        String invalidURL = "https://produktapi-6ef53ba8f2f2.herokuapp.com/products/categories/womens%20clothes";
        response = given().baseUri(invalidURL).when().get(); //do a get with the wrong URL
        int actualStatusCode = response.getStatusCode();   // get the actual status code from that
        int expectedStatusCode = 404; // Declare the expected status code,  404, not found
        assertEquals(expectedStatusCode, actualStatusCode); //compare the actual with expected
    }


















    }


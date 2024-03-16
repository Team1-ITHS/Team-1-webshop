package com.example.Team1webshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;

@SpringBootTest
public class ApiTests {

    // Samuel
    @Test
    @DisplayName("Check endpoint status code and if all categories are available")
    public void webShopCategories() {
        baseURI = "https://produktapi-6ef53ba8f2f2.herokuapp.com";
        given().
            get("/products/categories").
        then().statusCode(200).body("", hasItems(
            "electronics",
            "jewelery",
            "men's clothing",
            "women's clothing"));
        //new branch

    }



}

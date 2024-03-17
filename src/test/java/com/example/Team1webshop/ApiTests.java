package com.example.Team1webshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

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
    }

    // Samuel
    @Test
    @DisplayName("Check endpoint status code of electronics category and make sure it is not empty")
    public void webShopElectronicsCategory() {
        baseURI = "https://produktapi-6ef53ba8f2f2.herokuapp.com";
        given().
            get("/products/categories/electronics").
        then().statusCode(200).body("$", hasSize(greaterThan(0)));
    }

    // Samuel
    @Test
    @DisplayName("Verify the title of a product in the electronics category")
    public void webShopElectronicsCategoryProductDataTitle() {
        baseURI = "https://produktapi-6ef53ba8f2f2.herokuapp.com";
        given().
            get("/products/categories/electronics").
        then().statusCode(200).body("[0].title", equalTo("WD 2TB Elements Portable External Hard Drive - USB 3.0"));
    }

    // Samuel
    @Test
    @DisplayName("Verify the price of a product in the electronics category")
    public void webShopElectronicsCategoryProductDataPrice() {
        baseURI = "https://produktapi-6ef53ba8f2f2.herokuapp.com";
        given().
            get("/products/categories/electronics").
        then().statusCode(200).body("[1].price", equalTo(109F));
    }

    // Samuel
    @Test
    @DisplayName("Verify the id of a product in the electronics category")
    public void webShopElectronicsCategoryProductDataId() {
        baseURI = "https://produktapi-6ef53ba8f2f2.herokuapp.com";
        given().
            get("/products/categories/electronics").
        then().statusCode(200).body("[2].id", equalTo(11));
    }
}

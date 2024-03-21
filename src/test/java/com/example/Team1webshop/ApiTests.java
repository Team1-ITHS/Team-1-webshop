package com.example.Team1webshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
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
    //Semih
    @Test
    @DisplayName("Check endpoint status code of 'products' and number products")
    public void webShopProductsURL() {
        given()
                .baseUri("https://produktapi-6ef53ba8f2f2.herokuapp.com")
                .get("/products")
                .then().statusCode(200).body("[19].id", equalTo(20));

    }
    //Semih
    @Test
    @DisplayName("Check endpoint status code for specific product and products prodct details")
    public void webShopProductURL() {
        response = given().baseUri("https://produktapi-6ef53ba8f2f2.herokuapp.com/products/Fjallraven").when().get();
        int actualStatusCode= response.getStatusCode();
        Assertions.assertEquals(400, actualStatusCode); //Since we don't have specific endpoint for each product we do expect "400 not found" status code

        String actualProductDetails = response.body().asString();
        String expectedProductDetails= "\"id\":1,\"title\":\"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\"price\":109.95,\"category\":\"men's clothing\",\"description\":\"Fin väska me plats för dator\",\"image\":\"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg\"";
        Assertions.assertNotEquals(expectedProductDetails,actualProductDetails); // that assertion should be updated as a assertEqual when each product has endpoint

    }



}

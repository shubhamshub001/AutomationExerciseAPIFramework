package tests;

import base.BaseTest;
import endpoints.Routes;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetProductsTest extends BaseTest {

    @Test
    public void getAllProducts(){
        given()
                .spec(requestSpecification)
                .log().all()
                .when().get(Routes.PRODUCTS_LIST)
                .then()
                .log().all().statusCode(200);
    }

}
/*
config.properties
        │
                ▼
ConfigReader
        │
                ▼
FrameworkConstants
        │
                ▼
BaseTest
        │
                ▼
Routes
        │
                ▼
GetProductsTest
        │
                ▼
AutomationExercise API

->When these classes are in place, execution flow looks like this
        */

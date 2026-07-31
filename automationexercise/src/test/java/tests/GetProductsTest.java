package tests;

import base.BaseTest;
import endpoints.Routes;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetProductsTest extends BaseTest {

    @Test
    public void getAllProducts(){
        Response response = given()
                .spec(requestSpecification)
                .log().all()
                .when().get(Routes.PRODUCTS_LIST);

        response
                .then()
                .spec(responseSpecififcation)
                .log().all();
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

/*
This is an API Bug

This is not your framework's mistake.

It is not Rest Assured's mistake.

It is an issue with the API implementation.

A correctly implemented REST API should return:

Content-Type:
application/json

because the body contains JSON.

============================================================================================================

Look at the Body Carefully

The server actually returns:

<html>

<body>

{
  "responseCode":200,
  "products":[...]
}

</body>

</html>

Did you notice that?

The API wraps the JSON inside HTML tags.

This is another reason why the Content-Type is text/html.

So the server is not actually returning a pure JSON document—it is returning an HTML page whose body contains JSON text.

This is why your earlier content type validation failed.
 */
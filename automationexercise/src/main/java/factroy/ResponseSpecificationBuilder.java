package factroy;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.lessThan;

public final class ResponseSpecificationBuilder {

    private ResponseSpecificationBuilder() {
    }

    public static ResponseSpecification buildResponseSpecification() {

        return new ResponseSpecBuilder()
                .expectStatusCode(200)

                /*.expectContentType(ContentType.JSON) --->Sometime "I expected JSON, but the server returned HTML."
                Although the response body contains JSON:the server sends the HTTP header ->Content-Type:
                text/html; charset=utf-8, instead of application/json-->This is actually an issue with the API implementation.*/

                .expectResponseTime(lessThan(5000L))
                .build();
    }
}

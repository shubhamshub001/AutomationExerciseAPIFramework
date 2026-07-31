package factroy;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class RequestSpecificationBuilder {

    private RequestSpecificationBuilder(){
    }

    public static RequestSpecification buildRequestSpecification(){
        return new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty(FrameworkConstants.BASE_URL_KEY))
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();
    }
}

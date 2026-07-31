/*
package base;

import config.ConfigReader;
import constants.FrameworkConstants;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup(){
        System.out.println("key= "+FrameworkConstants.BASE_URL_KEY);
        String url = ConfigReader.getProperty(FrameworkConstants.BASE_URL_KEY);
        System.out.println("URL:"+url);
       RestAssured.baseURI=url ;
        //RestAssured.baseURI= ConfigReader.getProperty(FrameworkConstants.BASE_URL_KEY);
    }

}
*/
//===================================================================================================================
//Explanation:->
/*
Test Starts
      │
              ▼
@BeforeClass executes
      │
              ▼
Reads baseUrl from config.properties
      │
              ▼
RestAssured.baseURI =
https://automationexercise.com/api
*/
//===================================================================================================================
package base;

import factroy.RequestSpecificationBuilder;
import factroy.ResponseSpecificationBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecififcation;

    @BeforeClass
    public void setup() {

        requestSpecification =
                RequestSpecificationBuilder.buildRequestSpecification();
        responseSpecififcation =
                ResponseSpecificationBuilder.buildResponseSpecification();
    }
}
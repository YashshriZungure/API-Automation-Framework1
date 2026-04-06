package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.ConfigReader;

public class BaseTest {

    @BeforeClass
    public void setup() {

        ConfigReader config = new ConfigReader();

        RestAssured.baseURI = config.getBaseUrl();

        System.out.println("Base URL set: " + RestAssured.baseURI);
    }
}
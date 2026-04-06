package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPI {

    // 🔹 GET Request
    public Response getUser() {

        return RestAssured
                .given()
                .when()
                .get("/users/1");
    }

    // 🔹 POST Request
    public Response createUser() {

        String requestBody = "{ \"title\": \"Test\", \"body\": \"API\", \"userId\": 1 }";

        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts");
    }

    // 🔹 PUT Request (Update)
    public Response updateUser() {

        String requestBody = "{ \"id\": 1, \"title\": \"Updated\", \"body\": \"Updated Data\", \"userId\": 1 }";

        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/posts/1");
    }

    // 🔹 DELETE Request
    public Response deleteUser() {

        return RestAssured
                .given()
                .when()
                .delete("/posts/1");
    }
}
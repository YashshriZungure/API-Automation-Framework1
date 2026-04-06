package tests;

import api.UserAPI;
import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    // 🔹 GET Test
    @Test
    public void testGetUser() {

        UserAPI api = new UserAPI();
        Response res = api.getUser();

        System.out.println("GET Response: " + res.getBody().asString());
        System.out.println("GET Status Code: " + res.getStatusCode());

        Assert.assertEquals(res.getStatusCode(), 200);
    }

    // 🔹 POST Test
    @Test
    public void testCreateUser() {

        UserAPI api = new UserAPI();
        Response res = api.createUser();

        System.out.println("POST Response: " + res.getBody().asString());
        System.out.println("POST Status Code: " + res.getStatusCode());

        Assert.assertEquals(res.getStatusCode(), 201);
    }

    // 🔹 PUT Test
    @Test
    public void testUpdateUser() {

        UserAPI api = new UserAPI();
        Response res = api.updateUser();

        System.out.println("PUT Response: " + res.getBody().asString());
        System.out.println("PUT Status Code: " + res.getStatusCode());

        Assert.assertEquals(res.getStatusCode(), 200);

        // JSON validation
        String title = res.jsonPath().getString("title");
        Assert.assertEquals(title, "Updated");
    }

    // 🔹 DELETE Test
    @Test
    public void testDeleteUser() {

        UserAPI api = new UserAPI();
        Response res = api.deleteUser();

        System.out.println("DELETE Status Code: " + res.getStatusCode());

        Assert.assertEquals(res.getStatusCode(), 200);
    }
}
package restassuredapi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class TestPatchRequest {
	
	
	@Test
	public void test_patch_tc_01() {
		baseURI="http://localhost:8080/";
		basePath="/student";
		
		JSONObject reqBody = new JSONObject();
		reqBody.put("email", "sharath@gmail.com");
		
//		given().contentType(ContentType.JSON).body(reqBody)
//		.when().patch("/100")
//		.then().statusCode(200).and().body("msg", equalTo("Updated"));
		
		Response resp = given().contentType(ContentType.JSON).body(reqBody)
		.when().patch("/100");
		
		
		String respData = resp.getBody().jsonPath().get("msg");
		int respStatusCode = resp.getStatusCode();
//		System.out.println("Response Message is -->>"+respData);
		
		Assert.assertEquals("Updated", respData);
		Assert.assertEquals(200, respStatusCode);
		
		
	}

}

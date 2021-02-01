package restassuredapi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class CreateGitRepo_BasicAuth {
	
	
	@Test
	public void createRepo_BasicAuth() {
		
		baseURI="https://api.github.com";
		basePath="/user";
		
	
		Response response = given().auth().preemptive()
		.basic("srinidhi1072", "Bangalore!@#4").contentType(ContentType.JSON).
		body(new File("C:\\Users\\Srinidhi\\Desktop\\studentapi\\createRepo.json"))
		.when().post("/repos");
//		.then().statusCode(200);
		response.then().statusCode(201);
		
		System.out.println(response.getBody().asString());		
		
//		System.out.println(response.getBody().asString());
//		Assert.assertEquals(201, response.getStatusCode());
//		.then().statusCode(201);
	}

}

package restassuredapi;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPostRequest {
	
	
	@Test
	public void post_test_01() {
		baseURI="http://localhost:8080/";
		basePath="/student";
		
		given().contentType(ContentType.JSON).body(new File("C:\\Users\\Srinidhi\\Desktop\\studentapi\\reqBody.json"))
		.when().post("/")
		.then().statusCode(201).and().body("msg", equalTo("Student added"));
	}

}

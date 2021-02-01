package restassuredapi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;


public class TestPutRequest {
	
	
	@Test
	public void put_test_01() {
		
		baseURI="http://localhost:8080/";
		basePath="/student";
		
		given().contentType(ContentType.JSON).body(new File("C:\\Users\\Srinidhi\\Desktop\\studentapi\\reqBody.json"))
		.when().put("/103")
		.then().statusCode(200).and().body("msg",equalTo("Student Updated"));
		
	}

}

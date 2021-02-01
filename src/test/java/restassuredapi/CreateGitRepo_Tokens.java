package restassuredapi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class CreateGitRepo_Tokens {

	
	@Test
	public void createRepo_Tokens() {
		
		baseURI="https://api.github.com";
		basePath="/user";
		
	
		given().auth().oauth2("323ebde61a1e91428c54f3b897762ca6b5730982")
		.contentType(ContentType.JSON).
		body(new File("C:\\Users\\Srinidhi\\Desktop\\studentapi\\createRepo.json"))
		.when().post("/repos")
		.then().statusCode(201);

		
	}
}

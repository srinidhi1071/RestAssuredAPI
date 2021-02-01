package restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestDeleteRequest {
	
	@Test
	public void test_delete_tc_01() {
		
		baseURI="http://localhost:8080/";
		basePath="/student";
		
		given()
		.when().delete("/2")
		.then().statusCode(204);
		
	}

}

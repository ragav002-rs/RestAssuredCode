package Authorization;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuthPostman {
	
	RequestSpecification rs;
	RequestSpecification rq;
	
	@BeforeMethod
	public void BasicAuthPost() {
		
		rs = RestAssured.given().baseUri("https://postman-echo.com").basePath("/basic-auth");
		
		RestAssured.requestSpecification = rs;	
	}
	
	@Test
	public void RequestEmployee() {
		
		Response employee = RestAssured.given().auth().basic("postman", "password").log().all().get();
		
		System.out.println(employee.asPrettyString());
	}
	
	
	
	
	
}

package Authorization;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OAuth {
	
	RequestSpecification rs;
	
	@BeforeMethod
	public void OAuthToken() {
		
		rs = RestAssured.given().baseUri("http://localhost:4000").basePath("/users");
		
		RestAssured.requestSpecification = rs;
	}
	
	@Test
	public void requestOAuth() {
		
		Response employee = RestAssured.given().auth().oauth2("emp_RS12_r3YgN2").get("/RS12");
		
		System.out.println(employee.asPrettyString());
		System.out.println(employee.getStatusCode());
	}
}

package Authorization;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerToken4000 {

	RequestSpecification rs;
	
	@BeforeMethod
	public void BearerToken() {
		
		rs = RestAssured.given().baseUri("http://localhost:4000").basePath("/users")
		.header("Authorization" , "Bearer emp_RS01_x9k2mP");
		
		RestAssured.requestSpecification = rs;	
	}
	
	@Test
	public void EmployeeBearer() {
		
		Response employee = RestAssured.given().get("/RS01");
		
		System.out.println(employee.asPrettyString());
		System.out.println(employee.getStatusCode());
	}
	
}

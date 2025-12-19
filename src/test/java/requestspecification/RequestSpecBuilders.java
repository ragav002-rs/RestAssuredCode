package requestspecification;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpecBuilders {

	RequestSpecBuilder builder = new RequestSpecBuilder();
	RequestSpecification rs;
	
	@Test
	public void GetAnEmployee() {
			
		rs = builder.setBaseUri("http://localhost:4000").setBasePath("/users").build();
		
		Response employee = RestAssured.given(rs).get("/RS18");
		
		System.out.println(employee.asPrettyString());
		
	}

}
